package typingsSlinky.reactBeautifulDnd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBeautifulDnd.mod.DraggableId
import typingsSlinky.reactBeautifulDnd.mod.DraggableProps
import typingsSlinky.reactBeautifulDnd.mod.DraggableProvided
import typingsSlinky.reactBeautifulDnd.mod.DraggableRubric
import typingsSlinky.reactBeautifulDnd.mod.DraggableStateSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Draggable {
  
  @JSImport("react-beautiful-dnd", "Draggable")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBeautifulDnd.mod.Draggable] {
    
    @scala.inline
    def disableInteractiveElementBlocking(value: Boolean): this.type = set("disableInteractiveElementBlocking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isDragDisabled(value: Boolean): this.type = set("isDragDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldRespectForcePress(value: Boolean): this.type = set("shouldRespectForcePress", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DraggableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    children: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => ReactElement,
    draggableId: DraggableId,
    index: Double
  ): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction3(children), draggableId = draggableId.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DraggableProps]))
  }
}
