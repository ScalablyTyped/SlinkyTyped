package typingsSlinky.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvBrowseFeedResponseBrowseItemsItem extends js.Object {
  
  var item: IgtvBrowseFeedResponseItem = js.native
  
  var `type`: String = js.native
}
object IgtvBrowseFeedResponseBrowseItemsItem {
  
  @scala.inline
  def apply(item: IgtvBrowseFeedResponseItem, `type`: String): IgtvBrowseFeedResponseBrowseItemsItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseBrowseItemsItem]
  }
  
  @scala.inline
  implicit class IgtvBrowseFeedResponseBrowseItemsItemOps[Self <: IgtvBrowseFeedResponseBrowseItemsItem] (val x: Self) extends AnyVal {
    
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
    def setItem(value: IgtvBrowseFeedResponseItem): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
