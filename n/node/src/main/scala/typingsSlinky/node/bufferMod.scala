package typingsSlinky.node

import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.anon.ToPrimitive
import typingsSlinky.node.anon.ValueOf
import typingsSlinky.std.SharedArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferMod {
  
  /**
    * Raw data is stored in instances of the Buffer class.
    * A Buffer is similar to an array of integers but corresponds to a raw memory allocation outside the V8 heap.  A Buffer cannot be resized.
    * Valid string encodings: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
    */
  /* was `typeof Buffer` */
  @JSImport("buffer", "Buffer")
  @js.native
  class Buffer protected ()
    extends typingsSlinky.node.Buffer {
    /**
      * Produces a Buffer backed by the same allocated memory as
      * the given {ArrayBuffer}/{SharedArrayBuffer}.
      *
      *
      * @param arrayBuffer The ArrayBuffer with which to share memory.
      * @deprecated since v10.0.0 - Use `Buffer.from(arrayBuffer[, byteOffset[, length]])` instead.
      */
    def this(arrayBuffer: js.typedarray.ArrayBuffer) = this()
    def this(arrayBuffer: SharedArrayBuffer) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    def this(array: js.Array[_]) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    def this(array: js.typedarray.Uint8Array) = this()
    /**
      * Copies the passed {buffer} data onto a new {Buffer} instance.
      *
      * @param buffer The buffer to copy.
      * @deprecated since v10.0.0 - Use `Buffer.from(buffer)` instead.
      */
    def this(buffer: typingsSlinky.node.Buffer) = this()
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      * @deprecated since v10.0.0 - Use `Buffer.alloc()` instead (also see `Buffer.allocUnsafe()`).
      */
    def this(size: Double) = this()
    /**
      * Allocates a new buffer containing the given {str}.
      *
      * @param str String to store in buffer.
      * @param encoding encoding to use, optional.  Default is 'utf8'
      * @deprecated since v10.0.0 - Use `Buffer.from(string[, encoding])` instead.
      */
    def this(str: java.lang.String) = this()
    def this(str: java.lang.String, encoding: BufferEncoding) = this()
  }
  /* was `typeof Buffer` */
  object Buffer {
    
    @JSImport("buffer", "Buffer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
      *    If parameter is omitted, buffer will be filled with zeros.
      * @param encoding encoding used for call to buf.fill while initalizing
      */
    /* static member */
    @JSImport("buffer", "Buffer.alloc")
    @js.native
    def alloc(size: Double): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: js.UndefOr[scala.Nothing], encoding: BufferEncoding): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: java.lang.String): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: java.lang.String, encoding: BufferEncoding): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: Double): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: Double, encoding: BufferEncoding): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: typingsSlinky.node.Buffer): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: typingsSlinky.node.Buffer, encoding: BufferEncoding): typingsSlinky.node.Buffer = js.native
    
    /**
      * Allocates a new buffer of {size} octets, leaving memory not initialized, so the contents
      * of the newly created Buffer are unknown and may contain sensitive data.
      *
      * @param size count of octets to allocate
      */
    /* static member */
    @JSImport("buffer", "Buffer.allocUnsafe")
    @js.native
    def allocUnsafe(size: Double): typingsSlinky.node.Buffer = js.native
    
    /**
      * Allocates a new non-pooled buffer of {size} octets, leaving memory not initialized, so the contents
      * of the newly created Buffer are unknown and may contain sensitive data.
      *
      * @param size count of octets to allocate
      */
    /* static member */
    @JSImport("buffer", "Buffer.allocUnsafeSlow")
    @js.native
    def allocUnsafeSlow(size: Double): typingsSlinky.node.Buffer = js.native
    
    /**
      * Gives the actual byte length of a string. encoding defaults to 'utf8'.
      * This is not the same as String.prototype.length since that returns the number of characters in a string.
      *
      * @param string string to test.
      * @param encoding encoding used to evaluate (defaults to 'utf8')
      */
    /* static member */
    @JSImport("buffer", "Buffer.byteLength")
    @js.native
    def byteLength(string: java.lang.String): Double = js.native
    @JSImport("buffer", "Buffer.byteLength")
    @js.native
    def byteLength(string: java.lang.String, encoding: BufferEncoding): Double = js.native
    @JSImport("buffer", "Buffer.byteLength")
    @js.native
    def byteLength(string: js.typedarray.ArrayBuffer): Double = js.native
    @JSImport("buffer", "Buffer.byteLength")
    @js.native
    def byteLength(string: js.typedarray.ArrayBuffer, encoding: BufferEncoding): Double = js.native
    @JSImport("buffer", "Buffer.byteLength")
    @js.native
    def byteLength(string: ArrayBufferView): Double = js.native
    @JSImport("buffer", "Buffer.byteLength")
    @js.native
    def byteLength(string: ArrayBufferView, encoding: BufferEncoding): Double = js.native
    @JSImport("buffer", "Buffer.byteLength")
    @js.native
    def byteLength(string: SharedArrayBuffer): Double = js.native
    @JSImport("buffer", "Buffer.byteLength")
    @js.native
    def byteLength(string: SharedArrayBuffer, encoding: BufferEncoding): Double = js.native
    
    /**
      * The same as buf1.compare(buf2).
      */
    /* static member */
    @JSImport("buffer", "Buffer.compare")
    @js.native
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
    /* static member */
    @JSImport("buffer", "Buffer.concat")
    @js.native
    def concat(list: js.Array[js.typedarray.Uint8Array]): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.concat")
    @js.native
    def concat(list: js.Array[js.typedarray.Uint8Array], totalLength: Double): typingsSlinky.node.Buffer = js.native
    
    /**
      * When passed a reference to the .buffer property of a TypedArray instance,
      * the newly created Buffer will share the same allocated memory as the TypedArray.
      * The optional {byteOffset} and {length} arguments specify a memory range
      * within the {arrayBuffer} that will be shared by the Buffer.
      *
      * @param arrayBuffer The .buffer property of any TypedArray or a new ArrayBuffer()
      */
    /* static member */
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(arrayBuffer: js.typedarray.ArrayBuffer): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: js.UndefOr[scala.Nothing], length: Double): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Double): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Double, length: Double): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(arrayBuffer: SharedArrayBuffer): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(arrayBuffer: SharedArrayBuffer, byteOffset: js.UndefOr[scala.Nothing], length: Double): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(arrayBuffer: SharedArrayBuffer, byteOffset: Double): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(arrayBuffer: SharedArrayBuffer, byteOffset: Double, length: Double): typingsSlinky.node.Buffer = js.native
    /**
      * Creates a new Buffer using the passed {data}
      * @param data data to create a new Buffer
      */
    /* static member */
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(data: js.Array[Double]): typingsSlinky.node.Buffer = js.native
    /* static member */
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(data: js.typedarray.Uint8Array): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(obj: ToPrimitive): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(obj: ToPrimitive, byteOffset: js.UndefOr[scala.Nothing], length: Double): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(obj: ToPrimitive, byteOffset: Double): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(obj: ToPrimitive, byteOffset: Double, length: Double): typingsSlinky.node.Buffer = js.native
    /**
      * Creates a new buffer containing the coerced value of an object
      * A `TypeError` will be thrown if {obj} has not mentioned methods or is not of other type appropriate for `Buffer.from()` variants.
      * @param obj An object supporting `Symbol.toPrimitive` or `valueOf()`.
      */
    /* static member */
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(obj: ValueOf): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(obj: ValueOf, byteOffset: js.UndefOr[scala.Nothing], length: Double): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(obj: ValueOf, byteOffset: Double): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(obj: ValueOf, byteOffset: Double, length: Double): typingsSlinky.node.Buffer = js.native
    /**
      * Creates a new Buffer containing the given JavaScript string {str}.
      * If provided, the {encoding} parameter identifies the character encoding.
      * If not provided, {encoding} defaults to 'utf8'.
      */
    /* static member */
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(str: java.lang.String): typingsSlinky.node.Buffer = js.native
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(str: java.lang.String, encoding: BufferEncoding): typingsSlinky.node.Buffer = js.native
    
    /**
      * Returns true if {obj} is a Buffer
      *
      * @param obj object to test.
      */
    /* static member */
    @JSImport("buffer", "Buffer.isBuffer")
    @js.native
    def isBuffer(obj: js.Any): /* is node.Buffer */ Boolean = js.native
    
    /**
      * Returns true if {encoding} is a valid encoding argument.
      * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
      *
      * @param encoding string to test.
      */
    /* static member */
    @JSImport("buffer", "Buffer.isEncoding")
    @js.native
    def isEncoding(encoding: java.lang.String): /* is node.BufferEncoding */ Boolean = js.native
    
    /**
      * Creates a new Buffer using the passed {data}
      * @param values to create a new Buffer
      */
    /* static member */
    @JSImport("buffer", "Buffer.of")
    @js.native
    def of(items: Double*): typingsSlinky.node.Buffer = js.native
    
    /**
      * This is the number of bytes used to determine the size of pre-allocated, internal Buffer instances used for pooling. This value may be modified.
      */
    /* static member */
    @JSImport("buffer", "Buffer.poolSize")
    @js.native
    def poolSize: Double = js.native
    @scala.inline
    def poolSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("poolSize")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("buffer", "INSPECT_MAX_BYTES")
  @js.native
  val INSPECT_MAX_BYTES: Double = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("buffer", "SlowBuffer")
  @js.native
  class SlowBuffer protected ()
    extends typingsSlinky.node.Buffer {
    /** @deprecated since v6.0.0, use `Buffer.allocUnsafeSlow()` */
    def this(size: Double) = this()
  }
  
  object constants {
    
    @JSImport("buffer", "constants")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("buffer", "constants.MAX_LENGTH")
    @js.native
    def MAX_LENGTH: Double = js.native
    @scala.inline
    def MAX_LENGTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_LENGTH")(x.asInstanceOf[js.Any])
    
    @JSImport("buffer", "constants.MAX_STRING_LENGTH")
    @js.native
    def MAX_STRING_LENGTH: Double = js.native
    @scala.inline
    def MAX_STRING_LENGTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_STRING_LENGTH")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("buffer", "kMaxLength")
  @js.native
  val kMaxLength: Double = js.native
  
  @JSImport("buffer", "kStringMaxLength")
  @js.native
  val kStringMaxLength: Double = js.native
  
  @JSImport("buffer", "transcode")
  @js.native
  def transcode(source: js.typedarray.Uint8Array, fromEnc: TranscodeEncoding, toEnc: TranscodeEncoding): typingsSlinky.node.Buffer = js.native
  
  /* was `typeof Buffer` */
  object BuffType
  /**
    * Raw data is stored in instances of the Buffer class.
    * A Buffer is similar to an array of integers but corresponds to a raw memory allocation outside the V8 heap.  A Buffer cannot be resized.
    * Valid string encodings: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
    */
  /* was `typeof Buffer` */
  type BuffType = typingsSlinky.node.Buffer
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.node.nodeStrings.ascii
    - typingsSlinky.node.nodeStrings.utf8
    - typingsSlinky.node.nodeStrings.utf16le
    - typingsSlinky.node.nodeStrings.ucs2
    - typingsSlinky.node.nodeStrings.latin1
    - typingsSlinky.node.nodeStrings.binary
  */
  trait TranscodeEncoding extends StObject
  object TranscodeEncoding {
    
    @scala.inline
    def ascii: typingsSlinky.node.nodeStrings.ascii = "ascii".asInstanceOf[typingsSlinky.node.nodeStrings.ascii]
    
    @scala.inline
    def binary: typingsSlinky.node.nodeStrings.binary = "binary".asInstanceOf[typingsSlinky.node.nodeStrings.binary]
    
    @scala.inline
    def latin1: typingsSlinky.node.nodeStrings.latin1 = "latin1".asInstanceOf[typingsSlinky.node.nodeStrings.latin1]
    
    @scala.inline
    def ucs2: typingsSlinky.node.nodeStrings.ucs2 = "ucs2".asInstanceOf[typingsSlinky.node.nodeStrings.ucs2]
    
    @scala.inline
    def utf16le: typingsSlinky.node.nodeStrings.utf16le = "utf16le".asInstanceOf[typingsSlinky.node.nodeStrings.utf16le]
    
    @scala.inline
    def utf8: typingsSlinky.node.nodeStrings.utf8 = "utf8".asInstanceOf[typingsSlinky.node.nodeStrings.utf8]
  }
}
