package typingsSlinky.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChunkType extends js.Object {
  
  var data: DataType = js.native
  
  var offset: Double = js.native
}
object ChunkType {
  
  @scala.inline
  def apply(data: DataType, offset: Double): ChunkType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkType]
  }
  
  @scala.inline
  implicit class ChunkTypeOps[Self <: ChunkType] (val x: Self) extends AnyVal {
    
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
    def setData(value: DataType): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUint32Array(value: js.typedarray.Uint32Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Double*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
  }
}
