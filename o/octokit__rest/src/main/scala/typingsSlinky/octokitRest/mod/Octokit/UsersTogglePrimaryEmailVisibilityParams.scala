package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersTogglePrimaryEmailVisibilityParams extends js.Object {
  /**
    * Specify the _primary_ email address that needs a visibility change.
    */
  var email: String = js.native
  /**
    * Use `public` to enable an authenticated user to view the specified email address, or use `private` so this primary email address cannot be seen publicly.
    */
  var visibility: String = js.native
}

object UsersTogglePrimaryEmailVisibilityParams {
  @scala.inline
  def apply(email: String, visibility: String): UsersTogglePrimaryEmailVisibilityParams = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersTogglePrimaryEmailVisibilityParams]
  }
  @scala.inline
  implicit class UsersTogglePrimaryEmailVisibilityParamsOps[Self <: UsersTogglePrimaryEmailVisibilityParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

