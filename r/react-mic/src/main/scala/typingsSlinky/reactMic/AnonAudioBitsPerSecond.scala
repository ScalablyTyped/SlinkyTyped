package typingsSlinky.reactMic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAudioBitsPerSecond extends js.Object {
  var audioBitsPerSecond: Double = js.native
  var mimeType: String = js.native
}

object AnonAudioBitsPerSecond {
  @scala.inline
  def apply(audioBitsPerSecond: Double, mimeType: String): AnonAudioBitsPerSecond = {
    val __obj = js.Dynamic.literal(audioBitsPerSecond = audioBitsPerSecond.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAudioBitsPerSecond]
  }
  @scala.inline
  implicit class AnonAudioBitsPerSecondOps[Self <: AnonAudioBitsPerSecond] (val x: Self) extends AnyVal {
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
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

