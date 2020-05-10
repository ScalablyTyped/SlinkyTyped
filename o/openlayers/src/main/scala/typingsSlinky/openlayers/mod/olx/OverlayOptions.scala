package typingsSlinky.openlayers.mod.olx

import org.scalajs.dom.raw.Element
import typingsSlinky.openlayers.mod.Coordinate_
import typingsSlinky.openlayers.mod.OverlayPositioning
import typingsSlinky.openlayers.mod.olx.animation.PanOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for the overlay.
  */
@js.native
trait OverlayOptions extends js.Object {
  var autoPan: js.UndefOr[Boolean] = js.native
  var autoPanAnimation: js.UndefOr[PanOptions] = js.native
  var autoPanMargin: js.UndefOr[Double] = js.native
  var element: js.UndefOr[Element] = js.native
  var id: js.UndefOr[Double | String] = js.native
  var insertFirst: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[js.Array[Double]] = js.native
  var position: js.UndefOr[Coordinate_] = js.native
  var positioning: js.UndefOr[OverlayPositioning | String] = js.native
  var stopEvent: js.UndefOr[Boolean] = js.native
}

object OverlayOptions {
  @scala.inline
  def apply(): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayOptions]
  }
  @scala.inline
  implicit class OverlayOptionsOps[Self <: OverlayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPan")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPanAnimation(value: PanOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPanAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPanMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPanMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Coordinate_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPositioning(value: OverlayPositioning | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positioning")(js.undefined)
        ret
    }
    @scala.inline
    def withStopEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEvent")(js.undefined)
        ret
    }
  }
  
}

