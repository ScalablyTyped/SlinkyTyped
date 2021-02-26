package typingsSlinky.gapiYoutube

import typingsSlinky.gapiYoutube.anon.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiYouTubeGuideCategoryResource extends StObject {
  
  /**
    * The ETag of the guideCategory resource.
    */
  var etag: String = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the guide category.
    */
  var id: String = js.native
  
  /**
    * The type of the API resource. For guideCategory resources, the value will be youtube#guideCategory.
    */
  var kind: String = js.native
  
  /**
    * The snippet object contains basic details about the category, such as its title.
    */
  var snippet: Title = js.native
}
object GoogleApiYouTubeGuideCategoryResource {
  
  @scala.inline
  def apply(etag: String, id: String, kind: String, snippet: Title): GoogleApiYouTubeGuideCategoryResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeGuideCategoryResource]
  }
  
  @scala.inline
  implicit class GoogleApiYouTubeGuideCategoryResourceMutableBuilder[Self <: GoogleApiYouTubeGuideCategoryResource] (val x: Self) extends AnyVal {
    
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
