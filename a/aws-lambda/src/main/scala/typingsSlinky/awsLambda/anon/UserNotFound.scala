package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.commonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserNotFound extends StObject {
  
  var userAttributes: StringMap = js.native
  
  var userNotFound: js.UndefOr[Boolean] = js.native
  
  var validationData: js.UndefOr[StringMap] = js.native
}
object UserNotFound {
  
  @scala.inline
  def apply(userAttributes: StringMap): UserNotFound = {
    val __obj = js.Dynamic.literal(userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserNotFound]
  }
  
  @scala.inline
  implicit class UserNotFoundMutableBuilder[Self <: UserNotFound] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNotFound(value: Boolean): Self = StObject.set(x, "userNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNotFoundUndefined: Self = StObject.set(x, "userNotFound", js.undefined)
    
    @scala.inline
    def setValidationData(value: StringMap): Self = StObject.set(x, "validationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationDataUndefined: Self = StObject.set(x, "validationData", js.undefined)
  }
}
