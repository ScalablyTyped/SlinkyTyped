package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewOptions extends js.Object {
  /** The bounding rectangle of the map view. If both bounds and center are specified, bounds takes precedence over center. */
  var bounds: js.UndefOr[LocationRect] = js.native
  /** The location of the center of the map view. If both bounds and center are specified, bounds takes precedence over center. */
  var center: js.UndefOr[Location] = js.native
  /**	The amount the center is shifted in pixels.This property is ignored if center is not specified. */
  var centerOffset: js.UndefOr[Point] = js.native
  /**
    * The directional heading of the map. The heading is represented in geometric degrees with 0 or 360 = North, 90 = East,
    * 180 = South, and 270 = West.
    */
  var heading: js.UndefOr[Double] = js.native
  /** Indicates how the map labels are displayed. */
  var labelOverlay: js.UndefOr[LabelOverlay] = js.native
  /** The map type of the view. */
  var mapTypeId: js.UndefOr[MapTypeId] = js.native
  /** The amount of padding in pixels to be added to each side of the bounds of the map view. */
  var padding: js.UndefOr[Double] = js.native
  /** The angle relative to the horizon to tilt a streetside panorama image. */
  var pitch: js.UndefOr[Double] = js.native
  /** The zoom level of the map view. */
  var zoom: js.UndefOr[Double] = js.native
}

object IViewOptions {
  @scala.inline
  def apply(): IViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IViewOptions]
  }
  @scala.inline
  implicit class IViewOptionsOps[Self <: IViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: LocationRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterOffset(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOverlay(value: LabelOverlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withMapTypeId(value: MapTypeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeId")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

