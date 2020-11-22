package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoFileDetailsAudioStream extends js.Object {
  
  /** The audio stream's bitrate, in bits per second. */
  var bitrateBps: js.UndefOr[String] = js.native
  
  /** The number of audio channels that the stream contains. */
  var channelCount: js.UndefOr[Double] = js.native
  
  /** The audio codec that the stream uses. */
  var codec: js.UndefOr[String] = js.native
  
  /** A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code. */
  var vendor: js.UndefOr[String] = js.native
}
object VideoFileDetailsAudioStream {
  
  @scala.inline
  def apply(): VideoFileDetailsAudioStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoFileDetailsAudioStream]
  }
  
  @scala.inline
  implicit class VideoFileDetailsAudioStreamOps[Self <: VideoFileDetailsAudioStream] (val x: Self) extends AnyVal {
    
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
    def setBitrateBps(value: String): Self = this.set("bitrateBps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrateBps: Self = this.set("bitrateBps", js.undefined)
    
    @scala.inline
    def setChannelCount(value: Double): Self = this.set("channelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelCount: Self = this.set("channelCount", js.undefined)
    
    @scala.inline
    def setCodec(value: String): Self = this.set("codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodec: Self = this.set("codec", js.undefined)
    
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendor: Self = this.set("vendor", js.undefined)
  }
}
