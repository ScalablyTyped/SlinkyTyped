package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardInfo extends js.Object {
  /**
    * Defines the related dom event
    */
  var event: KeyboardEvent = js.native
  /**
    * Defines the type of event (KeyboardEventTypes)
    */
  var `type`: Double = js.native
}

object KeyboardInfo {
  @scala.inline
  def apply(event: KeyboardEvent, `type`: Double): KeyboardInfo = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardInfo]
  }
  @scala.inline
  implicit class KeyboardInfoOps[Self <: KeyboardInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: KeyboardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

