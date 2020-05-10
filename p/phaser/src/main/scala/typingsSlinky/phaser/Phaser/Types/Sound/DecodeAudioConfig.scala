package typingsSlinky.phaser.Phaser.Types.Sound

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Audio Data object.
  * 
  * You can pass an array of these objects to the WebAudioSoundManager `decodeAudio` method to have it decode
  * them all at once.
  */
@js.native
trait DecodeAudioConfig extends js.Object {
  /**
    * The audio data, either a base64 encoded string, an audio media-type data uri, or an ArrayBuffer instance.
    */
  var data: js.typedarray.ArrayBuffer | String = js.native
  /**
    * The string-based key to be used to reference the decoded audio in the audio cache.
    */
  var key: String = js.native
}

object DecodeAudioConfig {
  @scala.inline
  def apply(data: js.typedarray.ArrayBuffer | String, key: String): DecodeAudioConfig = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeAudioConfig]
  }
  @scala.inline
  implicit class DecodeAudioConfigOps[Self <: DecodeAudioConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.typedarray.ArrayBuffer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

