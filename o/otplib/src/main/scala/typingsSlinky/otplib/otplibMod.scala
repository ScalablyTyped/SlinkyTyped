package typingsSlinky.otplib

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("otplib", JSImport.Namespace)
@js.native
object otplibMod extends js.Object {
  @js.native
  object authenticator
    extends TopLevel[typingsSlinky.otplib.Authenticator] {
    @js.native
    class Authenticator ()
      extends typingsSlinky.otplib.Authenticator
    
    @js.native
    class HOTP ()
      extends typingsSlinky.otplib.HOTP
    
    @js.native
    class TOTP ()
      extends typingsSlinky.otplib.TOTP
    
  }
  
  @js.native
  object hotp
    extends TopLevel[typingsSlinky.otplib.HOTP] {
    @js.native
    class HOTP ()
      extends typingsSlinky.otplib.HOTP
    
  }
  
  @js.native
  object totp
    extends TopLevel[typingsSlinky.otplib.TOTP] {
    @js.native
    class HOTP ()
      extends typingsSlinky.otplib.HOTP
    
    @js.native
    class TOTP ()
      extends typingsSlinky.otplib.TOTP
    
  }
  
}

