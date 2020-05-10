package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDevicePolicyConfigurationResponse extends js.Object {
  /**
    * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
    */
  var DeviceCaCertificate: js.UndefOr[Certificate] = js.native
}

object DescribeDevicePolicyConfigurationResponse {
  @scala.inline
  def apply(): DescribeDevicePolicyConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDevicePolicyConfigurationResponse]
  }
  @scala.inline
  implicit class DescribeDevicePolicyConfigurationResponseOps[Self <: DescribeDevicePolicyConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceCaCertificate(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceCaCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCaCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceCaCertificate")(js.undefined)
        ret
    }
  }
  
}

