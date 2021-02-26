package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropNameItem[K]
  extends /* key */ StringDictionary[js.Any] {
  
  var item: org.scalajs.dom.raw.Element = js.native
  
  var key: K = js.native
}
object DictpropNameItem {
  
  @scala.inline
  def apply[K](item: org.scalajs.dom.raw.Element, key: K): DictpropNameItem[K] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameItem[K]]
  }
  
  @scala.inline
  implicit class DictpropNameItemMutableBuilder[Self <: DictpropNameItem[_], K] (val x: Self with DictpropNameItem[K]) extends AnyVal {
    
    @scala.inline
    def setItem(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
