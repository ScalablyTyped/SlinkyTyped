package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SMSChannelResponse extends StObject {
  
  /**
    * The unique identifier for the application that the SMS channel applies to.
    */
  var ApplicationId: js.UndefOr[string] = js.native
  
  /**
    * The date and time, in ISO 8601 format, when the SMS channel was enabled.
    */
  var CreationDate: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether the SMS channel is enabled for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[boolean] = js.native
  
  /**
    * (Deprecated) An identifier for the SMS channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether the SMS channel is archived.
    */
  var IsArchived: js.UndefOr[boolean] = js.native
  
  /**
    * The user who last modified the SMS channel.
    */
  var LastModifiedBy: js.UndefOr[string] = js.native
  
  /**
    * The date and time, in ISO 8601 format, when the SMS channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  
  /**
    * The type of messaging or notification platform for the channel. For the SMS channel, this value is SMS.
    */
  var Platform: string = js.native
  
  /**
    * The maximum number of promotional messages that you can send through the SMS channel each second.
    */
  var PromotionalMessagesPerSecond: js.UndefOr[integer] = js.native
  
  /**
    * The identity that displays on recipients' devices when they receive messages from the SMS channel.
    */
  var SenderId: js.UndefOr[string] = js.native
  
  /**
    * The registered short code to use when you send messages through the SMS channel.
    */
  var ShortCode: js.UndefOr[string] = js.native
  
  /**
    * The maximum number of transactional messages that you can send through the SMS channel each second.
    */
  var TransactionalMessagesPerSecond: js.UndefOr[integer] = js.native
  
  /**
    * The current version of the SMS channel.
    */
  var Version: js.UndefOr[integer] = js.native
}
object SMSChannelResponse {
  
  @scala.inline
  def apply(Platform: string): SMSChannelResponse = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMSChannelResponse]
  }
  
  @scala.inline
  implicit class SMSChannelResponseMutableBuilder[Self <: SMSChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setHasCredential(value: boolean): Self = StObject.set(x, "HasCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCredentialUndefined: Self = StObject.set(x, "HasCredential", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
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
    def setPlatform(value: string): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionalMessagesPerSecond(value: integer): Self = StObject.set(x, "PromotionalMessagesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionalMessagesPerSecondUndefined: Self = StObject.set(x, "PromotionalMessagesPerSecond", js.undefined)
    
    @scala.inline
    def setSenderId(value: string): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderIdUndefined: Self = StObject.set(x, "SenderId", js.undefined)
    
    @scala.inline
    def setShortCode(value: string): Self = StObject.set(x, "ShortCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortCodeUndefined: Self = StObject.set(x, "ShortCode", js.undefined)
    
    @scala.inline
    def setTransactionalMessagesPerSecond(value: integer): Self = StObject.set(x, "TransactionalMessagesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionalMessagesPerSecondUndefined: Self = StObject.set(x, "TransactionalMessagesPerSecond", js.undefined)
    
    @scala.inline
    def setVersion(value: integer): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
