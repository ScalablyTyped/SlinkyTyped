package typingsSlinky.openlayers.mod.olx.interaction

import typingsSlinky.openlayers.mod.DragBoxEndConditionType
import typingsSlinky.openlayers.mod.EventsConditionType
import typingsSlinky.openlayers.mod.MapBrowserEvent
import typingsSlinky.openlayers.mod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragBoxOptions extends js.Object {
  var boxEndCondition: js.UndefOr[DragBoxEndConditionType] = js.native
  var className: js.UndefOr[String] = js.native
  var condition: js.UndefOr[EventsConditionType] = js.native
  var minArea: js.UndefOr[Double] = js.native
}

object DragBoxOptions {
  @scala.inline
  def apply(): DragBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragBoxOptions]
  }
  @scala.inline
  implicit class DragBoxOptionsOps[Self <: DragBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoxEndCondition(value: (/* event */ MapBrowserEvent, /* pixel1 */ Pixel, /* pixel2 */ Pixel) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxEndCondition")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBoxEndCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxEndCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
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
    def withMinArea(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minArea")(js.undefined)
        ret
    }
  }
  
}

