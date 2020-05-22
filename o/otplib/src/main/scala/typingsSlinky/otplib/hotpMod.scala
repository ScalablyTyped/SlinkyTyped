package typingsSlinky.otplib

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("otplib/hotp", JSImport.Namespace)
@js.native
object hotpMod
  extends TopLevel[typingsSlinky.otplib.HOTP] {
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
  
}

