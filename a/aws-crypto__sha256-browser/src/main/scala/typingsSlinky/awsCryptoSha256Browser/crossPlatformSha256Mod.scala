package typingsSlinky.awsCryptoSha256Browser

import typingsSlinky.awsCryptoSha256Browser.awsCryptoSha256BrowserStrings.ascii
import typingsSlinky.awsCryptoSha256Browser.awsCryptoSha256BrowserStrings.latin1
import typingsSlinky.awsCryptoSha256Browser.awsCryptoSha256BrowserStrings.utf8
import typingsSlinky.awsSdkTypes.cryptoMod.Hash
import typingsSlinky.awsSdkTypes.cryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crossPlatformSha256Mod {
  
  @JSImport("@aws-crypto/sha256-browser/build/crossPlatformSha256", "Sha256")
  @js.native
  class Sha256 () extends Hash {
    def this(secret: SourceData) = this()
    
    val hash: js.Any = js.native
    
    @JSName("update")
    def update_ascii(data: SourceData, encoding: ascii): Unit = js.native
    @JSName("update")
    def update_latin1(data: SourceData, encoding: latin1): Unit = js.native
    @JSName("update")
    def update_utf8(data: SourceData, encoding: utf8): Unit = js.native
  }
}
