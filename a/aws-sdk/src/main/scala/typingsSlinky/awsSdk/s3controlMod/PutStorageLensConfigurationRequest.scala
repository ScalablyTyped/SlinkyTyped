package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutStorageLensConfigurationRequest extends StObject {
  
  /**
    * The account ID of the requester.
    */
  var AccountId: typingsSlinky.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * The ID of the S3 Storage Lens configuration.
    */
  var ConfigId: typingsSlinky.awsSdk.s3controlMod.ConfigId = js.native
  
  /**
    * The S3 Storage Lens configuration.
    */
  var StorageLensConfiguration: typingsSlinky.awsSdk.s3controlMod.StorageLensConfiguration = js.native
  
  /**
    * The tag set of the S3 Storage Lens configuration.  You can set up to a maximum of 50 tags. 
    */
  var Tags: js.UndefOr[StorageLensTags] = js.native
}
object PutStorageLensConfigurationRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, ConfigId: ConfigId, StorageLensConfiguration: StorageLensConfiguration): PutStorageLensConfigurationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ConfigId = ConfigId.asInstanceOf[js.Any], StorageLensConfiguration = StorageLensConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutStorageLensConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutStorageLensConfigurationRequestMutableBuilder[Self <: PutStorageLensConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigId(value: ConfigId): Self = StObject.set(x, "ConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageLensConfiguration(value: StorageLensConfiguration): Self = StObject.set(x, "StorageLensConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StorageLensTags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: StorageLensTag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
