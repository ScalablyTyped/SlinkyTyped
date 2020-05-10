package typingsSlinky.domMediacaptureRecord

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaRecorderEventMap extends js.Object {
  var dataavailable: BlobEvent = js.native
  var error: MediaRecorderErrorEvent = js.native
  var pause: Event_ = js.native
  var resume: Event_ = js.native
  var start: Event_ = js.native
  var stop: Event_ = js.native
}

object MediaRecorderEventMap {
  @scala.inline
  def apply(
    dataavailable: BlobEvent,
    error: MediaRecorderErrorEvent,
    pause: Event_,
    resume: Event_,
    start: Event_,
    stop: Event_
  ): MediaRecorderEventMap = {
    val __obj = js.Dynamic.literal(dataavailable = dataavailable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRecorderEventMap]
  }
  @scala.inline
  implicit class MediaRecorderEventMapOps[Self <: MediaRecorderEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataavailable(value: BlobEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataavailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: MediaRecorderErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPause(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResume(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

