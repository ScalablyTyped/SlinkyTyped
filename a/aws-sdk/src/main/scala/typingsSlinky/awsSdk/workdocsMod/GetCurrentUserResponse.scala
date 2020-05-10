package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCurrentUserResponse extends js.Object {
  /**
    * Metadata of the user.
    */
  var User: js.UndefOr[typingsSlinky.awsSdk.workdocsMod.User] = js.native
}

object GetCurrentUserResponse {
  @scala.inline
  def apply(): GetCurrentUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCurrentUserResponse]
  }
  @scala.inline
  implicit class GetCurrentUserResponseOps[Self <: GetCurrentUserResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(js.undefined)
        ret
    }
  }
  
}

