package typingsSlinky.reactJsonschemaForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldId extends js.Object {
  
  @JSName("$id")
  var $id: String = js.native
}
object FieldId {
  
  @scala.inline
  def apply($id: String): FieldId = {
    val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldId]
  }
  
  @scala.inline
  implicit class FieldIdOps[Self <: FieldId] (val x: Self) extends AnyVal {
    
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
    def set$id(value: String): Self = this.set("$id", value.asInstanceOf[js.Any])
  }
}
