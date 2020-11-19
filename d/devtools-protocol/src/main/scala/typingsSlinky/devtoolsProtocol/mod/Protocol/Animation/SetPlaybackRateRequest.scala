package typingsSlinky.devtoolsProtocol.mod.Protocol.Animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetPlaybackRateRequest extends js.Object {
  
  /**
    * Playback rate for animations on page
    */
  var playbackRate: Double = js.native
}
object SetPlaybackRateRequest {
  
  @scala.inline
  def apply(playbackRate: Double): SetPlaybackRateRequest = {
    val __obj = js.Dynamic.literal(playbackRate = playbackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPlaybackRateRequest]
  }
  
  @scala.inline
  implicit class SetPlaybackRateRequestOps[Self <: SetPlaybackRateRequest] (val x: Self) extends AnyVal {
    
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
    def setPlaybackRate(value: Double): Self = this.set("playbackRate", value.asInstanceOf[js.Any])
  }
}
