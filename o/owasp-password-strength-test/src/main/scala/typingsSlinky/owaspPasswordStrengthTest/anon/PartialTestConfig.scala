package typingsSlinky.owaspPasswordStrengthTest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<owasp-password-strength-test.owasp-password-strength-test.TestConfig> */
@js.native
trait PartialTestConfig extends js.Object {
  var allowPassphrases: js.UndefOr[Boolean] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var minOptionalTestsToPass: js.UndefOr[Double] = js.native
  var minPhraseLength: js.UndefOr[Double] = js.native
}

object PartialTestConfig {
  @scala.inline
  def apply(): PartialTestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTestConfig]
  }
  @scala.inline
  implicit class PartialTestConfigOps[Self <: PartialTestConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowPassphrases(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPassphrases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPassphrases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPassphrases")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinOptionalTestsToPass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOptionalTestsToPass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinOptionalTestsToPass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOptionalTestsToPass")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPhraseLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPhraseLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPhraseLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPhraseLength")(js.undefined)
        ret
    }
  }
  
}

