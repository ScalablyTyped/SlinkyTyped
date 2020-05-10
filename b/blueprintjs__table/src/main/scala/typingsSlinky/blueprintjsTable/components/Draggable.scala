package typingsSlinky.blueprintjsTable.components

import org.scalajs.dom.raw.MouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.draggableMod.ICoordinateData
import typingsSlinky.blueprintjsTable.draggableMod.IDraggableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Draggable {
  @JSImport("@blueprintjs/table", "Draggable")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.Draggable] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def onActivate(value: /* event */ MouseEvent => Boolean): this.type = set("onActivate", js.Any.fromFunction1(value))
    @scala.inline
    def onClick(value: /* event */ MouseEvent => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDoubleClick(value: /* event */ MouseEvent => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEnd(value: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Unit): this.type = set("onDragEnd", js.Any.fromFunction2(value))
    @scala.inline
    def onDragMove(value: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Unit): this.type = set("onDragMove", js.Any.fromFunction2(value))
    @scala.inline
    def preventDefault(value: Boolean): this.type = set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def stopPropagation(value: Boolean): this.type = set("stopPropagation", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDraggableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Draggable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

