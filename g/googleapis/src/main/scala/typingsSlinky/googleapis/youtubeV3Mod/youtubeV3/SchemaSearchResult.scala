package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A search result contains information about a YouTube video, channel, or
  * playlist that matches the search parameters specified in an API request.
  * While a search result points to a uniquely identifiable resource, like a
  * video, it does not have its own persistent data.
  */
@js.native
trait SchemaSearchResult extends js.Object {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The id object contains information that can be used to uniquely identify
    * the resource that matches the search request.
    */
  var id: js.UndefOr[SchemaResourceId] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#searchResult&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The snippet object contains basic details about a search result, such as
    * its title or description. For example, if the search result is a video,
    * then the title will be the video&#39;s title and the description will be
    * the video&#39;s description.
    */
  var snippet: js.UndefOr[SchemaSearchResultSnippet] = js.native
}
object SchemaSearchResult {
  
  @scala.inline
  def apply(): SchemaSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchResult]
  }
  
  @scala.inline
  implicit class SchemaSearchResultOps[Self <: SchemaSearchResult] (val x: Self) extends AnyVal {
    
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
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setId(value: SchemaResourceId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setSnippet(value: SchemaSearchResultSnippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
  }
}
