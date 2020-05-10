package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateUserResponse extends js.Object {
  /**
    * If the BatchUpdateUser action fails for one or more of the user IDs in the request, a list of the user IDs is returned, along with error codes and error messages.
    */
  var UserErrors: js.UndefOr[UserErrorList] = js.native
}

object BatchUpdateUserResponse {
  @scala.inline
  def apply(): BatchUpdateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateUserResponse]
  }
  @scala.inline
  implicit class BatchUpdateUserResponseOps[Self <: BatchUpdateUserResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserErrors(value: UserErrorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserErrors")(js.undefined)
        ret
    }
  }
  
}

