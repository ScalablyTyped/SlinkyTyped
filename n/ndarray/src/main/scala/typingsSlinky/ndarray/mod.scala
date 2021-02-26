package typingsSlinky.ndarray

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  def apply[T](data: Data[T]): typingsSlinky.ndarray.mod.ndarray[T] = js.native
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  def apply[T](data: Data[T], shape: js.UndefOr[scala.Nothing], stride: js.UndefOr[scala.Nothing], offset: Double): typingsSlinky.ndarray.mod.ndarray[T] = js.native
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  def apply[T](data: Data[T], shape: js.UndefOr[scala.Nothing], stride: js.Array[Double]): typingsSlinky.ndarray.mod.ndarray[T] = js.native
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  def apply[T](data: Data[T], shape: js.UndefOr[scala.Nothing], stride: js.Array[Double], offset: Double): typingsSlinky.ndarray.mod.ndarray[T] = js.native
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  def apply[T](data: Data[T], shape: js.Array[Double]): typingsSlinky.ndarray.mod.ndarray[T] = js.native
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  def apply[T](data: Data[T], shape: js.Array[Double], stride: js.UndefOr[scala.Nothing], offset: Double): typingsSlinky.ndarray.mod.ndarray[T] = js.native
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  def apply[T](data: Data[T], shape: js.Array[Double], stride: js.Array[Double]): typingsSlinky.ndarray.mod.ndarray[T] = js.native
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  def apply[T](data: Data[T], shape: js.Array[Double], stride: js.Array[Double], offset: Double): typingsSlinky.ndarray.mod.ndarray[T] = js.native
  
  type Data[T] = js.Array[T] | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.Uint8ClampedArray
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ndarray.ndarrayStrings.int8
    - typingsSlinky.ndarray.ndarrayStrings.int16
    - typingsSlinky.ndarray.ndarrayStrings.int32
    - typingsSlinky.ndarray.ndarrayStrings.uint8
    - typingsSlinky.ndarray.ndarrayStrings.uint16
    - typingsSlinky.ndarray.ndarrayStrings.uint32
    - typingsSlinky.ndarray.ndarrayStrings.float32
    - typingsSlinky.ndarray.ndarrayStrings.float64
    - typingsSlinky.ndarray.ndarrayStrings.array
    - typingsSlinky.ndarray.ndarrayStrings.uint8_clamped
    - typingsSlinky.ndarray.ndarrayStrings.buffer
    - typingsSlinky.ndarray.ndarrayStrings.generic
  */
  trait DataType extends StObject
  object DataType {
    
    @scala.inline
    def array: typingsSlinky.ndarray.ndarrayStrings.array = "array".asInstanceOf[typingsSlinky.ndarray.ndarrayStrings.array]
    
    @scala.inline
    def buffer: typingsSlinky.ndarray.ndarrayStrings.buffer = "buffer".asInstanceOf[typingsSlinky.ndarray.ndarrayStrings.buffer]
    
    @scala.inline
    def float32: typingsSlinky.ndarray.ndarrayStrings.float32 = "float32".asInstanceOf[typingsSlinky.ndarray.ndarrayStrings.float32]
    
    @scala.inline
    def float64: typingsSlinky.ndarray.ndarrayStrings.float64 = "float64".asInstanceOf[typingsSlinky.ndarray.ndarrayStrings.float64]
    
    @scala.inline
    def generic: typingsSlinky.ndarray.ndarrayStrings.generic = "generic".asInstanceOf[typingsSlinky.ndarray.ndarrayStrings.generic]
    
    @scala.inline
    def int16: typingsSlinky.ndarray.ndarrayStrings.int16 = "int16".asInstanceOf[typingsSlinky.ndarray.ndarrayStrings.int16]
    
    @scala.inline
    def int32: typingsSlinky.ndarray.ndarrayStrings.int32 = "int32".asInstanceOf[typingsSlinky.ndarray.ndarrayStrings.int32]
    
    @scala.inline
    def int8: typingsSlinky.ndarray.ndarrayStrings.int8 = "int8".asInstanceOf[typingsSlinky.ndarray.ndarrayStrings.int8]
    
    @scala.inline
    def uint16: typingsSlinky.ndarray.ndarrayStrings.uint16 = "uint16".asInstanceOf[typingsSlinky.ndarray.ndarrayStrings.uint16]
    
    @scala.inline
    def uint32: typingsSlinky.ndarray.ndarrayStrings.uint32 = "uint32".asInstanceOf[typingsSlinky.ndarray.ndarrayStrings.uint32]
    
    @scala.inline
    def uint8: typingsSlinky.ndarray.ndarrayStrings.uint8 = "uint8".asInstanceOf[typingsSlinky.ndarray.ndarrayStrings.uint8]
    
    @scala.inline
    def uint8_clamped: typingsSlinky.ndarray.ndarrayStrings.uint8_clamped = "uint8_clamped".asInstanceOf[typingsSlinky.ndarray.ndarrayStrings.uint8_clamped]
  }
  
  @js.native
  trait ndarray[T] extends StObject {
    
    var T: typingsSlinky.ndarray.mod.ndarray[T] = js.native
    
    var data: Data[T] = js.native
    
    var dimension: Double = js.native
    
    var dtype: DataType = js.native
    
    def get(args: Double*): T = js.native
    
    def hi(args: Double*): typingsSlinky.ndarray.mod.ndarray[T] = js.native
    
    def index(args: Double*): T = js.native
    
    def lo(args: Double*): typingsSlinky.ndarray.mod.ndarray[T] = js.native
    
    var offset: Double = js.native
    
    var order: js.Array[Double] = js.native
    
    def pick(args: (Double | Null)*): typingsSlinky.ndarray.mod.ndarray[T] = js.native
    
    def reshape(shapes: Double*): typingsSlinky.ndarray.mod.ndarray[T] = js.native
    
    def set(args: Double*): T = js.native
    
    var shape: js.Array[Double] = js.native
    
    var size: Double = js.native
    
    def step(args: Double*): typingsSlinky.ndarray.mod.ndarray[T] = js.native
    
    var stride: js.Array[Double] = js.native
    
    def transpose(args: Double*): typingsSlinky.ndarray.mod.ndarray[T] = js.native
  }
  object ndarray {
    
    @scala.inline
    def apply[T](
      T: typingsSlinky.ndarray.mod.ndarray[T],
      data: Data[T],
      dimension: Double,
      dtype: DataType,
      get: /* repeated */ Double => T,
      hi: /* repeated */ Double => typingsSlinky.ndarray.mod.ndarray[T],
      index: /* repeated */ Double => T,
      lo: /* repeated */ Double => typingsSlinky.ndarray.mod.ndarray[T],
      offset: Double,
      order: js.Array[Double],
      pick: /* repeated */ Double | Null => typingsSlinky.ndarray.mod.ndarray[T],
      reshape: /* repeated */ Double => typingsSlinky.ndarray.mod.ndarray[T],
      set: /* repeated */ Double => T,
      shape: js.Array[Double],
      size: Double,
      step: /* repeated */ Double => typingsSlinky.ndarray.mod.ndarray[T],
      stride: js.Array[Double],
      transpose: /* repeated */ Double => typingsSlinky.ndarray.mod.ndarray[T]
    ): typingsSlinky.ndarray.mod.ndarray[T] = {
      val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dimension = dimension.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), hi = js.Any.fromFunction1(hi), index = js.Any.fromFunction1(index), lo = js.Any.fromFunction1(lo), offset = offset.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pick = js.Any.fromFunction1(pick), reshape = js.Any.fromFunction1(reshape), set = js.Any.fromFunction1(set), shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], step = js.Any.fromFunction1(step), stride = stride.asInstanceOf[js.Any], transpose = js.Any.fromFunction1(transpose))
      __obj.asInstanceOf[typingsSlinky.ndarray.mod.ndarray[T]]
    }
    
    @scala.inline
    implicit class ndarrayMutableBuilder[Self <: typingsSlinky.ndarray.mod.ndarray[_], T] (val x: Self with typingsSlinky.ndarray.mod.ndarray[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: Data[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDimension(value: Double): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGet(value: /* repeated */ Double => T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHi(value: /* repeated */ Double => typingsSlinky.ndarray.mod.ndarray[T]): Self = StObject.set(x, "hi", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndex(value: /* repeated */ Double => T): Self = StObject.set(x, "index", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLo(value: /* repeated */ Double => typingsSlinky.ndarray.mod.ndarray[T]): Self = StObject.set(x, "lo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: js.Array[Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderVarargs(value: Double*): Self = StObject.set(x, "order", js.Array(value :_*))
      
      @scala.inline
      def setPick(value: /* repeated */ Double | Null => typingsSlinky.ndarray.mod.ndarray[T]): Self = StObject.set(x, "pick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReshape(value: /* repeated */ Double => typingsSlinky.ndarray.mod.ndarray[T]): Self = StObject.set(x, "reshape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: /* repeated */ Double => T): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStep(value: /* repeated */ Double => typingsSlinky.ndarray.mod.ndarray[T]): Self = StObject.set(x, "step", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStride(value: js.Array[Double]): Self = StObject.set(x, "stride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrideVarargs(value: Double*): Self = StObject.set(x, "stride", js.Array(value :_*))
      
      @scala.inline
      def setT(value: typingsSlinky.ndarray.mod.ndarray[T]): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranspose(value: /* repeated */ Double => typingsSlinky.ndarray.mod.ndarray[T]): Self = StObject.set(x, "transpose", js.Any.fromFunction1(value))
    }
  }
}
