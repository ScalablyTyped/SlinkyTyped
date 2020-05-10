package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRoomMembershipsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The room membership details.
    */
  var RoomMemberships: js.UndefOr[RoomMembershipList] = js.native
}

object ListRoomMembershipsResponse {
  @scala.inline
  def apply(): ListRoomMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoomMembershipsResponse]
  }
  @scala.inline
  implicit class ListRoomMembershipsResponseOps[Self <: ListRoomMembershipsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRoomMemberships(value: RoomMembershipList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomMemberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomMemberships: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomMemberships")(js.undefined)
        ret
    }
  }
  
}

