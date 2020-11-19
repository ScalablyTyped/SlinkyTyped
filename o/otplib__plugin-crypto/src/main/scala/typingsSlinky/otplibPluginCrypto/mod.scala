package typingsSlinky.otplibPluginCrypto

import typingsSlinky.otplibCore.authenticatorMod.CreateRandomBytes
import typingsSlinky.otplibCore.utilsMod.CreateDigest
import typingsSlinky.otplibCore.utilsMod.HexString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@otplib/plugin-crypto", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val createDigest: CreateDigest[HexString] = js.native
  
  val createRandomBytes: CreateRandomBytes[String] = js.native
}
