package typingsSlinky.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneMultiFactorSignInInfoOptions extends PhoneInfoOptions {
  var multiFactorHint: js.UndefOr[MultiFactorInfo] = js.native
  var multiFactorUid: js.UndefOr[String] = js.native
  var session: MultiFactorSession = js.native
}

object PhoneMultiFactorSignInInfoOptions {
  @scala.inline
  def apply(session: MultiFactorSession): PhoneMultiFactorSignInInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorSignInInfoOptions]
  }
  @scala.inline
  implicit class PhoneMultiFactorSignInInfoOptionsOps[Self <: PhoneMultiFactorSignInInfoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSession(value: MultiFactorSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiFactorHint(value: MultiFactorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiFactorHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiFactorHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiFactorHint")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiFactorUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiFactorUid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiFactorUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiFactorUid")(js.undefined)
        ret
    }
  }
  
}

