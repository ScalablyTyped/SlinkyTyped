package typingsSlinky.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolSchemaStringAttributeConstraints extends StObject {
  
  /**
    * The maximum length of an attribute value of the string type.
    */
  var maxLength: js.UndefOr[String] = js.native
  
  /**
    * The minimum length of an attribute value of the string type.
    */
  var minLength: js.UndefOr[String] = js.native
}
object UserPoolSchemaStringAttributeConstraints {
  
  @scala.inline
  def apply(): UserPoolSchemaStringAttributeConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolSchemaStringAttributeConstraints]
  }
  
  @scala.inline
  implicit class UserPoolSchemaStringAttributeConstraintsMutableBuilder[Self <: UserPoolSchemaStringAttributeConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxLength(value: String): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMinLength(value: String): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
  }
}
