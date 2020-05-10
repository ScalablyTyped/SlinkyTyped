package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateAddressResult extends js.Object {
  /**
    * [EC2-VPC] The ID that represents the association of the Elastic IP address with an instance.
    */
  var AssociationId: js.UndefOr[String] = js.native
}

object AssociateAddressResult {
  @scala.inline
  def apply(): AssociateAddressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateAddressResult]
  }
  @scala.inline
  implicit class AssociateAddressResultOps[Self <: AssociateAddressResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(js.undefined)
        ret
    }
  }
  
}

