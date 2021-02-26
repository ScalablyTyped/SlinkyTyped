package typingsSlinky.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TempVar extends StObject {
  
  @JSName("Access.TempVar_typekey")
  var AccessDotTempVar_typekey: TempVar = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  val Name: String = js.native
  
  var Value: Double | String | Boolean = js.native
  
  var _Value: Double | String | Boolean = js.native
}
object TempVar {
  
  @scala.inline
  def apply(
    AccessDotTempVar_typekey: TempVar,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: Double | String | Boolean,
    _Value: Double | String | Boolean
  ): TempVar = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.TempVar_typekey")(AccessDotTempVar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempVar]
  }
  
  @scala.inline
  implicit class TempVarMutableBuilder[Self <: TempVar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDotTempVar_typekey(value: TempVar): Self = StObject.set(x, "Access.TempVar_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double | String | Boolean): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Value(value: Double | String | Boolean): Self = StObject.set(x, "_Value", value.asInstanceOf[js.Any])
  }
}
