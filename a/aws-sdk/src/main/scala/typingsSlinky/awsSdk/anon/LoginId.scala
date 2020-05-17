package typingsSlinky.awsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginId extends js.Object {
  var LoginId: js.UndefOr[String] = js.native
}

object LoginId {
  @scala.inline
  def apply(): LoginId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginId]
  }
  @scala.inline
  implicit class LoginIdOps[Self <: LoginId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoginId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoginId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoginId")(js.undefined)
        ret
    }
  }
  
}

