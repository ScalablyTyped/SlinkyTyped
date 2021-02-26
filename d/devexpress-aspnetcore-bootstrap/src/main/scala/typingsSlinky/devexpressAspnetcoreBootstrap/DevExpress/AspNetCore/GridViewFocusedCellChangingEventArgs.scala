package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridViewFocusedCellChangingEventArgs extends CancelEventArgs {
  
  val cellInfo: BootstrapGridViewCellInfo = js.native
}
object GridViewFocusedCellChangingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, cellInfo: BootstrapGridViewCellInfo, sender: Control): GridViewFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cellInfo = cellInfo.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewFocusedCellChangingEventArgs]
  }
  
  @scala.inline
  implicit class GridViewFocusedCellChangingEventArgsMutableBuilder[Self <: GridViewFocusedCellChangingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellInfo(value: BootstrapGridViewCellInfo): Self = StObject.set(x, "cellInfo", value.asInstanceOf[js.Any])
  }
}
