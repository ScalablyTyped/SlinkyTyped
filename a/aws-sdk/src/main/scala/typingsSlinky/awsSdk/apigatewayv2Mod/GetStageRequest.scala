package typingsSlinky.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStageRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  
  /**
    * The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
    */
  var StageName: string = js.native
}
object GetStageRequest {
  
  @scala.inline
  def apply(ApiId: string, StageName: string): GetStageRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStageRequest]
  }
  
  @scala.inline
  implicit class GetStageRequestMutableBuilder[Self <: GetStageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageName(value: string): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
