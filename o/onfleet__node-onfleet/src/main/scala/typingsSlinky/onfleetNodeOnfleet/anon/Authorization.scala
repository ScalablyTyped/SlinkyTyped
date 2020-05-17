package typingsSlinky.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authorization extends js.Object {
  var Authorization: String = js.native
  var `Content-Type`: String = js.native
  var `User-Agent`: String = js.native
}

object Authorization {
  @scala.inline
  def apply(Authorization: String, `Content-Type`: String, `User-Agent`: String): Authorization = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
  @scala.inline
  implicit class AuthorizationOps[Self <: Authorization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withContent-Type`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content-Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withUser-Agent`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User-Agent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

