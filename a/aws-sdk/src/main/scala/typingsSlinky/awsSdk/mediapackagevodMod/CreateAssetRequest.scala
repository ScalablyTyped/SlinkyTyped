package typingsSlinky.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAssetRequest extends StObject {
  
  /**
    * The unique identifier for the Asset.
    */
  var Id: string = js.native
  
  /**
    * The ID of the PackagingGroup for the Asset.
    */
  var PackagingGroupId: string = js.native
  
  /**
    * The resource ID to include in SPEKE key requests.
    */
  var ResourceId: js.UndefOr[string] = js.native
  
  /**
    * ARN of the source object in S3.
    */
  var SourceArn: string = js.native
  
  /**
    * The IAM role ARN used to access the source S3 bucket.
    */
  var SourceRoleArn: string = js.native
  
  var Tags: js.UndefOr[typingsSlinky.awsSdk.mediapackagevodMod.Tags] = js.native
}
object CreateAssetRequest {
  
  @scala.inline
  def apply(Id: string, PackagingGroupId: string, SourceArn: string, SourceRoleArn: string): CreateAssetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PackagingGroupId = PackagingGroupId.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any], SourceRoleArn = SourceRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetRequest]
  }
  
  @scala.inline
  implicit class CreateAssetRequestMutableBuilder[Self <: CreateAssetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagingGroupId(value: string): Self = StObject.set(x, "PackagingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: string): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setSourceArn(value: string): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRoleArn(value: string): Self = StObject.set(x, "SourceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
