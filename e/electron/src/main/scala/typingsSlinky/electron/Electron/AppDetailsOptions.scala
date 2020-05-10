package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppDetailsOptions extends js.Object {
  /**
    * Index of the icon in appIconPath. Ignored when appIconPath is not set. Default
    * is 0.
    */
  var appIconIndex: js.UndefOr[Double] = js.native
  /**
    * Window's .
    */
  var appIconPath: js.UndefOr[String] = js.native
  /**
    * Window's . It has to be set, otherwise the other options will have no effect.
    */
  var appId: js.UndefOr[String] = js.native
  /**
    * Window's .
    */
  var relaunchCommand: js.UndefOr[String] = js.native
  /**
    * Window's .
    */
  var relaunchDisplayName: js.UndefOr[String] = js.native
}

object AppDetailsOptions {
  @scala.inline
  def apply(): AppDetailsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppDetailsOptions]
  }
  @scala.inline
  implicit class AppDetailsOptionsOps[Self <: AppDetailsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppIconIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIconIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppIconIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIconIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withAppIconPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIconPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppIconPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIconPath")(js.undefined)
        ret
    }
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withRelaunchCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relaunchCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelaunchCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relaunchCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withRelaunchDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relaunchDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelaunchDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relaunchDisplayName")(js.undefined)
        ret
    }
  }
  
}

