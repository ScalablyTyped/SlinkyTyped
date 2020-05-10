package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHsmRequest extends js.Object {
  /**
    * The ARN of the HSM. Either the HsmArn or the SerialNumber parameter must be specified.
    */
  var HsmArn: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.HsmArn] = js.native
  /**
    * The serial number of the HSM. Either the HsmArn or the HsmSerialNumber parameter must be specified.
    */
  var HsmSerialNumber: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.HsmSerialNumber] = js.native
}

object DescribeHsmRequest {
  @scala.inline
  def apply(): DescribeHsmRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHsmRequest]
  }
  @scala.inline
  implicit class DescribeHsmRequestOps[Self <: DescribeHsmRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHsmArn(value: HsmArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmArn")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmSerialNumber(value: HsmSerialNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmSerialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmSerialNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmSerialNumber")(js.undefined)
        ret
    }
  }
  
}

