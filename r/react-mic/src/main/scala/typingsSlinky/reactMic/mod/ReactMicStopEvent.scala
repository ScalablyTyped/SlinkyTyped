package typingsSlinky.reactMic.mod

import org.scalajs.dom.raw.Blob
import typingsSlinky.reactMic.AnonAudioBitsPerSecond
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactMicStopEvent extends js.Object {
  var blob: Blob = js.native
  var blobURL: String = js.native
  var option: AnonAudioBitsPerSecond = js.native
  var startTime: Double = js.native
  var stopTime: Double = js.native
}

object ReactMicStopEvent {
  @scala.inline
  def apply(blob: Blob, blobURL: String, option: AnonAudioBitsPerSecond, startTime: Double, stopTime: Double): ReactMicStopEvent = {
    val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], blobURL = blobURL.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stopTime = stopTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactMicStopEvent]
  }
  @scala.inline
  implicit class ReactMicStopEventOps[Self <: ReactMicStopEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlob(value: Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlobURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOption(value: AnonAudioBitsPerSecond): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

