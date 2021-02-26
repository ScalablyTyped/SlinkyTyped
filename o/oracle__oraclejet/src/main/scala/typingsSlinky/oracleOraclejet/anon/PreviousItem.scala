package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviousItem[K]
  extends /* key */ StringDictionary[js.Any] {
  
  var item: org.scalajs.dom.raw.Element = js.native
  
  var key: K = js.native
  
  var previousItem: org.scalajs.dom.raw.Element = js.native
  
  var previousKey: K = js.native
}
object PreviousItem {
  
  @scala.inline
  def apply[K](
    item: org.scalajs.dom.raw.Element,
    key: K,
    previousItem: org.scalajs.dom.raw.Element,
    previousKey: K
  ): PreviousItem[K] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], previousItem = previousItem.asInstanceOf[js.Any], previousKey = previousKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousItem[K]]
  }
  
  @scala.inline
  implicit class PreviousItemMutableBuilder[Self <: PreviousItem[_], K] (val x: Self with PreviousItem[K]) extends AnyVal {
    
    @scala.inline
    def setItem(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousItem(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "previousItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousKey(value: K): Self = StObject.set(x, "previousKey", value.asInstanceOf[js.Any])
  }
}
