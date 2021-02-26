package typingsSlinky.createHash

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("create-hash", JSImport.Namespace)
  @js.native
  def apply(algorithm: algorithm): HashAlgorithm = js.native
  @JSImport("create-hash", JSImport.Namespace)
  @js.native
  def apply(algorithm: algorithm, options: js.Any): HashAlgorithm = js.native
  
  @js.native
  trait HashAlgorithm extends StObject {
    
    def digest(): Buffer = js.native
    def digest(target: encoding): String = js.native
    
    def end(): Unit = js.native
    
    def read(): Unit = js.native
    
    def update(data: String): this.type = js.native
    def update(data: String, encoding: String): this.type = js.native
    def update(data: js.typedarray.DataView): this.type = js.native
    def update(data: js.typedarray.DataView, encoding: String): this.type = js.native
    def update(data: TypedArray): this.type = js.native
    def update(data: TypedArray, encoding: String): this.type = js.native
    def update(data: Buffer): this.type = js.native
    def update(data: Buffer, encoding: String): this.type = js.native
    
    def write(data: String): this.type = js.native
    def write(data: String, encoding: String): this.type = js.native
    def write(data: js.typedarray.DataView): this.type = js.native
    def write(data: js.typedarray.DataView, encoding: String): this.type = js.native
    def write(data: TypedArray): this.type = js.native
    def write(data: TypedArray, encoding: String): this.type = js.native
    def write(data: Buffer): this.type = js.native
    def write(data: Buffer, encoding: String): this.type = js.native
  }
  
  type TypedArray = js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.createHash.createHashStrings.md5
    - typingsSlinky.createHash.createHashStrings.rmd160
    - typingsSlinky.createHash.createHashStrings.ripemd160
    - typingsSlinky.createHash.createHashStrings.sha
    - typingsSlinky.createHash.createHashStrings.sha1
    - typingsSlinky.createHash.createHashStrings.sha224
    - typingsSlinky.createHash.createHashStrings.sha256
    - typingsSlinky.createHash.createHashStrings.sha384
    - typingsSlinky.createHash.createHashStrings.sha512
  */
  trait algorithm extends StObject
  object algorithm {
    
    @scala.inline
    def md5: typingsSlinky.createHash.createHashStrings.md5 = "md5".asInstanceOf[typingsSlinky.createHash.createHashStrings.md5]
    
    @scala.inline
    def ripemd160: typingsSlinky.createHash.createHashStrings.ripemd160 = "ripemd160".asInstanceOf[typingsSlinky.createHash.createHashStrings.ripemd160]
    
    @scala.inline
    def rmd160: typingsSlinky.createHash.createHashStrings.rmd160 = "rmd160".asInstanceOf[typingsSlinky.createHash.createHashStrings.rmd160]
    
    @scala.inline
    def sha: typingsSlinky.createHash.createHashStrings.sha = "sha".asInstanceOf[typingsSlinky.createHash.createHashStrings.sha]
    
    @scala.inline
    def sha1: typingsSlinky.createHash.createHashStrings.sha1 = "sha1".asInstanceOf[typingsSlinky.createHash.createHashStrings.sha1]
    
    @scala.inline
    def sha224: typingsSlinky.createHash.createHashStrings.sha224 = "sha224".asInstanceOf[typingsSlinky.createHash.createHashStrings.sha224]
    
    @scala.inline
    def sha256: typingsSlinky.createHash.createHashStrings.sha256 = "sha256".asInstanceOf[typingsSlinky.createHash.createHashStrings.sha256]
    
    @scala.inline
    def sha384: typingsSlinky.createHash.createHashStrings.sha384 = "sha384".asInstanceOf[typingsSlinky.createHash.createHashStrings.sha384]
    
    @scala.inline
    def sha512: typingsSlinky.createHash.createHashStrings.sha512 = "sha512".asInstanceOf[typingsSlinky.createHash.createHashStrings.sha512]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.createHash.createHashStrings.utf8
    - typingsSlinky.createHash.createHashStrings.hex
    - typingsSlinky.createHash.createHashStrings.base64
  */
  trait encoding extends StObject
  object encoding {
    
    @scala.inline
    def base64: typingsSlinky.createHash.createHashStrings.base64 = "base64".asInstanceOf[typingsSlinky.createHash.createHashStrings.base64]
    
    @scala.inline
    def hex: typingsSlinky.createHash.createHashStrings.hex = "hex".asInstanceOf[typingsSlinky.createHash.createHashStrings.hex]
    
    @scala.inline
    def utf8: typingsSlinky.createHash.createHashStrings.utf8 = "utf8".asInstanceOf[typingsSlinky.createHash.createHashStrings.utf8]
  }
}
