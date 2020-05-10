package typingsSlinky.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApplyType extends js.Object {
  var ApplyType: Double = js.native
  var Cancel: Double = js.native
}

object AnonApplyType {
  @scala.inline
  def apply(ApplyType: Double, Cancel: Double): AnonApplyType = {
    val __obj = js.Dynamic.literal(ApplyType = ApplyType.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApplyType]
  }
  @scala.inline
  implicit class AnonApplyTypeOps[Self <: AnonApplyType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

