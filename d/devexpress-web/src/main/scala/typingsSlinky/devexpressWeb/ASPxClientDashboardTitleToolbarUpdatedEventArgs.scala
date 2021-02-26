package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DashboardTitleToolbarUpdated event.
  */
@js.native
trait ASPxClientDashboardTitleToolbarUpdatedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Provides access to dashboard title options.
    */
  var Options: js.Any = js.native
}
object ASPxClientDashboardTitleToolbarUpdatedEventArgs {
  
  @scala.inline
  def apply(Options: js.Any): ASPxClientDashboardTitleToolbarUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardTitleToolbarUpdatedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardTitleToolbarUpdatedEventArgsMutableBuilder[Self <: ASPxClientDashboardTitleToolbarUpdatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
  }
}
