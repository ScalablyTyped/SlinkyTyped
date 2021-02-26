package typingsSlinky.awsCryptoSha256Browser

import typingsSlinky.awsSdkTypes.cryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-crypto/sha256-browser", "Ie11Sha256")
  @js.native
  class Ie11Sha256 ()
    extends typingsSlinky.awsCryptoSha256Browser.ie11Sha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
  
  @JSImport("@aws-crypto/sha256-browser", "Sha256")
  @js.native
  class Sha256 ()
    extends typingsSlinky.awsCryptoSha256Browser.crossPlatformSha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
  
  @JSImport("@aws-crypto/sha256-browser", "WebCryptoSha256")
  @js.native
  class WebCryptoSha256 ()
    extends typingsSlinky.awsCryptoSha256Browser.webCryptoSha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
}
