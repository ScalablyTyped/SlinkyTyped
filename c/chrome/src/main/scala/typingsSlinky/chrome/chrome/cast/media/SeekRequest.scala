package typingsSlinky.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeekRequest extends js.Object {
  var currentTime: Double = js.native
  var customData: js.Object = js.native
  var resumeState: ResumeState = js.native
}

object SeekRequest {
  @scala.inline
  def apply(currentTime: Double, customData: js.Object, resumeState: ResumeState): SeekRequest = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], resumeState = resumeState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeekRequest]
  }
  @scala.inline
  implicit class SeekRequestOps[Self <: SeekRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResumeState(value: ResumeState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

