package typingsSlinky.otplibPluginCrypto

import typingsSlinky.otplibCore.authenticatorMod.CreateRandomBytes
import typingsSlinky.otplibCore.utilsMod.CreateDigest
import typingsSlinky.otplibCore.utilsMod.HexString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@otplib/plugin-crypto", "createDigest")
  @js.native
  val createDigest: CreateDigest[HexString] = js.native
  
  @JSImport("@otplib/plugin-crypto", "createRandomBytes")
  @js.native
  val createRandomBytes: CreateRandomBytes[String] = js.native
}
