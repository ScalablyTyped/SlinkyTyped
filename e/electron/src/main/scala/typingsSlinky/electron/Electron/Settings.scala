package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  /**
    * The command-line arguments to pass to the executable. Defaults to an empty
    * array. Take care to wrap paths in quotes.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * true to open the app as hidden. Defaults to false. The user can edit this
    * setting from the System Preferences so
    * app.getLoginItemSettings().wasOpenedAsHidden should be checked when the app is
    * opened to know the current value. This setting is not available on .
    */
  var openAsHidden: js.UndefOr[Boolean] = js.native
  /**
    * true to open the app at login, false to remove the app as a login item. Defaults
    * to false.
    */
  var openAtLogin: js.UndefOr[Boolean] = js.native
  /**
    * The executable to launch at login. Defaults to process.execPath.
    */
  var path: js.UndefOr[String] = js.native
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
    def withOpenAsHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAsHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenAsHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAsHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenAtLogin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAtLogin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenAtLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAtLogin")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

