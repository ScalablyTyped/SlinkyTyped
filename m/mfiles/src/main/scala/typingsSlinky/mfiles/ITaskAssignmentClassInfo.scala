package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITaskAssignmentClassInfo extends js.Object {
  var AnyAssigneeCompletes: Boolean = js.native
  var SignatureForCompletion: ISignatureSettings = js.native
  def Clone(): ITaskAssignmentClassInfo = js.native
}

object ITaskAssignmentClassInfo {
  @scala.inline
  def apply(
    AnyAssigneeCompletes: Boolean,
    Clone: () => ITaskAssignmentClassInfo,
    SignatureForCompletion: ISignatureSettings
  ): ITaskAssignmentClassInfo = {
    val __obj = js.Dynamic.literal(AnyAssigneeCompletes = AnyAssigneeCompletes.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), SignatureForCompletion = SignatureForCompletion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaskAssignmentClassInfo]
  }
  @scala.inline
  implicit class ITaskAssignmentClassInfoOps[Self <: ITaskAssignmentClassInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnyAssigneeCompletes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnyAssigneeCompletes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => ITaskAssignmentClassInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSignatureForCompletion(value: ISignatureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureForCompletion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

