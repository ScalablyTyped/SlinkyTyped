package typingsSlinky.googleAuthLibrary.oauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyIdTokenOptions extends js.Object {
  var audience: String | js.Array[String] = js.native
  var idToken: String = js.native
  var maxExpiry: js.UndefOr[Double] = js.native
}

object VerifyIdTokenOptions {
  @scala.inline
  def apply(audience: String | js.Array[String], idToken: String): VerifyIdTokenOptions = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyIdTokenOptions]
  }
  @scala.inline
  implicit class VerifyIdTokenOptionsOps[Self <: VerifyIdTokenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudience(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxExpiry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExpiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxExpiry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExpiry")(js.undefined)
        ret
    }
  }
  
}

