package typingsSlinky.reactWebcam.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Audio extends js.Object {
  var audio: Boolean = js.native
  var imageSmoothing: Boolean = js.native
  var mirrored: Boolean = js.native
  var screenshotFormat: String = js.native
  var screenshotQuality: Double = js.native
  def onUserMedia(): Unit = js.native
  def onUserMediaError(): Unit = js.native
}

object Audio {
  @scala.inline
  def apply(
    audio: Boolean,
    imageSmoothing: Boolean,
    mirrored: Boolean,
    onUserMedia: () => Unit,
    onUserMediaError: () => Unit,
    screenshotFormat: String,
    screenshotQuality: Double
  ): Audio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], imageSmoothing = imageSmoothing.asInstanceOf[js.Any], mirrored = mirrored.asInstanceOf[js.Any], onUserMedia = js.Any.fromFunction0(onUserMedia), onUserMediaError = js.Any.fromFunction0(onUserMediaError), screenshotFormat = screenshotFormat.asInstanceOf[js.Any], screenshotQuality = screenshotQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
  @scala.inline
  implicit class AudioOps[Self <: Audio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageSmoothing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSmoothing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMirrored(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirrored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnUserMedia(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserMedia")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnUserMediaError(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserMediaError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScreenshotFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenshotQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotQuality")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

