package typingsSlinky.promiseFs.mod

import typingsSlinky.node.AnonBufferDataViewBytesReadNumber
import typingsSlinky.node.AnonBufferFloat32ArrayBytesReadNumber
import typingsSlinky.node.AnonBufferFloat64ArrayBytesReadNumber
import typingsSlinky.node.AnonBufferInt16ArrayBytesReadNumber
import typingsSlinky.node.AnonBufferInt32ArrayBytesReadNumber
import typingsSlinky.node.AnonBufferInt8ArrayBytesReadNumber
import typingsSlinky.node.AnonBufferUint16Array
import typingsSlinky.node.AnonBytesReadNumber
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.promiseFs.AnonBuffer
import typingsSlinky.promiseFs.AnonBufferBytesRead
import typingsSlinky.promiseFs.AnonBufferDataView
import typingsSlinky.promiseFs.AnonBufferFloat32Array
import typingsSlinky.promiseFs.AnonBufferFloat64Array
import typingsSlinky.promiseFs.AnonBufferInt16Array
import typingsSlinky.promiseFs.AnonBufferInt32Array
import typingsSlinky.promiseFs.AnonBufferInt8Array
import typingsSlinky.promiseFs.AnonBufferUint32Array
import typingsSlinky.promiseFs.AnonBytesRead
import typingsSlinky.std.DataView
import typingsSlinky.std.Float32Array
import typingsSlinky.std.Float64Array
import typingsSlinky.std.Int16Array
import typingsSlinky.std.Int32Array
import typingsSlinky.std.Int8Array
import typingsSlinky.std.Uint16Array
import typingsSlinky.std.Uint32Array
import typingsSlinky.std.Uint8Array
import typingsSlinky.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("promise-fs", "read")
@js.native
object read extends js.Object {
  def apply(fd: Double, buffer: DataView, offset: Double, length: Double): js.Promise[AnonBufferDataView] = js.native
  def apply(fd: Double, buffer: DataView, offset: Double, length: Double, position: Double): js.Promise[AnonBufferDataView] = js.native
  def apply(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Float32Array, offset: Double, length: Double): js.Promise[AnonBufferFloat32Array] = js.native
  def apply(fd: Double, buffer: Float32Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferFloat32Array] = js.native
  def apply(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: Float64Array, offset: Double, length: Double): js.Promise[AnonBufferFloat64Array] = js.native
  def apply(fd: Double, buffer: Float64Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferFloat64Array] = js.native
  def apply(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: Int16Array, offset: Double, length: Double): js.Promise[AnonBufferInt16Array] = js.native
  def apply(fd: Double, buffer: Int16Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferInt16Array] = js.native
  def apply(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Int32Array, offset: Double, length: Double): js.Promise[AnonBufferInt32Array] = js.native
  def apply(fd: Double, buffer: Int32Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferInt32Array] = js.native
  def apply(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Int8Array, offset: Double, length: Double): js.Promise[AnonBufferInt8Array] = js.native
  def apply(fd: Double, buffer: Int8Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferInt8Array] = js.native
  def apply(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Uint16Array, offset: Double, length: Double): js.Promise[AnonBufferBytesRead] = js.native
  def apply(fd: Double, buffer: Uint16Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferBytesRead] = js.native
  def apply(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: Uint32Array, offset: Double, length: Double): js.Promise[AnonBufferUint32Array] = js.native
  def apply(fd: Double, buffer: Uint32Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferUint32Array] = js.native
  def apply(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double): js.Promise[AnonBuffer] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[AnonBuffer] = js.native
  /**
    * Asynchronously reads data from the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
    */
  def apply(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double): js.Promise[AnonBytesRead] = js.native
  def apply(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[AnonBytesRead] = js.native
  def apply(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: DataView, offset: Double, length: Double): js.Promise[AnonBufferDataViewBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: DataView, offset: Double, length: Double, position: Double): js.Promise[AnonBufferDataViewBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Float32Array, offset: Double, length: Double): js.Promise[AnonBufferFloat32ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Float32Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferFloat32ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Float64Array, offset: Double, length: Double): js.Promise[AnonBufferFloat64ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Float64Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferFloat64ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int16Array, offset: Double, length: Double): js.Promise[AnonBufferInt16ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int16Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferInt16ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int32Array, offset: Double, length: Double): js.Promise[AnonBufferInt32ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int32Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferInt32ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int8Array, offset: Double, length: Double): js.Promise[AnonBufferInt8ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int8Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferInt8ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint16Array, offset: Double, length: Double): js.Promise[AnonBufferUint16Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint16Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferUint16Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint32Array, offset: Double, length: Double): js.Promise[AnonBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint32Array, offset: Double, length: Double, position: Double): js.Promise[AnonBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint8Array, offset: Double, length: Double): js.Promise[typingsSlinky.node.AnonBytesRead] = js.native
  /**
    * @param fd A file descriptor.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
    */
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[typingsSlinky.node.AnonBytesRead] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double): js.Promise[typingsSlinky.node.AnonBufferBytesRead] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[typingsSlinky.node.AnonBufferBytesRead] = js.native
}

