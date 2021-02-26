package typingsSlinky.musicmatch.mod

import typingsSlinky.musicmatch.musicmatchStrings.bad_characters
import typingsSlinky.musicmatch.musicmatchStrings.lines_too_long
import typingsSlinky.musicmatch.musicmatchStrings.wrong_attribution
import typingsSlinky.musicmatch.musicmatchStrings.wrong_formatting
import typingsSlinky.musicmatch.musicmatchStrings.wrong_lyrics
import typingsSlinky.musicmatch.musicmatchStrings.wrong_verses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackLyricsFeedbackParams extends StObject {
  
  var feedback: js.UndefOr[
    wrong_lyrics | wrong_attribution | bad_characters | lines_too_long | wrong_verses | wrong_formatting
  ] = js.native
  
  var lyrics_id: js.UndefOr[Double] = js.native
  
  var track_id: js.UndefOr[Double] = js.native
}
object TrackLyricsFeedbackParams {
  
  @scala.inline
  def apply(): TrackLyricsFeedbackParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackLyricsFeedbackParams]
  }
  
  @scala.inline
  implicit class TrackLyricsFeedbackParamsMutableBuilder[Self <: TrackLyricsFeedbackParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeedback(
      value: wrong_lyrics | wrong_attribution | bad_characters | lines_too_long | wrong_verses | wrong_formatting
    ): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    @scala.inline
    def setLyrics_id(value: Double): Self = StObject.set(x, "lyrics_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLyrics_idUndefined: Self = StObject.set(x, "lyrics_id", js.undefined)
    
    @scala.inline
    def setTrack_id(value: Double): Self = StObject.set(x, "track_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack_idUndefined: Self = StObject.set(x, "track_id", js.undefined)
  }
}
