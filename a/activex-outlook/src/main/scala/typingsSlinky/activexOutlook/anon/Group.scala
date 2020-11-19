package typingsSlinky.activexOutlook.anon

import typingsSlinky.activexOutlook.Outlook.OutlookBarGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends js.Object {
  
  var Cancel: Boolean = js.native
  
  val Group: OutlookBarGroup = js.native
}
object Group {
  
  @scala.inline
  def apply(Cancel: Boolean, Group: OutlookBarGroup): Group = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: OutlookBarGroup): Self = this.set("Group", value.asInstanceOf[js.Any])
  }
}
