package typingsSlinky.otplibPresetV11

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TOTP extends HOTP {
  
  var TOTP: Instantiable0[typingsSlinky.otplibPresetV11.TOTP] = js.native
  
  def check(token: String, secret: String): Boolean = js.native
  
  def checkDelta(token: String, secret: String): Double | Null = js.native
  
  @JSName("defaultOptions")
  var defaultOptions_TOTP: TotpOptionsInterface = js.native
  
  def generate(secret: String): String = js.native
  
  @JSName("optionsAll")
  var optionsAll_TOTP: TotpOptionsInterface = js.native
  
  @JSName("options")
  var options_TOTP: TotpOptionsInterface = js.native
  
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
  implicit class TOTPMutableBuilder[Self <: TOTP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheck(value: (String, String) => Boolean): Self = StObject.set(x, "check", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckDelta(value: (String, String) => Double | Null): Self = StObject.set(x, "checkDelta", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDefaultOptions(value: TotpOptionsInterface): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerate(value: String => String): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: TotpOptionsInterface): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsAll(value: TotpOptionsInterface): Self = StObject.set(x, "optionsAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOTP(value: Instantiable0[TOTP]): Self = StObject.set(x, "TOTP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeRemaining(value: () => Double): Self = StObject.set(x, "timeRemaining", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTimeUsed(value: () => Double): Self = StObject.set(x, "timeUsed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVerify(value: TotpVerifyOptionsInterface => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction1(value))
  }
}
