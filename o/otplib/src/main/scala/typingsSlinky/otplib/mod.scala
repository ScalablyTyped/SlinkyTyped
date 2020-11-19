package typingsSlinky.otplib

import typingsSlinky.otplibCore.authenticatorMod.AuthenticatorOptions_
import typingsSlinky.otplibCore.hotpMod.HOTPOptions_
import typingsSlinky.otplibCore.mod.Authenticator
import typingsSlinky.otplibCore.mod.HOTP
import typingsSlinky.otplibCore.mod.TOTP
import typingsSlinky.otplibCore.totpMod.TOTPOptions_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("otplib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val authenticator: Authenticator[AuthenticatorOptions_[String]] = js.native
  
  val hotp: HOTP[HOTPOptions_[String]] = js.native
  
  val totp: TOTP[TOTPOptions_[String]] = js.native
}
