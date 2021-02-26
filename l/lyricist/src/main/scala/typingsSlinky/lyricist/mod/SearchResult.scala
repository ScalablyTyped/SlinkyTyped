package typingsSlinky.lyricist.mod

import typingsSlinky.lyricist.anon.Hot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Search ================================================
@js.native
trait SearchResult extends StObject {
  
  var annotation_count: Double = js.native
  
  var api_path: String = js.native
  
  var full_title: String = js.native
  
  var header_image_thumbnail_url: String = js.native
  
  var header_image_url: String = js.native
  
  var id: Double = js.native
  
  var lyrics_owner_id: Double = js.native
  
  var lyrics_state: String = js.native
  
  var path: String = js.native
  
  var primary_artist: ArtistBrief = js.native
  
  var pyongs_count: js.UndefOr[js.Any] = js.native
  
  var song_art_image_thumbnail_url: String = js.native
  
  var stats: Hot = js.native
  
  var title: String = js.native
  
  var title_with_featured: String = js.native
  
  var url: String = js.native
}
object SearchResult {
  
  @scala.inline
  def apply(
    annotation_count: Double,
    api_path: String,
    full_title: String,
    header_image_thumbnail_url: String,
    header_image_url: String,
    id: Double,
    lyrics_owner_id: Double,
    lyrics_state: String,
    path: String,
    primary_artist: ArtistBrief,
    song_art_image_thumbnail_url: String,
    stats: Hot,
    title: String,
    title_with_featured: String,
    url: String
  ): SearchResult = {
    val __obj = js.Dynamic.literal(annotation_count = annotation_count.asInstanceOf[js.Any], api_path = api_path.asInstanceOf[js.Any], full_title = full_title.asInstanceOf[js.Any], header_image_thumbnail_url = header_image_thumbnail_url.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lyrics_owner_id = lyrics_owner_id.asInstanceOf[js.Any], lyrics_state = lyrics_state.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], primary_artist = primary_artist.asInstanceOf[js.Any], song_art_image_thumbnail_url = song_art_image_thumbnail_url.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], title_with_featured = title_with_featured.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  
  @scala.inline
  implicit class SearchResultMutableBuilder[Self <: SearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation_count(value: Double): Self = StObject.set(x, "annotation_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_path(value: String): Self = StObject.set(x, "api_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_title(value: String): Self = StObject.set(x, "full_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader_image_thumbnail_url(value: String): Self = StObject.set(x, "header_image_thumbnail_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader_image_url(value: String): Self = StObject.set(x, "header_image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLyrics_owner_id(value: Double): Self = StObject.set(x, "lyrics_owner_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLyrics_state(value: String): Self = StObject.set(x, "lyrics_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary_artist(value: ArtistBrief): Self = StObject.set(x, "primary_artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPyongs_count(value: js.Any): Self = StObject.set(x, "pyongs_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPyongs_countUndefined: Self = StObject.set(x, "pyongs_count", js.undefined)
    
    @scala.inline
    def setSong_art_image_thumbnail_url(value: String): Self = StObject.set(x, "song_art_image_thumbnail_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Hot): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle_with_featured(value: String): Self = StObject.set(x, "title_with_featured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
