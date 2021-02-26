package typingsSlinky.distributionsPoissonQuantile

import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypefloat32
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypefloat64undefi
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypeint16
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypeint32
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypeint8
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypeuint16
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypeuint32
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypeuint8
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypeuint8clamped
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypeundefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: js.Array[Double], options: Optionsdtypeundefined): js.Array[Double] = js.native
  /**
    * Evaluates the quantile function for a Poisson distribution.
    * @param p input value
    * @param options function options
    * @returns quantile function value(s)
    */
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: Double): Double | Data | Matrix = js.native
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: Double, options: Options): Double | Data | Matrix = js.native
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: Data): Double | Data | Matrix = js.native
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: Data, options: Optionsdtypefloat32): js.typedarray.Float32Array = js.native
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: Data, options: Optionsdtypefloat64undefi): js.typedarray.Float64Array = js.native
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: Data, options: Optionsdtypeint16): js.typedarray.Int16Array = js.native
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: Data, options: Optionsdtypeint32): js.typedarray.Int32Array = js.native
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: Data, options: Optionsdtypeint8): js.typedarray.Int8Array = js.native
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: Data, options: Optionsdtypeuint16): js.typedarray.Uint16Array = js.native
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: Data, options: Optionsdtypeuint32): js.typedarray.Uint32Array = js.native
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: Data, options: Optionsdtypeuint8): js.typedarray.Uint8Array = js.native
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: Data, options: Optionsdtypeuint8clamped): js.typedarray.Uint8ClampedArray = js.native
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: Data, options: Options): Double | Data | Matrix = js.native
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: MatrixLike): Double | Data | Matrix = js.native
  @JSImport("distributions-poisson-quantile", JSImport.Namespace)
  @js.native
  def apply(p: MatrixLike, options: Options): Double | Data | Matrix = js.native
  
  type Data = js.Array[Double] | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int8
    - typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint8
    - typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint8_clamped
    - typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int16
    - typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint16
    - typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int32
    - typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint32
    - typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.float32
    - typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.float64
  */
  trait DataType extends StObject
  object DataType {
    
    @scala.inline
    def float32: typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.float32 = "float32".asInstanceOf[typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.float32]
    
    @scala.inline
    def float64: typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.float64 = "float64".asInstanceOf[typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.float64]
    
    @scala.inline
    def int16: typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int16 = "int16".asInstanceOf[typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int16]
    
    @scala.inline
    def int32: typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int32 = "int32".asInstanceOf[typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int32]
    
    @scala.inline
    def int8: typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int8 = "int8".asInstanceOf[typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int8]
    
    @scala.inline
    def uint16: typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint16 = "uint16".asInstanceOf[typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint16]
    
    @scala.inline
    def uint32: typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint32 = "uint32".asInstanceOf[typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint32]
    
    @scala.inline
    def uint8: typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint8 = "uint8".asInstanceOf[typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint8]
    
    @scala.inline
    def uint8_clamped: typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint8_clamped = "uint8_clamped".asInstanceOf[typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint8_clamped]
  }
  
  // derived from https://github.com/dstructs/matrix
  @js.native
  trait Matrix extends StObject {
    
    val data: Data = js.native
    
    val dtype: DataType = js.native
    
    def get(i: Double, j: Double): Matrix = js.native
    
    def iget(index: Double): Matrix = js.native
    
    def iset(idx: Double, value: Double): Matrix = js.native
    
    val length: Double = js.native
    
    def mget(idx: js.Array[Double]): js.Array[Matrix] = js.native
    def mget(idx: js.Array[Double], cols: js.Array[Double]): js.Array[Matrix] = js.native
    
    def mset(idx: js.Array[Double], colsOrValue: js.Array[Double]): Matrix = js.native
    def mset(idx: js.Array[Double], colsOrValue: js.Array[Double], value: Double): Matrix = js.native
    def mset(idx: js.Array[Double], colsOrValue: js.Array[Double], value: Matrix): Matrix = js.native
    def mset(idx: js.Array[Double], colsOrValue: js.Array[Double], value: MatrixCallback): Matrix = js.native
    def mset(idx: js.Array[Double], colsOrValue: Matrix): Matrix = js.native
    def mset(idx: js.Array[Double], colsOrValue: Matrix, value: Double): Matrix = js.native
    def mset(idx: js.Array[Double], colsOrValue: Matrix, value: Matrix): Matrix = js.native
    def mset(idx: js.Array[Double], colsOrValue: Matrix, value: MatrixCallback): Matrix = js.native
    
    val nbytes: Double = js.native
    
    val ndims: Double = js.native
    
    var offset: Double = js.native
    
    def set(i: Double, j: Double, value: Double): Matrix = js.native
    
    def sget(subsequence: String): Matrix = js.native
    
    val shape: js.Array[Double] = js.native
    
    def sset(subsequence: String, value: Double): Matrix = js.native
    def sset(subsequence: String, value: Matrix): Matrix = js.native
    def sset(subsequence: String, value: MatrixCallback): Matrix = js.native
    
    var strides: js.Array[Double] = js.native
    
    def toJSON(): String = js.native
  }
  
  type MatrixCallback = js.Function4[/* d */ Double, /* i */ Double, /* j */ Double, /* idx */ Double, Double]
  
  // derived from https://github.com/validate-io/matrix-like
  @js.native
  trait MatrixLike extends StObject {
    
    var data: js.Object = js.native
    
    var dtype: String = js.native
    
    var length: Double = js.native
    
    var offset: Double = js.native
    
    var shape: js.Object = js.native
    
    var strides: js.Object = js.native
  }
  object MatrixLike {
    
    @scala.inline
    def apply(
      data: js.Object,
      dtype: String,
      length: Double,
      offset: Double,
      shape: js.Object,
      strides: js.Object
    ): MatrixLike = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatrixLike]
    }
    
    @scala.inline
    implicit class MatrixLikeMutableBuilder[Self <: MatrixLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtype(value: String): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShape(value: js.Object): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrides(value: js.Object): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, _]] = js.native
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.native
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] = js.native
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.native
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.native
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => _): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      @scala.inline
      def setLambda(value: Double): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
}
