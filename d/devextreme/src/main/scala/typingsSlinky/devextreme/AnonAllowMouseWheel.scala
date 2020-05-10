package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.alt
import typingsSlinky.devextreme.devextremeStrings.both
import typingsSlinky.devextreme.devextremeStrings.ctrl
import typingsSlinky.devextreme.devextremeStrings.meta
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.pan
import typingsSlinky.devextreme.devextremeStrings.shift
import typingsSlinky.devextreme.devextremeStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowMouseWheel extends js.Object {
  var allowMouseWheel: js.UndefOr[Boolean] = js.native
  var allowTouchGestures: js.UndefOr[Boolean] = js.native
  var argumentAxis: js.UndefOr[both | none | pan | zoom] = js.native
  var dragBoxStyle: js.UndefOr[AnonOpacity] = js.native
  var dragToZoom: js.UndefOr[Boolean] = js.native
  var panKey: js.UndefOr[alt | ctrl | meta | shift] = js.native
  var valueAxis: js.UndefOr[both | none | pan | zoom] = js.native
}

object AnonAllowMouseWheel {
  @scala.inline
  def apply(): AnonAllowMouseWheel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAllowMouseWheel]
  }
  @scala.inline
  implicit class AnonAllowMouseWheelOps[Self <: AnonAllowMouseWheel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMouseWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMouseWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMouseWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMouseWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTouchGestures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTouchGestures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTouchGestures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTouchGestures")(js.undefined)
        ret
    }
    @scala.inline
    def withArgumentAxis(value: both | none | pan | zoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgumentAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withDragBoxStyle(value: AnonOpacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragBoxStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragBoxStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragBoxStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDragToZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragToZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragToZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragToZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withPanKey(value: alt | ctrl | meta | shift): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panKey")(js.undefined)
        ret
    }
    @scala.inline
    def withValueAxis(value: both | none | pan | zoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAxis")(js.undefined)
        ret
    }
  }
  
}

