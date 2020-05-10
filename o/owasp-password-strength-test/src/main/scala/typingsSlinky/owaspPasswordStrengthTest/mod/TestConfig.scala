package typingsSlinky.owaspPasswordStrengthTest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestConfig extends js.Object {
  /**
    * toggles the "passphrase" mechanism on and off;
    * If set to false, the strength-checker will abandon the notion of "passphrases",
    * and will subject all passwords to the same complexity requirements.
    */
  var allowPassphrases: Boolean = js.native
  /** constraint on a password's maximum length */
  var maxLength: Double = js.native
  /** constraint on a password's minimum length */
  var minLength: Double = js.native
  /**
    * minimum number of optional tests that a password must pass in order to be considered "strong";
    * By default (per the OWASP guidelines), four optional complexity tests are made,
    * and a password must pass at least three of them in order to be considered "strong"
    */
  var minOptionalTestsToPass: Double = js.native
  /**
    * minimum length a password needs to achieve in order to be considered a "passphrase"
    * (and thus exempted from the optional complexity tests by default)
    */
  var minPhraseLength: Double = js.native
}

object TestConfig {
  @scala.inline
  def apply(
    allowPassphrases: Boolean,
    maxLength: Double,
    minLength: Double,
    minOptionalTestsToPass: Double,
    minPhraseLength: Double
  ): TestConfig = {
    val __obj = js.Dynamic.literal(allowPassphrases = allowPassphrases.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], minOptionalTestsToPass = minOptionalTestsToPass.asInstanceOf[js.Any], minPhraseLength = minPhraseLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestConfig]
  }
  @scala.inline
  implicit class TestConfigOps[Self <: TestConfig] (val x: Self) extends AnyVal {
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
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinOptionalTestsToPass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOptionalTestsToPass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinPhraseLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPhraseLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

