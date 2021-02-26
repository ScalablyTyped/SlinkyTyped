package typingsSlinky.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPlaybackRateResponse extends StObject {
  
  /**
    * Playback rate for animations on page.
    */
  var playbackRate: Double = js.native
}
object GetPlaybackRateResponse {
  
  @scala.inline
  def apply(playbackRate: Double): GetPlaybackRateResponse = {
    val __obj = js.Dynamic.literal(playbackRate = playbackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlaybackRateResponse]
  }
  
  @scala.inline
  implicit class GetPlaybackRateResponseMutableBuilder[Self <: GetPlaybackRateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
  }
}
