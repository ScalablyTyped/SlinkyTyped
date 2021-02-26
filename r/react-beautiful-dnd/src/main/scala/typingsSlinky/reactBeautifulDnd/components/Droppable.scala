package typingsSlinky.reactBeautifulDnd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBeautifulDnd.mod.Direction
import typingsSlinky.reactBeautifulDnd.mod.DraggableProvided
import typingsSlinky.reactBeautifulDnd.mod.DraggableRubric
import typingsSlinky.reactBeautifulDnd.mod.DraggableStateSnapshot
import typingsSlinky.reactBeautifulDnd.mod.DroppableId
import typingsSlinky.reactBeautifulDnd.mod.DroppableMode
import typingsSlinky.reactBeautifulDnd.mod.DroppableProps
import typingsSlinky.reactBeautifulDnd.mod.DroppableProvided
import typingsSlinky.reactBeautifulDnd.mod.DroppableStateSnapshot
import typingsSlinky.reactBeautifulDnd.mod.TypeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Droppable {
  
  @scala.inline
  def apply(children: (DroppableProvided, DroppableStateSnapshot) => ReactElement, droppableId: DroppableId): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children), droppableId = droppableId.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DroppableProps]))
  }
  
  @JSImport("react-beautiful-dnd", "Droppable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBeautifulDnd.mod.Droppable] {
    
    @scala.inline
    def direction(value: Direction): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainerForClone(value: () => ReactElement): this.type = set("getContainerForClone", js.Any.fromFunction0(value))
    
    @scala.inline
    def ignoreContainerClipping(value: Boolean): this.type = set("ignoreContainerClipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isCombineEnabled(value: Boolean): this.type = set("isCombineEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isDropDisabled(value: Boolean): this.type = set("isDropDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: DroppableMode): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderClone(
      value: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => ReactElement
    ): this.type = set("renderClone", js.Any.fromFunction3(value))
    
    @scala.inline
    def `type`(value: TypeId): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DroppableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
