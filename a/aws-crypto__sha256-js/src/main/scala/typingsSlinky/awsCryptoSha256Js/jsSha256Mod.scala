package typingsSlinky.awsCryptoSha256Js

import typingsSlinky.awsSdkTypes.cryptoMod.Hash
import typingsSlinky.awsSdkTypes.cryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSha256Mod {
  
  @JSImport("@aws-crypto/sha256-js/build/jsSha256", "Sha256")
  @js.native
  class Sha256 () extends Hash {
    def this(secret: SourceData) = this()
    
    def digestSync(): js.typedarray.Uint8Array = js.native
    
    var error: js.Any = js.native
    
    val hash: js.Any = js.native
    
    val outer: js.Any = js.native
  }
}
