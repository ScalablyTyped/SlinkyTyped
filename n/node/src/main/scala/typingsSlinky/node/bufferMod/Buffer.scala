package typingsSlinky.node.bufferMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.SharedArrayBuffer
import typingsSlinky.node.anon.ToPrimitive
import typingsSlinky.node.anon.ValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("buffer", "Buffer")
@js.native
class Buffer protected ()
  extends typingsSlinky.node.Buffer {
  /**
    * Allocates a new buffer containing the given {str}.
    *
    * @param str String to store in buffer.
    * @param encoding encoding to use, optional.  Default is 'utf8'
    * @deprecated since v10.0.0 - Use `Buffer.from(string[, encoding])` instead.
    */
  def this(str: String) = this()
  def this(str: String, encoding: BufferEncoding) = this()
}
@JSImport("buffer", "Buffer")
@js.native
object Buffer
  extends Instantiable1[/* str */ String, typingsSlinky.node.Buffer]
     with Instantiable2[/* str */ String, /* encoding */ BufferEncoding, typingsSlinky.node.Buffer] {
  
  /**
    * Allocates a new buffer of {size} octets.
    *
    * @param size count of octets to allocate.
    * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
    *    If parameter is omitted, buffer will be filled with zeros.
    * @param encoding encoding used for call to buf.fill while initalizing
    */
  def alloc(size: Double): typingsSlinky.node.Buffer = js.native
  def alloc(size: Double, fill: js.UndefOr[scala.Nothing], encoding: BufferEncoding): typingsSlinky.node.Buffer = js.native
  def alloc(size: Double, fill: String): typingsSlinky.node.Buffer = js.native
  def alloc(size: Double, fill: String, encoding: BufferEncoding): typingsSlinky.node.Buffer = js.native
  def alloc(size: Double, fill: Double): typingsSlinky.node.Buffer = js.native
  def alloc(size: Double, fill: Double, encoding: BufferEncoding): typingsSlinky.node.Buffer = js.native
  def alloc(size: Double, fill: typingsSlinky.node.Buffer): typingsSlinky.node.Buffer = js.native
  def alloc(size: Double, fill: typingsSlinky.node.Buffer, encoding: BufferEncoding): typingsSlinky.node.Buffer = js.native
  
  /**
    * Allocates a new buffer of {size} octets, leaving memory not initialized, so the contents
    * of the newly created Buffer are unknown and may contain sensitive data.
    *
    * @param size count of octets to allocate
    */
  def allocUnsafe(size: Double): typingsSlinky.node.Buffer = js.native
  
  /**
    * Allocates a new non-pooled buffer of {size} octets, leaving memory not initialized, so the contents
    * of the newly created Buffer are unknown and may contain sensitive data.
    *
    * @param size count of octets to allocate
    */
  def allocUnsafeSlow(size: Double): typingsSlinky.node.Buffer = js.native
  
  /**
    * Gives the actual byte length of a string. encoding defaults to 'utf8'.
    * This is not the same as String.prototype.length since that returns the number of characters in a string.
    *
    * @param string string to test.
    * @param encoding encoding used to evaluate (defaults to 'utf8')
    */
  def byteLength(string: String): Double = js.native
  def byteLength(string: String, encoding: BufferEncoding): Double = js.native
  def byteLength(string: ArrayBufferView): Double = js.native
  def byteLength(string: ArrayBufferView, encoding: BufferEncoding): Double = js.native
  def byteLength(string: SharedArrayBuffer): Double = js.native
  def byteLength(string: SharedArrayBuffer, encoding: BufferEncoding): Double = js.native
  def byteLength(string: js.typedarray.ArrayBuffer): Double = js.native
  def byteLength(string: js.typedarray.ArrayBuffer, encoding: BufferEncoding): Double = js.native
  
  /**
    * The same as buf1.compare(buf2).
    */
  def compare(buf1: js.typedarray.Uint8Array, buf2: js.typedarray.Uint8Array): Double = js.native
  
  /**
    * Returns a buffer which is the result of concatenating all the buffers in the list together.
    *
    * If the list has no items, or if the totalLength is 0, then it returns a zero-length buffer.
    * If the list has exactly one item, then the first item of the list is returned.
    * If the list has more than one item, then a new Buffer is created.
    *
    * @param list An array of Buffer objects to concatenate
    * @param totalLength Total length of the buffers when concatenated.
    *   If totalLength is not provided, it is read from the buffers in the list. However, this adds an additional loop to the function, so it is faster to provide the length explicitly.
    */
  def concat(list: js.Array[js.typedarray.Uint8Array]): typingsSlinky.node.Buffer = js.native
  def concat(list: js.Array[js.typedarray.Uint8Array], totalLength: Double): typingsSlinky.node.Buffer = js.native
  
  def from(arrayBuffer: SharedArrayBuffer): typingsSlinky.node.Buffer = js.native
  def from(arrayBuffer: SharedArrayBuffer, byteOffset: js.UndefOr[scala.Nothing], length: Double): typingsSlinky.node.Buffer = js.native
  def from(arrayBuffer: SharedArrayBuffer, byteOffset: Double): typingsSlinky.node.Buffer = js.native
  def from(arrayBuffer: SharedArrayBuffer, byteOffset: Double, length: Double): typingsSlinky.node.Buffer = js.native
  /**
    * When passed a reference to the .buffer property of a TypedArray instance,
    * the newly created Buffer will share the same allocated memory as the TypedArray.
    * The optional {byteOffset} and {length} arguments specify a memory range
    * within the {arrayBuffer} that will be shared by the Buffer.
    *
    * @param arrayBuffer The .buffer property of any TypedArray or a new ArrayBuffer()
    */
  def from(arrayBuffer: js.typedarray.ArrayBuffer): typingsSlinky.node.Buffer = js.native
  def from(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: js.UndefOr[scala.Nothing], length: Double): typingsSlinky.node.Buffer = js.native
  def from(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Double): typingsSlinky.node.Buffer = js.native
  def from(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Double, length: Double): typingsSlinky.node.Buffer = js.native
  /**
    * Creates a new Buffer using the passed {data}
    * @param data data to create a new Buffer
    */
  def from(data: js.Array[Double]): typingsSlinky.node.Buffer = js.native
  def from(data: js.typedarray.Uint8Array): typingsSlinky.node.Buffer = js.native
  def from(obj: ToPrimitive): typingsSlinky.node.Buffer = js.native
  def from(obj: ToPrimitive, byteOffset: js.UndefOr[scala.Nothing], length: Double): typingsSlinky.node.Buffer = js.native
  def from(obj: ToPrimitive, byteOffset: Double): typingsSlinky.node.Buffer = js.native
  def from(obj: ToPrimitive, byteOffset: Double, length: Double): typingsSlinky.node.Buffer = js.native
  /**
    * Creates a new buffer containing the coerced value of an object
    * A `TypeError` will be thrown if {obj} has not mentioned methods or is not of other type appropriate for `Buffer.from()` variants.
    * @param obj An object supporting `Symbol.toPrimitive` or `valueOf()`.
    */
  def from(obj: ValueOf): typingsSlinky.node.Buffer = js.native
  def from(obj: ValueOf, byteOffset: js.UndefOr[scala.Nothing], length: Double): typingsSlinky.node.Buffer = js.native
  def from(obj: ValueOf, byteOffset: Double): typingsSlinky.node.Buffer = js.native
  def from(obj: ValueOf, byteOffset: Double, length: Double): typingsSlinky.node.Buffer = js.native
  /**
    * Creates a new Buffer containing the given JavaScript string {str}.
    * If provided, the {encoding} parameter identifies the character encoding.
    * If not provided, {encoding} defaults to 'utf8'.
    */
  def from(str: String): typingsSlinky.node.Buffer = js.native
  def from(str: String, encoding: BufferEncoding): typingsSlinky.node.Buffer = js.native
  
  /**
    * Returns true if {obj} is a Buffer
    *
    * @param obj object to test.
    */
  def isBuffer(obj: js.Any): /* is node.Buffer */ Boolean = js.native
  
  /**
    * Returns true if {encoding} is a valid encoding argument.
    * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
    *
    * @param encoding string to test.
    */
  def isEncoding(encoding: String): /* is node.BufferEncoding */ Boolean = js.native
  
  /**
    * Creates a new Buffer using the passed {data}
    * @param values to create a new Buffer
    */
  def of(items: Double*): typingsSlinky.node.Buffer = js.native
  
  /**
    * This is the number of bytes used to determine the size of pre-allocated, internal Buffer instances used for pooling. This value may be modified.
    */
  var poolSize: Double = js.native
}
