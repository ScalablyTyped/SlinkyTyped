package typingsSlinky.gapiYoutube

import typingsSlinky.gapiYoutube.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiYouTubeVideoCategoryResource extends js.Object {
  
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
  implicit class GoogleApiYouTubeVideoCategoryResourceOps[Self <: GoogleApiYouTubeVideoCategoryResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippet(value: Title): Self = this.set("snippet", value.asInstanceOf[js.Any])
  }
}
