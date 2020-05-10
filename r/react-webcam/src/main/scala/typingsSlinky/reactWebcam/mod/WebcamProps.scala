package typingsSlinky.reactWebcam.mod

import org.scalajs.dom.experimental.mediastream.MediaTrackConstraints
import typingsSlinky.reactWebcam.reactWebcamStrings.imageSlashjpeg
import typingsSlinky.reactWebcam.reactWebcamStrings.imageSlashpng
import typingsSlinky.reactWebcam.reactWebcamStrings.imageSlashwebp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebcamProps extends js.Object {
  var audio: Boolean = js.native
  var audioConstraints: js.UndefOr[Boolean | MediaTrackConstraints] = js.native
  var imageSmoothing: Boolean = js.native
  var minScreenshotHeight: js.UndefOr[Double] = js.native
  var minScreenshotWidth: js.UndefOr[Double] = js.native
  var mirrored: js.UndefOr[Boolean] = js.native
  var screenshotFormat: imageSlashwebp | imageSlashpng | imageSlashjpeg = js.native
  var screenshotQuality: Double = js.native
  var videoConstraints: js.UndefOr[Boolean | MediaTrackConstraints] = js.native
  def onUserMedia(): Unit = js.native
  def onUserMediaError(error: String): Unit = js.native
}

object WebcamProps {
  @scala.inline
  def apply(
    audio: Boolean,
    imageSmoothing: Boolean,
    onUserMedia: () => Unit,
    onUserMediaError: String => Unit,
    screenshotFormat: imageSlashwebp | imageSlashpng | imageSlashjpeg,
    screenshotQuality: Double
  ): WebcamProps = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], imageSmoothing = imageSmoothing.asInstanceOf[js.Any], onUserMedia = js.Any.fromFunction0(onUserMedia), onUserMediaError = js.Any.fromFunction1(onUserMediaError), screenshotFormat = screenshotFormat.asInstanceOf[js.Any], screenshotQuality = screenshotQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebcamProps]
  }
  @scala.inline
  implicit class WebcamPropsOps[Self <: WebcamProps] (val x: Self) extends AnyVal {
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
    def withOnUserMedia(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserMedia")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnUserMediaError(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserMediaError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScreenshotFormat(value: imageSlashwebp | imageSlashpng | imageSlashjpeg): Self = {
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
    @scala.inline
    def withAudioConstraintsMediaTrackConstraints(value: MediaTrackConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioConstraints(value: Boolean | MediaTrackConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withMinScreenshotHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScreenshotHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinScreenshotHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScreenshotHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinScreenshotWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScreenshotWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinScreenshotWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScreenshotWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMirrored(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirrored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMirrored: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirrored")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoConstraintsMediaTrackConstraints(value: MediaTrackConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoConstraints(value: Boolean | MediaTrackConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoConstraints")(js.undefined)
        ret
    }
  }
  
}

