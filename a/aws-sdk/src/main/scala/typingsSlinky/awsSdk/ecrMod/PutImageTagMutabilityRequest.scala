package typingsSlinky.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutImageTagMutabilityRequest extends StObject {
  
  /**
    * The tag mutability setting for the repository. If MUTABLE is specified, image tags can be overwritten. If IMMUTABLE is specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
    */
  var imageTagMutability: ImageTagMutability = js.native
  
  /**
    * The AWS account ID associated with the registry that contains the repository in which to update the image tag mutability settings. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The name of the repository in which to update the image tag mutability settings.
    */
  var repositoryName: RepositoryName = js.native
}
object PutImageTagMutabilityRequest {
  
  @scala.inline
  def apply(imageTagMutability: ImageTagMutability, repositoryName: RepositoryName): PutImageTagMutabilityRequest = {
    val __obj = js.Dynamic.literal(imageTagMutability = imageTagMutability.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImageTagMutabilityRequest]
  }
  
  @scala.inline
  implicit class PutImageTagMutabilityRequestMutableBuilder[Self <: PutImageTagMutabilityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageTagMutability(value: ImageTagMutability): Self = StObject.set(x, "imageTagMutability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
