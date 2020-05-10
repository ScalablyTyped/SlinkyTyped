package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserProfilesResult extends js.Object {
  /**
    * A Users object that describes the specified users.
    */
  var UserProfiles: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.UserProfiles] = js.native
}

object DescribeUserProfilesResult {
  @scala.inline
  def apply(): DescribeUserProfilesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserProfilesResult]
  }
  @scala.inline
  implicit class DescribeUserProfilesResultOps[Self <: DescribeUserProfilesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserProfiles(value: UserProfiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserProfiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserProfiles")(js.undefined)
        ret
    }
  }
  
}

