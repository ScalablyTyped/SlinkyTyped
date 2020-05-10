package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trigger extends UserScriptable {
  /** The trigger operation. Should be one of 'all', 'create', 'update', 'delete', or 'replace'. */
  var triggerOperation: TriggerOperation = js.native
  /** The type of the trigger. Should be either 'pre' or 'post'. */
  var triggerType: js.UndefOr[TriggerType] = js.native
}

object Trigger {
  @scala.inline
  def apply(id: String, triggerOperation: TriggerOperation): Trigger = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], triggerOperation = triggerOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
  @scala.inline
  implicit class TriggerOps[Self <: Trigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTriggerOperation(value: TriggerOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerType(value: TriggerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(js.undefined)
        ret
    }
  }
  
}

