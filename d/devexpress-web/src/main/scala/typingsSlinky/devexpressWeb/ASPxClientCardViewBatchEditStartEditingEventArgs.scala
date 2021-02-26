package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditStartEditing event.
  */
@js.native
trait ASPxClientCardViewBatchEditStartEditingEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var cardValues: js.Any = js.native
  
  /**
    * Gets the CardView column that owns a cell that is about to be edited.
    */
  var focusedColumn: ASPxClientCardViewColumn = js.native
  
  /**
    * Gets the visible index of the card whose cells are about to be edited.
    */
  var visibleIndex: Double = js.native
}
object ASPxClientCardViewBatchEditStartEditingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, cardValues: js.Any, focusedColumn: ASPxClientCardViewColumn, visibleIndex: Double): ASPxClientCardViewBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cardValues = cardValues.asInstanceOf[js.Any], focusedColumn = focusedColumn.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditStartEditingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCardViewBatchEditStartEditingEventArgsMutableBuilder[Self <: ASPxClientCardViewBatchEditStartEditingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardValues(value: js.Any): Self = StObject.set(x, "cardValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedColumn(value: ASPxClientCardViewColumn): Self = StObject.set(x, "focusedColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
