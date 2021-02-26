package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an event occurred to an item of a menu, a list box etc. */
@js.native
trait ItemEvent extends EventObject {
  
  /** specifies which item is newly highlighted. */
  var Highlighted: Double = js.native
  
  /** specifies the id of the item. */
  var ItemId: Double = js.native
  
  /** specifies which item is newly selected. */
  var Selected: Double = js.native
}
object ItemEvent {
  
  @scala.inline
  def apply(Highlighted: Double, ItemId: Double, Selected: Double, Source: XInterface): ItemEvent = {
    val __obj = js.Dynamic.literal(Highlighted = Highlighted.asInstanceOf[js.Any], ItemId = ItemId.asInstanceOf[js.Any], Selected = Selected.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemEvent]
  }
  
  @scala.inline
  implicit class ItemEventMutableBuilder[Self <: ItemEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlighted(value: Double): Self = StObject.set(x, "Highlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemId(value: Double): Self = StObject.set(x, "ItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Double): Self = StObject.set(x, "Selected", value.asInstanceOf[js.Any])
  }
}
