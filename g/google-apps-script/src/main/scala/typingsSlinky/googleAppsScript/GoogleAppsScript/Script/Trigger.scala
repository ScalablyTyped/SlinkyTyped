package typingsSlinky.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A script trigger.
  */
@js.native
trait Trigger extends js.Object {
  def getEventType(): EventType = js.native
  def getHandlerFunction(): String = js.native
  def getTriggerSource(): TriggerSource = js.native
  def getTriggerSourceId(): String = js.native
  def getUniqueId(): String = js.native
}

object Trigger {
  @scala.inline
  def apply(
    getEventType: () => EventType,
    getHandlerFunction: () => String,
    getTriggerSource: () => TriggerSource,
    getTriggerSourceId: () => String,
    getUniqueId: () => String
  ): Trigger = {
    val __obj = js.Dynamic.literal(getEventType = js.Any.fromFunction0(getEventType), getHandlerFunction = js.Any.fromFunction0(getHandlerFunction), getTriggerSource = js.Any.fromFunction0(getTriggerSource), getTriggerSourceId = js.Any.fromFunction0(getTriggerSourceId), getUniqueId = js.Any.fromFunction0(getUniqueId))
    __obj.asInstanceOf[Trigger]
  }
  @scala.inline
  implicit class TriggerOps[Self <: Trigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEventType(value: () => EventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEventType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHandlerFunction(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHandlerFunction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTriggerSource(value: () => TriggerSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTriggerSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTriggerSourceId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTriggerSourceId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUniqueId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUniqueId")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

