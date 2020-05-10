package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecorationPropsChangedEvent extends js.Object {
  /** Object the new parameters the decoration now has */
  var newProperties: DecorationOptions = js.native
  /** Object the old parameters the decoration used to have. */
  var oldProperties: DecorationOptions = js.native
}

object DecorationPropsChangedEvent {
  @scala.inline
  def apply(newProperties: DecorationOptions, oldProperties: DecorationOptions): DecorationPropsChangedEvent = {
    val __obj = js.Dynamic.literal(newProperties = newProperties.asInstanceOf[js.Any], oldProperties = oldProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationPropsChangedEvent]
  }
  @scala.inline
  implicit class DecorationPropsChangedEventOps[Self <: DecorationPropsChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewProperties(value: DecorationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldProperties(value: DecorationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

