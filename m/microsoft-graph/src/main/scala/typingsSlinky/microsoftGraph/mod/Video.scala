package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Video extends js.Object {
  
  // Number of audio bits per sample.
  var audioBitsPerSample: js.UndefOr[NullableOption[Double]] = js.native
  
  // Number of audio channels.
  var audioChannels: js.UndefOr[NullableOption[Double]] = js.native
  
  // Name of the audio format (AAC, MP3, etc.).
  var audioFormat: js.UndefOr[NullableOption[String]] = js.native
  
  // Number of audio samples per second.
  var audioSamplesPerSecond: js.UndefOr[NullableOption[Double]] = js.native
  
  // Bit rate of the video in bits per second.
  var bitrate: js.UndefOr[NullableOption[Double]] = js.native
  
  // Duration of the file in milliseconds.
  var duration: js.UndefOr[NullableOption[Double]] = js.native
  
  // 'Four character code' name of the video format.
  var fourCC: js.UndefOr[NullableOption[String]] = js.native
  
  // Frame rate of the video.
  var frameRate: js.UndefOr[NullableOption[Double]] = js.native
  
  // Height of the video, in pixels.
  var height: js.UndefOr[NullableOption[Double]] = js.native
  
  // Width of the video, in pixels.
  var width: js.UndefOr[NullableOption[Double]] = js.native
}
object Video {
  
  @scala.inline
  def apply(): Video = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Video]
  }
  
  @scala.inline
  implicit class VideoOps[Self <: Video] (val x: Self) extends AnyVal {
    
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
    def setAudioBitsPerSample(value: NullableOption[Double]): Self = this.set("audioBitsPerSample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioBitsPerSample: Self = this.set("audioBitsPerSample", js.undefined)
    
    @scala.inline
    def setAudioBitsPerSampleNull: Self = this.set("audioBitsPerSample", null)
    
    @scala.inline
    def setAudioChannels(value: NullableOption[Double]): Self = this.set("audioChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioChannels: Self = this.set("audioChannels", js.undefined)
    
    @scala.inline
    def setAudioChannelsNull: Self = this.set("audioChannels", null)
    
    @scala.inline
    def setAudioFormat(value: NullableOption[String]): Self = this.set("audioFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioFormat: Self = this.set("audioFormat", js.undefined)
    
    @scala.inline
    def setAudioFormatNull: Self = this.set("audioFormat", null)
    
    @scala.inline
    def setAudioSamplesPerSecond(value: NullableOption[Double]): Self = this.set("audioSamplesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioSamplesPerSecond: Self = this.set("audioSamplesPerSecond", js.undefined)
    
    @scala.inline
    def setAudioSamplesPerSecondNull: Self = this.set("audioSamplesPerSecond", null)
    
    @scala.inline
    def setBitrate(value: NullableOption[Double]): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("bitrate", js.undefined)
    
    @scala.inline
    def setBitrateNull: Self = this.set("bitrate", null)
    
    @scala.inline
    def setDuration(value: NullableOption[Double]): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setDurationNull: Self = this.set("duration", null)
    
    @scala.inline
    def setFourCC(value: NullableOption[String]): Self = this.set("fourCC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFourCC: Self = this.set("fourCC", js.undefined)
    
    @scala.inline
    def setFourCCNull: Self = this.set("fourCC", null)
    
    @scala.inline
    def setFrameRate(value: NullableOption[Double]): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    
    @scala.inline
    def setFrameRateNull: Self = this.set("frameRate", null)
    
    @scala.inline
    def setHeight(value: NullableOption[Double]): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHeightNull: Self = this.set("height", null)
    
    @scala.inline
    def setWidth(value: NullableOption[Double]): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWidthNull: Self = this.set("width", null)
  }
}
