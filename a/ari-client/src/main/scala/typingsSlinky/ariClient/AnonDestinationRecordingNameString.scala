package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDestinationRecordingNameString extends js.Object {
  var destinationRecordingName: String = js.native
}

object AnonDestinationRecordingNameString {
  @scala.inline
  def apply(destinationRecordingName: String): AnonDestinationRecordingNameString = {
    val __obj = js.Dynamic.literal(destinationRecordingName = destinationRecordingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDestinationRecordingNameString]
  }
  @scala.inline
  implicit class AnonDestinationRecordingNameStringOps[Self <: AnonDestinationRecordingNameString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationRecordingName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationRecordingName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

