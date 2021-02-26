package typingsSlinky.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceDefinitionVersionRequest extends StObject {
  
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: string = js.native
  
  /**
    * The ID of the resource definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListResourceDefinitionVersions'' requests. If the version is the last one that was associated with a resource definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var ResourceDefinitionVersionId: string = js.native
}
object GetResourceDefinitionVersionRequest {
  
  @scala.inline
  def apply(ResourceDefinitionId: string, ResourceDefinitionVersionId: string): GetResourceDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId.asInstanceOf[js.Any], ResourceDefinitionVersionId = ResourceDefinitionVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceDefinitionVersionRequest]
  }
  
  @scala.inline
  implicit class GetResourceDefinitionVersionRequestMutableBuilder[Self <: GetResourceDefinitionVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceDefinitionId(value: string): Self = StObject.set(x, "ResourceDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceDefinitionVersionId(value: string): Self = StObject.set(x, "ResourceDefinitionVersionId", value.asInstanceOf[js.Any])
  }
}
