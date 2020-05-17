package typingsSlinky.otplib

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TOTP extends HOTP {
  var TOTP: Instantiable0[typingsSlinky.otplib.TOTP] = js.native
  @JSName("defaultOptions")
  var defaultOptions_TOTP: TotpOptionsInterface = js.native
  @JSName("optionsAll")
  var optionsAll_TOTP: TotpOptionsInterface = js.native
  @JSName("options")
  var options_TOTP: TotpOptionsInterface = js.native
  def check(token: String, secret: String): Boolean = js.native
  def checkDelta(token: String, secret: String): Double | Null = js.native
  def generate(secret: String): String = js.native
  def timeRemaining(): Double = js.native
  def timeUsed(): Double = js.native
  def verify(opts: TotpVerifyOptionsInterface): Boolean = js.native
}

object TOTP {
  @scala.inline
  def apply(
    HOTP: Instantiable0[HOTP],
    TOTP: Instantiable0[TOTP],
    check: (String, String) => Boolean,
    checkDelta: (String, String) => Double | Null,
    defaultOptions: TotpOptionsInterface,
    generate: String => String,
    options: TotpOptionsInterface,
    optionsAll: TotpOptionsInterface,
    resetOptions: () => TOTP,
    timeRemaining: () => Double,
    timeUsed: () => Double,
    verify: TotpVerifyOptionsInterface => Boolean
  ): TOTP = {
    val __obj = js.Dynamic.literal(HOTP = HOTP.asInstanceOf[js.Any], TOTP = TOTP.asInstanceOf[js.Any], check = js.Any.fromFunction2(check), checkDelta = js.Any.fromFunction2(checkDelta), defaultOptions = defaultOptions.asInstanceOf[js.Any], generate = js.Any.fromFunction1(generate), options = options.asInstanceOf[js.Any], optionsAll = optionsAll.asInstanceOf[js.Any], resetOptions = js.Any.fromFunction0(resetOptions), timeRemaining = js.Any.fromFunction0(timeRemaining), timeUsed = js.Any.fromFunction0(timeUsed), verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[TOTP]
  }
  @scala.inline
  implicit class TOTPOps[Self <: TOTP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTOTP(value: Instantiable0[TOTP]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOTP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheck(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCheckDelta(value: (String, String) => Double | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkDelta")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDefaultOptions(value: TotpOptionsInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerate(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptions(value: TotpOptionsInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsAll(value: TotpOptionsInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeRemaining(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRemaining")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTimeUsed(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUsed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVerify(value: TotpVerifyOptionsInterface => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

