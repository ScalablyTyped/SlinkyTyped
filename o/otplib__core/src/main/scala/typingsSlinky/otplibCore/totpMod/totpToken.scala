package typingsSlinky.otplibCore.totpMod

import typingsSlinky.otplibCore.utilsMod.SecretKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@otplib/core/totp", "totpToken")
@js.native
object totpToken extends js.Object {
  
  def apply[T /* <: TOTPOptions_[_] */](secret: SecretKey, options: T): String = js.native
}
