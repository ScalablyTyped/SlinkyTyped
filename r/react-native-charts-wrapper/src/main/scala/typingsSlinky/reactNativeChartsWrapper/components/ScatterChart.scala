package typingsSlinky.reactNativeChartsWrapper.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNative.reactNativeStrings.`box-none`
import typingsSlinky.reactNative.reactNativeStrings.`box-only`
import typingsSlinky.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsSlinky.reactNative.reactNativeStrings.assertive
import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.button
import typingsSlinky.reactNative.reactNativeStrings.no
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.polite
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_checked
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsSlinky.reactNative.reactNativeStrings.yes
import typingsSlinky.reactNativeChartsWrapper.anon.Action
import typingsSlinky.reactNativeChartsWrapper.anon.AxisDependency
import typingsSlinky.reactNativeChartsWrapper.anon.DataIndex
import typingsSlinky.reactNativeChartsWrapper.anon.Digits
import typingsSlinky.reactNativeChartsWrapper.anon.DurationX
import typingsSlinky.reactNativeChartsWrapper.anon.Right
import typingsSlinky.reactNativeChartsWrapper.anon.X
import typingsSlinky.reactNativeChartsWrapper.anon.Y
import typingsSlinky.reactNativeChartsWrapper.mod.ChartDescription
import typingsSlinky.reactNativeChartsWrapper.mod.ChartLegend
import typingsSlinky.reactNativeChartsWrapper.mod.Color
import typingsSlinky.reactNativeChartsWrapper.mod.Offsets
import typingsSlinky.reactNativeChartsWrapper.mod.ScatterChartProps
import typingsSlinky.reactNativeChartsWrapper.mod.ScatterData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScatterChart {
  
  @JSImport("react-native-charts-wrapper", "ScatterChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeChartsWrapper.mod.ScatterChart] {
    
    @scala.inline
    def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def accessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): this.type = set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): this.type = set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityTraitsVarargs(value: AccessibilityTrait*): this.type = set("accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animation(value: DurationX): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoScaleMinMaxEnabled(value: Boolean): this.type = set("autoScaleMinMaxEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderColor(value: Color): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def chartBackgroundColor(value: Color): this.type = set("chartBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def chartDescription(value: ChartDescription): this.type = set("chartDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def data(value: ScatterData): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def doubleTapToZoomEnabled(value: Boolean): this.type = set("doubleTapToZoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragDecelerationEnabled(value: Boolean): this.type = set("dragDecelerationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragDecelerationFrictionCoef(value: Double): this.type = set("dragDecelerationFrictionCoef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragEnabled(value: Boolean): this.type = set("dragEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def drawBorders(value: Boolean): this.type = set("drawBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def drawGridBackground(value: Boolean): this.type = set("drawGridBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraOffsets(value: Offsets): this.type = set("extraOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridBackgroundColor(value: Color): this.type = set("gridBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def group(value: String): this.type = set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlightPerDragEnabled(value: Boolean): this.type = set("highlightPerDragEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlightPerTapEnabled(value: Boolean): this.type = set("highlightPerTapEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlights(value: js.Array[DataIndex]): this.type = set("highlights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlightsVarargs(value: DataIndex*): this.type = set("highlights", js.Array(value :_*))
    
    @scala.inline
    def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def identifier(value: String): this.type = set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keepPositionOnRotation(value: Boolean): this.type = set("keepPositionOnRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def legend(value: ChartLegend): this.type = set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def logEnabled(value: Boolean): this.type = set("logEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marker(value: Digits): this.type = set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxHighlightDistance(value: Double): this.type = set("maxHighlightDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxVisibleValueCount(value: Double): this.type = set("maxVisibleValueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minOffset(value: Double): this.type = set("minOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noDataText(value: String): this.type = set("noDataText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onChange(value: SyntheticEvent[NodeHandle, Action] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
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
    def onSelect(value: SyntheticEvent[NodeHandle, Y | Null] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def pinchZoom(value: Boolean): this.type = set("pinchZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleEnabled(value: Boolean): this.type = set("scaleEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleXEnabled(value: Boolean): this.type = set("scaleXEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleYEnabled(value: Boolean): this.type = set("scaleYEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def syncX(value: Boolean): this.type = set("syncX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def syncY(value: Boolean): this.type = set("syncY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchEnabled(value: Boolean): this.type = set("touchEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def viewPortOffsets(value: Offsets): this.type = set("viewPortOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibleRange(value: X): this.type = set("visibleRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xAxis(value: typingsSlinky.reactNativeChartsWrapper.mod.xAxis): this.type = set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yAxis(value: Right): this.type = set("yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zoom(value: AxisDependency): this.type = set("zoom", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ScatterChart.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScatterChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
