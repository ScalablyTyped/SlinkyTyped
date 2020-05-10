package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceIamInstanceProfileAssociationResult extends js.Object {
  /**
    * Information about the IAM instance profile association.
    */
  var IamInstanceProfileAssociation: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.IamInstanceProfileAssociation] = js.native
}

object ReplaceIamInstanceProfileAssociationResult {
  @scala.inline
  def apply(): ReplaceIamInstanceProfileAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceIamInstanceProfileAssociationResult]
  }
  @scala.inline
  implicit class ReplaceIamInstanceProfileAssociationResultOps[Self <: ReplaceIamInstanceProfileAssociationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIamInstanceProfileAssociation(value: IamInstanceProfileAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamInstanceProfileAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamInstanceProfileAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamInstanceProfileAssociation")(js.undefined)
        ret
    }
  }
  
}

