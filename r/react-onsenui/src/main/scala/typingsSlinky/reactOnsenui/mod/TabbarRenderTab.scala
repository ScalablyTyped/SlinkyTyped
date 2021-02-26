package typingsSlinky.reactOnsenui.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabbarRenderTab extends StObject {
  
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
  implicit class TabbarRenderTabMutableBuilder[Self <: TabbarRenderTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: ReactElement): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
