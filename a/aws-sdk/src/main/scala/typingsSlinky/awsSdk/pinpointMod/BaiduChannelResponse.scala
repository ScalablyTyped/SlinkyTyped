package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaiduChannelResponse extends StObject {
  
  /**
    * The unique identifier for the application that the Baidu channel applies to.
    */
  var ApplicationId: js.UndefOr[string] = js.native
  
  /**
    * The date and time when the Baidu channel was enabled.
    */
  var CreationDate: js.UndefOr[string] = js.native
  
  /**
    * The API key that you received from the Baidu Cloud Push service to communicate with the service.
    */
  var Credential: string = js.native
  
  /**
    * Specifies whether the Baidu channel is enabled for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[boolean] = js.native
  
  /**
    * (Deprecated) An identifier for the Baidu channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether the Baidu channel is archived.
    */
  var IsArchived: js.UndefOr[boolean] = js.native
  
  /**
    * The user who last modified the Baidu channel.
    */
  var LastModifiedBy: js.UndefOr[string] = js.native
  
  /**
    * The date and time when the Baidu channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  
  /**
    * The type of messaging or notification platform for the channel. For the Baidu channel, this value is BAIDU.
    */
  var Platform: string = js.native
  
  /**
    * The current version of the Baidu channel.
    */
  var Version: js.UndefOr[integer] = js.native
}
object BaiduChannelResponse {
  
  @scala.inline
  def apply(Credential: string, Platform: string): BaiduChannelResponse = {
    val __obj = js.Dynamic.literal(Credential = Credential.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaiduChannelResponse]
  }
  
  @scala.inline
  implicit class BaiduChannelResponseMutableBuilder[Self <: BaiduChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setCredential(value: string): Self = StObject.set(x, "Credential", value.asInstanceOf[js.Any])
    
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
    def setVersion(value: integer): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
