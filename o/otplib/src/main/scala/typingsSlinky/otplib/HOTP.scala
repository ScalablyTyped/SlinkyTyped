package typingsSlinky.otplib

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HOTP extends js.Object {
  var HOTP: Instantiable0[typingsSlinky.otplib.HOTP] = js.native
  var defaultOptions: HotpOptionsInterface = js.native
  var options: HotpOptionsInterface = js.native
  var optionsAll: HotpOptionsInterface = js.native
  def check(token: String, secret: String, counter: Double): Boolean = js.native
  def generate(secret: String, counter: Double): String = js.native
  def resetOptions(): this.type = js.native
  def verify(opts: HotpVerifyOptionsInterface): Boolean = js.native
}

object HOTP {
  @scala.inline
  def apply(
    HOTP: Instantiable0[HOTP],
    check: (String, String, Double) => Boolean,
    defaultOptions: HotpOptionsInterface,
    generate: (String, Double) => String,
    options: HotpOptionsInterface,
    optionsAll: HotpOptionsInterface,
    resetOptions: () => HOTP,
    verify: HotpVerifyOptionsInterface => Boolean
  ): HOTP = {
    val __obj = js.Dynamic.literal(HOTP = HOTP.asInstanceOf[js.Any], check = js.Any.fromFunction3(check), defaultOptions = defaultOptions.asInstanceOf[js.Any], generate = js.Any.fromFunction2(generate), options = options.asInstanceOf[js.Any], optionsAll = optionsAll.asInstanceOf[js.Any], resetOptions = js.Any.fromFunction0(resetOptions), verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[HOTP]
  }
  @scala.inline
  implicit class HOTPOps[Self <: HOTP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHOTP(value: Instantiable0[HOTP]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HOTP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheck(value: (String, String, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDefaultOptions(value: HotpOptionsInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerate(value: (String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOptions(value: HotpOptionsInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsAll(value: HotpOptionsInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetOptions(value: () => HOTP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVerify(value: HotpVerifyOptionsInterface => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

