package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMyUserProfileResult extends js.Object {
  /**
    * A UserProfile object that describes the user's SSH information.
    */
  var UserProfile: js.UndefOr[SelfUserProfile] = js.native
}

object DescribeMyUserProfileResult {
  @scala.inline
  def apply(): DescribeMyUserProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMyUserProfileResult]
  }
  @scala.inline
  implicit class DescribeMyUserProfileResultOps[Self <: DescribeMyUserProfileResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserProfile(value: SelfUserProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserProfile")(js.undefined)
        ret
    }
  }
  
}

