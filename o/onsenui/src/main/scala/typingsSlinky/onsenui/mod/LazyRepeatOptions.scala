package typingsSlinky.onsenui.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LazyRepeatOptions extends StObject {
  
  /**
    * @description Should return the height of an item. The index is provided as an argument. This is important when rendering lists where the items have different height. The function is optional and if it isn't present the height of the first item will be automatically calculated and used for all other items.
    */
  var calculateItemHeight: js.UndefOr[Double] = js.native
  
  /**
    * @description Function which recieves an index and the scope for the item. Can be used to configure values in the item scope.
    */
  var configureItemScope: js.UndefOr[Double] = js.native
  
  /**
    * @description Should return the number of items in the list.
    */
  var countItems: js.UndefOr[Double] = js.native
  
  /**
    * @description This function should return a `HTMLElement`. To help rendering the element, the current index and a template is supplied as arguments. The template is the initial content of the `<ons-lazy-repeat>` element.
    */
  var createItemContent: js.UndefOr[HTMLElement] = js.native
  
  /**
    * @description This function is used called when an item is removed from the DOM. The index and DOM element is provided as arguments. The function is optional but may be important in order to avoid memory leaks.
    */
  var destroyItem: js.UndefOr[String] = js.native
}
object LazyRepeatOptions {
  
  @scala.inline
  def apply(): LazyRepeatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LazyRepeatOptions]
  }
  
  @scala.inline
  implicit class LazyRepeatOptionsMutableBuilder[Self <: LazyRepeatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculateItemHeight(value: Double): Self = StObject.set(x, "calculateItemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculateItemHeightUndefined: Self = StObject.set(x, "calculateItemHeight", js.undefined)
    
    @scala.inline
    def setConfigureItemScope(value: Double): Self = StObject.set(x, "configureItemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigureItemScopeUndefined: Self = StObject.set(x, "configureItemScope", js.undefined)
    
    @scala.inline
    def setCountItems(value: Double): Self = StObject.set(x, "countItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountItemsUndefined: Self = StObject.set(x, "countItems", js.undefined)
    
    @scala.inline
    def setCreateItemContent(value: HTMLElement): Self = StObject.set(x, "createItemContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateItemContentUndefined: Self = StObject.set(x, "createItemContent", js.undefined)
    
    @scala.inline
    def setDestroyItem(value: String): Self = StObject.set(x, "destroyItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyItemUndefined: Self = StObject.set(x, "destroyItem", js.undefined)
  }
}
