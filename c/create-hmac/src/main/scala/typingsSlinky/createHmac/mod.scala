package typingsSlinky.createHmac

import typingsSlinky.node.Buffer
import typingsSlinky.node.cryptoMod.Hmac
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("create-hmac", JSImport.Namespace)
  @js.native
  def apply(algo: Algorithm, key: String): Hmac = js.native
  @JSImport("create-hmac", JSImport.Namespace)
  @js.native
  def apply(algo: Algorithm, key: Buffer): Hmac = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.createHmac.createHmacStrings.rmd160
    - typingsSlinky.createHmac.createHmacStrings.ripemd160
    - typingsSlinky.createHmac.createHmacStrings.md5
    - typingsSlinky.createHmac.createHmacStrings.sha
    - typingsSlinky.createHmac.createHmacStrings.sha1
    - typingsSlinky.createHmac.createHmacStrings.sha224
    - typingsSlinky.createHmac.createHmacStrings.sha256
    - typingsSlinky.createHmac.createHmacStrings.sha384
    - typingsSlinky.createHmac.createHmacStrings.sha512
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    @scala.inline
    def md5: typingsSlinky.createHmac.createHmacStrings.md5 = "md5".asInstanceOf[typingsSlinky.createHmac.createHmacStrings.md5]
    
    @scala.inline
    def ripemd160: typingsSlinky.createHmac.createHmacStrings.ripemd160 = "ripemd160".asInstanceOf[typingsSlinky.createHmac.createHmacStrings.ripemd160]
    
    @scala.inline
    def rmd160: typingsSlinky.createHmac.createHmacStrings.rmd160 = "rmd160".asInstanceOf[typingsSlinky.createHmac.createHmacStrings.rmd160]
    
    @scala.inline
    def sha: typingsSlinky.createHmac.createHmacStrings.sha = "sha".asInstanceOf[typingsSlinky.createHmac.createHmacStrings.sha]
    
    @scala.inline
    def sha1: typingsSlinky.createHmac.createHmacStrings.sha1 = "sha1".asInstanceOf[typingsSlinky.createHmac.createHmacStrings.sha1]
    
    @scala.inline
    def sha224: typingsSlinky.createHmac.createHmacStrings.sha224 = "sha224".asInstanceOf[typingsSlinky.createHmac.createHmacStrings.sha224]
    
    @scala.inline
    def sha256: typingsSlinky.createHmac.createHmacStrings.sha256 = "sha256".asInstanceOf[typingsSlinky.createHmac.createHmacStrings.sha256]
    
    @scala.inline
    def sha384: typingsSlinky.createHmac.createHmacStrings.sha384 = "sha384".asInstanceOf[typingsSlinky.createHmac.createHmacStrings.sha384]
    
    @scala.inline
    def sha512: typingsSlinky.createHmac.createHmacStrings.sha512 = "sha512".asInstanceOf[typingsSlinky.createHmac.createHmacStrings.sha512]
  }
}
