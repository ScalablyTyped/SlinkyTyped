package typingsSlinky.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationResource extends Resource {
  val reference_id: js.UndefOr[String] = js.native
  @JSName("update_time")
  val update_time_AuthorizationResource: String = js.native
  val valid_until: String = js.native
}

object AuthorizationResource {
  @scala.inline
  def apply(amount: Amount, id: String, update_time: String, valid_until: String): AuthorizationResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationResource]
  }
  @scala.inline
  implicit class AuthorizationResourceOps[Self <: AuthorizationResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdate_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid_until(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid_until")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReference_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference_id")(js.undefined)
        ret
    }
  }
  
}

