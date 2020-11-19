package typingsSlinky.otplibPluginThirtyTwo

import typingsSlinky.otplibCore.authenticatorMod.Base32SecretKey
import typingsSlinky.otplibCore.authenticatorMod.KeyDecoder
import typingsSlinky.otplibCore.authenticatorMod.KeyEncoder
import typingsSlinky.otplibCore.utilsMod.SecretKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@otplib/plugin-thirty-two", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val keyDecoder: KeyDecoder[SecretKey] = js.native
  
  val keyEncoder: KeyEncoder[Base32SecretKey] = js.native
}
