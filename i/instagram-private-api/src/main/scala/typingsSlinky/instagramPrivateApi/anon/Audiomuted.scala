package typingsSlinky.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Audiomuted extends js.Object {
  var audio_muted: js.UndefOr[Boolean] = js.native
  var clips: js.UndefOr[js.Array[Length]] = js.native
  var length: Double = js.native
  var poster_frame_index: js.UndefOr[Double] = js.native
}

object Audiomuted {
  @scala.inline
  def apply(length: Double): Audiomuted = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audiomuted]
  }
  @scala.inline
  implicit class AudiomutedOps[Self <: Audiomuted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudio_muted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio_muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio_muted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio_muted")(js.undefined)
        ret
    }
    @scala.inline
    def withClips(value: js.Array[Length]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clips")(js.undefined)
        ret
    }
    @scala.inline
    def withPoster_frame_index(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster_frame_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoster_frame_index: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster_frame_index")(js.undefined)
        ret
    }
  }
  
}

