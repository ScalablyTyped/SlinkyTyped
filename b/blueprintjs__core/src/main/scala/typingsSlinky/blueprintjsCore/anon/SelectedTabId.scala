package typingsSlinky.blueprintjsCore.anon

import typingsSlinky.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectedTabId extends js.Object {
  
  var selectedTabId: ReactText = js.native
}
object SelectedTabId {
  
  @scala.inline
  def apply(selectedTabId: ReactText): SelectedTabId = {
    val __obj = js.Dynamic.literal(selectedTabId = selectedTabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedTabId]
  }
  
  @scala.inline
  implicit class SelectedTabIdOps[Self <: SelectedTabId] (val x: Self) extends AnyVal {
    
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
    def setSelectedTabId(value: ReactText): Self = this.set("selectedTabId", value.asInstanceOf[js.Any])
  }
}
