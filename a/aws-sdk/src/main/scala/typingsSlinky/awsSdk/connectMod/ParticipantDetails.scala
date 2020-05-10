package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticipantDetails extends js.Object {
  /**
    * Display name of the participant.
    */
  var DisplayName: typingsSlinky.awsSdk.connectMod.DisplayName = js.native
}

object ParticipantDetails {
  @scala.inline
  def apply(DisplayName: DisplayName): ParticipantDetails = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantDetails]
  }
  @scala.inline
  implicit class ParticipantDetailsOps[Self <: ParticipantDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

