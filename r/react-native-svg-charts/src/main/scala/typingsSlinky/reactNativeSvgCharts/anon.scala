package typingsSlinky.reactNativeSvgCharts

import org.scalablytyped.runtime.StringDictionary
import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNativeSvg.mod.AlignmentBaseline
import typingsSlinky.reactNativeSvg.mod.BaselineShift
import typingsSlinky.reactNativeSvg.mod.ColumnMajorTransformMatrix
import typingsSlinky.reactNativeSvg.mod.FillRule
import typingsSlinky.reactNativeSvg.mod.FontObject
import typingsSlinky.reactNativeSvg.mod.FontStretch
import typingsSlinky.reactNativeSvg.mod.FontStyle
import typingsSlinky.reactNativeSvg.mod.FontVariant
import typingsSlinky.reactNativeSvg.mod.FontVariantLigatures
import typingsSlinky.reactNativeSvg.mod.FontWeight
import typingsSlinky.reactNativeSvg.mod.LengthAdjust
import typingsSlinky.reactNativeSvg.mod.Linecap
import typingsSlinky.reactNativeSvg.mod.Linejoin
import typingsSlinky.reactNativeSvg.mod.NumberArray
import typingsSlinky.reactNativeSvg.mod.NumberProp
import typingsSlinky.reactNativeSvg.mod.TextAnchor
import typingsSlinky.reactNativeSvg.mod.TextDecoration
import typingsSlinky.reactNativeSvg.mod.TransformObject
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.HORIZONTAL
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.VERTICAL
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.`box-none`
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.`box-only`
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.`non-scaling-stroke`
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.auto
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.default
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.inherit
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.nonScalingStroke
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.none
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BOTH extends StObject {
    
    var BOTH: typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.BOTH = js.native
    
    var HORIZONTAL: typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.HORIZONTAL = js.native
    
    var VERTICAL: typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.VERTICAL = js.native
  }
  object BOTH {
    
    @scala.inline
    def apply(
      BOTH: typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.BOTH,
      HORIZONTAL: HORIZONTAL,
      VERTICAL: VERTICAL
    ): BOTH = {
      val __obj = js.Dynamic.literal(BOTH = BOTH.asInstanceOf[js.Any], HORIZONTAL = HORIZONTAL.asInstanceOf[js.Any], VERTICAL = VERTICAL.asInstanceOf[js.Any])
      __obj.asInstanceOf[BOTH]
    }
    
    @scala.inline
    implicit class BOTHMutableBuilder[Self <: BOTH] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBOTH(value: typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.BOTH): Self = StObject.set(x, "BOTH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHORIZONTAL(value: HORIZONTAL): Self = StObject.set(x, "HORIZONTAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVERTICAL(value: VERTICAL): Self = StObject.set(x, "VERTICAL", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Bottom extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var left: js.UndefOr[Double] = js.native
    
    var right: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(): Bottom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait Color[T] extends StObject {
    
    var color: String = js.native
    
    var height: Double = js.native
    
    var id: String = js.native
    
    var index: Double = js.native
    
    var key: /* keyof T */ String = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Color {
    
    @scala.inline
    def apply[T](
      color: String,
      height: Double,
      id: String,
      index: Double,
      key: /* keyof T */ String,
      width: Double,
      x: Double,
      y: Double
    ): Color[T] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color[T]]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color[_], T] (val x: Self with Color[T]) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: /* keyof T */ String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CornerRadius extends StObject {
    
    var cornerRadius: js.UndefOr[Double | String] = js.native
    
    var outerRadius: js.UndefOr[Double | String] = js.native
  }
  object CornerRadius {
    
    @scala.inline
    def apply(): CornerRadius = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CornerRadius]
    }
    
    @scala.inline
    implicit class CornerRadiusMutableBuilder[Self <: CornerRadius] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCornerRadius(value: Double | String): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setOuterRadius(value: Double | String): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Left extends StObject {
    
    var left: js.UndefOr[Double] = js.native
    
    var right: js.UndefOr[Double] = js.native
  }
  object Left {
    
    @scala.inline
    def apply(): Left = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-native-svg.react-native-svg.LineProps> */
  @js.native
  trait PartialLineProps extends StObject {
    
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
    implicit class PartialLinePropsMutableBuilder[Self <: PartialLineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      @scala.inline
      def setClipRule(value: FillRule): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      @scala.inline
      def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
      
      @scala.inline
      def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
      
      @scala.inline
      def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFill(value: typingsSlinky.reactNativeSvg.mod.Color): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: NumberProp): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillRule(value: FillRule): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFillVarargs(value: Double*): Self = StObject.set(x, "fill", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      @scala.inline
      def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      @scala.inline
      def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      @scala.inline
      def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setOnLongPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      @scala.inline
      def setOnPressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setOnResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
      
      @scala.inline
      def setOnResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
      
      @scala.inline
      def setOnResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
      
      @scala.inline
      def setOnResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
      
      @scala.inline
      def setOnResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      @scala.inline
      def setOnResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
      
      @scala.inline
      def setOnResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
      
      @scala.inline
      def setOnResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOrigin(value: NumberArray): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setOriginVarargs(value: NumberProp*): Self = StObject.set(x, "origin", js.Array(value :_*))
      
      @scala.inline
      def setOriginX(value: NumberProp): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginXUndefined: Self = StObject.set(x, "originX", js.undefined)
      
      @scala.inline
      def setOriginY(value: NumberProp): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginYUndefined: Self = StObject.set(x, "originY", js.undefined)
      
      @scala.inline
      def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setRotation(value: NumberProp): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setScale(value: NumberArray): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setScaleVarargs(value: NumberProp*): Self = StObject.set(x, "scale", js.Array(value :_*))
      
      @scala.inline
      def setScaleX(value: NumberProp): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      @scala.inline
      def setScaleY(value: NumberProp): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      @scala.inline
      def setSkew(value: NumberArray): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkewUndefined: Self = StObject.set(x, "skew", js.undefined)
      
      @scala.inline
      def setSkewVarargs(value: NumberProp*): Self = StObject.set(x, "skew", js.Array(value :_*))
      
      @scala.inline
      def setSkewX(value: NumberProp): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkewXUndefined: Self = StObject.set(x, "skewX", js.undefined)
      
      @scala.inline
      def setSkewY(value: NumberProp): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkewYUndefined: Self = StObject.set(x, "skewY", js.undefined)
      
      @scala.inline
      def setStroke(value: typingsSlinky.reactNativeSvg.mod.Color): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharray(value: js.Array[NumberProp] | NumberProp): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      @scala.inline
      def setStrokeDasharrayVarargs(value: NumberProp*): Self = StObject.set(x, "strokeDasharray", js.Array(value :_*))
      
      @scala.inline
      def setStrokeDashoffset(value: NumberProp): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      @scala.inline
      def setStrokeLinecap(value: Linecap): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      @scala.inline
      def setStrokeLinejoin(value: Linejoin): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      @scala.inline
      def setStrokeMiterlimit(value: NumberProp): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: NumberProp): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeVarargs(value: Double*): Self = StObject.set(x, "stroke", js.Array(value :_*))
      
      @scala.inline
      def setStrokeWidth(value: NumberProp): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setTransform(value: ColumnMajorTransformMatrix | String | TransformObject): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTranslate(value: NumberArray): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setTranslateVarargs(value: NumberProp*): Self = StObject.set(x, "translate", js.Array(value :_*))
      
      @scala.inline
      def setTranslateX(value: NumberProp): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
      
      @scala.inline
      def setTranslateY(value: NumberProp): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
      
      @scala.inline
      def setVectorEffect(value: none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
      
      @scala.inline
      def setX(value: NumberArray): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1(value: NumberProp): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      @scala.inline
      def setX2(value: NumberProp): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setXVarargs(value: NumberProp*): Self = StObject.set(x, "x", js.Array(value :_*))
      
      @scala.inline
      def setY(value: NumberArray): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1(value: NumberProp): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      @scala.inline
      def setY2(value: NumberProp): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      @scala.inline
      def setYVarargs(value: NumberProp*): Self = StObject.set(x, "y", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<react-native-svg.react-native-svg.PathProps> */
  @js.native
  trait PartialPathProps extends StObject {
    
    var clipPath: js.UndefOr[String] = js.native
    
    var clipRule: js.UndefOr[FillRule] = js.native
    
    var d: js.UndefOr[String] = js.native
    
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
    
    var y: js.UndefOr[NumberArray] = js.native
  }
  object PartialPathProps {
    
    @scala.inline
    def apply(): PartialPathProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPathProps]
    }
    
    @scala.inline
    implicit class PartialPathPropsMutableBuilder[Self <: PartialPathProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      @scala.inline
      def setClipRule(value: FillRule): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      @scala.inline
      def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      @scala.inline
      def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
      
      @scala.inline
      def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
      
      @scala.inline
      def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFill(value: typingsSlinky.reactNativeSvg.mod.Color): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: NumberProp): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillRule(value: FillRule): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFillVarargs(value: Double*): Self = StObject.set(x, "fill", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      @scala.inline
      def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      @scala.inline
      def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      @scala.inline
      def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setOnLongPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      @scala.inline
      def setOnPressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setOnResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
      
      @scala.inline
      def setOnResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
      
      @scala.inline
      def setOnResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
      
      @scala.inline
      def setOnResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
      
      @scala.inline
      def setOnResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      @scala.inline
      def setOnResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
      
      @scala.inline
      def setOnResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
      
      @scala.inline
      def setOnResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOrigin(value: NumberArray): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setOriginVarargs(value: NumberProp*): Self = StObject.set(x, "origin", js.Array(value :_*))
      
      @scala.inline
      def setOriginX(value: NumberProp): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginXUndefined: Self = StObject.set(x, "originX", js.undefined)
      
      @scala.inline
      def setOriginY(value: NumberProp): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginYUndefined: Self = StObject.set(x, "originY", js.undefined)
      
      @scala.inline
      def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setRotation(value: NumberProp): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setScale(value: NumberArray): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setScaleVarargs(value: NumberProp*): Self = StObject.set(x, "scale", js.Array(value :_*))
      
      @scala.inline
      def setScaleX(value: NumberProp): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      @scala.inline
      def setScaleY(value: NumberProp): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      @scala.inline
      def setSkew(value: NumberArray): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkewUndefined: Self = StObject.set(x, "skew", js.undefined)
      
      @scala.inline
      def setSkewVarargs(value: NumberProp*): Self = StObject.set(x, "skew", js.Array(value :_*))
      
      @scala.inline
      def setSkewX(value: NumberProp): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkewXUndefined: Self = StObject.set(x, "skewX", js.undefined)
      
      @scala.inline
      def setSkewY(value: NumberProp): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkewYUndefined: Self = StObject.set(x, "skewY", js.undefined)
      
      @scala.inline
      def setStroke(value: typingsSlinky.reactNativeSvg.mod.Color): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharray(value: js.Array[NumberProp] | NumberProp): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      @scala.inline
      def setStrokeDasharrayVarargs(value: NumberProp*): Self = StObject.set(x, "strokeDasharray", js.Array(value :_*))
      
      @scala.inline
      def setStrokeDashoffset(value: NumberProp): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      @scala.inline
      def setStrokeLinecap(value: Linecap): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      @scala.inline
      def setStrokeLinejoin(value: Linejoin): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      @scala.inline
      def setStrokeMiterlimit(value: NumberProp): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: NumberProp): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeVarargs(value: Double*): Self = StObject.set(x, "stroke", js.Array(value :_*))
      
      @scala.inline
      def setStrokeWidth(value: NumberProp): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setTransform(value: ColumnMajorTransformMatrix | String | TransformObject): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTranslate(value: NumberArray): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setTranslateVarargs(value: NumberProp*): Self = StObject.set(x, "translate", js.Array(value :_*))
      
      @scala.inline
      def setTranslateX(value: NumberProp): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
      
      @scala.inline
      def setTranslateY(value: NumberProp): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
      
      @scala.inline
      def setVectorEffect(value: none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
      
      @scala.inline
      def setX(value: NumberArray): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setXVarargs(value: NumberProp*): Self = StObject.set(x, "x", js.Array(value :_*))
      
      @scala.inline
      def setY(value: NumberArray): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      @scala.inline
      def setYVarargs(value: NumberProp*): Self = StObject.set(x, "y", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<react-native-svg.react-native-svg.TextProps> */
  @js.native
  trait PartialTextProps extends StObject {
    
    var alignmentBaseline: js.UndefOr[AlignmentBaseline] = js.native
    
    var baselineShift: js.UndefOr[BaselineShift] = js.native
    
    var clipPath: js.UndefOr[String] = js.native
    
    var clipRule: js.UndefOr[FillRule] = js.native
    
    var delayLongPress: js.UndefOr[Double] = js.native
    
    var delayPressIn: js.UndefOr[Double] = js.native
    
    var delayPressOut: js.UndefOr[Double] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var dx: js.UndefOr[NumberArray] = js.native
    
    var dy: js.UndefOr[NumberArray] = js.native
    
    var fill: js.UndefOr[typingsSlinky.reactNativeSvg.mod.Color] = js.native
    
    var fillOpacity: js.UndefOr[NumberProp] = js.native
    
    var fillRule: js.UndefOr[FillRule] = js.native
    
    var font: js.UndefOr[FontObject] = js.native
    
    var fontData: js.UndefOr[Null | StringDictionary[js.Any]] = js.native
    
    var fontFamily: js.UndefOr[String] = js.native
    
    var fontFeatureSettings: js.UndefOr[String] = js.native
    
    var fontSize: js.UndefOr[NumberProp] = js.native
    
    var fontStretch: js.UndefOr[FontStretch] = js.native
    
    var fontStyle: js.UndefOr[FontStyle] = js.native
    
    var fontVariant: js.UndefOr[FontVariant] = js.native
    
    var fontVariantLigatures: js.UndefOr[FontVariantLigatures] = js.native
    
    var fontVariationSettings: js.UndefOr[String] = js.native
    
    var fontWeight: js.UndefOr[FontWeight] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inlineSize: js.UndefOr[NumberProp] = js.native
    
    var kerning: js.UndefOr[NumberProp] = js.native
    
    var lengthAdjust: js.UndefOr[LengthAdjust] = js.native
    
    var letterSpacing: js.UndefOr[NumberProp] = js.native
    
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
    
    var rotate: js.UndefOr[NumberArray] = js.native
    
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
    
    var textAnchor: js.UndefOr[TextAnchor] = js.native
    
    var textDecoration: js.UndefOr[TextDecoration] = js.native
    
    var textLength: js.UndefOr[NumberProp] = js.native
    
    var transform: js.UndefOr[ColumnMajorTransformMatrix | String | TransformObject] = js.native
    
    var translate: js.UndefOr[NumberArray] = js.native
    
    var translateX: js.UndefOr[NumberProp] = js.native
    
    var translateY: js.UndefOr[NumberProp] = js.native
    
    var vectorEffect: js.UndefOr[none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri] = js.native
    
    var verticalAlign: js.UndefOr[NumberProp] = js.native
    
    var wordSpacing: js.UndefOr[NumberProp] = js.native
    
    var x: js.UndefOr[NumberArray] = js.native
    
    var y: js.UndefOr[NumberArray] = js.native
  }
  object PartialTextProps {
    
    @scala.inline
    def apply(): PartialTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTextProps]
    }
    
    @scala.inline
    implicit class PartialTextPropsMutableBuilder[Self <: PartialTextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignmentBaseline(value: AlignmentBaseline): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      @scala.inline
      def setBaselineShift(value: BaselineShift): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      @scala.inline
      def setBaselineShiftVarargs(value: NumberProp*): Self = StObject.set(x, "baselineShift", js.Array(value :_*))
      
      @scala.inline
      def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      @scala.inline
      def setClipRule(value: FillRule): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      @scala.inline
      def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
      
      @scala.inline
      def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
      
      @scala.inline
      def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDx(value: NumberArray): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      @scala.inline
      def setDxVarargs(value: NumberProp*): Self = StObject.set(x, "dx", js.Array(value :_*))
      
      @scala.inline
      def setDy(value: NumberArray): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      @scala.inline
      def setDyVarargs(value: NumberProp*): Self = StObject.set(x, "dy", js.Array(value :_*))
      
      @scala.inline
      def setFill(value: typingsSlinky.reactNativeSvg.mod.Color): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: NumberProp): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillRule(value: FillRule): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFillVarargs(value: Double*): Self = StObject.set(x, "fill", js.Array(value :_*))
      
      @scala.inline
      def setFont(value: FontObject): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontData(value: StringDictionary[js.Any]): Self = StObject.set(x, "fontData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontDataNull: Self = StObject.set(x, "fontData", null)
      
      @scala.inline
      def setFontDataUndefined: Self = StObject.set(x, "fontData", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontFeatureSettings(value: String): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
      
      @scala.inline
      def setFontSize(value: NumberProp): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStretch(value: FontStretch): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFontVariant(value: FontVariant): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantLigatures(value: FontVariantLigatures): Self = StObject.set(x, "fontVariantLigatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantLigaturesUndefined: Self = StObject.set(x, "fontVariantLigatures", js.undefined)
      
      @scala.inline
      def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      @scala.inline
      def setFontVariationSettings(value: String): Self = StObject.set(x, "fontVariationSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariationSettingsUndefined: Self = StObject.set(x, "fontVariationSettings", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInlineSize(value: NumberProp): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineSizeUndefined: Self = StObject.set(x, "inlineSize", js.undefined)
      
      @scala.inline
      def setKerning(value: NumberProp): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      @scala.inline
      def setLengthAdjust(value: LengthAdjust): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthAdjustUndefined: Self = StObject.set(x, "lengthAdjust", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: NumberProp): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      @scala.inline
      def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      @scala.inline
      def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      @scala.inline
      def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setOnLongPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      @scala.inline
      def setOnPressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setOnResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
      
      @scala.inline
      def setOnResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
      
      @scala.inline
      def setOnResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
      
      @scala.inline
      def setOnResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
      
      @scala.inline
      def setOnResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      @scala.inline
      def setOnResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
      
      @scala.inline
      def setOnResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
      
      @scala.inline
      def setOnResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOrigin(value: NumberArray): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setOriginVarargs(value: NumberProp*): Self = StObject.set(x, "origin", js.Array(value :_*))
      
      @scala.inline
      def setOriginX(value: NumberProp): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginXUndefined: Self = StObject.set(x, "originX", js.undefined)
      
      @scala.inline
      def setOriginY(value: NumberProp): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginYUndefined: Self = StObject.set(x, "originY", js.undefined)
      
      @scala.inline
      def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setRotate(value: NumberArray): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setRotateVarargs(value: NumberProp*): Self = StObject.set(x, "rotate", js.Array(value :_*))
      
      @scala.inline
      def setRotation(value: NumberProp): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setScale(value: NumberArray): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setScaleVarargs(value: NumberProp*): Self = StObject.set(x, "scale", js.Array(value :_*))
      
      @scala.inline
      def setScaleX(value: NumberProp): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      @scala.inline
      def setScaleY(value: NumberProp): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      @scala.inline
      def setSkew(value: NumberArray): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkewUndefined: Self = StObject.set(x, "skew", js.undefined)
      
      @scala.inline
      def setSkewVarargs(value: NumberProp*): Self = StObject.set(x, "skew", js.Array(value :_*))
      
      @scala.inline
      def setSkewX(value: NumberProp): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkewXUndefined: Self = StObject.set(x, "skewX", js.undefined)
      
      @scala.inline
      def setSkewY(value: NumberProp): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkewYUndefined: Self = StObject.set(x, "skewY", js.undefined)
      
      @scala.inline
      def setStroke(value: typingsSlinky.reactNativeSvg.mod.Color): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharray(value: js.Array[NumberProp] | NumberProp): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      @scala.inline
      def setStrokeDasharrayVarargs(value: NumberProp*): Self = StObject.set(x, "strokeDasharray", js.Array(value :_*))
      
      @scala.inline
      def setStrokeDashoffset(value: NumberProp): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      @scala.inline
      def setStrokeLinecap(value: Linecap): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      @scala.inline
      def setStrokeLinejoin(value: Linejoin): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      @scala.inline
      def setStrokeMiterlimit(value: NumberProp): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: NumberProp): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeVarargs(value: Double*): Self = StObject.set(x, "stroke", js.Array(value :_*))
      
      @scala.inline
      def setStrokeWidth(value: NumberProp): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setTextAnchor(value: TextAnchor): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      @scala.inline
      def setTextDecoration(value: TextDecoration): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      @scala.inline
      def setTextLength(value: NumberProp): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextLengthUndefined: Self = StObject.set(x, "textLength", js.undefined)
      
      @scala.inline
      def setTransform(value: ColumnMajorTransformMatrix | String | TransformObject): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTranslate(value: NumberArray): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setTranslateVarargs(value: NumberProp*): Self = StObject.set(x, "translate", js.Array(value :_*))
      
      @scala.inline
      def setTranslateX(value: NumberProp): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
      
      @scala.inline
      def setTranslateY(value: NumberProp): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
      
      @scala.inline
      def setVectorEffect(value: none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: NumberProp): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      @scala.inline
      def setWordSpacing(value: NumberProp): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
      
      @scala.inline
      def setX(value: NumberArray): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setXVarargs(value: NumberProp*): Self = StObject.set(x, "x", js.Array(value :_*))
      
      @scala.inline
      def setY(value: NumberArray): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      @scala.inline
      def setYVarargs(value: NumberProp*): Self = StObject.set(x, "y", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Top extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
  }
  object Top {
    
    @scala.inline
    def apply(): Top = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Top]
    }
    
    @scala.inline
    implicit class TopMutableBuilder[Self <: Top] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
