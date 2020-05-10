package typingsSlinky.leafletDraw.mod.DrawOptions

import typingsSlinky.leaflet.mod.DivIcon_
import typingsSlinky.leaflet.mod.IconOptions
import typingsSlinky.leaflet.mod.Icon_
import typingsSlinky.leafletDraw.PolylineOptionsclickableb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineOptions extends SimpleShapeOptions {
  /**
    * Determines if line segments can cross.
    *
    * @default true
    */
  var allowIntersection: js.UndefOr[Boolean] = js.native
  /**
    * Configuration options for the error that displays if an intersection is detected.
    *
    * @default { color: '#b00b00', timeout: 2500 }
    */
  var drawError: js.UndefOr[DrawErrorOptions] = js.native
  /**
    * To change distance calculation
    *
    * @default 1
    */
  var factor: js.UndefOr[Double] = js.native
  /**
    * When not metric, to use feet instead of yards for display.
    *
    * @default true
    */
  var feet: js.UndefOr[Boolean] = js.native
  /**
    * Distance in pixels between each guide dash.
    *
    * @default 20
    */
  var guidelineDistance: js.UndefOr[Double] = js.native
  var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  /**
    * The maximum length of the guide line
    *
    * @default 4000
    */
  var maxGuideLineLength: js.UndefOr[Double] = js.native
  /**
    * Once this number of points are placed, finish shape
    *
    * @default 0
    */
  var maxPoints: js.UndefOr[Double] = js.native
  /**
    * Determines which measurement system (metric or imperial) is used.
    *
    * @default true
    */
  var metric: js.UndefOr[Boolean] = js.native
  /**
    * When not metric, not feet use nautic mile for display
    *
    * @default false
    */
  var nautic: js.UndefOr[Boolean] = js.native
  /**
    * The options used when drawing the polyline/polygon on the map.
    *
    * @default { stroke: true, color: '#3388ff', weight: 4, opacity: 0.5, fill: false, clickable: true }
    */
  var shapeOptions: js.UndefOr[PolylineOptionsclickableb] = js.native
  /**
    * Whether to display distance in the tooltip
    *
    * @default true
    */
  var showLength: js.UndefOr[Boolean] = js.native
  var touchIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  /**
    * This should be a high number to ensure that you can draw over all other layers on the map.
    *
    * @default 2000
    */
  var zIndexOffset: js.UndefOr[Double] = js.native
}

object PolylineOptions {
  @scala.inline
  def apply(): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineOptions]
  }
  @scala.inline
  implicit class PolylineOptionsOps[Self <: PolylineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowIntersection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowIntersection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowIntersection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowIntersection")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawError(value: DrawErrorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawError")(js.undefined)
        ret
    }
    @scala.inline
    def withFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(js.undefined)
        ret
    }
    @scala.inline
    def withFeet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feet")(js.undefined)
        ret
    }
    @scala.inline
    def withGuidelineDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guidelineDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuidelineDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guidelineDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: Icon_[IconOptions] | DivIcon_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxGuideLineLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxGuideLineLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxGuideLineLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxGuideLineLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withMetric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(js.undefined)
        ret
    }
    @scala.inline
    def withNautic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nautic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNautic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nautic")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeOptions(value: PolylineOptionsclickableb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLength(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLength")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchIcon(value: Icon_[IconOptions] | DivIcon_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndexOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndexOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexOffset")(js.undefined)
        ret
    }
  }
  
}

