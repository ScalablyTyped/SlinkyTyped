package typingsSlinky.openfin.systemMod

import typingsSlinky.openfin.eventsBaseMod.BaseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdleEvent[Topic, Type] extends BaseEvent[Topic, Type] {
  var elapsedTime: Double = js.native
  var isIdle: Boolean = js.native
}

object IdleEvent {
  @scala.inline
  def apply[Topic, Type](elapsedTime: Double, isIdle: Boolean, topic: Topic, `type`: Type): IdleEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(elapsedTime = elapsedTime.asInstanceOf[js.Any], isIdle = isIdle.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleEvent[Topic, Type]]
  }
  @scala.inline
  implicit class IdleEventOps[Self[topic, `type`] <: IdleEvent[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def withElapsedTime(value: Double): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIdle(value: Boolean): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

