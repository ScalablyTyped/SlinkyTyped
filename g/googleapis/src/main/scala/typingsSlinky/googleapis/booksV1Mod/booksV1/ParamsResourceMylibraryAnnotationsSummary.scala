package typingsSlinky.googleapis.booksV1Mod.booksV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceMylibraryAnnotationsSummary extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Array of layer IDs to get the summary for.
    */
  var layerIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Volume id to get the summary for.
    */
  var volumeId: js.UndefOr[String] = js.native
}
object ParamsResourceMylibraryAnnotationsSummary {
  
  @scala.inline
  def apply(): ParamsResourceMylibraryAnnotationsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMylibraryAnnotationsSummary]
  }
  
  @scala.inline
  implicit class ParamsResourceMylibraryAnnotationsSummaryMutableBuilder[Self <: ParamsResourceMylibraryAnnotationsSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setLayerIds(value: js.Array[String]): Self = StObject.set(x, "layerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdsUndefined: Self = StObject.set(x, "layerIds", js.undefined)
    
    @scala.inline
    def setLayerIdsVarargs(value: String*): Self = StObject.set(x, "layerIds", js.Array(value :_*))
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
