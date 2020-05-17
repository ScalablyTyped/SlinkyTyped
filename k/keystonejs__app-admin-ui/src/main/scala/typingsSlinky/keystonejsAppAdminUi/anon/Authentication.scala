package typingsSlinky.keystonejsAppAdminUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authentication[UserType /* <: js.Object */, ListNames /* <: String */] extends js.Object {
  var authentication: Item[UserType, ListNames] = js.native
}

object Authentication {
  @scala.inline
  def apply[UserType, ListNames](authentication: Item[UserType, ListNames]): Authentication[UserType, ListNames] = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication[UserType, ListNames]]
  }
  @scala.inline
  implicit class AuthenticationOps[Self[usertype, listnames] <: Authentication[usertype, listnames], UserType, ListNames] (val x: Self[UserType, ListNames]) extends AnyVal {
    @scala.inline
    def duplicate: Self[UserType, ListNames] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[UserType, ListNames]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[UserType, ListNames]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[UserType, ListNames]) with Other]
    @scala.inline
    def withAuthentication(value: Item[UserType, ListNames]): Self[UserType, ListNames] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authentication")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

