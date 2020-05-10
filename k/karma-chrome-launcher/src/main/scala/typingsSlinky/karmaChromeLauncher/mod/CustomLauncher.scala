package typingsSlinky.karmaChromeLauncher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLauncher extends js.Object {
  /**
    * The `--user-data-dir` is set to a temporary directory,
    * but can be overridden on a custom launcher as shown below.
    * One reason to do this is to have a permanent Chrome user data directory inside the project directory
    * to be able to install plugins there (e.g. JetBrains IDE Support plugin).
    */
  var chromeDataDir: js.UndefOr[String] = js.native
}

object CustomLauncher {
  @scala.inline
  def apply(): CustomLauncher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLauncher]
  }
  @scala.inline
  implicit class CustomLauncherOps[Self <: CustomLauncher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChromeDataDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeDataDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromeDataDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeDataDir")(js.undefined)
        ret
    }
  }
  
}

