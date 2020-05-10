package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenviewData extends js.Object {
  var appName: js.UndefOr[String] = js.native
  var mobileDeviceBranding: js.UndefOr[String] = js.native
  var mobileDeviceModel: js.UndefOr[String] = js.native
  var screenName: js.UndefOr[String] = js.native
}

object ScreenviewData {
  @scala.inline
  def apply(): ScreenviewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenviewData]
  }
  @scala.inline
  implicit class ScreenviewDataOps[Self <: ScreenviewData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileDeviceBranding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileDeviceBranding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileDeviceBranding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileDeviceBranding")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileDeviceModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileDeviceModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileDeviceModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileDeviceModel")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenName")(js.undefined)
        ret
    }
  }
  
}

