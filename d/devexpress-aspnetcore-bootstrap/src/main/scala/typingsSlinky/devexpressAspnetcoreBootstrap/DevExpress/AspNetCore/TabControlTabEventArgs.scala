package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabControlTabEventArgs extends EventArgs {
  
  val tab: BootstrapTab = js.native
}
object TabControlTabEventArgs {
  
  @scala.inline
  def apply(sender: Control, tab: BootstrapTab): TabControlTabEventArgs = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabControlTabEventArgs]
  }
  
  @scala.inline
  implicit class TabControlTabEventArgsMutableBuilder[Self <: TabControlTabEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTab(value: BootstrapTab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
