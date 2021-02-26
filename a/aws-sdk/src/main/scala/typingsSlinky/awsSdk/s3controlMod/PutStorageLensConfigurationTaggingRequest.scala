package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutStorageLensConfigurationTaggingRequest extends StObject {
  
  /**
    * The account ID of the requester.
    */
  var AccountId: typingsSlinky.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * The ID of the S3 Storage Lens configuration.
    */
  var ConfigId: typingsSlinky.awsSdk.s3controlMod.ConfigId = js.native
  
  /**
    * The tag set of the S3 Storage Lens configuration.  You can set up to a maximum of 50 tags. 
    */
  var Tags: StorageLensTags = js.native
}
object PutStorageLensConfigurationTaggingRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, ConfigId: ConfigId, Tags: StorageLensTags): PutStorageLensConfigurationTaggingRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ConfigId = ConfigId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutStorageLensConfigurationTaggingRequest]
  }
  
  @scala.inline
  implicit class PutStorageLensConfigurationTaggingRequestMutableBuilder[Self <: PutStorageLensConfigurationTaggingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigId(value: ConfigId): Self = StObject.set(x, "ConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StorageLensTags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: StorageLensTag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
