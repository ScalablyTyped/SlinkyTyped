package typingsSlinky.fsPromise.mod

import typingsSlinky.fsExtra.mod.ReadResult
import typingsSlinky.mz.anon.BufferBytesRead
import typingsSlinky.mz.anon.BufferDataView
import typingsSlinky.mz.anon.BufferFloat32Array
import typingsSlinky.mz.anon.BufferFloat64Array
import typingsSlinky.mz.anon.BufferInt16Array
import typingsSlinky.mz.anon.BufferInt32Array
import typingsSlinky.mz.anon.BufferInt8Array
import typingsSlinky.mz.anon.BufferUint32Array
import typingsSlinky.mz.anon.BytesRead
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
  def apply(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Double): js.Promise[BufferDataView] = js.native
  def apply(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Double, position: Double): js.Promise[BufferDataView] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Double): js.Promise[BufferFloat32Array] = js.native
  def apply(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat32Array] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Double): js.Promise[BufferFloat64Array] = js.native
  def apply(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat64Array] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Double): js.Promise[BufferInt16Array] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt16Array] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Double): js.Promise[BufferInt32Array] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt32Array] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Double): js.Promise[BufferInt8Array] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt8Array] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Double): js.Promise[BufferBytesRead] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Double, position: Double): js.Promise[BufferBytesRead] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Double): js.Promise[BufferUint32Array] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Double, position: Double): js.Promise[BufferUint32Array] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[typingsSlinky.mz.anon.Buffer] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): js.Promise[typingsSlinky.mz.anon.Buffer] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Uint8ClampedArray, offset: Double, length: Double): js.Promise[BytesRead] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double
  ): js.Promise[BytesRead] = js.native
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

