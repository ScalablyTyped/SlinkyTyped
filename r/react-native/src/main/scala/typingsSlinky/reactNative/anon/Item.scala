package typingsSlinky.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item[ItemT] extends StObject {
  
  var animated: js.UndefOr[Boolean | Null] = js.native
  
  var item: ItemT = js.native
  
  var viewPosition: js.UndefOr[Double] = js.native
}
object Item {
  
  @scala.inline
  def apply[ItemT](item: ItemT): Item[ItemT] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[ItemT]]
  }
  
  @scala.inline
  implicit class ItemMutableBuilder[Self <: Item[_], ItemT] (val x: Self with Item[ItemT]) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedNull: Self = StObject.set(x, "animated", null)
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setItem(value: ItemT): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewPosition(value: Double): Self = StObject.set(x, "viewPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewPositionUndefined: Self = StObject.set(x, "viewPosition", js.undefined)
  }
}
