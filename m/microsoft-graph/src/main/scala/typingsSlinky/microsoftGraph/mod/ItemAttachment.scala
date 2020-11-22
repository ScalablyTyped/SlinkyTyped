package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemAttachment extends Attachment {
  
  // The attached message or event. Navigation property.
  var item: js.UndefOr[NullableOption[OutlookItem]] = js.native
}
object ItemAttachment {
  
  @scala.inline
  def apply(): ItemAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemAttachment]
  }
  
  @scala.inline
  implicit class ItemAttachmentOps[Self <: ItemAttachment] (val x: Self) extends AnyVal {
    
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
    def setItem(value: NullableOption[OutlookItem]): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setItemNull: Self = this.set("item", null)
  }
}
