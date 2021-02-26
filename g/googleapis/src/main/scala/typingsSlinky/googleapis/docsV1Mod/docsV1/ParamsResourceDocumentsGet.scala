package typingsSlinky.googleapis.docsV1Mod.docsV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceDocumentsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the document to retrieve.
    */
  var documentId: js.UndefOr[String] = js.native
  
  /**
    * The suggestions view mode to apply to the document. This allows viewing
    * the document with all suggestions inline, accepted or rejected. If one is
    * not specified, DEFAULT_FOR_CURRENT_ACCESS is used.
    */
  var suggestionsViewMode: js.UndefOr[String] = js.native
}
object ParamsResourceDocumentsGet {
  
  @scala.inline
  def apply(): ParamsResourceDocumentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDocumentsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceDocumentsGetMutableBuilder[Self <: ParamsResourceDocumentsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setSuggestionsViewMode(value: String): Self = StObject.set(x, "suggestionsViewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsViewModeUndefined: Self = StObject.set(x, "suggestionsViewMode", js.undefined)
  }
}
