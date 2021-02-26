package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersLineItemSubLine extends StObject {
  
  /**
    * A generic line item (e.g. add-on).
    */
  var lineItem: js.UndefOr[GoogleActionsV2OrdersLineItem] = js.native
  
  /**
    * A note associated with the line item.
    */
  var note: js.UndefOr[String] = js.native
}
object GoogleActionsV2OrdersLineItemSubLine {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersLineItemSubLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersLineItemSubLine]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersLineItemSubLineMutableBuilder[Self <: GoogleActionsV2OrdersLineItemSubLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineItem(value: GoogleActionsV2OrdersLineItem): Self = StObject.set(x, "lineItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemUndefined: Self = StObject.set(x, "lineItem", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
