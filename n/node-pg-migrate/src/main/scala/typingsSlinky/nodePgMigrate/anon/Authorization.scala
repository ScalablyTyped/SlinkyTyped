package typingsSlinky.nodePgMigrate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authorization extends js.Object {
  var authorization: js.UndefOr[String] = js.native
  var ifNotExists: js.UndefOr[Boolean] = js.native
}

object Authorization {
  @scala.inline
  def apply(): Authorization = {
    val __obj = js.Dynamic.literal()
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
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(js.undefined)
        ret
    }
    @scala.inline
    def withIfNotExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifNotExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfNotExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifNotExists")(js.undefined)
        ret
    }
  }
  
}

