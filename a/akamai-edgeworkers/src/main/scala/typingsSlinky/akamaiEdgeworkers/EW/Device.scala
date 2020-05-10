package typingsSlinky.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Notes:
  * * If device properties can not be supplied for any reason,
  *   undefined is returned for each property
  */
@js.native
trait Device extends js.Object {
  /**
    * Indicates if the browser accepts third party cookies.
    */
  val acceptsThirdPartyCookie: js.UndefOr[Boolean] = js.native
  /**
    * Brand name of the device.
    */
  val brandName: js.UndefOr[String] = js.native
  /**
    * Indicates if the device supports all of the following
    * JavaScript functions: "alert confirm access form elements
    * setTimeout setInterval and document.location"
    */
  val hasAjaxSupport: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the browser supports cookies.
    */
  val hasCookieSupport: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the browser supports Flash.
    */
  val hasFlashSupport: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the device is a mobile device.
    */
  val isMobile: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the device is a tablet.
    */
  val isTablet: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the device is a wireless device.
    */
  val isWireless: js.UndefOr[Boolean] = js.native
  /**
    * Marketing name of the device.
    */
  val marketingName: js.UndefOr[String] = js.native
  /**
    * The mobile browser name.
    */
  val mobileBrowser: js.UndefOr[String] = js.native
  /**
    * The mobile browser version.
    */
  val mobileBrowserVersion: js.UndefOr[String] = js.native
  /**
    * Model name of the device.
    */
  val modelName: js.UndefOr[String] = js.native
  /**
    * The device operation system.
    */
  val os: js.UndefOr[String] = js.native
  /**
    * The device operating system version.
    */
  val osVersion: js.UndefOr[String] = js.native
  /**
    * The physical screen height, in millimeters.
    */
  val physicalScreenHeight: js.UndefOr[Double] = js.native
  /**
    * The physical screen width, in millimeters.
    */
  val physicalScreenWidth: js.UndefOr[Double] = js.native
  /**
    * The screen resolution height, in pixels.
    */
  val resolutionHeight: js.UndefOr[Double] = js.native
  /**
    * The screen resolution width, in pixels.
    */
  val resolutionWidth: js.UndefOr[Double] = js.native
  /**
    * Indicates the level of support for XHTML.
    */
  val xhtmlSupportLevel: js.UndefOr[Double] = js.native
}

object Device {
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptsThirdPartyCookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptsThirdPartyCookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptsThirdPartyCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptsThirdPartyCookie")(js.undefined)
        ret
    }
    @scala.inline
    def withBrandName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrandName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandName")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAjaxSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAjaxSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasAjaxSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAjaxSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCookieSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCookieSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCookieSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCookieSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withHasFlashSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFlashSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasFlashSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFlashSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTablet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTablet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTablet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTablet")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWireless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWireless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWireless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWireless")(js.undefined)
        ret
    }
    @scala.inline
    def withMarketingName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketingName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketingName")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileBrowser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileBrowser")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileBrowserVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileBrowserVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileBrowserVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileBrowserVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withModelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(js.undefined)
        ret
    }
    @scala.inline
    def withOs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(js.undefined)
        ret
    }
    @scala.inline
    def withOsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPhysicalScreenHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalScreenHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhysicalScreenHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalScreenHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPhysicalScreenWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalScreenWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhysicalScreenWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalScreenWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withResolutionHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolutionHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withResolutionWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolutionWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withXhtmlSupportLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhtmlSupportLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhtmlSupportLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhtmlSupportLevel")(js.undefined)
        ret
    }
  }
  
}

