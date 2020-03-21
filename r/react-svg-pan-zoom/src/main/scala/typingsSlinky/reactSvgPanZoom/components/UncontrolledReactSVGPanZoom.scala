package typingsSlinky.reactSvgPanZoom.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactSvgPanZoom.AnonBackground
import typingsSlinky.reactSvgPanZoom.AnonPosition
import typingsSlinky.reactSvgPanZoom.mod.Tool
import typingsSlinky.reactSvgPanZoom.mod.UncontrolledProps
import typingsSlinky.reactSvgPanZoom.mod.Value
import typingsSlinky.reactSvgPanZoom.mod.ViewerMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UncontrolledReactSVGPanZoom
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactSvgPanZoom.mod.UncontrolledReactSVGPanZoom] {
  @JSImport("react-svg-pan-zoom", "UncontrolledReactSVGPanZoom")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    height: Double,
    width: Double,
    SVGBackground: String = null,
    background: String = null,
    customMiniature: ReactElement | ReactComponentClass[js.Object] = null,
    customToolbar: ReactComponentClass[_] = null,
    detectAutoPan: js.UndefOr[Boolean] = js.undefined,
    detectPinchGesture: js.UndefOr[Boolean] = js.undefined,
    detectWheel: js.UndefOr[Boolean] = js.undefined,
    disableDoubleClickZoomWithToolAuto: js.UndefOr[Boolean] = js.undefined,
    miniatureProps: AnonBackground = null,
    modifierKeys: js.Array[String] = null,
    onChangeTool: /* tool */ Tool => Unit = null,
    onChangeValue: /* value */ Value => Unit = null,
    onClick: /* event */ ViewerMouseEvent[_] => Unit = null,
    onDoubleClick: /* event */ ViewerMouseEvent[_] => Unit = null,
    onMouseDown: /* event */ ViewerMouseEvent[_] => Unit = null,
    onMouseMove: /* event */ ViewerMouseEvent[_] => Unit = null,
    onMouseUp: /* event */ ViewerMouseEvent[_] => Unit = null,
    onPan: /* event */ ViewerMouseEvent[_] => Unit = null,
    onZoom: /* event */ ViewerMouseEvent[_] => Unit = null,
    preventPanOutside: js.UndefOr[Boolean] = js.undefined,
    scaleFactor: Int | Double = null,
    scaleFactorMax: Int | Double = null,
    scaleFactorMin: Int | Double = null,
    scaleFactorOnWheel: Int | Double = null,
    style: js.Object = null,
    tool: Tool = null,
    toolbarProps: AnonPosition = null,
    value: Value = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactSvgPanZoom.mod.UncontrolledReactSVGPanZoom] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (SVGBackground != null) __obj.updateDynamic("SVGBackground")(SVGBackground.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (customMiniature != null) __obj.updateDynamic("customMiniature")(customMiniature.asInstanceOf[js.Any])
    if (customToolbar != null) __obj.updateDynamic("customToolbar")(customToolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(detectAutoPan)) __obj.updateDynamic("detectAutoPan")(detectAutoPan.asInstanceOf[js.Any])
    if (!js.isUndefined(detectPinchGesture)) __obj.updateDynamic("detectPinchGesture")(detectPinchGesture.asInstanceOf[js.Any])
    if (!js.isUndefined(detectWheel)) __obj.updateDynamic("detectWheel")(detectWheel.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDoubleClickZoomWithToolAuto)) __obj.updateDynamic("disableDoubleClickZoomWithToolAuto")(disableDoubleClickZoomWithToolAuto.asInstanceOf[js.Any])
    if (miniatureProps != null) __obj.updateDynamic("miniatureProps")(miniatureProps.asInstanceOf[js.Any])
    if (modifierKeys != null) __obj.updateDynamic("modifierKeys")(modifierKeys.asInstanceOf[js.Any])
    if (onChangeTool != null) __obj.updateDynamic("onChangeTool")(js.Any.fromFunction1(onChangeTool))
    if (onChangeValue != null) __obj.updateDynamic("onChangeValue")(js.Any.fromFunction1(onChangeValue))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPan != null) __obj.updateDynamic("onPan")(js.Any.fromFunction1(onPan))
    if (onZoom != null) __obj.updateDynamic("onZoom")(js.Any.fromFunction1(onZoom))
    if (!js.isUndefined(preventPanOutside)) __obj.updateDynamic("preventPanOutside")(preventPanOutside.asInstanceOf[js.Any])
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    if (scaleFactorMax != null) __obj.updateDynamic("scaleFactorMax")(scaleFactorMax.asInstanceOf[js.Any])
    if (scaleFactorMin != null) __obj.updateDynamic("scaleFactorMin")(scaleFactorMin.asInstanceOf[js.Any])
    if (scaleFactorOnWheel != null) __obj.updateDynamic("scaleFactorOnWheel")(scaleFactorOnWheel.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tool != null) __obj.updateDynamic("tool")(tool.asInstanceOf[js.Any])
    if (toolbarProps != null) __obj.updateDynamic("toolbarProps")(toolbarProps.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = UncontrolledProps
}

