package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Meeting extends js.Object {
  /**
    * The media placement for the meeting.
    */
  var MediaPlacement: js.UndefOr[typingsSlinky.awsSdk.chimeMod.MediaPlacement] = js.native
  /**
    * The Region in which to create the meeting. Available values: ap-northeast-1, ap-southeast-1, ap-southeast-2, ca-central-1, eu-central-1, eu-north-1, eu-west-1, eu-west-2, eu-west-3, sa-east-1, us-east-1, us-east-2, us-west-1, us-west-2.
    */
  var MediaRegion: js.UndefOr[String] = js.native
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: js.UndefOr[GuidString] = js.native
}

object Meeting {
  @scala.inline
  def apply(): Meeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Meeting]
  }
  @scala.inline
  implicit class MeetingOps[Self <: Meeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaPlacement(value: MediaPlacement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withMeetingId(value: GuidString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeetingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeetingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeetingId")(js.undefined)
        ret
    }
  }
  
}

