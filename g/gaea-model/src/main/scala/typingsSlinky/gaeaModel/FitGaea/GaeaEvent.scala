package typingsSlinky.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GaeaEvent extends js.Object {
  var effects: js.Array[EventAction] = js.native
  var triggers: js.Array[EventTriggerCondition] = js.native
}

object GaeaEvent {
  @scala.inline
  def apply(effects: js.Array[EventAction], triggers: js.Array[EventTriggerCondition]): GaeaEvent = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaeaEvent]
  }
  @scala.inline
  implicit class GaeaEventOps[Self <: GaeaEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffects(value: js.Array[EventAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggers(value: js.Array[EventTriggerCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

