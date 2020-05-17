package typingsSlinky.electron.originalFsMod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.Buffer
import typingsSlinky.node.anon.BufferBytesWritten
import typingsSlinky.node.anon.BufferDataView
import typingsSlinky.node.anon.BufferFloat32Array
import typingsSlinky.node.anon.BufferFloat64Array
import typingsSlinky.node.anon.BufferInt16Array
import typingsSlinky.node.anon.BufferInt32Array
import typingsSlinky.node.anon.BufferInt8Array
import typingsSlinky.node.anon.BufferString
import typingsSlinky.node.anon.BufferUint32Array
import typingsSlinky.node.anon.BytesWritten
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("original-fs", "write")
@js.native
object write extends js.Object {
  def apply(
    fd: Double,
    buffer: js.typedarray.DataView,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ js.typedarray.DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ js.typedarray.DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ js.typedarray.DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    */
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    */
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
    */
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    */
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[
      ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
    */
  def apply(
    fd: Double,
    string: js.Any,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    */
  def apply(
    fd: Double,
    string: js.Any,
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    * @param encoding The expected string encoding.
    */
  def apply(
    fd: Double,
    string: js.Any,
    position: js.UndefOr[Double | Null],
    encoding: js.UndefOr[Null | String],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    */
  @JSName("__promisify__")
  def promisify(fd: Double): js.Promise[Buffer] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.DataView): js.Promise[BufferDataView] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.DataView, offset: Double): js.Promise[BufferDataView] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Double): js.Promise[BufferDataView] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Double, position: Double): js.Promise[BufferDataView] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Float32Array): js.Promise[BufferFloat32Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Float32Array, offset: Double): js.Promise[BufferFloat32Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Double): js.Promise[BufferFloat32Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat32Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Float64Array): js.Promise[BufferFloat64Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Float64Array, offset: Double): js.Promise[BufferFloat64Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Double): js.Promise[BufferFloat64Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat64Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Int16Array): js.Promise[BufferInt16Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Int16Array, offset: Double): js.Promise[BufferInt16Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Double): js.Promise[BufferInt16Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt16Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Int32Array): js.Promise[BufferInt32Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Int32Array, offset: Double): js.Promise[BufferInt32Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Double): js.Promise[BufferInt32Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt32Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Int8Array): js.Promise[BufferInt8Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Int8Array, offset: Double): js.Promise[BufferInt8Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Double): js.Promise[BufferInt8Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt8Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Uint16Array): js.Promise[BufferBytesWritten] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double): js.Promise[BufferBytesWritten] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Double): js.Promise[BufferBytesWritten] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Double, position: Double): js.Promise[BufferBytesWritten] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Uint32Array): js.Promise[BufferUint32Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double): js.Promise[BufferUint32Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Double): js.Promise[BufferUint32Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Double, position: Double): js.Promise[BufferUint32Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Uint8Array): js.Promise[Buffer] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double): js.Promise[Buffer] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[Buffer] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): js.Promise[Buffer] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Uint8ClampedArray): js.Promise[BytesWritten] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Uint8ClampedArray, offset: Double): js.Promise[BytesWritten] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: js.typedarray.Uint8ClampedArray, offset: Double, length: Double): js.Promise[BytesWritten] = js.native
  @JSName("__promisify__")
  def promisify(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double
  ): js.Promise[BytesWritten] = js.native
  /**
    * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    * @param encoding The expected string encoding.
    */
  @JSName("__promisify__")
  def promisify(fd: Double, string: js.Any): js.Promise[BufferString] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, string: js.Any, position: Double): js.Promise[BufferString] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, string: js.Any, position: Double, encoding: String): js.Promise[BufferString] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, string: js.Any, position: Null, encoding: String): js.Promise[BufferString] = js.native
}

