package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectedItemsChangedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the current selected data items.
    */
  var newItems: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get a reference to the previous selected data items.
    */
  var oldItems: js.UndefOr[js.Any] = js.native
}
object SelectedItemsChangedEventUIParam {
  
  @scala.inline
  def apply(): SelectedItemsChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemsChangedEventUIParam]
  }
  
  @scala.inline
  implicit class SelectedItemsChangedEventUIParamMutableBuilder[Self <: SelectedItemsChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewItems(value: js.Any): Self = StObject.set(x, "newItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewItemsUndefined: Self = StObject.set(x, "newItems", js.undefined)
    
    @scala.inline
    def setOldItems(value: js.Any): Self = StObject.set(x, "oldItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldItemsUndefined: Self = StObject.set(x, "oldItems", js.undefined)
  }
}
