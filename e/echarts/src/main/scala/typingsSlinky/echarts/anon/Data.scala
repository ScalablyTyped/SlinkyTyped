package typingsSlinky.echarts.anon

import typingsSlinky.echarts.echarts.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends js.Object {
  
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
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataUint8Array(value: js.typedarray.Uint8Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataInt16Array(value: js.typedarray.Int16Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataInt8Array(value: js.typedarray.Int8Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFloat32Array(value: js.typedarray.Float32Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataInt32Array(value: js.typedarray.Int32Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFloat64Array(value: js.typedarray.Float64Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUint16Array(value: js.typedarray.Uint16Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[_] | TypedArray): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUint32Array(value: js.typedarray.Uint32Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setSeriesIndex(value: String): Self = this.set("seriesIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesIndex: Self = this.set("seriesIndex", js.undefined)
  }
}
