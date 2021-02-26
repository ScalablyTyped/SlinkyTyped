package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDocumentationVersionRequest extends StObject {
  
  /**
    * A description about the new documentation snapshot.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Required] The version identifier of the new snapshot.
    */
  var documentationVersion: String = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  
  /**
    * The stage name to be associated with the new documentation snapshot.
    */
  var stageName: js.UndefOr[String] = js.native
}
object CreateDocumentationVersionRequest {
  
  @scala.inline
  def apply(documentationVersion: String, restApiId: String): CreateDocumentationVersionRequest = {
    val __obj = js.Dynamic.literal(documentationVersion = documentationVersion.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDocumentationVersionRequest]
  }
  
  @scala.inline
  implicit class CreateDocumentationVersionRequestMutableBuilder[Self <: CreateDocumentationVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDocumentationVersion(value: String): Self = StObject.set(x, "documentationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
  }
}
