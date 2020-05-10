package typingsSlinky.blueprintjsTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.resizeHandleMod.IResizeHandleProps
import typingsSlinky.blueprintjsTable.resizeHandleMod.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResizeHandle {
  @JSImport("@blueprintjs/table", "ResizeHandle")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.ResizeHandle] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def onDoubleClick(value: () => Unit): this.type = set("onDoubleClick", js.Any.fromFunction0(value))
    @scala.inline
    def onResizeEnd(value: /* offset */ Double => Unit): this.type = set("onResizeEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onResizeMove(value: (/* offset */ Double, /* delta */ Double) => Unit): this.type = set("onResizeMove", js.Any.fromFunction2(value))
  }
  
  def withProps(p: IResizeHandleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onLayoutLock: js.UndefOr[Boolean] => Unit, orientation: Orientation): Builder = {
    val __props = js.Dynamic.literal(onLayoutLock = js.Any.fromFunction1(onLayoutLock), orientation = orientation.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IResizeHandleProps]))
  }
}

