package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Items extends js.Object {
  
  /**
    * The list of promoted items in the order that they will display across different playbacks to the same viewer.
    */
  var items: js.Array[Type] = js.native
  
  /**
    * The position object encapsulates information about the spatial position within the video where the promoted item will be displayed.
    */
  var position: CornerPosition = js.native
  
  /**
    * The timing object encapsulates information about the temporal position within the video when the promoted item will be displayed.
    */
  var timing: OffsetMs = js.native
}
object Items {
  
  @scala.inline
  def apply(items: js.Array[Type], position: CornerPosition, timing: OffsetMs): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  
  @scala.inline
  implicit class ItemsOps[Self <: Items] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: Type*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Type]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: CornerPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiming(value: OffsetMs): Self = this.set("timing", value.asInstanceOf[js.Any])
  }
}
