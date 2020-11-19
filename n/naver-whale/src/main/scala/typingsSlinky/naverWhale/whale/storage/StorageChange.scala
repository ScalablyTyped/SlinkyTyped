package typingsSlinky.naverWhale.whale.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageChange extends js.Object {
  
  /** Optional. The new value of the item, if there is a new value. */
  var newValue: js.UndefOr[js.Any] = js.native
  
  /** Optional. The old value of the item, if there was an old value. */
  var oldValue: js.UndefOr[js.Any] = js.native
}
object StorageChange {
  
  @scala.inline
  def apply(): StorageChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageChange]
  }
  
  @scala.inline
  implicit class StorageChangeOps[Self <: StorageChange] (val x: Self) extends AnyVal {
    
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
    def setNewValue(value: js.Any): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: js.Any): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
  }
}
