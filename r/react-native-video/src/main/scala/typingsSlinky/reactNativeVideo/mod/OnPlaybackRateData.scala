package typingsSlinky.reactNativeVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPlaybackRateData extends StObject {
  
  var playbackRate: Double = js.native
}
object OnPlaybackRateData {
  
  @scala.inline
  def apply(playbackRate: Double): OnPlaybackRateData = {
    val __obj = js.Dynamic.literal(playbackRate = playbackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPlaybackRateData]
  }
  
  @scala.inline
  implicit class OnPlaybackRateDataMutableBuilder[Self <: OnPlaybackRateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
  }
}
