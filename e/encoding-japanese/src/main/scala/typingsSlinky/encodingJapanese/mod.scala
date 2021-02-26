package typingsSlinky.encodingJapanese

import typingsSlinky.encodingJapanese.encodingJapaneseStrings.array
import typingsSlinky.encodingJapanese.encodingJapaneseStrings.arraybuffer
import typingsSlinky.encodingJapanese.encodingJapaneseStrings.string
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("encoding-japanese", "base64Decode")
  @js.native
  def base64Decode(data: String): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "base64Encode")
  @js.native
  def base64Encode(data: IntArrayType): String = js.native
  
  @JSImport("encoding-japanese", "codeToString")
  @js.native
  def codeToString(data: IntArrayType): String = js.native
  
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: String, options: ConvertArrayBufferOptions): js.typedarray.ArrayBuffer = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: String, options: ConvertArrayOptions): js.Array[Double] = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: String, options: ConvertStringOptions): String = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: String, options: ConvertUnknownOptions): String = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: String, to: Encoding): String = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: String, to: Encoding, from: Encoding): String = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: RawType, options: ConvertArrayBufferOptions): js.typedarray.ArrayBuffer = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: RawType, options: ConvertArrayOptions): js.Array[Double] = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: RawType, options: ConvertStringOptions): String = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: RawType, options: ConvertUnknownOptions): js.Array[Double] = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: RawType, to: Encoding): js.Array[Double] = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: RawType, to: Encoding, from: Encoding): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "detect")
  @js.native
  def detect(data: String): EncodingDetection = js.native
  @JSImport("encoding-japanese", "detect")
  @js.native
  def detect(data: String, encodings: js.Array[Encoding]): EncodingDetection = js.native
  @JSImport("encoding-japanese", "detect")
  @js.native
  def detect(data: String, encodings: Encoding): EncodingDetection = js.native
  @JSImport("encoding-japanese", "detect")
  @js.native
  def detect(data: RawType): EncodingDetection = js.native
  @JSImport("encoding-japanese", "detect")
  @js.native
  def detect(data: RawType, encodings: js.Array[Encoding]): EncodingDetection = js.native
  @JSImport("encoding-japanese", "detect")
  @js.native
  def detect(data: RawType, encodings: Encoding): EncodingDetection = js.native
  
  @JSImport("encoding-japanese", "orders")
  @js.native
  val orders: js.Array[String] = js.native
  
  @JSImport("encoding-japanese", "stringToCode")
  @js.native
  def stringToCode(data: String): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "toHankakuCase")
  @js.native
  def toHankakuCase(data: String): String = js.native
  @JSImport("encoding-japanese", "toHankakuCase")
  @js.native
  def toHankakuCase(data: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "toHankakuSpace")
  @js.native
  def toHankakuSpace(data: String): String = js.native
  @JSImport("encoding-japanese", "toHankakuSpace")
  @js.native
  def toHankakuSpace(data: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "toHankanaCase")
  @js.native
  def toHankanaCase(data: String): String = js.native
  @JSImport("encoding-japanese", "toHankanaCase")
  @js.native
  def toHankanaCase(data: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "toHiraganaCase")
  @js.native
  def toHiraganaCase(data: String): String = js.native
  @JSImport("encoding-japanese", "toHiraganaCase")
  @js.native
  def toHiraganaCase(data: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "toKatakanaCase")
  @js.native
  def toKatakanaCase(data: String): String = js.native
  @JSImport("encoding-japanese", "toKatakanaCase")
  @js.native
  def toKatakanaCase(data: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "toZenkakuCase")
  @js.native
  def toZenkakuCase(data: String): String = js.native
  @JSImport("encoding-japanese", "toZenkakuCase")
  @js.native
  def toZenkakuCase(data: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "toZenkakuSpace")
  @js.native
  def toZenkakuSpace(data: String): String = js.native
  @JSImport("encoding-japanese", "toZenkakuSpace")
  @js.native
  def toZenkakuSpace(data: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "toZenkanaCase")
  @js.native
  def toZenkanaCase(data: String): String = js.native
  @JSImport("encoding-japanese", "toZenkanaCase")
  @js.native
  def toZenkanaCase(data: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "urlDecode")
  @js.native
  def urlDecode(data: String): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "urlEncode")
  @js.native
  def urlEncode(data: IntArrayType): String = js.native
  
  @js.native
  trait ConvertArrayBufferOptions extends ConvertOptions {
    
    var bom: js.UndefOr[Boolean | String] = js.native
    
    var from: js.UndefOr[Encoding] = js.native
    
    var to: Encoding = js.native
    
    var `type`: arraybuffer = js.native
  }
  object ConvertArrayBufferOptions {
    
    @scala.inline
    def apply(to: Encoding, `type`: arraybuffer): ConvertArrayBufferOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertArrayBufferOptions]
    }
    
    @scala.inline
    implicit class ConvertArrayBufferOptionsMutableBuilder[Self <: ConvertArrayBufferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBom(value: Boolean | String): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      @scala.inline
      def setFrom(value: Encoding): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTo(value: Encoding): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: arraybuffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConvertArrayOptions extends ConvertOptions {
    
    var bom: js.UndefOr[Boolean | String] = js.native
    
    var from: js.UndefOr[Encoding] = js.native
    
    var to: Encoding = js.native
    
    var `type`: array = js.native
  }
  object ConvertArrayOptions {
    
    @scala.inline
    def apply(to: Encoding, `type`: array): ConvertArrayOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertArrayOptions]
    }
    
    @scala.inline
    implicit class ConvertArrayOptionsMutableBuilder[Self <: ConvertArrayOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBom(value: Boolean | String): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      @scala.inline
      def setFrom(value: Encoding): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTo(value: Encoding): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.encodingJapanese.mod.ConvertStringOptions
    - typingsSlinky.encodingJapanese.mod.ConvertArrayBufferOptions
    - typingsSlinky.encodingJapanese.mod.ConvertArrayOptions
    - typingsSlinky.encodingJapanese.mod.ConvertUnknownOptions
  */
  trait ConvertOptions extends StObject
  object ConvertOptions {
    
    @scala.inline
    def ConvertArrayBufferOptions(to: Encoding, `type`: arraybuffer): typingsSlinky.encodingJapanese.mod.ConvertArrayBufferOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.encodingJapanese.mod.ConvertArrayBufferOptions]
    }
    
    @scala.inline
    def ConvertArrayOptions(to: Encoding, `type`: array): typingsSlinky.encodingJapanese.mod.ConvertArrayOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.encodingJapanese.mod.ConvertArrayOptions]
    }
    
    @scala.inline
    def ConvertStringOptions(to: Encoding, `type`: string): typingsSlinky.encodingJapanese.mod.ConvertStringOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.encodingJapanese.mod.ConvertStringOptions]
    }
    
    @scala.inline
    def ConvertUnknownOptions(to: Encoding): typingsSlinky.encodingJapanese.mod.ConvertUnknownOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.encodingJapanese.mod.ConvertUnknownOptions]
    }
  }
  
  @js.native
  trait ConvertStringOptions extends ConvertOptions {
    
    var bom: js.UndefOr[Boolean | String] = js.native
    
    var from: js.UndefOr[Encoding] = js.native
    
    var to: Encoding = js.native
    
    var `type`: string = js.native
  }
  object ConvertStringOptions {
    
    @scala.inline
    def apply(to: Encoding, `type`: string): ConvertStringOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertStringOptions]
    }
    
    @scala.inline
    implicit class ConvertStringOptionsMutableBuilder[Self <: ConvertStringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBom(value: Boolean | String): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      @scala.inline
      def setFrom(value: Encoding): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTo(value: Encoding): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConvertUnknownOptions extends ConvertOptions {
    
    var bom: js.UndefOr[Boolean | String] = js.native
    
    var from: js.UndefOr[Encoding] = js.native
    
    var to: Encoding = js.native
  }
  object ConvertUnknownOptions {
    
    @scala.inline
    def apply(to: Encoding): ConvertUnknownOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertUnknownOptions]
    }
    
    @scala.inline
    implicit class ConvertUnknownOptionsMutableBuilder[Self <: ConvertUnknownOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBom(value: Boolean | String): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      @scala.inline
      def setFrom(value: Encoding): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTo(value: Encoding): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF32
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16BE
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16LE
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.BINARY
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.ASCII
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.JIS
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF8
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.EUCJP
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.SJIS
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.UNICODE
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.AUTO
  */
  trait Encoding extends StObject
  object Encoding {
    
    @scala.inline
    def ASCII: typingsSlinky.encodingJapanese.encodingJapaneseStrings.ASCII = "ASCII".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.ASCII]
    
    @scala.inline
    def AUTO: typingsSlinky.encodingJapanese.encodingJapaneseStrings.AUTO = "AUTO".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.AUTO]
    
    @scala.inline
    def BINARY: typingsSlinky.encodingJapanese.encodingJapaneseStrings.BINARY = "BINARY".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.BINARY]
    
    @scala.inline
    def EUCJP: typingsSlinky.encodingJapanese.encodingJapaneseStrings.EUCJP = "EUCJP".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.EUCJP]
    
    @scala.inline
    def JIS: typingsSlinky.encodingJapanese.encodingJapaneseStrings.JIS = "JIS".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.JIS]
    
    @scala.inline
    def SJIS: typingsSlinky.encodingJapanese.encodingJapaneseStrings.SJIS = "SJIS".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.SJIS]
    
    @scala.inline
    def UNICODE: typingsSlinky.encodingJapanese.encodingJapaneseStrings.UNICODE = "UNICODE".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.UNICODE]
    
    @scala.inline
    def UTF16: typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16 = "UTF16".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16]
    
    @scala.inline
    def UTF16BE: typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16BE = "UTF16BE".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16BE]
    
    @scala.inline
    def UTF16LE: typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16LE = "UTF16LE".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16LE]
    
    @scala.inline
    def UTF32: typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF32 = "UTF32".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF32]
    
    @scala.inline
    def UTF8: typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF8 = "UTF8".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF8]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.encodingJapanese.encodingJapaneseBooleans.`false`
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF32
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16BE
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16LE
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.BINARY
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.ASCII
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.JIS
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF8
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.EUCJP
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.SJIS
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.UNICODE
    - typingsSlinky.encodingJapanese.encodingJapaneseStrings.AUTO
  */
  trait EncodingDetection extends StObject
  object EncodingDetection {
    
    @scala.inline
    def ASCII: typingsSlinky.encodingJapanese.encodingJapaneseStrings.ASCII = "ASCII".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.ASCII]
    
    @scala.inline
    def AUTO: typingsSlinky.encodingJapanese.encodingJapaneseStrings.AUTO = "AUTO".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.AUTO]
    
    @scala.inline
    def BINARY: typingsSlinky.encodingJapanese.encodingJapaneseStrings.BINARY = "BINARY".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.BINARY]
    
    @scala.inline
    def EUCJP: typingsSlinky.encodingJapanese.encodingJapaneseStrings.EUCJP = "EUCJP".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.EUCJP]
    
    @scala.inline
    def JIS: typingsSlinky.encodingJapanese.encodingJapaneseStrings.JIS = "JIS".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.JIS]
    
    @scala.inline
    def SJIS: typingsSlinky.encodingJapanese.encodingJapaneseStrings.SJIS = "SJIS".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.SJIS]
    
    @scala.inline
    def UNICODE: typingsSlinky.encodingJapanese.encodingJapaneseStrings.UNICODE = "UNICODE".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.UNICODE]
    
    @scala.inline
    def UTF16: typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16 = "UTF16".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16]
    
    @scala.inline
    def UTF16BE: typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16BE = "UTF16BE".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16BE]
    
    @scala.inline
    def UTF16LE: typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16LE = "UTF16LE".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF16LE]
    
    @scala.inline
    def UTF32: typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF32 = "UTF32".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF32]
    
    @scala.inline
    def UTF8: typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF8 = "UTF8".asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseStrings.UTF8]
    
    @scala.inline
    def `false`: typingsSlinky.encodingJapanese.encodingJapaneseBooleans.`false` = false.asInstanceOf[typingsSlinky.encodingJapanese.encodingJapaneseBooleans.`false`]
  }
  
  type IntArrayType = js.Array[Double] | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array
  
  type RawType = IntArrayType | js.Array[Double] | Buffer
}
