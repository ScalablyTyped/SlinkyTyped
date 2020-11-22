package typingsSlinky.pvtsutils

import typingsSlinky.pvtsutils.bufferSourceConverterMod.BufferSource
import typingsSlinky.pvtsutils.convertMod.BufferEncoding
import typingsSlinky.std.ArrayBufferLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pvtsutils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  
  def combine(buf: js.typedarray.ArrayBuffer*): ArrayBufferLike = js.native
  
  def isEqual(bytes1: js.typedarray.ArrayBuffer, bytes2: js.typedarray.ArrayBuffer): Boolean = js.native
  
  @js.native
  class BufferSourceConverter ()
    extends typingsSlinky.pvtsutils.bufferSourceConverterMod.BufferSourceConverter
  /* static members */
  @js.native
  object BufferSourceConverter extends js.Object {
    
    def isArrayBufferView(data: js.Any): /* is std.ArrayBufferView */ Boolean = js.native
    
    def isBufferSource(data: js.Any): /* is pvtsutils.pvtsutils/build/types/buffer_source_converter.BufferSource */ Boolean = js.native
    
    def toArrayBuffer(data: BufferSource): js.typedarray.ArrayBuffer = js.native
    
    def toUint8Array(data: BufferSource): js.typedarray.Uint8Array = js.native
  }
  
  @js.native
  class Convert ()
    extends typingsSlinky.pvtsutils.convertMod.Convert
  /* static members */
  @js.native
  object Convert extends js.Object {
    
    /* protected */ def Base64Padding(base64: String): String = js.native
    
    def FromBase64(base64: String): js.typedarray.ArrayBuffer = js.native
    
    def FromBase64Url(base64url: String): js.typedarray.ArrayBuffer = js.native
    
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
    def FromHex(hexString: String): js.typedarray.ArrayBuffer = js.native
    
    def FromString(str: String): js.typedarray.ArrayBuffer = js.native
    def FromString(str: String, enc: BufferEncoding): js.typedarray.ArrayBuffer = js.native
    
    def FromUtf8String(text: String): js.typedarray.ArrayBuffer = js.native
    
    def ToBase64(buffer: BufferSource): String = js.native
    
    def ToBase64Url(data: BufferSource): String = js.native
    
    def ToBinary(buffer: BufferSource): String = js.native
    
    /**
      * Converts buffer to HEX string
      * @param  {BufferSource} buffer Incoming buffer
      * @returns string
      */
    def ToHex(buffer: BufferSource): String = js.native
    
    def ToString(buffer: BufferSource): String = js.native
    def ToString(buffer: BufferSource, enc: BufferEncoding): String = js.native
    
    def ToUtf8String(buffer: BufferSource): String = js.native
    
    /**
      * Removes odd chars from string data
      * @param data String data
      */
    def formatString(data: String): String = js.native
    
    def isBase64(data: js.Any): /* is string */ Boolean = js.native
    
    def isBase64Url(data: js.Any): /* is string */ Boolean = js.native
    
    def isHex(data: js.Any): /* is string */ Boolean = js.native
  }
}
