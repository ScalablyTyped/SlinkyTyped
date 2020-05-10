package typingsSlinky.modernizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioBoolean extends js.Object {
  var m4a: String = js.native
  var mp3: String = js.native
  var ogg: String = js.native
  var wav: String = js.native
}

object AudioBoolean {
  @scala.inline
  def apply(m4a: String, mp3: String, ogg: String, wav: String): AudioBoolean = {
    val __obj = js.Dynamic.literal(m4a = m4a.asInstanceOf[js.Any], mp3 = mp3.asInstanceOf[js.Any], ogg = ogg.asInstanceOf[js.Any], wav = wav.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBoolean]
  }
  @scala.inline
  implicit class AudioBooleanOps[Self <: AudioBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withM4a(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m4a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMp3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mp3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOgg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ogg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWav(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wav")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

