package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateIamInstanceProfileResult extends js.Object {
  /**
    * Information about the IAM instance profile association.
    */
  var IamInstanceProfileAssociation: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.IamInstanceProfileAssociation] = js.native
}

object DisassociateIamInstanceProfileResult {
  @scala.inline
  def apply(): DisassociateIamInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateIamInstanceProfileResult]
  }
  @scala.inline
  implicit class DisassociateIamInstanceProfileResultOps[Self <: DisassociateIamInstanceProfileResult] (val x: Self) extends AnyVal {
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

