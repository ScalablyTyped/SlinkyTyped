package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.openfinStrings.`idle-state-changed`
import typingsSlinky.openfin.openfinStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdleStateChangedEvent extends js.Object {
  /**
    * How long in milliseconds since the user has been idle.
    */
  var elapsedTime: Double = js.native
  /**
    * true when the user is idle,false when the user has returned;
    */
  var isIdle: Boolean = js.native
  var topic: system = js.native
  var `type`: `idle-state-changed` = js.native
}

object IdleStateChangedEvent {
  @scala.inline
  def apply(elapsedTime: Double, isIdle: Boolean, topic: system, `type`: `idle-state-changed`): IdleStateChangedEvent = {
    val __obj = js.Dynamic.literal(elapsedTime = elapsedTime.asInstanceOf[js.Any], isIdle = isIdle.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleStateChangedEvent]
  }
  @scala.inline
  implicit class IdleStateChangedEventOps[Self <: IdleStateChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElapsedTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIdle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopic(value: system): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `idle-state-changed`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

