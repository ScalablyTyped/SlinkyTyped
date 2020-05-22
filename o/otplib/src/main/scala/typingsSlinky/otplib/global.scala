package typingsSlinky.otplib

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Authenticator ()
    extends typingsSlinky.otplib.Authenticator {
    /* CompleteClass */
    override var HOTP: Instantiable0[typingsSlinky.otplib.HOTP] = js.native
    /* CompleteClass */
    override var TOTP: Instantiable0[typingsSlinky.otplib.TOTP] = js.native
    /* CompleteClass */
    override var defaultOptions: HotpOptionsInterface = js.native
    /* CompleteClass */
    @JSName("defaultOptions")
    override var defaultOptions_TOTP: TotpOptionsInterface = js.native
    /* CompleteClass */
    override var options: HotpOptionsInterface = js.native
    /* CompleteClass */
    override var optionsAll: HotpOptionsInterface = js.native
    /* CompleteClass */
    @JSName("optionsAll")
    override var optionsAll_TOTP: TotpOptionsInterface = js.native
    /* CompleteClass */
    @JSName("options")
    override var options_TOTP: TotpOptionsInterface = js.native
    /* CompleteClass */
    override def check(token: String, secret: String): Boolean = js.native
    /* CompleteClass */
    override def check(token: String, secret: String, counter: Double): Boolean = js.native
    /* CompleteClass */
    override def checkDelta(token: String, secret: String): Double | Null = js.native
    /* CompleteClass */
    override def generate(secret: String): String = js.native
    /* CompleteClass */
    override def generate(secret: String, counter: Double): String = js.native
    /* CompleteClass */
    override def resetOptions(): this.type = js.native
    /* CompleteClass */
    override def timeRemaining(): Double = js.native
    /* CompleteClass */
    override def timeUsed(): Double = js.native
    /* CompleteClass */
    override def verify(opts: HotpVerifyOptionsInterface): Boolean = js.native
    /* CompleteClass */
    override def verify(opts: TotpVerifyOptionsInterface): Boolean = js.native
  }
  
  @js.native
  class HOTP ()
    extends typingsSlinky.otplib.HOTP {
    /* CompleteClass */
    override var HOTP: Instantiable0[typingsSlinky.otplib.HOTP] = js.native
    /* CompleteClass */
    override var defaultOptions: HotpOptionsInterface = js.native
    /* CompleteClass */
    override var options: HotpOptionsInterface = js.native
    /* CompleteClass */
    override var optionsAll: HotpOptionsInterface = js.native
    /* CompleteClass */
    override def check(token: String, secret: String, counter: Double): Boolean = js.native
    /* CompleteClass */
    override def generate(secret: String, counter: Double): String = js.native
    /* CompleteClass */
    override def resetOptions(): this.type = js.native
    /* CompleteClass */
    override def verify(opts: HotpVerifyOptionsInterface): Boolean = js.native
  }
  
  @js.native
  class TOTP ()
    extends typingsSlinky.otplib.TOTP {
    /* CompleteClass */
    override var HOTP: Instantiable0[typingsSlinky.otplib.HOTP] = js.native
    /* CompleteClass */
    override var TOTP: Instantiable0[typingsSlinky.otplib.TOTP] = js.native
    /* CompleteClass */
    override var defaultOptions: HotpOptionsInterface = js.native
    /* CompleteClass */
    @JSName("defaultOptions")
    override var defaultOptions_TOTP: TotpOptionsInterface = js.native
    /* CompleteClass */
    override var options: HotpOptionsInterface = js.native
    /* CompleteClass */
    override var optionsAll: HotpOptionsInterface = js.native
    /* CompleteClass */
    @JSName("optionsAll")
    override var optionsAll_TOTP: TotpOptionsInterface = js.native
    /* CompleteClass */
    @JSName("options")
    override var options_TOTP: TotpOptionsInterface = js.native
    /* CompleteClass */
    override def check(token: String, secret: String): Boolean = js.native
    /* CompleteClass */
    override def check(token: String, secret: String, counter: Double): Boolean = js.native
    /* CompleteClass */
    override def checkDelta(token: String, secret: String): Double | Null = js.native
    /* CompleteClass */
    override def generate(secret: String): String = js.native
    /* CompleteClass */
    override def generate(secret: String, counter: Double): String = js.native
    /* CompleteClass */
    override def resetOptions(): this.type = js.native
    /* CompleteClass */
    override def timeRemaining(): Double = js.native
    /* CompleteClass */
    override def timeUsed(): Double = js.native
    /* CompleteClass */
    override def verify(opts: HotpVerifyOptionsInterface): Boolean = js.native
    /* CompleteClass */
    override def verify(opts: TotpVerifyOptionsInterface): Boolean = js.native
  }
  
}

