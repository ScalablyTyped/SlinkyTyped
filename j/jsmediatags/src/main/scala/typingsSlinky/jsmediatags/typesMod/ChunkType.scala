package typingsSlinky.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChunkType extends StObject {
  
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
  implicit class ChunkTypeMutableBuilder[Self <: ChunkType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: DataType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
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
    def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
