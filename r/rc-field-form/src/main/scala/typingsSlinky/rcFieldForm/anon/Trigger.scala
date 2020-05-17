package typingsSlinky.rcFieldForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trigger extends js.Object {
  var trigger: String = js.native
  var validateTrigger: String = js.native
  var valuePropName: String = js.native
}

object Trigger {
  @scala.inline
  def apply(trigger: String, validateTrigger: String, valuePropName: String): Trigger = {
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any], validateTrigger = validateTrigger.asInstanceOf[js.Any], valuePropName = valuePropName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
  @scala.inline
  implicit class TriggerOps[Self <: Trigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValuePropName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePropName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

