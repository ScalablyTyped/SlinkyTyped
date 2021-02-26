package typingsSlinky.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatcherSubtitleParams extends MatcherLyricsParams {
  
  var f_subtitle_length: js.UndefOr[Double] = js.native
  
  var f_subtitle_length_max_deviation: js.UndefOr[Double] = js.native
}
object MatcherSubtitleParams {
  
  @scala.inline
  def apply(): MatcherSubtitleParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherSubtitleParams]
  }
  
  @scala.inline
  implicit class MatcherSubtitleParamsMutableBuilder[Self <: MatcherSubtitleParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setF_subtitle_length(value: Double): Self = StObject.set(x, "f_subtitle_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_subtitle_lengthUndefined: Self = StObject.set(x, "f_subtitle_length", js.undefined)
    
    @scala.inline
    def setF_subtitle_length_max_deviation(value: Double): Self = StObject.set(x, "f_subtitle_length_max_deviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_subtitle_length_max_deviationUndefined: Self = StObject.set(x, "f_subtitle_length_max_deviation", js.undefined)
  }
}
