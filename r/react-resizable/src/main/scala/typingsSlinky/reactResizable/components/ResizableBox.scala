package typingsSlinky.reactResizable.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactResizable.mod.Axis
import typingsSlinky.reactResizable.mod.ResizableProps
import typingsSlinky.reactResizable.mod.ResizeCallbackData
import typingsSlinky.reactResizable.mod.ResizeHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResizableBox {
  @JSImport("react-resizable", "ResizableBox")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactResizable.mod.ResizableBox] {
    @scala.inline
    def axis(value: Axis): this.type = set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def draggableOpts(value: js.Any): this.type = set("draggableOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def handleReactElement(value: ReactElement): this.type = set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def handleFunction1(value: /* resizeHandle */ ResizeHandle => TagMod[Any]): this.type = set("handle", js.Any.fromFunction1(value))
    @scala.inline
    def handle(value: TagMod[Any] | (js.Function1[/* resizeHandle */ ResizeHandle, TagMod[Any]])): this.type = set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def handleSize(value: js.Tuple2[Double, Double]): this.type = set("handleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def lockAspectRatio(value: Boolean): this.type = set("lockAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def maxConstraints(value: js.Tuple2[Double, Double]): this.type = set("maxConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def minConstraints(value: js.Tuple2[Double, Double]): this.type = set("minConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def onResize(value: (/* e */ SyntheticEvent[Event, Element], /* data */ ResizeCallbackData) => _): this.type = set("onResize", js.Any.fromFunction2(value))
    @scala.inline
    def onResizeStart(value: (/* e */ SyntheticEvent[Event, Element], /* data */ ResizeCallbackData) => _): this.type = set("onResizeStart", js.Any.fromFunction2(value))
    @scala.inline
    def onResizeStop(value: (/* e */ SyntheticEvent[Event, Element], /* data */ ResizeCallbackData) => _): this.type = set("onResizeStop", js.Any.fromFunction2(value))
    @scala.inline
    def resizeHandles(value: js.Array[ResizeHandle]): this.type = set("resizeHandles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ResizableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(height: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ResizableProps]))
  }
}

