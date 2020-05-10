package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFpgaImageAttributeRequest extends js.Object {
  /**
    * The AFI attribute.
    */
  var Attribute: FpgaImageAttributeName = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: typingsSlinky.awsSdk.ec2Mod.FpgaImageId = js.native
}

object DescribeFpgaImageAttributeRequest {
  @scala.inline
  def apply(Attribute: FpgaImageAttributeName, FpgaImageId: FpgaImageId): DescribeFpgaImageAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], FpgaImageId = FpgaImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFpgaImageAttributeRequest]
  }
  @scala.inline
  implicit class DescribeFpgaImageAttributeRequestOps[Self <: DescribeFpgaImageAttributeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute(value: FpgaImageAttributeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFpgaImageId(value: FpgaImageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FpgaImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
  }
  
}

