package typingsSlinky.keystonejsAppAdminUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthentication[UserType /* <: js.Object */, ListNames /* <: String */] extends js.Object {
  var authentication: AnonItem[UserType, ListNames] = js.native
}

object AnonAuthentication {
  @scala.inline
  def apply[UserType, ListNames](authentication: AnonItem[UserType, ListNames]): AnonAuthentication[UserType, ListNames] = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthentication[UserType, ListNames]]
  }
  @scala.inline
  implicit class AnonAuthenticationOps[Self[usertype, listnames] <: AnonAuthentication[usertype, listnames], UserType, ListNames] (val x: Self[UserType, ListNames]) extends AnyVal {
    @scala.inline
    def duplicate: Self[UserType, ListNames] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[UserType, ListNames]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[UserType, ListNames]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[UserType, ListNames]) with Other]
    @scala.inline
    def withAuthentication(value: AnonItem[UserType, ListNames]): Self[UserType, ListNames] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authentication")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

