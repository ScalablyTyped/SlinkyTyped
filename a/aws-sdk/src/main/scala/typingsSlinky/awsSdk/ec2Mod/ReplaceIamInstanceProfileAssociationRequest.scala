package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceIamInstanceProfileAssociationRequest extends js.Object {
  /**
    * The ID of the existing IAM instance profile association.
    */
  var AssociationId: IamInstanceProfileAssociationId = js.native
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: IamInstanceProfileSpecification = js.native
}

object ReplaceIamInstanceProfileAssociationRequest {
  @scala.inline
  def apply(
    AssociationId: IamInstanceProfileAssociationId,
    IamInstanceProfile: IamInstanceProfileSpecification
  ): ReplaceIamInstanceProfileAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], IamInstanceProfile = IamInstanceProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceIamInstanceProfileAssociationRequest]
  }
  @scala.inline
  implicit class ReplaceIamInstanceProfileAssociationRequestOps[Self <: ReplaceIamInstanceProfileAssociationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationId(value: IamInstanceProfileAssociationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIamInstanceProfile(value: IamInstanceProfileSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamInstanceProfile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

