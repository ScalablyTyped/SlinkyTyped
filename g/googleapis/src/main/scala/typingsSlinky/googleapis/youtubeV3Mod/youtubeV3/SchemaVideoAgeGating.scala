package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaVideoAgeGating extends StObject {
  
  /**
    * Indicates whether or not the video has alcoholic beverage content. Only
    * users of legal purchasing age in a particular country, as identified by
    * ICAP, can view the content.
    */
  var alcoholContent: js.UndefOr[Boolean] = js.native
  
  /**
    * Age-restricted trailers. For redband trailers and adult-rated
    * video-games. Only users aged 18+ can view the content. The the field is
    * true the content is restricted to viewers aged 18+. Otherwise The field
    * won&#39;t be present.
    */
  var restricted: js.UndefOr[Boolean] = js.native
  
  /**
    * Video game rating, if any.
    */
  var videoGameRating: js.UndefOr[String] = js.native
}
object SchemaVideoAgeGating {
  
  @scala.inline
  def apply(): SchemaVideoAgeGating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoAgeGating]
  }
  
  @scala.inline
  implicit class SchemaVideoAgeGatingMutableBuilder[Self <: SchemaVideoAgeGating] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlcoholContent(value: Boolean): Self = StObject.set(x, "alcoholContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlcoholContentUndefined: Self = StObject.set(x, "alcoholContent", js.undefined)
    
    @scala.inline
    def setRestricted(value: Boolean): Self = StObject.set(x, "restricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictedUndefined: Self = StObject.set(x, "restricted", js.undefined)
    
    @scala.inline
    def setVideoGameRating(value: String): Self = StObject.set(x, "videoGameRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoGameRatingUndefined: Self = StObject.set(x, "videoGameRating", js.undefined)
  }
}
