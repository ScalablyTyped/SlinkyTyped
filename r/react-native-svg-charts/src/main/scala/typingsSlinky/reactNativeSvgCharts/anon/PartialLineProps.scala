package typingsSlinky.reactNativeSvgCharts.anon

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNativeSvg.mod.ColumnMajorTransformMatrix
import typingsSlinky.reactNativeSvg.mod.FillRule
import typingsSlinky.reactNativeSvg.mod.Linecap
import typingsSlinky.reactNativeSvg.mod.Linejoin
import typingsSlinky.reactNativeSvg.mod.NumberArray
import typingsSlinky.reactNativeSvg.mod.NumberProp
import typingsSlinky.reactNativeSvg.mod.TransformObject
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.`box-none`
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.`box-only`
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.`non-scaling-stroke`
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.auto
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.default
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.inherit
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.nonScalingStroke
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.none
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-svg.react-native-svg.LineProps> */
@js.native
trait PartialLineProps extends js.Object {
  var clipPath: js.UndefOr[String] = js.native
  var clipRule: js.UndefOr[FillRule] = js.native
  var delayLongPress: js.UndefOr[Double] = js.native
  var delayPressIn: js.UndefOr[Double] = js.native
  var delayPressOut: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[typingsSlinky.reactNativeSvg.mod.Color] = js.native
  var fillOpacity: js.UndefOr[NumberProp] = js.native
  var fillRule: js.UndefOr[FillRule] = js.native
  var id: js.UndefOr[String] = js.native
  var marker: js.UndefOr[String] = js.native
  var markerEnd: js.UndefOr[String] = js.native
  var markerMid: js.UndefOr[String] = js.native
  var markerStart: js.UndefOr[String] = js.native
  var mask: js.UndefOr[String] = js.native
  var onLongPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  var onPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onPressIn: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onPressOut: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderEnd: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderGrant: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderMove: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderReject: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderRelease: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderStart: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderTerminate: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderTerminationRequest: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  var onStartShouldSetResponder: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  var opacity: js.UndefOr[NumberProp] = js.native
  var origin: js.UndefOr[NumberArray] = js.native
  var originX: js.UndefOr[NumberProp] = js.native
  var originY: js.UndefOr[NumberProp] = js.native
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.native
  var rotation: js.UndefOr[NumberProp] = js.native
  var scale: js.UndefOr[NumberArray] = js.native
  var scaleX: js.UndefOr[NumberProp] = js.native
  var scaleY: js.UndefOr[NumberProp] = js.native
  var skew: js.UndefOr[NumberArray] = js.native
  var skewX: js.UndefOr[NumberProp] = js.native
  var skewY: js.UndefOr[NumberProp] = js.native
  var stroke: js.UndefOr[typingsSlinky.reactNativeSvg.mod.Color] = js.native
  var strokeDasharray: js.UndefOr[js.Array[NumberProp] | NumberProp] = js.native
  var strokeDashoffset: js.UndefOr[NumberProp] = js.native
  var strokeLinecap: js.UndefOr[Linecap] = js.native
  var strokeLinejoin: js.UndefOr[Linejoin] = js.native
  var strokeMiterlimit: js.UndefOr[NumberProp] = js.native
  var strokeOpacity: js.UndefOr[NumberProp] = js.native
  var strokeWidth: js.UndefOr[NumberProp] = js.native
  var transform: js.UndefOr[ColumnMajorTransformMatrix | String | TransformObject] = js.native
  var translate: js.UndefOr[NumberArray] = js.native
  var translateX: js.UndefOr[NumberProp] = js.native
  var translateY: js.UndefOr[NumberProp] = js.native
  var vectorEffect: js.UndefOr[none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri] = js.native
  var x: js.UndefOr[NumberArray] = js.native
  var x1: js.UndefOr[NumberProp] = js.native
  var x2: js.UndefOr[NumberProp] = js.native
  var y: js.UndefOr[NumberArray] = js.native
  var y1: js.UndefOr[NumberProp] = js.native
  var y2: js.UndefOr[NumberProp] = js.native
}

object PartialLineProps {
  @scala.inline
  def apply(): PartialLineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLineProps]
  }
  @scala.inline
  implicit class PartialLinePropsOps[Self <: PartialLineProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPath")(js.undefined)
        ret
    }
    @scala.inline
    def withClipRule(value: FillRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipRule")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayLongPress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayLongPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayLongPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayLongPress")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayPressIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayPressIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayPressIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayPressIn")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayPressOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayPressOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayPressOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayPressOut")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: typingsSlinky.reactNativeSvg.mod.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFillOpacity(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withFillRule(value: FillRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRule")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
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
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerMid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerMid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerMid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerMid")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerStart")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLongPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLongPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMoveShouldSetResponder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMoveShouldSetResponderCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponderCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
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
    def withOnPressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPressIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressIn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPressOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderGrant")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderGrant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderGrant")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderReject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderReject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderReject")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderRelease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderTerminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderTerminationRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminationRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStartShouldSetResponder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStartShouldSetResponderCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponderCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: NumberArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginX(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originX")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginY(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originY")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerEvents(value: `box-none` | none | `box-only` | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: NumberArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleX(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleY(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(js.undefined)
        ret
    }
    @scala.inline
    def withSkew(value: NumberArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skew")(js.undefined)
        ret
    }
    @scala.inline
    def withSkewX(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkewX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewX")(js.undefined)
        ret
    }
    @scala.inline
    def withSkewY(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkewY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewY")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: typingsSlinky.reactNativeSvg.mod.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeDasharray(value: js.Array[NumberProp] | NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDasharray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDasharray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDasharray")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeDashoffset(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDashoffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashoffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeLinecap(value: Linecap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinecap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeLinecap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinecap")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeLinejoin(value: Linejoin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinejoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeLinejoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinejoin")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeMiterlimit(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterlimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeMiterlimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterlimit")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: NumberProp): Self = {
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
    def withTransform(value: ColumnMajorTransformMatrix | String | TransformObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslate(value: NumberArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslateX(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateX")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslateY(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateY")(js.undefined)
        ret
    }
    @scala.inline
    def withVectorEffect(value: none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vectorEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVectorEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vectorEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: NumberArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withX1(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(js.undefined)
        ret
    }
    @scala.inline
    def withX2(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: NumberArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withY1(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(js.undefined)
        ret
    }
    @scala.inline
    def withY2(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(js.undefined)
        ret
    }
  }
  
}

