package typingsSlinky.awsCryptoSha256Browser

import typingsSlinky.awsSdkTypes.cryptoMod.SourceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-crypto/sha256-browser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Ie11Sha256 ()
    extends typingsSlinky.awsCryptoSha256Browser.ie11Sha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
  
  @js.native
  class Sha256 ()
    extends typingsSlinky.awsCryptoSha256Browser.crossPlatformSha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
  
  @js.native
  class WebCryptoSha256 ()
    extends typingsSlinky.awsCryptoSha256Browser.webCryptoSha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
}
