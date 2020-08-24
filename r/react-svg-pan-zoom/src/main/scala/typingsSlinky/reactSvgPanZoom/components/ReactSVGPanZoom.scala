package typingsSlinky.reactSvgPanZoom.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSvgPanZoom.anon.Background
import typingsSlinky.reactSvgPanZoom.anon.Position
import typingsSlinky.reactSvgPanZoom.mod.Props
import typingsSlinky.reactSvgPanZoom.mod.Tool
import typingsSlinky.reactSvgPanZoom.mod.Value
import typingsSlinky.reactSvgPanZoom.mod.ViewerMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSVGPanZoom {
  @JSImport("react-svg-pan-zoom", "ReactSVGPanZoom")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSvgPanZoom.mod.ReactSVGPanZoom] {
    @scala.inline
    def SVGBackground(value: String): this.type = set("SVGBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def background(value: String): this.type = set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def customMiniatureReactElement(value: ReactElement): this.type = set("customMiniature", value.asInstanceOf[js.Any])
    @scala.inline
    def customMiniatureFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("customMiniature", value.asInstanceOf[js.Any])
    @scala.inline
    def customMiniatureComponentClass(value: ReactComponentClass[js.Object]): this.type = set("customMiniature", value.asInstanceOf[js.Any])
    @scala.inline
    def customMiniature(value: ReactElement | ReactComponentClass[js.Object]): this.type = set("customMiniature", value.asInstanceOf[js.Any])
    @scala.inline
    def customToolbarFunctionComponent(value: ReactComponentClass[_]): this.type = set("customToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def customToolbarComponent(value: ReactComponentClass[_]): this.type = set("customToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def customToolbar(value: ReactComponentClass[_]): this.type = set("customToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def detectAutoPan(value: Boolean): this.type = set("detectAutoPan", value.asInstanceOf[js.Any])
    @scala.inline
    def detectPinchGesture(value: Boolean): this.type = set("detectPinchGesture", value.asInstanceOf[js.Any])
    @scala.inline
    def detectWheel(value: Boolean): this.type = set("detectWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def disableDoubleClickZoomWithToolAuto(value: Boolean): this.type = set("disableDoubleClickZoomWithToolAuto", value.asInstanceOf[js.Any])
    @scala.inline
    def miniatureProps(value: Background): this.type = set("miniatureProps", value.asInstanceOf[js.Any])
    @scala.inline
    def modifierKeysVarargs(value: String*): this.type = set("modifierKeys", js.Array(value :_*))
    @scala.inline
    def modifierKeys(value: js.Array[String]): this.type = set("modifierKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* event */ ViewerMouseEvent[_] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDoubleClick(value: /* event */ ViewerMouseEvent[_] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseDown(value: /* event */ ViewerMouseEvent[_] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseMove(value: /* event */ ViewerMouseEvent[_] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseUp(value: /* event */ ViewerMouseEvent[_] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def onPan(value: /* event */ ViewerMouseEvent[_] => Unit): this.type = set("onPan", js.Any.fromFunction1(value))
    @scala.inline
    def onZoom(value: /* event */ ViewerMouseEvent[_] => Unit): this.type = set("onZoom", js.Any.fromFunction1(value))
    @scala.inline
    def preventPanOutside(value: Boolean): this.type = set("preventPanOutside", value.asInstanceOf[js.Any])
    @scala.inline
    def scaleFactor(value: Double): this.type = set("scaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def scaleFactorMax(value: Double): this.type = set("scaleFactorMax", value.asInstanceOf[js.Any])
    @scala.inline
    def scaleFactorMin(value: Double): this.type = set("scaleFactorMin", value.asInstanceOf[js.Any])
    @scala.inline
    def scaleFactorOnWheel(value: Double): this.type = set("scaleFactorOnWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def toolbarProps(value: Position): this.type = set("toolbarProps", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Value): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    height: Double,
    onChangeTool: Tool => Unit,
    onChangeValue: Value => Unit,
    tool: Tool,
    width: Double
  ): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], onChangeTool = js.Any.fromFunction1(onChangeTool), onChangeValue = js.Any.fromFunction1(onChangeValue), tool = tool.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

