package typingsSlinky.docopt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocoptOption extends js.Object {
  /** is an optional argument vector. It defaults to the arguments passed to your program (process.argv[2..]). You can also supply it with an array of strings, as with process.argv. For example: ['--verbose', '-o', 'hai.txt'] */
  var argv: js.UndefOr[js.Array[String]] = js.native
  /** (default true) If set to false will cause docopt to throw exceptions instead of printing the error to console and terminating the application. This flag is mainly for testing purposes. */
  var exit: js.UndefOr[Boolean] = js.native
  /** (default:true) specifies whether the parser should automatically print the help message (supplied as doc) in case -h or --help options are encountered. After showing the usage-message, the program will terminate. If you want to handle -h or --help options manually (the same as other options), set help=false. */
  var help: js.UndefOr[Boolean] = js.native
  /** (default false) If set to true will disallow mixing options and positional argument. I.e. after first positional argument, all arguments will be interpreted as positional even if the look like options. This can be used for strict compatibility with POSIX, or if you want to dispatch your arguments to other programs. */
  var options_first: js.UndefOr[Boolean] = js.native
  /** (default:null) is an optional argument that specifies the version of your program. If supplied, then, if the parser encounters --version option, it will print the supplied version and terminate. version could be any printable object, but most likely a string, e.g. '2.1.0rc1'. */
  var version: js.UndefOr[js.Any] = js.native
}

object DocoptOption {
  @scala.inline
  def apply(): DocoptOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocoptOption]
  }
  @scala.inline
  implicit class DocoptOptionOps[Self <: DocoptOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argv")(js.undefined)
        ret
    }
    @scala.inline
    def withExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.undefined)
        ret
    }
    @scala.inline
    def withHelp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions_first(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options_first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions_first: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options_first")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

