package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapMarkerDefaultsTooltipAnimation extends js.Object {
  var close: js.UndefOr[MapMarkerDefaultsTooltipAnimationClose] = js.native
  var open: js.UndefOr[MapMarkerDefaultsTooltipAnimationOpen] = js.native
}

object MapMarkerDefaultsTooltipAnimation {
  @scala.inline
  def apply(): MapMarkerDefaultsTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapMarkerDefaultsTooltipAnimation]
  }
  @scala.inline
  implicit class MapMarkerDefaultsTooltipAnimationOps[Self <: MapMarkerDefaultsTooltipAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: MapMarkerDefaultsTooltipAnimationClose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: MapMarkerDefaultsTooltipAnimationOpen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
  }
  
}

