package typingsSlinky.downshift.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseMultipleSelectionGetSelectedItemPropsOptions[Item]
  extends HTMLProps[HTMLElement]
     with GetPropsWithRefKey {
  
  var index: js.UndefOr[Double] = js.native
  
  var selectedItem: Item = js.native
}
object UseMultipleSelectionGetSelectedItemPropsOptions {
  
  @scala.inline
  def apply[Item](selectedItem: Item): UseMultipleSelectionGetSelectedItemPropsOptions[Item] = {
    val __obj = js.Dynamic.literal(selectedItem = selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionGetSelectedItemPropsOptions[Item]]
  }
  
  @scala.inline
  implicit class UseMultipleSelectionGetSelectedItemPropsOptionsMutableBuilder[Self <: UseMultipleSelectionGetSelectedItemPropsOptions[_], Item] (val x: Self with UseMultipleSelectionGetSelectedItemPropsOptions[Item]) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setSelectedItem(value: Item): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
  }
}
