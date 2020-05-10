package typingsSlinky.jose.mod.JWT

import typingsSlinky.jose.mod.JWTProfiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyOptions[komplet] extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.native
  var audience: js.UndefOr[String | js.Array[String]] = js.native
  var clockTolerance: js.UndefOr[String] = js.native
  var complete: js.UndefOr[komplet] = js.native
  var crit: js.UndefOr[js.Array[String]] = js.native
  var ignoreExp: js.UndefOr[Boolean] = js.native
  var ignoreIat: js.UndefOr[Boolean] = js.native
  var ignoreNbf: js.UndefOr[Boolean] = js.native
  var issuer: js.UndefOr[String] = js.native
  var jti: js.UndefOr[String] = js.native
  var maxAuthAge: js.UndefOr[String] = js.native
  var maxTokenAge: js.UndefOr[String] = js.native
  var nonce: js.UndefOr[String] = js.native
  var now: js.UndefOr[js.Date] = js.native
  var profile: js.UndefOr[JWTProfiles] = js.native
  var subject: js.UndefOr[String] = js.native
  var typ: js.UndefOr[String] = js.native
}

object VerifyOptions {
  @scala.inline
  def apply[komplet](): VerifyOptions[komplet] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyOptions[komplet]]
  }
  @scala.inline
  implicit class VerifyOptionsOps[Self[komplet_] <: VerifyOptions[komplet_], komplet] (val x: Self[komplet]) extends AnyVal {
    @scala.inline
    def duplicate: Self[komplet] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[komplet]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[komplet] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[komplet] with Other]
    @scala.inline
    def withAlgorithms(value: js.Array[String]): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithms: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithms")(js.undefined)
        ret
    }
    @scala.inline
    def withAudience(value: String | js.Array[String]): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudience: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(js.undefined)
        ret
    }
    @scala.inline
    def withClockTolerance(value: String): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClockTolerance: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: komplet): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplete: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withCrit(value: js.Array[String]): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrit: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crit")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreExp(value: Boolean): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreExp: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreExp")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreIat(value: Boolean): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreIat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreIat: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreIat")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreNbf(value: Boolean): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreNbf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreNbf: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreNbf")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuer(value: String): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withJti(value: String): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jti")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJti: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jti")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAuthAge(value: String): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAuthAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAuthAge: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAuthAge")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTokenAge(value: String): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTokenAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTokenAge: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTokenAge")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: String): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
    @scala.inline
    def withNow(value: js.Date): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNow: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: JWTProfiles): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: String): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withTyp(value: String): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTyp: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typ")(js.undefined)
        ret
    }
  }
  
}

