package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagParam extends StObject {
  
  var str: String = js.native
}
object TagParam {
  
  @scala.inline
  def apply(str: String): TagParam = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagParam]
  }
  
  @scala.inline
  implicit class TagParamMutableBuilder[Self <: TagParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
  }
}
