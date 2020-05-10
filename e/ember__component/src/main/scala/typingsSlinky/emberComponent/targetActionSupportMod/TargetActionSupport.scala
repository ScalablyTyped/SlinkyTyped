package typingsSlinky.emberComponent.targetActionSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetActionSupport extends js.Object {
  def triggerAction(opts: TriggerActionOptions): Boolean = js.native
}

object TargetActionSupport {
  @scala.inline
  def apply(triggerAction: TriggerActionOptions => Boolean): TargetActionSupport = {
    val __obj = js.Dynamic.literal(triggerAction = js.Any.fromFunction1(triggerAction))
    __obj.asInstanceOf[TargetActionSupport]
  }
  @scala.inline
  implicit class TargetActionSupportOps[Self <: TargetActionSupport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTriggerAction(value: TriggerActionOptions => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerAction")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

