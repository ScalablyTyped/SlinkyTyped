package typingsSlinky.openlayers.mod.olx.interaction

import typingsSlinky.openlayers.mod.EventsConditionType
import typingsSlinky.openlayers.mod.MapBrowserEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragRotateAndZoomOptions extends js.Object {
  var condition: js.UndefOr[EventsConditionType] = js.native
  var duration: js.UndefOr[Double] = js.native
}

object DragRotateAndZoomOptions {
  @scala.inline
  def apply(): DragRotateAndZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragRotateAndZoomOptions]
  }
  @scala.inline
  implicit class DragRotateAndZoomOptionsOps[Self <: DragRotateAndZoomOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: /* event */ MapBrowserEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
  }
  
}

