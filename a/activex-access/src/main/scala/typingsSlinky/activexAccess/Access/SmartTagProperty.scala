package typingsSlinky.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTagProperty extends StObject {
  
  @JSName("Access.SmartTagProperty_typekey")
  var AccessDotSmartTagProperty_typekey: SmartTagProperty = js.native
  
  def Delete(): Unit = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  var Name: String = js.native
  
  var Value: String = js.native
}
object SmartTagProperty {
  
  @scala.inline
  def apply(
    AccessDotSmartTagProperty_typekey: SmartTagProperty,
    Delete: () => Unit,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: String
  ): SmartTagProperty = {
    val __obj = js.Dynamic.literal(Delete = js.Any.fromFunction0(Delete), IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.SmartTagProperty_typekey")(AccessDotSmartTagProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagProperty]
  }
  
  @scala.inline
  implicit class SmartTagPropertyMutableBuilder[Self <: SmartTagProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDotSmartTagProperty_typekey(value: SmartTagProperty): Self = StObject.set(x, "Access.SmartTagProperty_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
