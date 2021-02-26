package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserLandingPagesListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#advertiserLandingPagesListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Landing page collection */
  var landingPages: js.UndefOr[js.Array[LandingPage]] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object AdvertiserLandingPagesListResponse {
  
  @scala.inline
  def apply(): AdvertiserLandingPagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserLandingPagesListResponse]
  }
  
  @scala.inline
  implicit class AdvertiserLandingPagesListResponseMutableBuilder[Self <: AdvertiserLandingPagesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLandingPages(value: js.Array[LandingPage]): Self = StObject.set(x, "landingPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandingPagesUndefined: Self = StObject.set(x, "landingPages", js.undefined)
    
    @scala.inline
    def setLandingPagesVarargs(value: LandingPage*): Self = StObject.set(x, "landingPages", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
