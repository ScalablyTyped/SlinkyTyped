package typingsSlinky.gulpNunitRunner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  // The NUnit bin folder or the full path of the console runner.
  // If not specified the NUnit bin folder must be in the `PATH`.
  var executable: js.UndefOr[String] = js.native
   // true|false
  // The options below map directly to the NUnit console runner. See here
  // for more info: http://www.nunit.org/index.php?p=consoleCommandLine&r=2.6.3
  var options: js.UndefOr[ConsoleRunnerOptions] = js.native
   // 'c:/Program Files/NUnit/bin'
  // [2.x] If the full path of the console runner is not specified this determines
  // what version of the console runner is used. Defaults to anycpu.
  // NOTE: This has been superseded by the 'x86' option below in 3.x.
  // http://www.nunit.org/index.php?p=nunit-console&r=2.6.3
  var platform: js.UndefOr[String] = js.native
   // 'anycpu|x86'
  // [2.x] Output TeamCity service messages.
  // NOTE: This has been superseded by the 'teamcity' option below in 3.x.
  // https://confluence.jetbrains.com/display/TCD8/Build+Script+Interaction+with+TeamCity
  var teamcity: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executable")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: ConsoleRunnerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamcity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamcity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamcity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamcity")(js.undefined)
        ret
    }
  }
  
}

