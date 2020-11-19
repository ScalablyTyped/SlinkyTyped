package typingsSlinky.awsCryptoSha256Browser

import typingsSlinky.awsCryptoSha256Browser.anon.Name
import typingsSlinky.awsCryptoSha256Browser.awsCryptoSha256BrowserStrings.HMAC
import typingsSlinky.awsCryptoSha256Browser.awsCryptoSha256BrowserStrings.`SHA-256`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-crypto/sha256-browser/build/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  
  val EMPTY_DATA_SHA_256: js.typedarray.Uint8Array = js.native
  
  @js.native
  object SHA_256_HASH extends js.Object {
    
    var name: `SHA-256` = js.native
  }
  
  @js.native
  object SHA_256_HMAC_ALGO extends js.Object {
    
    var hash: Name = js.native
    
    var name: HMAC = js.native
  }
}
