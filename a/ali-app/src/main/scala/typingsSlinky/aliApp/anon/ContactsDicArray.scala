package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.my.ContactsDic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactsDicArray extends js.Object {
  
  var contactsDicArray: js.Array[ContactsDic] = js.native
}
object ContactsDicArray {
  
  @scala.inline
  def apply(contactsDicArray: js.Array[ContactsDic]): ContactsDicArray = {
    val __obj = js.Dynamic.literal(contactsDicArray = contactsDicArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactsDicArray]
  }
  
  @scala.inline
  implicit class ContactsDicArrayOps[Self <: ContactsDicArray] (val x: Self) extends AnyVal {
    
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
    def setContactsDicArrayVarargs(value: ContactsDic*): Self = this.set("contactsDicArray", js.Array(value :_*))
    
    @scala.inline
    def setContactsDicArray(value: js.Array[ContactsDic]): Self = this.set("contactsDicArray", value.asInstanceOf[js.Any])
  }
}
