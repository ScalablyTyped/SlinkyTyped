package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminListUserAuthEventsResponse extends js.Object {
  /**
    * The response object. It includes the EventID, EventType, CreationDate, EventRisk, and EventResponse.
    */
  var AuthEvents: js.UndefOr[AuthEventsType] = js.native
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
}

object AdminListUserAuthEventsResponse {
  @scala.inline
  def apply(): AdminListUserAuthEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminListUserAuthEventsResponse]
  }
  @scala.inline
  implicit class AdminListUserAuthEventsResponseOps[Self <: AdminListUserAuthEventsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthEvents(value: AuthEventsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationKey): Self = {
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
  }
  
}

