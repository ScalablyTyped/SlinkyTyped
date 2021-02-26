package typingsSlinky.awsCryptoSha256Browser

import typingsSlinky.awsCryptoSha256Browser.anon.Name
import typingsSlinky.awsCryptoSha256Browser.awsCryptoSha256BrowserStrings.HMAC
import typingsSlinky.awsCryptoSha256Browser.awsCryptoSha256BrowserStrings.`SHA-256`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("@aws-crypto/sha256-browser/build/constants", "EMPTY_DATA_SHA_256")
  @js.native
  val EMPTY_DATA_SHA_256: js.typedarray.Uint8Array = js.native
  
  object SHA_256_HASH {
    
    @JSImport("@aws-crypto/sha256-browser/build/constants", "SHA_256_HASH")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@aws-crypto/sha256-browser/build/constants", "SHA_256_HASH.name")
    @js.native
    def name: `SHA-256` = js.native
    @scala.inline
    def name_=(x: `SHA-256`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
  
  object SHA_256_HMAC_ALGO {
    
    @JSImport("@aws-crypto/sha256-browser/build/constants", "SHA_256_HMAC_ALGO")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@aws-crypto/sha256-browser/build/constants", "SHA_256_HMAC_ALGO.hash")
    @js.native
    def hash: Name = js.native
    @scala.inline
    def hash_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hash")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-crypto/sha256-browser/build/constants", "SHA_256_HMAC_ALGO.name")
    @js.native
    def name: HMAC = js.native
    @scala.inline
    def name_=(x: HMAC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
}
