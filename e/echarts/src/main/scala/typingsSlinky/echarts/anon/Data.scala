package typingsSlinky.echarts.anon

import typingsSlinky.echarts.echarts.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  // The data to be appended.
  var data: js.UndefOr[js.Array[_] | TypedArray] = js.native
  
  // Specify which series the data will be appended to.
  var seriesIndex: js.UndefOr[String] = js.native
}
object Data {
  
  @scala.inline
  def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[_] | TypedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
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
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setSeriesIndex(value: String): Self = StObject.set(x, "seriesIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesIndexUndefined: Self = StObject.set(x, "seriesIndex", js.undefined)
  }
}
