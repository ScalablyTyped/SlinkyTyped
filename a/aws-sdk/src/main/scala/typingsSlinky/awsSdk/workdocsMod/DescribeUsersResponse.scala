package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUsersResponse extends js.Object {
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
  /**
    * The total number of users included in the results.
    */
  var TotalNumberOfUsers: js.UndefOr[SizeType] = js.native
  /**
    * The users.
    */
  var Users: js.UndefOr[OrganizationUserList] = js.native
}

object DescribeUsersResponse {
  @scala.inline
  def apply(): DescribeUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUsersResponse]
  }
  @scala.inline
  implicit class DescribeUsersResponseOps[Self <: DescribeUsersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: PageMarkerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalNumberOfUsers(value: SizeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalNumberOfUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalNumberOfUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalNumberOfUsers")(js.undefined)
        ret
    }
    @scala.inline
    def withUsers(value: OrganizationUserList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(js.undefined)
        ret
    }
  }
  
}

