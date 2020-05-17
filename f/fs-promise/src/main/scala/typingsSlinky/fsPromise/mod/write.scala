package typingsSlinky.fsPromise.mod

import typingsSlinky.fsExtra.mod.WriteResult
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "write")
@js.native
object write extends js.Object {
  def apply(fd: Double): js.Promise[js.Tuple2[Double, js.typedarray.Uint8Array]] = js.native
  def apply(fd: Double, buffer: Buffer): js.Promise[WriteResult] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double): js.Promise[WriteResult] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): js.Promise[WriteResult] = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[WriteResult] = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.DataView): js.Promise[js.Tuple2[Double, js.typedarray.DataView]] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.DataView, offset: Double): js.Promise[js.Tuple2[Double, js.typedarray.DataView]] = js.native
  def apply(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Double): js.Promise[js.Tuple2[Double, js.typedarray.DataView]] = js.native
  def apply(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, js.typedarray.DataView]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Float32Array): js.Promise[js.Tuple2[Double, js.typedarray.Float32Array]] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Float32Array, offset: Double): js.Promise[js.Tuple2[Double, js.typedarray.Float32Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Double): js.Promise[js.Tuple2[Double, js.typedarray.Float32Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, js.typedarray.Float32Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Float64Array): js.Promise[js.Tuple2[Double, js.typedarray.Float64Array]] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Float64Array, offset: Double): js.Promise[js.Tuple2[Double, js.typedarray.Float64Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Double): js.Promise[js.Tuple2[Double, js.typedarray.Float64Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, js.typedarray.Float64Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int16Array): js.Promise[js.Tuple2[Double, js.typedarray.Int16Array]] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Int16Array, offset: Double): js.Promise[js.Tuple2[Double, js.typedarray.Int16Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Double): js.Promise[js.Tuple2[Double, js.typedarray.Int16Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, js.typedarray.Int16Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int32Array): js.Promise[js.Tuple2[Double, js.typedarray.Int32Array]] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Int32Array, offset: Double): js.Promise[js.Tuple2[Double, js.typedarray.Int32Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Double): js.Promise[js.Tuple2[Double, js.typedarray.Int32Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, js.typedarray.Int32Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int8Array): js.Promise[js.Tuple2[Double, js.typedarray.Int8Array]] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Int8Array, offset: Double): js.Promise[js.Tuple2[Double, js.typedarray.Int8Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Double): js.Promise[js.Tuple2[Double, js.typedarray.Int8Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, js.typedarray.Int8Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint16Array): js.Promise[js.Tuple2[Double, js.typedarray.Uint16Array]] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double): js.Promise[js.Tuple2[Double, js.typedarray.Uint16Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Double): js.Promise[js.Tuple2[Double, js.typedarray.Uint16Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, js.typedarray.Uint16Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint32Array): js.Promise[js.Tuple2[Double, js.typedarray.Uint32Array]] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double): js.Promise[js.Tuple2[Double, js.typedarray.Uint32Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Double): js.Promise[js.Tuple2[Double, js.typedarray.Uint32Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, js.typedarray.Uint32Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array): js.Promise[js.Tuple2[Double, js.typedarray.Uint8Array]] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double): js.Promise[js.Tuple2[Double, js.typedarray.Uint8Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[js.Tuple2[Double, js.typedarray.Uint8Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, js.typedarray.Uint8Array]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8ClampedArray): js.Promise[js.Tuple2[Double, js.typedarray.Uint8ClampedArray]] = js.native
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
  def apply(fd: Double, buffer: js.typedarray.Uint8ClampedArray, offset: Double): js.Promise[js.Tuple2[Double, js.typedarray.Uint8ClampedArray]] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8ClampedArray, offset: Double, length: Double): js.Promise[js.Tuple2[Double, js.typedarray.Uint8ClampedArray]] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double
  ): js.Promise[js.Tuple2[Double, js.typedarray.Uint8ClampedArray]] = js.native
  def apply(
    fd: Double,
    data: js.Any,
    callback: js.Function3[(/* err */ ErrnoException) | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    data: js.Any,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    data: js.Any,
    offset: Double,
    encoding: String,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    data: js.Any,
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    data: js.Any,
    position: js.UndefOr[Double | Null],
    encoding: js.UndefOr[Null | String],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(fd: Double, string: js.Any): js.Promise[js.Tuple2[Double, String]] = js.native
  def apply(fd: Double, string: js.Any, position: Double): js.Promise[js.Tuple2[Double, String]] = js.native
  def apply(fd: Double, string: js.Any, position: Double, encoding: String): js.Promise[js.Tuple2[Double, String]] = js.native
  def apply(fd: Double, string: js.Any, position: Null, encoding: String): js.Promise[js.Tuple2[Double, String]] = js.native
}

