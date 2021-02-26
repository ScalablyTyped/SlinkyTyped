package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reference
  extends /* key */ StringDictionary[js.Any] {
  
  var items: js.Array[org.scalajs.dom.raw.Element] = js.native
  
  var position: String = js.native
  
  var reference: org.scalajs.dom.raw.Element = js.native
}
object Reference {
  
  @scala.inline
  def apply(
    items: js.Array[org.scalajs.dom.raw.Element],
    position: String,
    reference: org.scalajs.dom.raw.Element
  ): Reference = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  
  @scala.inline
  implicit class ReferenceMutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[org.scalajs.dom.raw.Element]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: org.scalajs.dom.raw.Element*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
