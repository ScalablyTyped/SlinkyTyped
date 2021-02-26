package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridViewBatchEditRowDeletingEventArgs extends CancelEventArgs {
  
  val rowValues: js.Any = js.native
  
  val visibleIndex: Double = js.native
}
object GridViewBatchEditRowDeletingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, rowValues: js.Any, sender: Control, visibleIndex: Double): GridViewBatchEditRowDeletingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditRowDeletingEventArgs]
  }
  
  @scala.inline
  implicit class GridViewBatchEditRowDeletingEventArgsMutableBuilder[Self <: GridViewBatchEditRowDeletingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowValues(value: js.Any): Self = StObject.set(x, "rowValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
