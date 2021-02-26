package typingsSlinky.otplibPresetDefault

import typingsSlinky.otplibCore.authenticatorMod.AuthenticatorOptions_
import typingsSlinky.otplibCore.hotpMod.HOTPOptions_
import typingsSlinky.otplibCore.mod.Authenticator
import typingsSlinky.otplibCore.mod.HOTP
import typingsSlinky.otplibCore.mod.TOTP
import typingsSlinky.otplibCore.totpMod.TOTPOptions_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@otplib/preset-default", "authenticator")
  @js.native
  val authenticator: Authenticator[AuthenticatorOptions_[String]] = js.native
  
  @JSImport("@otplib/preset-default", "hotp")
  @js.native
  val hotp: HOTP[HOTPOptions_[String]] = js.native
  
  @JSImport("@otplib/preset-default", "totp")
  @js.native
  val totp: TOTP[TOTPOptions_[String]] = js.native
}
