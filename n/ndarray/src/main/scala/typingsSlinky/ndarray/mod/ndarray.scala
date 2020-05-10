package typingsSlinky.ndarray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ndarray[T] extends js.Object {
  var T: ndarray[T] = js.native
  var data: Data[T] = js.native
  var dimension: Double = js.native
  var dtype: DataType = js.native
  var offset: Double = js.native
  var order: js.Array[Double] = js.native
  var shape: js.Array[Double] = js.native
  var size: Double = js.native
  var stride: js.Array[Double] = js.native
  def get(args: Double*): T = js.native
  def hi(args: Double*): ndarray[T] = js.native
  def index(args: Double*): T = js.native
  def lo(args: Double*): ndarray[T] = js.native
  def pick(args: (Double | Null)*): ndarray[T] = js.native
  def reshape(shapes: Double*): ndarray[T] = js.native
  def set(args: Double*): T = js.native
  def step(args: Double*): ndarray[T] = js.native
  def transpose(args: Double*): ndarray[T] = js.native
}

object ndarray {
  @scala.inline
  def apply[T](
    T: ndarray[T],
    data: Data[T],
    dimension: Double,
    dtype: DataType,
    get: /* repeated */ Double => T,
    hi: /* repeated */ Double => ndarray[T],
    index: /* repeated */ Double => T,
    lo: /* repeated */ Double => ndarray[T],
    offset: Double,
    order: js.Array[Double],
    pick: /* repeated */ Double | Null => ndarray[T],
    reshape: /* repeated */ Double => ndarray[T],
    set: /* repeated */ Double => T,
    shape: js.Array[Double],
    size: Double,
    step: /* repeated */ Double => ndarray[T],
    stride: js.Array[Double],
    transpose: /* repeated */ Double => ndarray[T]
  ): ndarray[T] = {
    val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dimension = dimension.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), hi = js.Any.fromFunction1(hi), index = js.Any.fromFunction1(index), lo = js.Any.fromFunction1(lo), offset = offset.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pick = js.Any.fromFunction1(pick), reshape = js.Any.fromFunction1(reshape), set = js.Any.fromFunction1(set), shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], step = js.Any.fromFunction1(step), stride = stride.asInstanceOf[js.Any], transpose = js.Any.fromFunction1(transpose))
    __obj.asInstanceOf[ndarray[T]]
  }
  @scala.inline
  implicit class ndarrayOps[Self[t] <: ndarray[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withT(value: ndarray[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("T")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataInt8Array(value: js.typedarray.Int8Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataUint16Array(value: js.typedarray.Uint16Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFloat64Array(value: js.typedarray.Float64Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataUint8Array(value: js.typedarray.Uint8Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataInt32Array(value: js.typedarray.Int32Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFloat32Array(value: js.typedarray.Float32Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataUint32Array(value: js.typedarray.Uint32Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: Data[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataInt16Array(value: js.typedarray.Int16Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimension(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDtype(value: DataType): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: /* repeated */ Double => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHi(value: /* repeated */ Double => ndarray[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hi")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndex(value: /* repeated */ Double => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLo(value: /* repeated */ Double => ndarray[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPick(value: /* repeated */ Double | Null => ndarray[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReshape(value: /* repeated */ Double => ndarray[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reshape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: /* repeated */ Double => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShape(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: /* repeated */ Double => ndarray[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStride(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranspose(value: /* repeated */ Double => ndarray[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpose")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

