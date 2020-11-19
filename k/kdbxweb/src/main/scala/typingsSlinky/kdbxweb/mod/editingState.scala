package typingsSlinky.kdbxweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait editingState extends js.Object {
  
  var added: js.Array[js.Date] = js.native
  
  var deleted: js.Array[js.Date] = js.native
}
object editingState {
  
  @scala.inline
  def apply(added: js.Array[js.Date], deleted: js.Array[js.Date]): editingState = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[editingState]
  }
  
  @scala.inline
  implicit class editingStateOps[Self <: editingState] (val x: Self) extends AnyVal {
    
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
    def setAddedVarargs(value: js.Date*): Self = this.set("added", js.Array(value :_*))
    
    @scala.inline
    def setAdded(value: js.Array[js.Date]): Self = this.set("added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedVarargs(value: js.Date*): Self = this.set("deleted", js.Array(value :_*))
    
    @scala.inline
    def setDeleted(value: js.Array[js.Date]): Self = this.set("deleted", value.asInstanceOf[js.Any])
  }
}
