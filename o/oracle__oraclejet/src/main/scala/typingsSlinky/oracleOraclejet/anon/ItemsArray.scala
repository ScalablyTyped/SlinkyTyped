package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsArray extends StObject {
  
  var items: js.Array[org.scalajs.dom.raw.Element] = js.native
}
object ItemsArray {
  
  @scala.inline
  def apply(items: js.Array[org.scalajs.dom.raw.Element]): ItemsArray = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsArray]
  }
  
  @scala.inline
  implicit class ItemsArrayMutableBuilder[Self <: ItemsArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[org.scalajs.dom.raw.Element]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: org.scalajs.dom.raw.Element*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
