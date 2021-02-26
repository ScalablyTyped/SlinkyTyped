package typingsSlinky.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateExclusionsPreviewResponse extends StObject {
  
  /**
    * Specifies the unique identifier of the requested exclusions preview. You can use the unique identifier to retrieve the exclusions preview when running the GetExclusionsPreview API.
    */
  var previewToken: UUID = js.native
}
object CreateExclusionsPreviewResponse {
  
  @scala.inline
  def apply(previewToken: UUID): CreateExclusionsPreviewResponse = {
    val __obj = js.Dynamic.literal(previewToken = previewToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExclusionsPreviewResponse]
  }
  
  @scala.inline
  implicit class CreateExclusionsPreviewResponseMutableBuilder[Self <: CreateExclusionsPreviewResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviewToken(value: UUID): Self = StObject.set(x, "previewToken", value.asInstanceOf[js.Any])
  }
}
