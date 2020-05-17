package typingsSlinky.reactNativeMaps.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapCircleProps extends ViewProps {
  var center: LatLng = js.native
  var fillColor: js.UndefOr[String] = js.native
  var lineCap: js.UndefOr[LineCapType] = js.native
  var lineDashPattern: js.UndefOr[js.Array[Double]] = js.native
  var lineDashPhase: js.UndefOr[Double] = js.native
  var lineJoin: js.UndefOr[LineJoinType] = js.native
  var miterLimit: js.UndefOr[Double] = js.native
  var onPress: js.UndefOr[
    js.Function1[
      SyntheticEvent[NodeHandle, js.Object with typingsSlinky.reactNativeMaps.anon.Coordinate], 
      Unit
    ]
  ] = js.native
  var radius: Double = js.native
  var strokeColor: js.UndefOr[String] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object MapCircleProps {
  @scala.inline
  def apply(center: LatLng, radius: Double): MapCircleProps = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapCircleProps]
  }
  @scala.inline
  implicit class MapCirclePropsOps[Self <: MapCircleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLineCap(value: LineCapType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDashPattern(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDashPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDashPhase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashPhase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDashPhase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashPhase")(js.undefined)
        ret
    }
    @scala.inline
    def withLineJoin(value: LineJoinType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withMiterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiterLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(
      value: SyntheticEvent[NodeHandle, js.Object with typingsSlinky.reactNativeMaps.anon.Coordinate] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

