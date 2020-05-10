package typingsSlinky.blueprintjsTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.resizableMod.IResizableProps
import typingsSlinky.blueprintjsTable.resizeHandleMod.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Resizable {
  @JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.resizableMod.Resizable] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def isResizable(value: Boolean): this.type = set("isResizable", value.asInstanceOf[js.Any])
    @scala.inline
    def maxSize(value: Double): this.type = set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def minSize(value: Double): this.type = set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def onDoubleClick(value: () => Unit): this.type = set("onDoubleClick", js.Any.fromFunction0(value))
    @scala.inline
    def onResizeEnd(value: /* size */ Double => Unit): this.type = set("onResizeEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onSizeChanged(value: /* size */ Double => Unit): this.type = set("onSizeChanged", js.Any.fromFunction1(value))
  }
  
  def withProps(p: IResizableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onLayoutLock: js.UndefOr[Boolean] => Unit, orientation: Orientation, size: Double): Builder = {
    val __props = js.Dynamic.literal(onLayoutLock = js.Any.fromFunction1(onLayoutLock), orientation = orientation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IResizableProps]))
  }
}

