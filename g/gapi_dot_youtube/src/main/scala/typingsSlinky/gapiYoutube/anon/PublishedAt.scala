package typingsSlinky.gapiYoutube.anon

import typingsSlinky.gapiYoutube.GoogleApiYouTubeThumbnailResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishedAt extends StObject {
  
  /**
    * The ID that YouTube uses to uniquely identify the channel that published the playlist.
    */
  var channelId: String = js.native
  
  /**
    * The channel title of the channel that the video belongs to.
    */
  var channelTitle: String = js.native
  
  /**
    * The playlists description.
    */
  var description: String = js.native
  
  /**
    * The date and time that the playlist was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: String = js.native
  
  /**
    * Keyword tags associated with the playlist.
    */
  var tags: js.Array[String] = js.native
  
  /**
    * A map of thumbnail images associated with the playlist. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource = js.native
  
  /**
    * The playlists title.
    */
  var title: String = js.native
}
object PublishedAt {
  
  @scala.inline
  def apply(
    channelId: String,
    channelTitle: String,
    description: String,
    publishedAt: String,
    tags: js.Array[String],
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: String
  ): PublishedAt = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], channelTitle = channelTitle.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishedAt]
  }
  
  @scala.inline
  implicit class PublishedAtMutableBuilder[Self <: PublishedAt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setThumbnails(value: GoogleApiYouTubeThumbnailResource): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
