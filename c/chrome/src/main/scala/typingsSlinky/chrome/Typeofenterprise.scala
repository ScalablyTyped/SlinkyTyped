package typingsSlinky.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofenterprise extends js.Object {
  ////////////////////
  // Enterprise Device Attributes
  ////////////////////
  /**
    * Use the <code>chrome.enterprise.deviceAttributes</code> API to read device attributes.
    * Permissions:  "enterprise.deviceAttributes"
    * Since: Chrome 46
    * Important: This API works only on Chrome OS.
    * Note: This API is only for extensions pre-installed by policy.
    */
  val deviceAttributes: TypeofdeviceAttributes = js.native
  ////////////////////
  // Enterprise Platform Keys
  ////////////////////
  /**
    * Use the chrome.enterprise.platformKeys API to generate hardware-backed keys and to install certificates for these keys. The certificates will be managed by the platform and can be used for TLS authentication, network access or by other extension through chrome.platformKeys.
    * Availability: Since Chrome 37.
    * Permissions:  "enterprise.platformKeys"
    * Important: This API works only on Chrome OS.
    * Note:  This API is only for extensions pre-installed by policy.
    */
  val platformKeys: TypeofplatformKeys = js.native
}

object Typeofenterprise {
  @scala.inline
  def apply(deviceAttributes: TypeofdeviceAttributes, platformKeys: TypeofplatformKeys): Typeofenterprise = {
    val __obj = js.Dynamic.literal(deviceAttributes = deviceAttributes.asInstanceOf[js.Any], platformKeys = platformKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofenterprise]
  }
  @scala.inline
  implicit class TypeofenterpriseOps[Self <: Typeofenterprise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceAttributes(value: TypeofdeviceAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatformKeys(value: TypeofplatformKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

