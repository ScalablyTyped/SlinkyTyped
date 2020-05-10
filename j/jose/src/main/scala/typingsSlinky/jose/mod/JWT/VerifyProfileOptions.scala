package typingsSlinky.jose.mod.JWT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyProfileOptions[profile] extends js.Object {
  var audience: String | js.Array[String] = js.native
  var issuer: String = js.native
  var profile: js.UndefOr[profile] = js.native
}

object VerifyProfileOptions {
  @scala.inline
  def apply[profile](audience: String | js.Array[String], issuer: String): VerifyProfileOptions[profile] = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyProfileOptions[profile]]
  }
  @scala.inline
  implicit class VerifyProfileOptionsOps[Self[profile_] <: VerifyProfileOptions[profile_], profile] (val x: Self[profile]) extends AnyVal {
    @scala.inline
    def duplicate: Self[profile] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[profile]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[profile] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[profile] with Other]
    @scala.inline
    def withAudience(value: String | js.Array[String]): Self[profile] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuer(value: String): Self[profile] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile(value: profile): Self[profile] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self[profile] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
  }
  
}

