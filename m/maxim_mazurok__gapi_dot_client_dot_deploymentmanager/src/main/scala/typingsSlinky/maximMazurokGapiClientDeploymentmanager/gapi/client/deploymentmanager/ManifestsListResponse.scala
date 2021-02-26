package typingsSlinky.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManifestsListResponse extends StObject {
  
  /** Output only. Manifests contained in this list response. */
  var manifests: js.UndefOr[js.Array[Manifest]] = js.native
  
  /** Output only. A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ManifestsListResponse {
  
  @scala.inline
  def apply(): ManifestsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestsListResponse]
  }
  
  @scala.inline
  implicit class ManifestsListResponseMutableBuilder[Self <: ManifestsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManifests(value: js.Array[Manifest]): Self = StObject.set(x, "manifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestsUndefined: Self = StObject.set(x, "manifests", js.undefined)
    
    @scala.inline
    def setManifestsVarargs(value: Manifest*): Self = StObject.set(x, "manifests", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
