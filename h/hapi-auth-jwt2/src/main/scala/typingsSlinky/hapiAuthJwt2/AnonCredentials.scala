package typingsSlinky.hapiAuthJwt2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCredentials extends js.Object {
  var credentials: js.UndefOr[js.Any] = js.native
  var isValid: Boolean = js.native
}

object AnonCredentials {
  @scala.inline
  def apply(isValid: Boolean): AnonCredentials = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCredentials]
  }
  @scala.inline
  implicit class AnonCredentialsOps[Self <: AnonCredentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentials(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
  }
  
}

