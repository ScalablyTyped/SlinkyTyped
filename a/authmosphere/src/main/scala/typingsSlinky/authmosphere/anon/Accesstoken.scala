package typingsSlinky.authmosphere.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accesstoken extends js.Object {
  var access_token: String = js.native
  var expires_in: js.UndefOr[Double] = js.native
  var local_expiry: js.UndefOr[Double] = js.native
  var scope: js.UndefOr[js.Array[String]] = js.native
  var token_type: js.UndefOr[String] = js.native
}

object Accesstoken {
  @scala.inline
  def apply(access_token: String): Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstoken]
  }
  @scala.inline
  implicit class AccesstokenOps[Self <: Accesstoken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires_in(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires_in: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_in")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal_expiry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_expiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_expiry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_expiry")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_type")(js.undefined)
        ret
    }
  }
  
}

