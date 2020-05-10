package typingsSlinky.reactDragtastic.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDragtastic.mod.Accepts
import typingsSlinky.reactDragtastic.mod.DroppableProps
import typingsSlinky.reactDragtastic.mod.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Droppable {
  @JSImport("react-dragtastic", "Droppable")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactDragtastic.mod.Droppable] {
    @scala.inline
    def accepts(value: Accepts): this.type = set("accepts", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: Id): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragEnter(value: () => Unit): this.type = set("onDragEnter", js.Any.fromFunction0(value))
    @scala.inline
    def onDragLeave(value: () => Unit): this.type = set("onDragLeave", js.Any.fromFunction0(value))
    @scala.inline
    def onDrop(value: /* data */ js.Any => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def subscribeTo(value: js.Array[String]): this.type = set("subscribeTo", value.asInstanceOf[js.Any])
    @scala.inline
    def subscribeToNull: this.type = set("subscribeTo", null)
  }
  
  def withProps(p: DroppableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Droppable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

