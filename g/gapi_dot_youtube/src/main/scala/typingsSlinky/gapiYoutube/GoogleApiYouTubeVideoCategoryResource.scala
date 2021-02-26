package typingsSlinky.gapiYoutube

import typingsSlinky.gapiYoutube.anon.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiYouTubeVideoCategoryResource extends StObject {
  
  /**
    * The ETag of the videoCategory resource.
    */
  var etag: String = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the video category.
    */
  var id: String = js.native
  
  /**
    * The type of the API resource. For video category resources, the value will be youtube#videoCategory.
    */
  var kind: String = js.native
  
  /**
    * The snippet object contains basic details about the video category, including its title.
    */
  var snippet: Title = js.native
}
object GoogleApiYouTubeVideoCategoryResource {
  
  @scala.inline
  def apply(etag: String, id: String, kind: String, snippet: Title): GoogleApiYouTubeVideoCategoryResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeVideoCategoryResource]
  }
  
  @scala.inline
  implicit class GoogleApiYouTubeVideoCategoryResourceMutableBuilder[Self <: GoogleApiYouTubeVideoCategoryResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippet(value: Title): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
  }
}
