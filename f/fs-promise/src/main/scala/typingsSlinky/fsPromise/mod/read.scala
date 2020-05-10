package typingsSlinky.fsPromise.mod

import typingsSlinky.fsExtra.mod.ReadResult
import typingsSlinky.mz.AnonBuffer
import typingsSlinky.mz.AnonBufferBytesRead
import typingsSlinky.mz.AnonBufferDataView
import typingsSlinky.mz.AnonBufferFloat32Array
import typingsSlinky.mz.AnonBufferFloat64Array
import typingsSlinky.mz.AnonBufferInt16Array
import typingsSlinky.mz.AnonBufferInt32Array
import typingsSlinky.mz.AnonBufferInt8Array
import typingsSlinky.mz.AnonBufferUint32Array
import typingsSlinky.mz.AnonBytesRead
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "read")
@js.native
object read extends js.Object {
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): js.Promise[ReadResult] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[ReadResult] = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Double): js.Promise[AnonBufferDataView] = js.native
  def apply(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Double, position: Double): js.Promise[AnonBufferDataView] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Double): js.Promise[AnonBufferFloat32Array] = js.native
  def apply(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferFloat32Array] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Double): js.Promise[AnonBufferFloat64Array] = js.native
  def apply(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferFloat64Array] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Double): js.Promise[AnonBufferInt16Array] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferInt16Array] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Double): js.Promise[AnonBufferInt32Array] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferInt32Array] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Double): js.Promise[AnonBufferInt8Array] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferInt8Array] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Double): js.Promise[AnonBufferBytesRead] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferBytesRead] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Double): js.Promise[AnonBufferUint32Array] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferUint32Array] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[AnonBuffer] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): js.Promise[AnonBuffer] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8ClampedArray, offset: Double, length: Double): js.Promise[AnonBytesRead] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double
  ): js.Promise[AnonBytesRead] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
}

