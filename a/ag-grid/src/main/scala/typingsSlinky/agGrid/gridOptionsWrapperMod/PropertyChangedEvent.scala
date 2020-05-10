package typingsSlinky.agGrid.gridOptionsWrapperMod

import typingsSlinky.agGrid.eventsMod.AgEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyChangedEvent extends AgEvent {
  var currentValue: js.Any = js.native
  var previousValue: js.Any = js.native
}

object PropertyChangedEvent {
  @scala.inline
  def apply(currentValue: js.Any, previousValue: js.Any, `type`: String): PropertyChangedEvent = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyChangedEvent]
  }
  @scala.inline
  implicit class PropertyChangedEventOps[Self <: PropertyChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

