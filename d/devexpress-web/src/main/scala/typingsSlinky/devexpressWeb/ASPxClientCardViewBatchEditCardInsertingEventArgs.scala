package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditCardInserting event.
  */
@js.native
trait ASPxClientCardViewBatchEditCardInsertingEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed card visible index.
    */
  var visibleIndex: Double = js.native
}
object ASPxClientCardViewBatchEditCardInsertingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, visibleIndex: Double): ASPxClientCardViewBatchEditCardInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditCardInsertingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCardViewBatchEditCardInsertingEventArgsMutableBuilder[Self <: ASPxClientCardViewBatchEditCardInsertingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
