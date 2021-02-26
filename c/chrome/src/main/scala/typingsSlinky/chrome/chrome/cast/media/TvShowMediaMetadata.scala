package typingsSlinky.chrome.chrome.cast.media

import typingsSlinky.chrome.chrome.cast.Image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TvShowMediaMetadata extends StObject {
  
  var episode: Double = js.native
  
  /** @deprecated. Use episode instead. */
  var episodeNumber: Double = js.native
  
  /** @deprecated. Use title instead. */
  var episodeTitle: String = js.native
  
  var images: js.Array[Image] = js.native
  
  var metadataType: MetadataType = js.native
  
  var originalAirdate: String = js.native
  
  /** @deprecated. Use originalAirdate instead. */
  var releaseYear: Double = js.native
  
  var season: Double = js.native
  
  /** @deprecated. Use season instead. */
  var seasonNumber: Double = js.native
  
  var seriesTitle: String = js.native
  
  var title: String = js.native
  
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
}
object TvShowMediaMetadata {
  
  @scala.inline
  def apply(
    episode: Double,
    episodeNumber: Double,
    episodeTitle: String,
    images: js.Array[Image],
    metadataType: MetadataType,
    originalAirdate: String,
    releaseYear: Double,
    season: Double,
    seasonNumber: Double,
    seriesTitle: String,
    title: String,
    `type`: MetadataType
  ): TvShowMediaMetadata = {
    val __obj = js.Dynamic.literal(episode = episode.asInstanceOf[js.Any], episodeNumber = episodeNumber.asInstanceOf[js.Any], episodeTitle = episodeTitle.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], metadataType = metadataType.asInstanceOf[js.Any], originalAirdate = originalAirdate.asInstanceOf[js.Any], releaseYear = releaseYear.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], seasonNumber = seasonNumber.asInstanceOf[js.Any], seriesTitle = seriesTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TvShowMediaMetadata]
  }
  
  @scala.inline
  implicit class TvShowMediaMetadataMutableBuilder[Self <: TvShowMediaMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEpisode(value: Double): Self = StObject.set(x, "episode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpisodeNumber(value: Double): Self = StObject.set(x, "episodeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpisodeTitle(value: String): Self = StObject.set(x, "episodeTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setMetadataType(value: MetadataType): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalAirdate(value: String): Self = StObject.set(x, "originalAirdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseYear(value: Double): Self = StObject.set(x, "releaseYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeason(value: Double): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeasonNumber(value: Double): Self = StObject.set(x, "seasonNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesTitle(value: String): Self = StObject.set(x, "seriesTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
