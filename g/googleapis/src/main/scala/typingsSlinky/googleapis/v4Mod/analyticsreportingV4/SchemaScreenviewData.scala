package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaScreenviewData extends js.Object {
  /**
    * The application name.
    */
  var appName: js.UndefOr[String] = js.native
  /**
    * Mobile manufacturer or branded name. Eg: &quot;Google&quot;,
    * &quot;Apple&quot; etc.
    */
  var mobileDeviceBranding: js.UndefOr[String] = js.native
  /**
    * Mobile device model. Eg: &quot;Pixel&quot;, &quot;iPhone&quot; etc.
    */
  var mobileDeviceModel: js.UndefOr[String] = js.native
  /**
    * The name of the screen.
    */
  var screenName: js.UndefOr[String] = js.native
}

object SchemaScreenviewData {
  @scala.inline
  def apply(): SchemaScreenviewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScreenviewData]
  }
  @scala.inline
  implicit class SchemaScreenviewDataOps[Self <: SchemaScreenviewData] (val x: Self) extends AnyVal {
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

