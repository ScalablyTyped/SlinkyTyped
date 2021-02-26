package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemKey
  extends /* key */ StringDictionary[js.Any] {
  
  var item: org.scalajs.dom.raw.Element = js.native
  
  var key: js.Any = js.native
}
object ItemKey {
  
  @scala.inline
  def apply(item: org.scalajs.dom.raw.Element, key: js.Any): ItemKey = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemKey]
  }
  
  @scala.inline
  implicit class ItemKeyMutableBuilder[Self <: ItemKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
