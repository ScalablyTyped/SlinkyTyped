package typingsSlinky.fsExtra.mod

import typingsSlinky.fsExtra.anon.BufferBytesWritten
import typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber
import typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber
import typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber
import typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber
import typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber
import typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber
import typingsSlinky.fsExtra.anon.BufferString
import typingsSlinky.fsExtra.anon.BufferUint16Array
import typingsSlinky.fsExtra.anon.BytesWritten
import typingsSlinky.fsExtra.anon.BytesWrittenNumber
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "write")
@js.native
object write extends js.Object {
  
  def apply(fd: Double, buffer: js.typedarray.DataView): js.Promise[BufferDataViewBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferDataViewBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.DataView, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BufferDataViewBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BufferDataViewBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.DataView, offset: Double): js.Promise[BufferDataViewBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferDataViewBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Double): js.Promise[BufferDataViewBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Double, position: Double): js.Promise[BufferDataViewBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
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
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Float32Array): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Float32Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Float32Array, offset: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
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
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Float64Array): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Float64Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Float64Array, offset: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
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
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Int16Array): js.Promise[BufferInt16ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferInt16ArrayBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int16Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BufferInt16ArrayBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int16Array, offset: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferInt16ArrayBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
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
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Int32Array): js.Promise[BufferInt32ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferInt32ArrayBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int32Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BufferInt32ArrayBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int32Array, offset: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferInt32ArrayBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
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
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Int8Array): js.Promise[BufferInt8ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferInt8ArrayBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int8Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BufferInt8ArrayBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int8Array, offset: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferInt8ArrayBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
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
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint16Array): js.Promise[BufferUint16Array] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferUint16Array] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint16Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BufferUint16Array] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BufferUint16Array] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double): js.Promise[BufferUint16Array] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferUint16Array] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Double): js.Promise[BufferUint16Array] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Double, position: Double): js.Promise[BufferUint16Array] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
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
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint32Array): js.Promise[BytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint32Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double): js.Promise[BytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Double): js.Promise[BytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Double, position: Double): js.Promise[BytesWrittenNumber] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
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
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array): js.Promise[BytesWritten] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BytesWritten] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BytesWritten] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BytesWritten] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double): js.Promise[BytesWritten] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BytesWritten] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[BytesWritten] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): js.Promise[BytesWritten] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
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
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8ClampedArray): js.Promise[BufferBytesWritten] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferBytesWritten] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: Double
  ): js.Promise[BufferBytesWritten] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8ClampedArray, offset: Double): js.Promise[BufferBytesWritten] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8ClampedArray, offset: Double, length: Double): js.Promise[BufferBytesWritten] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double
  ): js.Promise[BufferBytesWritten] = js.native
  def apply(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException, 
      /* written */ Double, 
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
      /* err */ ErrnoException, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, data: js.Any): js.Promise[BufferString] = js.native
  def apply(
    fd: Double,
    data: js.Any,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(fd: Double, data: js.Any, offset: js.UndefOr[scala.Nothing], encoding: String): js.Promise[BufferString] = js.native
  def apply(fd: Double, data: js.Any, offset: Double): js.Promise[BufferString] = js.native
  def apply(
    fd: Double,
    data: js.Any,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(fd: Double, data: js.Any, offset: Double, encoding: String): js.Promise[BufferString] = js.native
  def apply(
    fd: Double,
    data: js.Any,
    offset: Double,
    encoding: String,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
}
