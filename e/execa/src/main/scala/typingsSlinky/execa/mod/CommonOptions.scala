package typingsSlinky.execa.mod

import typingsSlinky.execa.execaStrings.ignore
import typingsSlinky.execa.execaStrings.inherit
import typingsSlinky.execa.execaStrings.pipe
import typingsSlinky.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonOptions[EncodingType] extends js.Object {
  /**
  		Explicitly set the value of `argv[0]` sent to the child process. This will be set to `command` or `file` if not specified.
  		*/
  val argv0: js.UndefOr[String] = js.native
  /**
  		Buffer the output from the spawned process. When buffering is disabled you must consume the output of the `stdout` and `stderr` streams because the promise will not be resolved/rejected until they have completed.
  		If the spawned process fails, `error.stdout`, `error.stderr`, and `error.all` will contain the buffered data.
  		@default true
  		*/
  val buffer: js.UndefOr[Boolean] = js.native
  /**
  		Kill the spawned process when the parent process exits unless either:
  			- the spawned process is [`detached`](https://nodejs.org/api/child_process.html#child_process_options_detached)
  			- the parent process is terminated abruptly, for example, with `SIGKILL` as opposed to `SIGTERM` or a normal exit
  		@default true
  		*/
  val cleanup: js.UndefOr[Boolean] = js.native
  /**
  		Current working directory of the child process.
  		@default process.cwd()
  		*/
  val cwd: js.UndefOr[String] = js.native
  /**
  		Prepare child to run independently of its parent process. Specific behavior [depends on the platform](https://nodejs.org/api/child_process.html#child_process_options_detached).
  		@default false
  		*/
  val detached: js.UndefOr[Boolean] = js.native
  /**
  		Specify the character encoding used to decode the `stdout` and `stderr` output. If set to `null`, then `stdout` and `stderr` will be a `Buffer` instead of a string.
  		@default 'utf8'
  		*/
  val encoding: js.UndefOr[EncodingType] = js.native
  /**
  		Environment key-value pairs. Extends automatically from `process.env`. Set `extendEnv` to `false` if you don't want this.
  		@default process.env
  		*/
  val env: js.UndefOr[ProcessEnv] = js.native
  /**
  		Set to `false` if you don't want to extend the environment variables when providing the `env` property.
  		@default true
  		*/
  val extendEnv: js.UndefOr[Boolean] = js.native
  /**
  		Sets the group identity of the process.
  		*/
  val gid: js.UndefOr[Double] = js.native
  /**
  		Signal value to be used when the spawned process will be killed.
  		@default 'SIGTERM'
  		*/
  val killSignal: js.UndefOr[String | Double] = js.native
  /**
  		Preferred path to find locally installed binaries in (use with `preferLocal`).
  		@default process.cwd()
  		*/
  val localDir: js.UndefOr[String] = js.native
  /**
  		Largest amount of data in bytes allowed on `stdout` or `stderr`. Default: 100 MB.
  		@default 100_000_000
  		*/
  val maxBuffer: js.UndefOr[Double] = js.native
  /**
  		Prefer locally installed binaries when looking for a binary to execute.
  		If you `$ npm install foo`, you can then `execa('foo')`.
  		@default false
  		*/
  val preferLocal: js.UndefOr[Boolean] = js.native
  /**
  		Setting this to `false` resolves the promise with the error instead of rejecting it.
  		@default true
  		*/
  val reject: js.UndefOr[Boolean] = js.native
  /**
  		If `true`, runs `command` inside of a shell. Uses `/bin/sh` on UNIX and `cmd.exe` on Windows. A different shell can be specified as a string. The shell should understand the `-c` switch on UNIX or `/d /s /c` on Windows.
  		We recommend against using this option since it is:
  		- not cross-platform, encouraging shell-specific syntax.
  		- slower, because of the additional shell interpretation.
  		- unsafe, potentially allowing command injection.
  		@default false
  		*/
  val shell: js.UndefOr[Boolean | String] = js.native
  /**
  		Same options as [`stdio`](https://nodejs.org/dist/latest-v6.x/docs/api/child_process.html#child_process_options_stdio).
  		@default 'pipe'
  		*/
  val stderr: js.UndefOr[StdioOption] = js.native
  /**
  		Same options as [`stdio`](https://nodejs.org/dist/latest-v6.x/docs/api/child_process.html#child_process_options_stdio).
  		@default 'pipe'
  		*/
  val stdin: js.UndefOr[StdioOption] = js.native
  /**
  		Child's [stdio](https://nodejs.org/api/child_process.html#child_process_options_stdio) configuration.
  		@default 'pipe'
  		*/
  val stdio: js.UndefOr[pipe | ignore | inherit | js.Array[StdioOption]] = js.native
  /**
  		Same options as [`stdio`](https://nodejs.org/dist/latest-v6.x/docs/api/child_process.html#child_process_options_stdio).
  		@default 'pipe'
  		*/
  val stdout: js.UndefOr[StdioOption] = js.native
  /**
  		Strip the final [newline character](https://en.wikipedia.org/wiki/Newline) from the output.
  		@default true
  		*/
  val stripFinalNewline: js.UndefOr[Boolean] = js.native
  /**
  		If `timeout` is greater than `0`, the parent will send the signal identified by the `killSignal` property (the default is `SIGTERM`) if the child runs longer than `timeout` milliseconds.
  		@default 0
  		*/
  val timeout: js.UndefOr[Double] = js.native
  /**
  		Sets the user identity of the process.
  		*/
  val uid: js.UndefOr[Double] = js.native
  /**
  		If `true`, no quoting or escaping of arguments is done on Windows. Ignored on other platforms. This is set to `true` automatically when the `shell` option is `true`.
  		@default false
  		*/
  val windowsVerbatimArguments: js.UndefOr[Boolean] = js.native
}

object CommonOptions {
  @scala.inline
  def apply[EncodingType](): CommonOptions[EncodingType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions[EncodingType]]
  }
  @scala.inline
  implicit class CommonOptionsOps[Self[encodingtype] <: CommonOptions[encodingtype], EncodingType] (val x: Self[EncodingType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EncodingType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EncodingType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[EncodingType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[EncodingType] with Other]
    @scala.inline
    def withArgv0(value: String): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argv0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgv0: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argv0")(js.undefined)
        ret
    }
    @scala.inline
    def withBuffer(value: Boolean): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanup(value: Boolean): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanup: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withCwd(value: String): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withDetached(value: Boolean): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetached: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: EncodingType): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: ProcessEnv): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendEnv(value: Boolean): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendEnv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendEnv: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendEnv")(js.undefined)
        ret
    }
    @scala.inline
    def withGid(value: Double): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGid: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(js.undefined)
        ret
    }
    @scala.inline
    def withKillSignal(value: String | Double): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killSignal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKillSignal: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killSignal")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalDir(value: String): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalDir: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localDir")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBuffer(value: Double): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBuffer: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferLocal(value: Boolean): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferLocal: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferLocal")(js.undefined)
        ret
    }
    @scala.inline
    def withReject(value: Boolean): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReject: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.undefined)
        ret
    }
    @scala.inline
    def withShell(value: Boolean | String): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShell: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(js.undefined)
        ret
    }
    @scala.inline
    def withStderr(value: StdioOption): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStderr: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(js.undefined)
        ret
    }
    @scala.inline
    def withStdin(value: StdioOption): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdin: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(js.undefined)
        ret
    }
    @scala.inline
    def withStdio(value: pipe | ignore | inherit | js.Array[StdioOption]): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdio: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdio")(js.undefined)
        ret
    }
    @scala.inline
    def withStdout(value: StdioOption): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdout: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(js.undefined)
        ret
    }
    @scala.inline
    def withStripFinalNewline(value: Boolean): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripFinalNewline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripFinalNewline: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripFinalNewline")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: Double): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsVerbatimArguments(value: Boolean): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsVerbatimArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsVerbatimArguments: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsVerbatimArguments")(js.undefined)
        ret
    }
  }
  
}

