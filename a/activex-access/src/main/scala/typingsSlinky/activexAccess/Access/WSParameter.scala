package typingsSlinky.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WSParameter extends StObject {
  
  @JSName("Access.WSParameter_typekey")
  var AccessDotWSParameter_typekey: WSParameter = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val Type: Double = js.native
}
object WSParameter {
  
  @scala.inline
  def apply(
    AccessDotWSParameter_typekey: WSParameter,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Parent: js.Any,
    Type: Double
  ): WSParameter = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.WSParameter_typekey")(AccessDotWSParameter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WSParameter]
  }
  
  @scala.inline
  implicit class WSParameterMutableBuilder[Self <: WSParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDotWSParameter_typekey(value: WSParameter): Self = StObject.set(x, "Access.WSParameter_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
