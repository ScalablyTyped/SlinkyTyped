package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for iSDK to execute strong match flow for post-install attribution.
  * This is meant for iOS requests only. Requests from other platforms will not
  * be honored.
  */
@js.native
trait SchemaGetIosPostInstallAttributionRequest extends js.Object {
  /**
    * App installation epoch time (https://en.wikipedia.org/wiki/Unix_time).
    * This is a client signal for a more accurate weak match.
    */
  var appInstallationTime: js.UndefOr[String] = js.native
  /**
    * APP bundle ID.
    */
  var bundleId: js.UndefOr[String] = js.native
  /**
    * Device information.
    */
  var device: js.UndefOr[SchemaDeviceInfo] = js.native
  /**
    * iOS version, ie: 9.3.5. Consider adding &quot;build&quot;.
    */
  var iosVersion: js.UndefOr[String] = js.native
  /**
    * App post install attribution retrieval information. Disambiguates
    * mechanism (iSDK or developer invoked) to retrieve payload from clicked
    * link.
    */
  var retrievalMethod: js.UndefOr[String] = js.native
  /**
    * Google SDK version. Version takes the form
    * &quot;$major.$minor.$patch&quot;
    */
  var sdkVersion: js.UndefOr[String] = js.native
  /**
    * Possible unique matched link that server need to check before performing
    * fingerprint match. If passed link is short server need to expand the
    * link. If link is long server need to vslidate the link.
    */
  var uniqueMatchLinkToCheck: js.UndefOr[String] = js.native
  /**
    * Strong match page information. Disambiguates between default UI and
    * custom page to present when strong match succeeds/fails to find cookie.
    */
  var visualStyle: js.UndefOr[String] = js.native
}

object SchemaGetIosPostInstallAttributionRequest {
  @scala.inline
  def apply(): SchemaGetIosPostInstallAttributionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetIosPostInstallAttributionRequest]
  }
  @scala.inline
  implicit class SchemaGetIosPostInstallAttributionRequestOps[Self <: SchemaGetIosPostInstallAttributionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppInstallationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appInstallationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppInstallationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appInstallationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice(value: SchemaDeviceInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
    @scala.inline
    def withIosVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRetrievalMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrievalMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetrievalMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrievalMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withSdkVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdkVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueMatchLinkToCheck(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueMatchLinkToCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueMatchLinkToCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueMatchLinkToCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withVisualStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisualStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualStyle")(js.undefined)
        ret
    }
  }
  
}

