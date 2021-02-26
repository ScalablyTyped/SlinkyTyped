package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends StObject {
  
  var item: org.scalajs.dom.raw.Element = js.native
}
object Item {
  
  @scala.inline
  def apply(item: org.scalajs.dom.raw.Element): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
