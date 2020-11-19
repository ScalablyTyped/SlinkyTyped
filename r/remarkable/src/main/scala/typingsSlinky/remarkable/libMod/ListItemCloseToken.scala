package typingsSlinky.remarkable.libMod

import typingsSlinky.remarkable.remarkableStrings.list_item_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.remarkable.libMod._Token because Already inherited */ @js.native
trait ListItemCloseToken extends TagToken {
  
  @JSName("type")
  var type_ListItemCloseToken: list_item_close = js.native
}
object ListItemCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: list_item_close): ListItemCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemCloseToken]
  }
  
  @scala.inline
  implicit class ListItemCloseTokenOps[Self <: ListItemCloseToken] (val x: Self) extends AnyVal {
    
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
    def setType(value: list_item_close): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
