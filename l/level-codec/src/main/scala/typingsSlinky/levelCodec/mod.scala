package typingsSlinky.levelCodec

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Codec extends StObject {
    
    def createStreamDecoder(opts: CodecOptions): js.Any = js.native
    
    def decodeKey(key: js.Any): js.Any = js.native
    def decodeKey(key: js.Any, opts: CodecOptions): js.Any = js.native
    
    def decodeValue(value: js.Any): js.Any = js.native
    def decodeValue(value: js.Any, opts: CodecOptions): js.Any = js.native
    
    def encodeBatch(ops: js.Any): js.Any = js.native
    def encodeBatch(ops: js.Any, opts: CodecOptions): js.Any = js.native
    
    def encodeKey(key: js.Any): js.Any = js.native
    def encodeKey(key: js.Any, opts: js.UndefOr[scala.Nothing], batchOpts: CodecOptions): js.Any = js.native
    def encodeKey(key: js.Any, opts: CodecOptions): js.Any = js.native
    def encodeKey(key: js.Any, opts: CodecOptions, batchOpts: CodecOptions): js.Any = js.native
    
    def encodeLtgt(ltgt: js.Any): js.Any = js.native
    
    def encodeValue(value: js.Any): js.Any = js.native
    def encodeValue(value: js.Any, opts: js.UndefOr[scala.Nothing], batchOpts: CodecOptions): js.Any = js.native
    def encodeValue(value: js.Any, opts: CodecOptions): js.Any = js.native
    def encodeValue(value: js.Any, opts: CodecOptions, batchOpts: CodecOptions): js.Any = js.native
    
    def keyAsBuffer(): js.Any = js.native
    def keyAsBuffer(opts: CodecOptions): js.Any = js.native
    
    def valueAsBuffer(): js.Any = js.native
    def valueAsBuffer(opts: CodecOptions): js.Any = js.native
  }
  @JSImport("level-codec", "Codec")
  @js.native
  val Codec: CodecConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("level-codec", "Codec")
  @js.native
  class CodecCls ()
    extends typingsSlinky.levelCodec.mod.Codec {
    def this(options: CodecOptions) = this()
  }
  
  @js.native
  trait CodecConstructor
    extends Instantiable0[typingsSlinky.levelCodec.mod.Codec]
       with Instantiable1[/* options */ CodecOptions, typingsSlinky.levelCodec.mod.Codec] {
    
    def apply(): typingsSlinky.levelCodec.mod.Codec = js.native
    def apply(options: CodecOptions): typingsSlinky.levelCodec.mod.Codec = js.native
  }
  
  @js.native
  trait CodecEncoder extends StObject {
    
    var buffer: Boolean = js.native
    
    def decode(`val`: js.Any): js.Any = js.native
    
    def encode(`val`: js.Any): js.Any = js.native
    
    var `type`: String = js.native
  }
  object CodecEncoder {
    
    @scala.inline
    def apply(buffer: Boolean, decode: js.Any => js.Any, encode: js.Any => js.Any, `type`: String): CodecEncoder = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodecEncoder]
    }
    
    @scala.inline
    implicit class CodecEncoderMutableBuilder[Self <: CodecEncoder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecode(value: js.Any => js.Any): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncode(value: js.Any => js.Any): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CodecOptions extends StObject {
    
    var keyEncoding: js.UndefOr[String | CodecEncoder] = js.native
    
    var valueEncoding: js.UndefOr[String | CodecEncoder] = js.native
  }
  object CodecOptions {
    
    @scala.inline
    def apply(): CodecOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodecOptions]
    }
    
    @scala.inline
    implicit class CodecOptionsMutableBuilder[Self <: CodecOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyEncoding(value: String | CodecEncoder): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      @scala.inline
      def setValueEncoding(value: String | CodecEncoder): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueEncodingUndefined: Self = StObject.set(x, "valueEncoding", js.undefined)
    }
  }
}
