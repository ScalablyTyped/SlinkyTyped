package typingsSlinky.activexOutlook.anon

import typingsSlinky.activexOutlook.Outlook.OutlookBarShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewShortcut extends js.Object {
  
  val NewShortcut: OutlookBarShortcut = js.native
}
object NewShortcut {
  
  @scala.inline
  def apply(NewShortcut: OutlookBarShortcut): NewShortcut = {
    val __obj = js.Dynamic.literal(NewShortcut = NewShortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewShortcut]
  }
  
  @scala.inline
  implicit class NewShortcutOps[Self <: NewShortcut] (val x: Self) extends AnyVal {
    
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
    def setNewShortcut(value: OutlookBarShortcut): Self = this.set("NewShortcut", value.asInstanceOf[js.Any])
  }
}
