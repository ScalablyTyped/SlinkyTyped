package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IApprovalAssignmentClassInfo extends js.Object {
  var AnyAssigneeApproves: Boolean = js.native
  var SignatureForApproval: ISignatureSettings = js.native
  var SignatureForRejection: ISignatureSettings = js.native
  def Clone(): IApprovalAssignmentClassInfo = js.native
}

object IApprovalAssignmentClassInfo {
  @scala.inline
  def apply(
    AnyAssigneeApproves: Boolean,
    Clone: () => IApprovalAssignmentClassInfo,
    SignatureForApproval: ISignatureSettings,
    SignatureForRejection: ISignatureSettings
  ): IApprovalAssignmentClassInfo = {
    val __obj = js.Dynamic.literal(AnyAssigneeApproves = AnyAssigneeApproves.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), SignatureForApproval = SignatureForApproval.asInstanceOf[js.Any], SignatureForRejection = SignatureForRejection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApprovalAssignmentClassInfo]
  }
  @scala.inline
  implicit class IApprovalAssignmentClassInfoOps[Self <: IApprovalAssignmentClassInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnyAssigneeApproves(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnyAssigneeApproves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IApprovalAssignmentClassInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSignatureForApproval(value: ISignatureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureForApproval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureForRejection(value: ISignatureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureForRejection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

