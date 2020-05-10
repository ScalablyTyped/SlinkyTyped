package typingsSlinky.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/signinwithapplejs/namei
@js.native
trait NameI extends js.Object {
  var firstName: String = js.native
  var lastName: String = js.native
}

object NameI {
  @scala.inline
  def apply(firstName: String, lastName: String): NameI = {
    val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameI]
  }
  @scala.inline
  implicit class NameIOps[Self <: NameI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

