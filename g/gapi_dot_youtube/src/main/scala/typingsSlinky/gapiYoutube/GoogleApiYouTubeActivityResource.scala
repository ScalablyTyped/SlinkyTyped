package typingsSlinky.gapiYoutube

import typingsSlinky.gapiYoutube.anon.Bulletin
import typingsSlinky.gapiYoutube.anon.ChannelId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiYouTubeActivityResource extends StObject {
  
  /**
    * The contentDetails object contains information about the content associated with the activity.
    */
  var contentDetails: Bulletin = js.native
  
  /**
    * The ETag of the activity resource.
    */
  var etag: String = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the activity.
    */
  var id: String = js.native
  
  /**
    * The type of the API resource. For activity resources, the value will be youtube#activity.
    */
  var kind: String = js.native
  
  /**
    * The snippet object contains basic details about the activity, including the activitys type and group ID.
    */
  var snippet: ChannelId = js.native
}
object GoogleApiYouTubeActivityResource {
  
  @scala.inline
  def apply(contentDetails: Bulletin, etag: String, id: String, kind: String, snippet: ChannelId): GoogleApiYouTubeActivityResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeActivityResource]
  }
  
  @scala.inline
  implicit class GoogleApiYouTubeActivityResourceMutableBuilder[Self <: GoogleApiYouTubeActivityResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentDetails(value: Bulletin): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippet(value: ChannelId): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
  }
}
