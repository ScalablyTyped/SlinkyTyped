package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelResponse extends StObject {
  
  /**
    * The unique identifier for the application.
    */
  var ApplicationId: js.UndefOr[string] = js.native
  
  /**
    * The date and time, in ISO 8601 format, when the channel was enabled.
    */
  var CreationDate: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether the channel is enabled for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[boolean] = js.native
  
  /**
    * (Deprecated) An identifier for the channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether the channel is archived.
    */
  var IsArchived: js.UndefOr[boolean] = js.native
  
  /**
    * The user who last modified the channel.
    */
  var LastModifiedBy: js.UndefOr[string] = js.native
  
  /**
    * The date and time, in ISO 8601 format, when the channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  
  /**
    * The current version of the channel.
    */
  var Version: js.UndefOr[integer] = js.native
}
object ChannelResponse {
  
  @scala.inline
  def apply(): ChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelResponse]
  }
  
  @scala.inline
  implicit class ChannelResponseMutableBuilder[Self <: ChannelResponse] (val x: Self) extends AnyVal {
    
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
    def setVersion(value: integer): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
