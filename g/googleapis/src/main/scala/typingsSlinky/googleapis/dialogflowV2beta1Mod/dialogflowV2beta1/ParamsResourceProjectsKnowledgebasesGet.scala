package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsKnowledgebasesGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Required. The name of the knowledge base to retrieve. Format
    * `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>`.
    */
  var name: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsKnowledgebasesGet {
  
  @scala.inline
  def apply(): ParamsResourceProjectsKnowledgebasesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsKnowledgebasesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsKnowledgebasesGetMutableBuilder[Self <: ParamsResourceProjectsKnowledgebasesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
