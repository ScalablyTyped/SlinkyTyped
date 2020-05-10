package typingsSlinky.reResizable.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reResizable.AnonX
import typingsSlinky.reResizable.mod.Enable
import typingsSlinky.reResizable.mod.HandleClassName
import typingsSlinky.reResizable.mod.HandleComponent
import typingsSlinky.reResizable.mod.HandleStyles
import typingsSlinky.reResizable.mod.NumberSize
import typingsSlinky.reResizable.mod.ResizableProps
import typingsSlinky.reResizable.mod.Size
import typingsSlinky.reResizable.reResizableStrings.parent
import typingsSlinky.reResizable.reResizableStrings.window
import typingsSlinky.reResizable.resizerMod.Direction
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Resizable {
  @JSImport("re-resizable", "Resizable")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reResizable.mod.Resizable] {
    @scala.inline
    def boundsHTMLElement(value: HTMLElement): this.type = set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def bounds(value: parent | window | HTMLElement): this.type = set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSize(value: Size): this.type = set("defaultSize", value.asInstanceOf[js.Any])
    @scala.inline
    def enable(value: Enable): this.type = set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def grid(value: js.Tuple2[Double, Double]): this.type = set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def handleClasses(value: HandleClassName): this.type = set("handleClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def handleComponent(value: HandleComponent): this.type = set("handleComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def handleStyles(value: HandleStyles): this.type = set("handleStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def handleWrapperClass(value: String): this.type = set("handleWrapperClass", value.asInstanceOf[js.Any])
    @scala.inline
    def handleWrapperStyle(value: CSSProperties): this.type = set("handleWrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def lockAspectRatio(value: Boolean | Double): this.type = set("lockAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def lockAspectRatioExtraHeight(value: Double): this.type = set("lockAspectRatioExtraHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def lockAspectRatioExtraWidth(value: Double): this.type = set("lockAspectRatioExtraWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def maxHeight(value: String | Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def maxWidth(value: String | Double): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def minHeight(value: String | Double): this.type = set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def minWidth(value: String | Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def onResize(
      value: (/* event */ MouseEvent | TouchEvent, /* direction */ Direction, /* elementRef */ HTMLDivElement, /* delta */ NumberSize) => Unit
    ): this.type = set("onResize", js.Any.fromFunction4(value))
    @scala.inline
    def onResizeStart(
      value: (/* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticTouchEvent[HTMLDivElement], /* dir */ Direction, /* elementRef */ HTMLDivElement) => Unit | Boolean
    ): this.type = set("onResizeStart", js.Any.fromFunction3(value))
    @scala.inline
    def onResizeStop(
      value: (/* event */ MouseEvent | TouchEvent, /* direction */ Direction, /* elementRef */ HTMLDivElement, /* delta */ NumberSize) => Unit
    ): this.type = set("onResizeStop", js.Any.fromFunction4(value))
    @scala.inline
    def resizeRatio(value: Double): this.type = set("resizeRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def snap(value: AnonX): this.type = set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def snapGap(value: Double): this.type = set("snapGap", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ResizableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Resizable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

