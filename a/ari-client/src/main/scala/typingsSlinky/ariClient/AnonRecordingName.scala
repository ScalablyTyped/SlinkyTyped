package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRecordingName extends js.Object {
  var recordingName: String = js.native
}

object AnonRecordingName {
  @scala.inline
  def apply(recordingName: String): AnonRecordingName = {
    val __obj = js.Dynamic.literal(recordingName = recordingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRecordingName]
  }
  @scala.inline
  implicit class AnonRecordingNameOps[Self <: AnonRecordingName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordingName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

