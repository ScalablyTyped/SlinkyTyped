package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsCreateOrLoadUIParams extends StObject {
  
  var panel: JQuery = js.native
  
  var tab: JQuery = js.native
}
object TabsCreateOrLoadUIParams {
  
  @scala.inline
  def apply(panel: JQuery, tab: JQuery): TabsCreateOrLoadUIParams = {
    val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsCreateOrLoadUIParams]
  }
  
  @scala.inline
  implicit class TabsCreateOrLoadUIParamsMutableBuilder[Self <: TabsCreateOrLoadUIParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPanel(value: JQuery): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: JQuery): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
