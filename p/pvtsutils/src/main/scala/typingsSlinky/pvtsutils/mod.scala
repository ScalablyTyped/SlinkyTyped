package typingsSlinky.pvtsutils

import typingsSlinky.pvtsutils.bufferSourceConverterMod.BufferSource
import typingsSlinky.pvtsutils.convertMod.BufferEncoding
import typingsSlinky.std.ArrayBufferLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pvtsutils", "BufferSourceConverter")
  @js.native
  class BufferSourceConverter ()
    extends typingsSlinky.pvtsutils.bufferSourceConverterMod.BufferSourceConverter
  /* static members */
  object BufferSourceConverter {
    
    @JSImport("pvtsutils", "BufferSourceConverter.isArrayBufferView")
    @js.native
    def isArrayBufferView(data: js.Any): /* is std.ArrayBufferView */ Boolean = js.native
    
    @JSImport("pvtsutils", "BufferSourceConverter.isBufferSource")
    @js.native
    def isBufferSource(data: js.Any): /* is pvtsutils.pvtsutils/build/types/buffer_source_converter.BufferSource */ Boolean = js.native
    
    @JSImport("pvtsutils", "BufferSourceConverter.toArrayBuffer")
    @js.native
    def toArrayBuffer(data: BufferSource): js.typedarray.ArrayBuffer = js.native
    
    @JSImport("pvtsutils", "BufferSourceConverter.toUint8Array")
    @js.native
    def toUint8Array(data: BufferSource): js.typedarray.Uint8Array = js.native
  }
  
  @JSImport("pvtsutils", "Convert")
  @js.native
  class Convert ()
    extends typingsSlinky.pvtsutils.convertMod.Convert
  /* static members */
  object Convert {
    
    @JSImport("pvtsutils", "Convert.Base64Padding")
    @js.native
    def Base64Padding(base64: String): String = js.native
    
    @JSImport("pvtsutils", "Convert.FromBase64")
    @js.native
    def FromBase64(base64: String): js.typedarray.ArrayBuffer = js.native
    
    @JSImport("pvtsutils", "Convert.FromBase64Url")
    @js.native
    def FromBase64Url(base64url: String): js.typedarray.ArrayBuffer = js.native
    
    @JSImport("pvtsutils", "Convert.FromBinary")
    @js.native
    def FromBinary(text: String): js.typedarray.ArrayBuffer = js.native
    
    /**
      * Converts HEX string to buffer
      *
      * @static
      * @param {string} formatted
      * @returns {Uint8Array}
      *
      * @memberOf Convert
      */
    @JSImport("pvtsutils", "Convert.FromHex")
    @js.native
    def FromHex(hexString: String): js.typedarray.ArrayBuffer = js.native
    
    @JSImport("pvtsutils", "Convert.FromString")
    @js.native
    def FromString(str: String): js.typedarray.ArrayBuffer = js.native
    @JSImport("pvtsutils", "Convert.FromString")
    @js.native
    def FromString(str: String, enc: BufferEncoding): js.typedarray.ArrayBuffer = js.native
    
    @JSImport("pvtsutils", "Convert.FromUtf8String")
    @js.native
    def FromUtf8String(text: String): js.typedarray.ArrayBuffer = js.native
    
    @JSImport("pvtsutils", "Convert.ToBase64")
    @js.native
    def ToBase64(buffer: BufferSource): String = js.native
    
    @JSImport("pvtsutils", "Convert.ToBase64Url")
    @js.native
    def ToBase64Url(data: BufferSource): String = js.native
    
    @JSImport("pvtsutils", "Convert.ToBinary")
    @js.native
    def ToBinary(buffer: BufferSource): String = js.native
    
    /**
      * Converts buffer to HEX string
      * @param  {BufferSource} buffer Incoming buffer
      * @returns string
      */
    @JSImport("pvtsutils", "Convert.ToHex")
    @js.native
    def ToHex(buffer: BufferSource): String = js.native
    
    @JSImport("pvtsutils", "Convert.ToString")
    @js.native
    def ToString(buffer: BufferSource): String = js.native
    @JSImport("pvtsutils", "Convert.ToString")
    @js.native
    def ToString(buffer: BufferSource, enc: BufferEncoding): String = js.native
    
    @JSImport("pvtsutils", "Convert.ToUtf8String")
    @js.native
    def ToUtf8String(buffer: BufferSource): String = js.native
    
    /**
      * Removes odd chars from string data
      * @param data String data
      */
    @JSImport("pvtsutils", "Convert.formatString")
    @js.native
    def formatString(data: String): String = js.native
    
    @JSImport("pvtsutils", "Convert.isBase64")
    @js.native
    def isBase64(data: js.Any): /* is string */ Boolean = js.native
    
    @JSImport("pvtsutils", "Convert.isBase64Url")
    @js.native
    def isBase64Url(data: js.Any): /* is string */ Boolean = js.native
    
    @JSImport("pvtsutils", "Convert.isHex")
    @js.native
    def isHex(data: js.Any): /* is string */ Boolean = js.native
  }
  
  @JSImport("pvtsutils", "assign")
  @js.native
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  
  @JSImport("pvtsutils", "combine")
  @js.native
  def combine(buf: js.typedarray.ArrayBuffer*): ArrayBufferLike = js.native
  
  @JSImport("pvtsutils", "isEqual")
  @js.native
  def isEqual(bytes1: js.typedarray.ArrayBuffer, bytes2: js.typedarray.ArrayBuffer): Boolean = js.native
}
