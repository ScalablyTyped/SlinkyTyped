package typingsSlinky.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompleteLayerUploadRequest extends StObject {
  
  /**
    * The sha256 digest of the image layer.
    */
  var layerDigests: LayerDigestList = js.native
  
  /**
    * The AWS account ID associated with the registry to which to upload layers. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The name of the repository to associate with the image layer.
    */
  var repositoryName: RepositoryName = js.native
  
  /**
    * The upload ID from a previous InitiateLayerUpload operation to associate with the image layer.
    */
  var uploadId: UploadId = js.native
}
object CompleteLayerUploadRequest {
  
  @scala.inline
  def apply(layerDigests: LayerDigestList, repositoryName: RepositoryName, uploadId: UploadId): CompleteLayerUploadRequest = {
    val __obj = js.Dynamic.literal(layerDigests = layerDigests.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteLayerUploadRequest]
  }
  
  @scala.inline
  implicit class CompleteLayerUploadRequestMutableBuilder[Self <: CompleteLayerUploadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerDigests(value: LayerDigestList): Self = StObject.set(x, "layerDigests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerDigestsVarargs(value: LayerDigest*): Self = StObject.set(x, "layerDigests", js.Array(value :_*))
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
