package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.openfinStrings.`external-window`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalWindowBaseEvent extends js.Object {
  /**
    * the name of the window
    */
  var name: String = js.native
  /**
    * always window
    */
  var topic: `external-window` = js.native
  /**
    * window event type
    */
  var `type`: OpenFinExternalWindowEventType = js.native
  /**
    * the UUID of the application the window belongs to
    */
  var uuid: String = js.native
}

object ExternalWindowBaseEvent {
  @scala.inline
  def apply(name: String, topic: `external-window`, `type`: OpenFinExternalWindowEventType, uuid: String): ExternalWindowBaseEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalWindowBaseEvent]
  }
  @scala.inline
  implicit class ExternalWindowBaseEventOps[Self <: ExternalWindowBaseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopic(value: `external-window`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: OpenFinExternalWindowEventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

