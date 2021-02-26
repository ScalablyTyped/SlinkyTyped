package typingsSlinky.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnString extends StObject {
  
  @JSName("MSForms.ReturnString_typekey")
  var MSFormsDotReturnString_typekey: ReturnString = js.native
  
  var Value: String = js.native
}
object ReturnString {
  
  @scala.inline
  def apply(MSFormsDotReturnString_typekey: ReturnString, Value: String): ReturnString = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnString_typekey")(MSFormsDotReturnString_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnString]
  }
  
  @scala.inline
  implicit class ReturnStringMutableBuilder[Self <: ReturnString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSFormsDotReturnString_typekey(value: ReturnString): Self = StObject.set(x, "MSForms.ReturnString_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
