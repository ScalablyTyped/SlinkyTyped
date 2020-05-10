package typingsSlinky.nodemon.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodemon.AnonRe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings
  extends /* k */ StringDictionary[js.Any] {
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set to false to disable color output
    */
  var colours: js.UndefOr[Boolean] = js.native
  /**
    * Change into <dir> before running the script
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * Debounce restart in seconds.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Print full debug configuration
    */
  var dump: js.UndefOr[Boolean] = js.native
  var env: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.native
  var events: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Execute script with "app", ie. -x "python -v". May use variables.
    */
  var exec: js.UndefOr[String] = js.native
  /**
    * The global config file is useful for setting up default executables
    */
  var execMap: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Exit on crash, allows use of nodemon with daemon tools like forever.js.
    */
  var exitcrash: js.UndefOr[Boolean] = js.native
  /**
    * Extensions to look for, ie. js,jade,hbs.
    */
  var ext: js.UndefOr[String] = js.native
  /**
    * Ignore specific files or directories.  One entry per ignored value.  Wildcards are allowed.
    */
  var ignore: js.UndefOr[js.Array[String | AnonRe]] = js.native
  /**
    * Root paths to ignore
    */
  var ignoreRoot: js.UndefOr[js.Array[String]] = js.native
  /**
    * Forces node to use the most compatible version for watching file changes.
    *
    * Use polling to watch for changes (typically needed when watching over a network/Docker)
    */
  var legacyWatch: js.UndefOr[Boolean] = js.native
  /**
    * Opt-out of update version check
    */
  var noUpdateNotifier: js.UndefOr[Boolean] = js.native
  /**
    * Arguments to pass to node if exec is "node"
    */
  var nodeArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * Combined with legacyWatch, milliseconds to poll for (default 100)
    */
  var pollingInterval: js.UndefOr[Double] = js.native
  /**
    * Minimise nodemon messages to start/stop only.
    */
  var quiet: js.UndefOr[Boolean] = js.native
  var restartable: js.UndefOr[String] = js.native
  /**
    * Execute script on change only, not startup
    */
  var runOnChangeOnly: js.UndefOr[Boolean] = js.native
  var script: js.UndefOr[String] = js.native
  var scriptPosition: js.UndefOr[Double] = js.native
  /**
    * Use specified kill signal instead of default (ex. SIGTERM)
    */
  var signal: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Force nodemon to use spawn (over fork) [node only]
    */
  var spawn: js.UndefOr[Boolean] = js.native
  /**
    * Try to read from stdin. Set to false to have nodemon pass stdin directly to child process
    */
  var stdin: js.UndefOr[Boolean] = js.native
  var stdout: js.UndefOr[Boolean] = js.native
  /**
    * Show detail on what is causing restarts.
    */
  var verbose: js.UndefOr[Boolean] = js.native
  /**
    * Watch directory or file.  One entry per watched value.  Wildcards are allowed.
    */
  var watch: js.UndefOr[js.Array[String | AnonRe]] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withColours(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colours")(js.undefined)
        ret
    }
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDump(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dump")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDump: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dump")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: StringDictionary[String | Boolean | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withExec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.undefined)
        ret
    }
    @scala.inline
    def withExecMap(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execMap")(js.undefined)
        ret
    }
    @scala.inline
    def withExitcrash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitcrash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitcrash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitcrash")(js.undefined)
        ret
    }
    @scala.inline
    def withExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: js.Array[String | AnonRe]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreRoot(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withLegacyWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyWatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacyWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyWatch")(js.undefined)
        ret
    }
    @scala.inline
    def withNoUpdateNotifier(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUpdateNotifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoUpdateNotifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUpdateNotifier")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withPollingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollingInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withQuiet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuiet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestartable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartable")(js.undefined)
        ret
    }
    @scala.inline
    def withRunOnChangeOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOnChangeOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunOnChangeOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOnChangeOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSignal(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.undefined)
        ret
    }
    @scala.inline
    def withSpawn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spawn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpawn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spawn")(js.undefined)
        ret
    }
    @scala.inline
    def withStdin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(js.undefined)
        ret
    }
    @scala.inline
    def withStdout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: js.Array[String | AnonRe]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
  }
  
}

