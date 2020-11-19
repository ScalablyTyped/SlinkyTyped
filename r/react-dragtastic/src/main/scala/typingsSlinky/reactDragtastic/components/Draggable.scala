package typingsSlinky.reactDragtastic.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDragtastic.anon.StateisActivebooleanevent
import typingsSlinky.reactDragtastic.mod.DraggableProps
import typingsSlinky.reactDragtastic.mod.Id
import typingsSlinky.reactDragtastic.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Draggable {
  
  @JSImport("react-dragtastic", "Draggable")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactDragtastic.mod.Draggable] {
    
    @scala.inline
    def data(value: js.Any): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: Id): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDrag(value: () => Unit): this.type = set("onDrag", js.Any.fromFunction0(value))
    
    @scala.inline
    def onDragEnd(value: /* data */ js.Any => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStart(value: /* data */ js.Any => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def subscribeToVarargs(value: String*): this.type = set("subscribeTo", js.Array(value :_*))
    
    @scala.inline
    def subscribeTo(value: js.Array[String]): this.type = set("subscribeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subscribeToNull: this.type = set("subscribeTo", null)
    
    @scala.inline
    def `type`(value: Type): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DraggableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: StateisActivebooleanevent => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[DraggableProps]))
  }
}
