package typingsSlinky.gestalt

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSyntheticEvent extends js.Object {
  var syntheticEvent: SyntheticEvent[Event_, HTMLInputElement] = js.native
  var value: String = js.native
}

object AnonSyntheticEvent {
  @scala.inline
  def apply(syntheticEvent: SyntheticEvent[Event_, HTMLInputElement], value: String): AnonSyntheticEvent = {
    val __obj = js.Dynamic.literal(syntheticEvent = syntheticEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSyntheticEvent]
  }
  @scala.inline
  implicit class AnonSyntheticEventOps[Self <: AnonSyntheticEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSyntheticEvent(value: SyntheticEvent[Event_, HTMLInputElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntheticEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

