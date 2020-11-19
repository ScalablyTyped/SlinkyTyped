package typingsSlinky.reactNavigation.mod

import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashBACK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationBackAction
  extends NavigationStackAction
     with NavigationBackActionPayload
     with NavigationTabAction {
  
  var `type`: NavigationSlashBACK = js.native
}
object NavigationBackAction {
  
  @scala.inline
  def apply(`type`: NavigationSlashBACK): NavigationBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBackAction]
  }
  
  @scala.inline
  implicit class NavigationBackActionOps[Self <: NavigationBackAction] (val x: Self) extends AnyVal {
    
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
    def setType(value: NavigationSlashBACK): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
