package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.awsLambdaStrings.EMAIL
import typingsSlinky.awsLambda.awsLambdaStrings.RESEND
import typingsSlinky.awsLambda.awsLambdaStrings.SMS
import typingsSlinky.awsLambda.awsLambdaStrings.SUPPRESS
import typingsSlinky.awsLambda.commonMod.StringMap
import typingsSlinky.awsLambda.userMigrationMod.UserStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DesiredDeliveryMediums extends StObject {
  
  var desiredDeliveryMediums: js.Array[SMS | EMAIL] = js.native
  
  var finalUserStatus: js.UndefOr[UserStatus] = js.native
  
  var forceAliasCreation: js.UndefOr[Boolean] = js.native
  
  var messageAction: js.UndefOr[RESEND | SUPPRESS] = js.native
  
  var userAttributes: StringMap = js.native
}
object DesiredDeliveryMediums {
  
  @scala.inline
  def apply(desiredDeliveryMediums: js.Array[SMS | EMAIL], userAttributes: StringMap): DesiredDeliveryMediums = {
    val __obj = js.Dynamic.literal(desiredDeliveryMediums = desiredDeliveryMediums.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesiredDeliveryMediums]
  }
  
  @scala.inline
  implicit class DesiredDeliveryMediumsMutableBuilder[Self <: DesiredDeliveryMediums] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredDeliveryMediums(value: js.Array[SMS | EMAIL]): Self = StObject.set(x, "desiredDeliveryMediums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredDeliveryMediumsVarargs(value: (SMS | EMAIL)*): Self = StObject.set(x, "desiredDeliveryMediums", js.Array(value :_*))
    
    @scala.inline
    def setFinalUserStatus(value: UserStatus): Self = StObject.set(x, "finalUserStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalUserStatusUndefined: Self = StObject.set(x, "finalUserStatus", js.undefined)
    
    @scala.inline
    def setForceAliasCreation(value: Boolean): Self = StObject.set(x, "forceAliasCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceAliasCreationUndefined: Self = StObject.set(x, "forceAliasCreation", js.undefined)
    
    @scala.inline
    def setMessageAction(value: RESEND | SUPPRESS): Self = StObject.set(x, "messageAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageActionUndefined: Self = StObject.set(x, "messageAction", js.undefined)
    
    @scala.inline
    def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
  }
}
