package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableLocation extends js.Object {
  
  var droppableId: DroppableId = js.native
  
  var index: Double = js.native
}
object DraggableLocation {
  
  @scala.inline
  def apply(droppableId: DroppableId, index: Double): DraggableLocation = {
    val __obj = js.Dynamic.literal(droppableId = droppableId.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableLocation]
  }
  
  @scala.inline
  implicit class DraggableLocationOps[Self <: DraggableLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDroppableId(value: DroppableId): Self = this.set("droppableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
}
