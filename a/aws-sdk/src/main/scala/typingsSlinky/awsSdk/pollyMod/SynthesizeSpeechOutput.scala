package typingsSlinky.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SynthesizeSpeechOutput extends js.Object {
  /**
    *  Stream containing the synthesized speech. 
    */
  var AudioStream: js.UndefOr[typingsSlinky.awsSdk.pollyMod.AudioStream] = js.native
  /**
    *  Specifies the type audio stream. This should reflect the OutputFormat parameter in your request.     If you request mp3 as the OutputFormat, the ContentType returned is audio/mpeg.     If you request ogg_vorbis as the OutputFormat, the ContentType returned is audio/ogg.     If you request pcm as the OutputFormat, the ContentType returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.    If you request json as the OutputFormat, the ContentType returned is audio/json.    
    */
  var ContentType: js.UndefOr[typingsSlinky.awsSdk.pollyMod.ContentType] = js.native
  /**
    * Number of characters synthesized.
    */
  var RequestCharacters: js.UndefOr[typingsSlinky.awsSdk.pollyMod.RequestCharacters] = js.native
}

object SynthesizeSpeechOutput {
  @scala.inline
  def apply(): SynthesizeSpeechOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynthesizeSpeechOutput]
  }
  @scala.inline
  implicit class SynthesizeSpeechOutputOps[Self <: SynthesizeSpeechOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioStreamUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioStream(value: AudioStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioStream")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: ContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCharacters(value: RequestCharacters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCharacters")(js.undefined)
        ret
    }
  }
  
}

