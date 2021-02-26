package typingsSlinky.gapiYoutube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiYouTubeChannelBannerResource extends StObject {
  
  /**
    * The ETag of the response.
    */
  var etag: String = js.native
  
  /**
    * The type of the API response. For this operation, the value will be youtube#channelBannerInsertResponse.
    */
  var kind: String = js.native
  
  /**
    * The banner images URL. After calling the channelBanners.insert method, extract this value from the API response. Then call the channels.update method, and set the URL as the value of the brandingSettings.image.bannerExternalUrl property to set the banner image for a channel.
    */
  var url: String = js.native
}
object GoogleApiYouTubeChannelBannerResource {
  
  @scala.inline
  def apply(etag: String, kind: String, url: String): GoogleApiYouTubeChannelBannerResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeChannelBannerResource]
  }
  
  @scala.inline
  implicit class GoogleApiYouTubeChannelBannerResourceMutableBuilder[Self <: GoogleApiYouTubeChannelBannerResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
