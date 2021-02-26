package typingsSlinky.lyricist.mod

import typingsSlinky.lyricist.anon.ExcludedpermissionsInteractions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Album =================================================
@js.native
trait Album extends StObject {
  
  var api_path: String = js.native
  
  var artist: ArtistBrief = js.native
  
  var comment_count: Double = js.native
  
  var cover_art_url: String = js.native
  
  var cover_arts: js.Array[_] = js.native
  
  var current_user_metadata: ExcludedpermissionsInteractions = js.native
  
  var custom_header_image_url: js.UndefOr[js.Any] = js.native
  
  var description_annotation: DescriptionAnnotation = js.native
  
  var full_title: String = js.native
  
  var header_image_url: String = js.native
  
  var id: Double = js.native
  
  var lock_state: String = js.native
  
  var name: String = js.native
  
  var performance_groups: js.Array[_] = js.native
  
  var pyongs_count: Double = js.native
  
  var release_date: js.UndefOr[js.Any] = js.native
  
  var release_date_components: js.UndefOr[js.Any] = js.native
  
  var song_pageviews: Double = js.native
  
  var song_performances: js.Array[_] = js.native
  
  var url: String = js.native
}
object Album {
  
  @scala.inline
  def apply(
    api_path: String,
    artist: ArtistBrief,
    comment_count: Double,
    cover_art_url: String,
    cover_arts: js.Array[_],
    current_user_metadata: ExcludedpermissionsInteractions,
    description_annotation: DescriptionAnnotation,
    full_title: String,
    header_image_url: String,
    id: Double,
    lock_state: String,
    name: String,
    performance_groups: js.Array[_],
    pyongs_count: Double,
    song_pageviews: Double,
    song_performances: js.Array[_],
    url: String
  ): Album = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], cover_art_url = cover_art_url.asInstanceOf[js.Any], cover_arts = cover_arts.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], description_annotation = description_annotation.asInstanceOf[js.Any], full_title = full_title.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lock_state = lock_state.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], performance_groups = performance_groups.asInstanceOf[js.Any], pyongs_count = pyongs_count.asInstanceOf[js.Any], song_pageviews = song_pageviews.asInstanceOf[js.Any], song_performances = song_performances.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Album]
  }
  
  @scala.inline
  implicit class AlbumMutableBuilder[Self <: Album] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi_path(value: String): Self = StObject.set(x, "api_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtist(value: ArtistBrief): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover_art_url(value: String): Self = StObject.set(x, "cover_art_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover_arts(value: js.Array[_]): Self = StObject.set(x, "cover_arts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover_artsVarargs(value: js.Any*): Self = StObject.set(x, "cover_arts", js.Array(value :_*))
    
    @scala.inline
    def setCurrent_user_metadata(value: ExcludedpermissionsInteractions): Self = StObject.set(x, "current_user_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_header_image_url(value: js.Any): Self = StObject.set(x, "custom_header_image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_header_image_urlUndefined: Self = StObject.set(x, "custom_header_image_url", js.undefined)
    
    @scala.inline
    def setDescription_annotation(value: DescriptionAnnotation): Self = StObject.set(x, "description_annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_title(value: String): Self = StObject.set(x, "full_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader_image_url(value: String): Self = StObject.set(x, "header_image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLock_state(value: String): Self = StObject.set(x, "lock_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformance_groups(value: js.Array[_]): Self = StObject.set(x, "performance_groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformance_groupsVarargs(value: js.Any*): Self = StObject.set(x, "performance_groups", js.Array(value :_*))
    
    @scala.inline
    def setPyongs_count(value: Double): Self = StObject.set(x, "pyongs_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease_date(value: js.Any): Self = StObject.set(x, "release_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease_dateUndefined: Self = StObject.set(x, "release_date", js.undefined)
    
    @scala.inline
    def setRelease_date_components(value: js.Any): Self = StObject.set(x, "release_date_components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease_date_componentsUndefined: Self = StObject.set(x, "release_date_components", js.undefined)
    
    @scala.inline
    def setSong_pageviews(value: Double): Self = StObject.set(x, "song_pageviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSong_performances(value: js.Array[_]): Self = StObject.set(x, "song_performances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSong_performancesVarargs(value: js.Any*): Self = StObject.set(x, "song_performances", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
