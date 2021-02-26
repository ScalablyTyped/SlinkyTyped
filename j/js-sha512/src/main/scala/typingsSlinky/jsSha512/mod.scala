package typingsSlinky.jsSha512

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("js-sha512", JSImport.Namespace)
  @js.native
  val ^ : JSSha512Static = js.native
  
  @js.native
  trait Hash extends StObject {
    
    def array(): js.Array[Double] = js.native
    
    def arrayBuffer(): js.typedarray.ArrayBuffer = js.native
    
    def digest(): js.Array[Double] = js.native
    
    def hex(): String = js.native
    
    def update(messageToHash: String): Hash = js.native
  }
  object Hash {
    
    @scala.inline
    def apply(
      array: () => js.Array[Double],
      arrayBuffer: () => js.typedarray.ArrayBuffer,
      digest: () => js.Array[Double],
      hex: () => String,
      update: String => Hash
    ): Hash = {
      val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), arrayBuffer = js.Any.fromFunction0(arrayBuffer), digest = js.Any.fromFunction0(digest), hex = js.Any.fromFunction0(hex), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Hash]
    }
    
    @scala.inline
    implicit class HashMutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArray(value: () => js.Array[Double]): Self = StObject.set(x, "array", js.Any.fromFunction0(value))
      
      @scala.inline
      def setArrayBuffer(value: () => js.typedarray.ArrayBuffer): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDigest(value: () => js.Array[Double]): Self = StObject.set(x, "digest", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHex(value: () => String): Self = StObject.set(x, "hex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: String => Hash): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait HashStatic extends StObject {
    
    def apply(messageToHash: String): String = js.native
    
    def array(messageToHash: String): js.Array[Double] = js.native
    
    def arrayBuffer(messageToHash: String): js.typedarray.ArrayBuffer = js.native
    
    def create(): Hash = js.native
    
    def digest(messageToHash: String): js.Array[Double] = js.native
    
    def hex(messageToHash: String): String = js.native
    
    def hmac(key: String, messageToHash: String): String = js.native
    @JSName("hmac")
    var hmac_Original: HmacStatic = js.native
    
    def update(messageToHash: String): Hash = js.native
  }
  
  @js.native
  trait HmacStatic extends StObject {
    
    def apply(key: String, messageToHash: String): String = js.native
    
    def create(key: String): Hash = js.native
    
    def update(key: String, messageToHash: String): Hash = js.native
  }
  
  @js.native
  trait JSSha512Static extends HashStatic {
    
    def sha384(messageToHash: String): String = js.native
    @JSName("sha384")
    var sha384_Original: HashStatic = js.native
    
    def sha512(messageToHash: String): String = js.native
    
    def sha512_224(messageToHash: String): String = js.native
    @JSName("sha512_224")
    var sha512_224_Original: HashStatic = js.native
    
    def sha512_256(messageToHash: String): String = js.native
    @JSName("sha512_256")
    var sha512_256_Original: HashStatic = js.native
    
    @JSName("sha512")
    var sha512_Original: HashStatic = js.native
  }
  
  type _To = JSSha512Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: JSSha512Static = ^
}
