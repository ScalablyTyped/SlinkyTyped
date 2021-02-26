package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternetMessageHeader extends StObject {
  
  // Represents the key in a key-value pair.
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // The value in a key-value pair.
  var value: js.UndefOr[NullableOption[String]] = js.native
}
object InternetMessageHeader {
  
  @scala.inline
  def apply(): InternetMessageHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternetMessageHeader]
  }
  
  @scala.inline
  implicit class InternetMessageHeaderMutableBuilder[Self <: InternetMessageHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
