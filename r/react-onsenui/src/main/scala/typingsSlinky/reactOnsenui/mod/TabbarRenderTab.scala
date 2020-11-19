package typingsSlinky.reactOnsenui.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabbarRenderTab extends js.Object {
  
  var content: ReactElement = js.native
  
  var tab: ReactElement = js.native
}
object TabbarRenderTab {
  
  @scala.inline
  def apply(content: ReactElement, tab: ReactElement): TabbarRenderTab = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbarRenderTab]
  }
  
  @scala.inline
  implicit class TabbarRenderTabOps[Self <: TabbarRenderTab] (val x: Self) extends AnyVal {
    
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
    def setContent(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: ReactElement): Self = this.set("tab", value.asInstanceOf[js.Any])
  }
}
