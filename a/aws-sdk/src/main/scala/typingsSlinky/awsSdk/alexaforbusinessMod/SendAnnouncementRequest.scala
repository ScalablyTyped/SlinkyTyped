package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAnnouncementRequest extends js.Object {
  /**
    * The unique, user-specified identifier for the request that ensures idempotency.
    */
  var ClientRequestToken: typingsSlinky.awsSdk.alexaforbusinessMod.ClientRequestToken = js.native
  /**
    * The announcement content. This can contain only one of the three possible announcement types (text, SSML or audio).
    */
  var Content: typingsSlinky.awsSdk.alexaforbusinessMod.Content = js.native
  /**
    * The filters to use to send an announcement to a specified list of rooms. The supported filter keys are RoomName, ProfileName, RoomArn, and ProfileArn. To send to all rooms, specify an empty RoomFilters list.
    */
  var RoomFilters: FilterList = js.native
  /**
    * The time to live for an announcement. Default is 300. If delivery doesn't occur within this time, the announcement is not delivered.
    */
  var TimeToLiveInSeconds: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.TimeToLiveInSeconds] = js.native
}

object SendAnnouncementRequest {
  @scala.inline
  def apply(ClientRequestToken: ClientRequestToken, Content: Content, RoomFilters: FilterList): SendAnnouncementRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], RoomFilters = RoomFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAnnouncementRequest]
  }
  @scala.inline
  implicit class SendAnnouncementRequestOps[Self <: SendAnnouncementRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: Content): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoomFilters(value: FilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeToLiveInSeconds(value: TimeToLiveInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeToLiveInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeToLiveInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeToLiveInSeconds")(js.undefined)
        ret
    }
  }
  
}

