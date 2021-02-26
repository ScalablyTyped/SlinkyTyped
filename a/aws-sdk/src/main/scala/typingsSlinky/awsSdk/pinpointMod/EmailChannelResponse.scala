package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailChannelResponse extends StObject {
  
  /**
    * The unique identifier for the application that the email channel applies to.
    */
  var ApplicationId: js.UndefOr[string] = js.native
  
  /**
    * The Amazon SES configuration set that's applied to messages that are sent through the channel.
    */
  var ConfigurationSet: js.UndefOr[string] = js.native
  
  /**
    * The date and time, in ISO 8601 format, when the email channel was enabled.
    */
  var CreationDate: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether the email channel is enabled for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  
  /**
    * The verified email address that email is sent from when you send email through the channel.
    */
  var FromAddress: js.UndefOr[string] = js.native
  
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[boolean] = js.native
  
  /**
    * (Deprecated) An identifier for the email channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES), that's used when you send email through the channel.
    */
  var Identity: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether the email channel is archived.
    */
  var IsArchived: js.UndefOr[boolean] = js.native
  
  /**
    * The user who last modified the email channel.
    */
  var LastModifiedBy: js.UndefOr[string] = js.native
  
  /**
    * The date and time, in ISO 8601 format, when the email channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  
  /**
    * The maximum number of emails that can be sent through the channel each second.
    */
  var MessagesPerSecond: js.UndefOr[integer] = js.native
  
  /**
    * The type of messaging or notification platform for the channel. For the email channel, this value is EMAIL.
    */
  var Platform: string = js.native
  
  /**
    *  The ARN of the AWS Identity and Access Management (IAM) role that Amazon Pinpoint uses to submit email-related event data for the channel.
    */
  var RoleArn: js.UndefOr[string] = js.native
  
  /**
    * The current version of the email channel.
    */
  var Version: js.UndefOr[integer] = js.native
}
object EmailChannelResponse {
  
  @scala.inline
  def apply(Platform: string): EmailChannelResponse = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailChannelResponse]
  }
  
  @scala.inline
  implicit class EmailChannelResponseMutableBuilder[Self <: EmailChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    @scala.inline
    def setConfigurationSet(value: string): Self = StObject.set(x, "ConfigurationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSetUndefined: Self = StObject.set(x, "ConfigurationSet", js.undefined)
    
    @scala.inline
    def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setFromAddress(value: string): Self = StObject.set(x, "FromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromAddressUndefined: Self = StObject.set(x, "FromAddress", js.undefined)
    
    @scala.inline
    def setHasCredential(value: boolean): Self = StObject.set(x, "HasCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCredentialUndefined: Self = StObject.set(x, "HasCredential", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setIdentity(value: string): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityUndefined: Self = StObject.set(x, "Identity", js.undefined)
    
    @scala.inline
    def setIsArchived(value: boolean): Self = StObject.set(x, "IsArchived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsArchivedUndefined: Self = StObject.set(x, "IsArchived", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: string): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: string): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setMessagesPerSecond(value: integer): Self = StObject.set(x, "MessagesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesPerSecondUndefined: Self = StObject.set(x, "MessagesPerSecond", js.undefined)
    
    @scala.inline
    def setPlatform(value: string): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setVersion(value: integer): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
