package typingsSlinky.node

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.NodeJS.Global
import typingsSlinky.node.NodeJS.Immediate
import typingsSlinky.node.NodeJS.Timeout
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.anon.ToPrimitive
import typingsSlinky.node.anon.ValueOf
import typingsSlinky.node.consoleMod.global.Console_
import typingsSlinky.node.consoleMod.global.NodeJS.ConsoleConstructorOptions
import typingsSlinky.node.processMod.global.NodeJS.Process
import typingsSlinky.std.ArrayBufferLike
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.SharedArrayBuffer
import typingsSlinky.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Raw data is stored in instances of the Buffer class.
    * A Buffer is similar to an array of integers but corresponds to a raw memory allocation outside the V8 heap.  A Buffer cannot be resized.
    * Valid string encodings: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
    */
  @JSGlobal("Buffer")
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
  object Buffer {
    
    @JSGlobal("Buffer")
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
    @JSGlobal("Buffer.alloc")
    @js.native
    def alloc(size: Double): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: js.UndefOr[scala.Nothing], encoding: BufferEncoding): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: java.lang.String): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: java.lang.String, encoding: BufferEncoding): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: Double): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: Double, encoding: BufferEncoding): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: typingsSlinky.node.Buffer): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: typingsSlinky.node.Buffer, encoding: BufferEncoding): typingsSlinky.node.Buffer = js.native
    
    /**
      * Allocates a new buffer of {size} octets, leaving memory not initialized, so the contents
      * of the newly created Buffer are unknown and may contain sensitive data.
      *
      * @param size count of octets to allocate
      */
    /* static member */
    @JSGlobal("Buffer.allocUnsafe")
    @js.native
    def allocUnsafe(size: Double): typingsSlinky.node.Buffer = js.native
    
    /**
      * Allocates a new non-pooled buffer of {size} octets, leaving memory not initialized, so the contents
      * of the newly created Buffer are unknown and may contain sensitive data.
      *
      * @param size count of octets to allocate
      */
    /* static member */
    @JSGlobal("Buffer.allocUnsafeSlow")
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
    @JSGlobal("Buffer.byteLength")
    @js.native
    def byteLength(string: java.lang.String): Double = js.native
    @JSGlobal("Buffer.byteLength")
    @js.native
    def byteLength(string: java.lang.String, encoding: BufferEncoding): Double = js.native
    @JSGlobal("Buffer.byteLength")
    @js.native
    def byteLength(string: js.typedarray.ArrayBuffer): Double = js.native
    @JSGlobal("Buffer.byteLength")
    @js.native
    def byteLength(string: js.typedarray.ArrayBuffer, encoding: BufferEncoding): Double = js.native
    @JSGlobal("Buffer.byteLength")
    @js.native
    def byteLength(string: ArrayBufferView): Double = js.native
    @JSGlobal("Buffer.byteLength")
    @js.native
    def byteLength(string: ArrayBufferView, encoding: BufferEncoding): Double = js.native
    @JSGlobal("Buffer.byteLength")
    @js.native
    def byteLength(string: SharedArrayBuffer): Double = js.native
    @JSGlobal("Buffer.byteLength")
    @js.native
    def byteLength(string: SharedArrayBuffer, encoding: BufferEncoding): Double = js.native
    
    /**
      * The same as buf1.compare(buf2).
      */
    /* static member */
    @JSGlobal("Buffer.compare")
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
    @JSGlobal("Buffer.concat")
    @js.native
    def concat(list: js.Array[js.typedarray.Uint8Array]): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.concat")
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
    @JSGlobal("Buffer.from")
    @js.native
    def from(arrayBuffer: js.typedarray.ArrayBuffer): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.from")
    @js.native
    def from(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: js.UndefOr[scala.Nothing], length: Double): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.from")
    @js.native
    def from(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Double): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.from")
    @js.native
    def from(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Double, length: Double): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.from")
    @js.native
    def from(arrayBuffer: SharedArrayBuffer): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.from")
    @js.native
    def from(arrayBuffer: SharedArrayBuffer, byteOffset: js.UndefOr[scala.Nothing], length: Double): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.from")
    @js.native
    def from(arrayBuffer: SharedArrayBuffer, byteOffset: Double): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.from")
    @js.native
    def from(arrayBuffer: SharedArrayBuffer, byteOffset: Double, length: Double): typingsSlinky.node.Buffer = js.native
    /**
      * Creates a new Buffer using the passed {data}
      * @param data data to create a new Buffer
      */
    /* static member */
    @JSGlobal("Buffer.from")
    @js.native
    def from(data: js.Array[Double]): typingsSlinky.node.Buffer = js.native
    /* static member */
    @JSGlobal("Buffer.from")
    @js.native
    def from(data: js.typedarray.Uint8Array): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.from")
    @js.native
    def from(obj: ToPrimitive): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.from")
    @js.native
    def from(obj: ToPrimitive, byteOffset: js.UndefOr[scala.Nothing], length: Double): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.from")
    @js.native
    def from(obj: ToPrimitive, byteOffset: Double): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.from")
    @js.native
    def from(obj: ToPrimitive, byteOffset: Double, length: Double): typingsSlinky.node.Buffer = js.native
    /**
      * Creates a new buffer containing the coerced value of an object
      * A `TypeError` will be thrown if {obj} has not mentioned methods or is not of other type appropriate for `Buffer.from()` variants.
      * @param obj An object supporting `Symbol.toPrimitive` or `valueOf()`.
      */
    /* static member */
    @JSGlobal("Buffer.from")
    @js.native
    def from(obj: ValueOf): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.from")
    @js.native
    def from(obj: ValueOf, byteOffset: js.UndefOr[scala.Nothing], length: Double): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.from")
    @js.native
    def from(obj: ValueOf, byteOffset: Double): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.from")
    @js.native
    def from(obj: ValueOf, byteOffset: Double, length: Double): typingsSlinky.node.Buffer = js.native
    /**
      * Creates a new Buffer containing the given JavaScript string {str}.
      * If provided, the {encoding} parameter identifies the character encoding.
      * If not provided, {encoding} defaults to 'utf8'.
      */
    /* static member */
    @JSGlobal("Buffer.from")
    @js.native
    def from(str: java.lang.String): typingsSlinky.node.Buffer = js.native
    @JSGlobal("Buffer.from")
    @js.native
    def from(str: java.lang.String, encoding: BufferEncoding): typingsSlinky.node.Buffer = js.native
    
    /**
      * Returns true if {obj} is a Buffer
      *
      * @param obj object to test.
      */
    /* static member */
    @JSGlobal("Buffer.isBuffer")
    @js.native
    def isBuffer(obj: js.Any): /* is node.Buffer */ Boolean = js.native
    
    /**
      * Returns true if {encoding} is a valid encoding argument.
      * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
      *
      * @param encoding string to test.
      */
    /* static member */
    @JSGlobal("Buffer.isEncoding")
    @js.native
    def isEncoding(encoding: java.lang.String): /* is node.BufferEncoding */ Boolean = js.native
    
    /**
      * Creates a new Buffer using the passed {data}
      * @param values to create a new Buffer
      */
    /* static member */
    @JSGlobal("Buffer.of")
    @js.native
    def of(items: Double*): typingsSlinky.node.Buffer = js.native
    
    /**
      * This is the number of bytes used to determine the size of pre-allocated, internal Buffer instances used for pooling. This value may be modified.
      */
    /* static member */
    @JSGlobal("Buffer.poolSize")
    @js.native
    def poolSize: Double = js.native
    @scala.inline
    def poolSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("poolSize")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("clearImmediate")
  @js.native
  def clearImmediate(immediateId: Immediate): Unit = js.native
  
  @JSGlobal("clearInterval")
  @js.native
  def clearInterval(intervalId: Timeout): Unit = js.native
  
  @JSGlobal("clearTimeout")
  @js.native
  def clearTimeout(timeoutId: Timeout): Unit = js.native
  
  object console extends Shortcut {
    
    @JSGlobal("console")
    @js.native
    val ^ : Console_ = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("console.Console")
    @js.native
    class Console protected () extends Console_ {
      def this(options: ConsoleConstructorOptions) = this()
      def this(stdout: WritableStream) = this()
      def this(stdout: WritableStream, stderr: WritableStream) = this()
      def this(stdout: WritableStream, stderr: js.UndefOr[scala.Nothing], ignoreErrors: Boolean) = this()
      def this(stdout: WritableStream, stderr: WritableStream, ignoreErrors: Boolean) = this()
    }
    
    type _To = Console_
    
    /* This means you don't have to write `^`, but can instead just say `console.foo` */
    override def _to: Console_ = ^
  }
  
  @JSGlobal("__dirname")
  @js.native
  def dirname: java.lang.String = js.native
  
  @scala.inline
  def dirname_=(x: java.lang.String): Unit = js.Dynamic.global.updateDynamic("__dirname")(x.asInstanceOf[js.Any])
  
  // Same as module.exports
  @JSGlobal("exports")
  @js.native
  def exports: js.Any = js.native
  @scala.inline
  def exports_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("exports")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__filename")
  @js.native
  def filename: java.lang.String = js.native
  
  @scala.inline
  def filename_=(x: java.lang.String): Unit = js.Dynamic.global.updateDynamic("__filename")(x.asInstanceOf[js.Any])
  
  object global extends Shortcut {
    
    @JSGlobal("global")
    @js.native
    val ^ : Global with (/* globalThis */ js.Any) = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Array")
    @js.native
    class Array[T] protected ()
      extends typingsSlinky.std.Array[T] {
      def this(arrayLength: Double) = this()
      def this(items: T*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.ArrayBuffer")
    @js.native
    class ArrayBuffer protected ()
      extends typingsSlinky.std.ArrayBuffer {
      def this(byteLength: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Boolean")
    @js.native
    class Boolean ()
      extends typingsSlinky.std.Boolean {
      def this(value: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("global.Buffer")
    @js.native
    class BufferCls protected ()
      extends typingsSlinky.node.Buffer {
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
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.DataView")
    @js.native
    class DataView protected ()
      extends typingsSlinky.std.DataView {
      def this(buffer: ArrayBufferLike) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], byteLength: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, byteLength: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Date")
    @js.native
    class Date ()
      extends typingsSlinky.std.Date {
      def this(value: java.lang.String) = this()
      def this(value: js.Date) = this()
      def this(value: Double) = this()
      def this(vd: VarDate) = this()
      def this(year: Double, month: Double) = this()
      def this(year: Double, month: Double, date: Double) = this()
      def this(year: Double, month: Double, date: js.UndefOr[scala.Nothing], hours: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: Double
      ) = this()
      def this(year: Double, month: Double, date: js.UndefOr[scala.Nothing], hours: Double, minutes: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: js.UndefOr[scala.Nothing], minutes: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: Double,
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double
      ) = this()
      def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: Double,
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: Double,
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Error")
    @js.native
    class Error ()
      extends typingsSlinky.std.Error {
      def this(message: java.lang.String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.EvalError")
    @js.native
    class EvalError ()
      extends typingsSlinky.std.Error {
      def this(message: java.lang.String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Float32Array")
    @js.native
    class Float32Array ()
      extends typingsSlinky.std.Float32Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Float64Array")
    @js.native
    class Float64Array ()
      extends typingsSlinky.std.Float64Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Function")
    @js.native
    class Function protected ()
      extends js.Function {
      /**
        * Creates a new function.
        * @param args A list of arguments the function accepts.
        */
      def this(args: java.lang.String*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Int16Array")
    @js.native
    class Int16Array ()
      extends typingsSlinky.std.Int16Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Int32Array")
    @js.native
    class Int32Array ()
      extends typingsSlinky.std.Int32Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Int8Array")
    @js.native
    class Int8Array ()
      extends typingsSlinky.std.Int8Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Map")
    @js.native
    class Map[K, V] ()
      extends typingsSlinky.std.Map[K, V] {
      def this(entries: js.Array[js.Tuple2[K, V]]) = this()
      def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Number")
    @js.native
    class Number ()
      extends typingsSlinky.std.Number {
      def this(value: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Object")
    @js.native
    class Object ()
      extends typingsSlinky.std.Object {
      def this(value: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Promise")
    @js.native
    class Promise[T] protected ()
      extends typingsSlinky.std.Promise[T] {
      /**
        * Creates a new Promise.
        * @param executor A callback used to initialize the promise. This callback is passed two arguments:
        * a resolve callback used to resolve the promise with a value or the result of another promise,
        * and a reject callback used to reject the promise with a provided reason or error.
        */
      def this(executor: js.Function2[
                /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
                Unit
              ]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.RangeError")
    @js.native
    class RangeError ()
      extends typingsSlinky.std.Error {
      def this(message: java.lang.String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.ReferenceError")
    @js.native
    class ReferenceError ()
      extends typingsSlinky.std.Error {
      def this(message: java.lang.String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.RegExp")
    @js.native
    class RegExp protected ()
      extends typingsSlinky.std.RegExp {
      def this(pattern: java.lang.String) = this()
      def this(pattern: js.RegExp) = this()
      def this(pattern: java.lang.String, flags: java.lang.String) = this()
      def this(pattern: js.RegExp, flags: java.lang.String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Set")
    @js.native
    class Set[T] ()
      extends typingsSlinky.std.Set[T] {
      def this(values: js.Array[T]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.String")
    @js.native
    class String ()
      extends typingsSlinky.std.String {
      def this(value: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.SyntaxError")
    @js.native
    class SyntaxError ()
      extends typingsSlinky.std.Error {
      def this(message: java.lang.String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.TypeError")
    @js.native
    class TypeError ()
      extends typingsSlinky.std.Error {
      def this(message: java.lang.String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.URIError")
    @js.native
    class URIError ()
      extends typingsSlinky.std.Error {
      def this(message: java.lang.String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Uint16Array")
    @js.native
    class Uint16Array ()
      extends typingsSlinky.std.Uint16Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Uint32Array")
    @js.native
    class Uint32Array ()
      extends typingsSlinky.std.Uint32Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Uint8Array")
    @js.native
    class Uint8Array ()
      extends typingsSlinky.std.Uint8Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Uint8ClampedArray")
    @js.native
    class Uint8ClampedArray ()
      extends typingsSlinky.std.Uint8ClampedArray {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.WeakMap")
    @js.native
    class WeakMap[K /* <: js.Object */, V] ()
      extends typingsSlinky.std.WeakMap[K, V] {
      def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.WeakSet")
    @js.native
    class WeakSet[T /* <: js.Object */] ()
      extends typingsSlinky.std.WeakSet[T] {
      def this(iterable: js.Iterable[T]) = this()
      def this(values: js.Array[T]) = this()
    }
    
    type _To = Global with (/* globalThis */ js.Any)
    
    /* This means you don't have to write `^`, but can instead just say `global.foo` */
    override def _to: Global with (/* globalThis */ js.Any) = ^
  }
  
  @JSGlobal("module")
  @js.native
  def module: NodeModule = js.native
  @scala.inline
  def module_=(x: NodeModule): Unit = js.Dynamic.global.updateDynamic("module")(x.asInstanceOf[js.Any])
  
  @JSGlobal("process")
  @js.native
  def process: Process = js.native
  @scala.inline
  def process_=(x: Process): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
  
  @JSGlobal("queueMicrotask")
  @js.native
  def queueMicrotask(callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("require")
  @js.native
  def require: NodeRequire = js.native
  @scala.inline
  def require_=(x: NodeRequire): Unit = js.Dynamic.global.updateDynamic("require")(x.asInstanceOf[js.Any])
  
  @JSGlobal("setImmediate")
  @js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
  
  @JSGlobal("setInterval")
  @js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  
  @JSGlobal("setTimeout")
  @js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  
  /*----------------------------------------------*
  *                                               *
  *               GLOBAL INTERFACES               *
  *                                               *
  *-----------------------------------------------*/
  object NodeJS
}
