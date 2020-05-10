package typingsSlinky.domMediacaptureRecord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaRecorderOptions extends js.Object {
  var audioBitsPerSecond: js.UndefOr[Double] = js.native
  var bitsPerSecond: js.UndefOr[Double] = js.native
  var mimeType: js.UndefOr[String] = js.native
  var videoBitsPerSecond: js.UndefOr[Double] = js.native
}

object MediaRecorderOptions {
  @scala.inline
  def apply(): MediaRecorderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaRecorderOptions]
  }
  @scala.inline
  implicit class MediaRecorderOptionsOps[Self <: MediaRecorderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioBitsPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioBitsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioBitsPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioBitsPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withBitsPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitsPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitsPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoBitsPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoBitsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoBitsPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoBitsPerSecond")(js.undefined)
        ret
    }
  }
  
}

