package typingsSlinky.reactNativeSvg.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNativeSvg.mod.Color
import typingsSlinky.reactNativeSvg.mod.ColumnMajorTransformMatrix
import typingsSlinky.reactNativeSvg.mod.FillRule
import typingsSlinky.reactNativeSvg.mod.FontObject
import typingsSlinky.reactNativeSvg.mod.FontStretch
import typingsSlinky.reactNativeSvg.mod.FontStyle
import typingsSlinky.reactNativeSvg.mod.FontVariant
import typingsSlinky.reactNativeSvg.mod.FontVariantLigatures
import typingsSlinky.reactNativeSvg.mod.FontWeight
import typingsSlinky.reactNativeSvg.mod.Linecap
import typingsSlinky.reactNativeSvg.mod.Linejoin
import typingsSlinky.reactNativeSvg.mod.NumberArray
import typingsSlinky.reactNativeSvg.mod.NumberProp
import typingsSlinky.reactNativeSvg.mod.TSpanCls
import typingsSlinky.reactNativeSvg.mod.TSpanProps
import typingsSlinky.reactNativeSvg.mod.TextAnchor
import typingsSlinky.reactNativeSvg.mod.TextDecoration
import typingsSlinky.reactNativeSvg.mod.TransformObject
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.`box-none`
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.`box-only`
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.`non-scaling-stroke`
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.auto
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.default
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.inherit
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.nonScalingStroke
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.none
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TSpan {
  
  @JSImport("react-native-svg", "TSpan")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, TSpanCls] {
    
    @scala.inline
    def clipPath(value: String): this.type = set("clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clipRule(value: FillRule): this.type = set("clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dx(value: NumberArray): this.type = set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dxVarargs(value: NumberProp*): this.type = set("dx", js.Array(value :_*))
    
    @scala.inline
    def dy(value: NumberArray): this.type = set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dyVarargs(value: NumberProp*): this.type = set("dy", js.Array(value :_*))
    
    @scala.inline
    def fill(value: Color): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillOpacity(value: NumberProp): this.type = set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillRule(value: FillRule): this.type = set("fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillVarargs(value: Double*): this.type = set("fill", js.Array(value :_*))
    
    @scala.inline
    def font(value: FontObject): this.type = set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontFeatureSettings(value: String): this.type = set("fontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSize(value: NumberProp): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontStretch(value: FontStretch): this.type = set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontStyle(value: FontStyle): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontVariant(value: FontVariant): this.type = set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontVariantLigatures(value: FontVariantLigatures): this.type = set("fontVariantLigatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontVariationSettings(value: String): this.type = set("fontVariationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontWeight(value: FontWeight): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inlineSize(value: NumberProp): this.type = set("inlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def kerning(value: NumberProp): this.type = set("kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def letterSpacing(value: NumberProp): this.type = set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marker(value: String): this.type = set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerEnd(value: String): this.type = set("markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerMid(value: String): this.type = set("markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerStart(value: String): this.type = set("markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mask(value: String): this.type = set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLongPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPressIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPressOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderGrant", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderTerminate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def origin(value: NumberArray): this.type = set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def originVarargs(value: NumberProp*): this.type = set("origin", js.Array(value :_*))
    
    @scala.inline
    def originX(value: NumberProp): this.type = set("originX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def originY(value: NumberProp): this.type = set("originY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotate(value: NumberArray): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotateVarargs(value: NumberProp*): this.type = set("rotate", js.Array(value :_*))
    
    @scala.inline
    def rotation(value: NumberProp): this.type = set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: NumberArray): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleVarargs(value: NumberProp*): this.type = set("scale", js.Array(value :_*))
    
    @scala.inline
    def scaleX(value: NumberProp): this.type = set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleY(value: NumberProp): this.type = set("scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skew(value: NumberArray): this.type = set("skew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skewVarargs(value: NumberProp*): this.type = set("skew", js.Array(value :_*))
    
    @scala.inline
    def skewX(value: NumberProp): this.type = set("skewX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skewY(value: NumberProp): this.type = set("skewY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stroke(value: Color): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeDasharray(value: js.Array[NumberProp] | NumberProp): this.type = set("strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeDasharrayVarargs(value: NumberProp*): this.type = set("strokeDasharray", js.Array(value :_*))
    
    @scala.inline
    def strokeDashoffset(value: NumberProp): this.type = set("strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeLinecap(value: Linecap): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeLinejoin(value: Linejoin): this.type = set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeMiterlimit(value: NumberProp): this.type = set("strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeOpacity(value: NumberProp): this.type = set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeVarargs(value: Double*): this.type = set("stroke", js.Array(value :_*))
    
    @scala.inline
    def strokeWidth(value: NumberProp): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textAnchor(value: TextAnchor): this.type = set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textDecoration(value: TextDecoration): this.type = set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transform(value: ColumnMajorTransformMatrix | String | TransformObject): this.type = set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translate(value: NumberArray): this.type = set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translateVarargs(value: NumberProp*): this.type = set("translate", js.Array(value :_*))
    
    @scala.inline
    def translateX(value: NumberProp): this.type = set("translateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translateY(value: NumberProp): this.type = set("translateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vectorEffect(value: none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri): this.type = set("vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wordSpacing(value: NumberProp): this.type = set("wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x(value: NumberArray): this.type = set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xVarargs(value: NumberProp*): this.type = set("x", js.Array(value :_*))
    
    @scala.inline
    def y(value: NumberArray): this.type = set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yVarargs(value: NumberProp*): this.type = set("y", js.Array(value :_*))
  }
  
  implicit def make(companion: TSpan.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TSpanProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
