package typingsSlinky.blake2sJs

import typingsSlinky.blake2sJs.blake2sJsNumbers.`32`
import typingsSlinky.blake2sJs.blake2sJsNumbers.`64`
import typingsSlinky.blake2sJs.blake2sJsNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("blake2s-js", JSImport.Default)
  @js.native
  class default () extends BLAKE2s {
    def this(digestLength: Double) = this()
    def this(digestLength: js.UndefOr[scala.Nothing], config: BLAKE2sConfig) = this()
    def this(digestLength: js.UndefOr[scala.Nothing], key: ByteArray) = this()
    def this(digestLength: Double, config: BLAKE2sConfig) = this()
    def this(digestLength: Double, key: ByteArray) = this()
  }
  /* static members */
  object default {
    
    @JSImport("blake2s-js", "default.blockLength")
    @js.native
    val blockLength: `64` = js.native
    
    @JSImport("blake2s-js", "default.digestLength")
    @js.native
    val digestLength: `32` = js.native
    
    @JSImport("blake2s-js", "default.keyLength")
    @js.native
    val keyLength: `32` = js.native
    
    @JSImport("blake2s-js", "default.personalizationLength")
    @js.native
    val personalizationLength: `8` = js.native
    
    @JSImport("blake2s-js", "default.saltLength")
    @js.native
    val saltLength: `8` = js.native
  }
  
  @JSImport("blake2s-js", "blockLength")
  @js.native
  val blockLength: `64` = js.native
  
  @JSImport("blake2s-js", "digestLength")
  @js.native
  val digestLength: `32` = js.native
  
  @JSImport("blake2s-js", "keyLength")
  @js.native
  val keyLength: `32` = js.native
  
  @JSImport("blake2s-js", "personalizationLength")
  @js.native
  val personalizationLength: `8` = js.native
  
  @JSImport("blake2s-js", "saltLength")
  @js.native
  val saltLength: `8` = js.native
  
  @js.native
  trait BLAKE2s extends StObject {
    
    def digest(): js.typedarray.Uint8Array = js.native
    
    def hexDigest(): String = js.native
    
    def update(p: ByteArray): this.type = js.native
    def update(p: ByteArray, offset: js.UndefOr[scala.Nothing], length: Double): this.type = js.native
    def update(p: ByteArray, offset: Double): this.type = js.native
    def update(p: ByteArray, offset: Double, length: Double): this.type = js.native
  }
  
  @js.native
  trait BLAKE2sConfig extends StObject {
    
    var key: js.UndefOr[ByteArray] = js.native
    
    var personalization: js.UndefOr[ByteArray] = js.native
    
    var salt: js.UndefOr[ByteArray] = js.native
  }
  object BLAKE2sConfig {
    
    @scala.inline
    def apply(): BLAKE2sConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BLAKE2sConfig]
    }
    
    @scala.inline
    implicit class BLAKE2sConfigMutableBuilder[Self <: BLAKE2sConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: ByteArray): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKeyVarargs(value: Double*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      @scala.inline
      def setPersonalization(value: ByteArray): Self = StObject.set(x, "personalization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonalizationUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "personalization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonalizationUndefined: Self = StObject.set(x, "personalization", js.undefined)
      
      @scala.inline
      def setPersonalizationVarargs(value: Double*): Self = StObject.set(x, "personalization", js.Array(value :_*))
      
      @scala.inline
      def setSalt(value: ByteArray): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      @scala.inline
      def setSaltVarargs(value: Double*): Self = StObject.set(x, "salt", js.Array(value :_*))
    }
  }
  
  type ByteArray = js.Array[Double] | js.typedarray.Uint8Array
}
