package typingsSlinky.reactBeautifulDnd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBeautifulDnd.mod.BeforeCapture
import typingsSlinky.reactBeautifulDnd.mod.DragDropContextProps
import typingsSlinky.reactBeautifulDnd.mod.DragStart
import typingsSlinky.reactBeautifulDnd.mod.DragUpdate
import typingsSlinky.reactBeautifulDnd.mod.DropResult
import typingsSlinky.reactBeautifulDnd.mod.ResponderProvided
import typingsSlinky.reactBeautifulDnd.mod.Sensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DragDropContext {
  
  @scala.inline
  def apply(onDragEnd: (DropResult, ResponderProvided) => Unit): Builder = {
    val __props = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    new Builder(js.Array(this.component, __props.asInstanceOf[DragDropContextProps]))
  }
  
  @JSImport("react-beautiful-dnd", "DragDropContext")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBeautifulDnd.mod.DragDropContext] {
    
    @scala.inline
    def dragHandleUsageInstructions(value: String): this.type = set("dragHandleUsageInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableDefaultSensors(value: Boolean): this.type = set("enableDefaultSensors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBeforeCapture(value: /* before */ BeforeCapture => Unit): this.type = set("onBeforeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBeforeDragStart(value: /* initial */ DragStart => Unit): this.type = set("onBeforeDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStart(value: (/* initial */ DragStart, /* provided */ ResponderProvided) => Unit): this.type = set("onDragStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDragUpdate(value: (/* initial */ DragUpdate, /* provided */ ResponderProvided) => Unit): this.type = set("onDragUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def sensors(value: js.Array[Sensor]): this.type = set("sensors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sensorsVarargs(value: Sensor*): this.type = set("sensors", js.Array(value :_*))
  }
  
  def withProps(p: DragDropContextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
