package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buffer extends js.Object {
  
  var buffer: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Float32Array | js.typedarray.Float64Array = js.native
  
  var childTileMask: js.UndefOr[Double] = js.native
  
  var createdByUpsampling: js.UndefOr[Boolean] = js.native
  
  var height: Double = js.native
  
  var structure: js.UndefOr[js.Any] = js.native
  
  var structureelementMultiplier: js.UndefOr[Double] = js.native
  
  var structureelementsPerHeight: js.UndefOr[Double] = js.native
  
  var structureheightOffset: js.UndefOr[Double] = js.native
  
  var structureheightScale: js.UndefOr[Double] = js.native
  
  var structureisBigEndian: js.UndefOr[Boolean] = js.native
  
  var structurestride: js.UndefOr[Double] = js.native
  
  var width: Double = js.native
}
object Buffer {
  
  @scala.inline
  def apply(
    buffer: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Float32Array | js.typedarray.Float64Array,
    height: Double,
    width: Double
  ): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  @scala.inline
  implicit class BufferOps[Self <: Buffer] (val x: Self) extends AnyVal {
    
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
    def setBufferFloat64Array(value: js.typedarray.Float64Array): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferInt8Array(value: js.typedarray.Int8Array): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUint16Array(value: js.typedarray.Uint16Array): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUint8Array(value: js.typedarray.Uint8Array): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferInt16Array(value: js.typedarray.Int16Array): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferFloat32Array(value: js.typedarray.Float32Array): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer(
      value: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Float32Array | js.typedarray.Float64Array
    ): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildTileMask(value: Double): Self = this.set("childTileMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildTileMask: Self = this.set("childTileMask", js.undefined)
    
    @scala.inline
    def setCreatedByUpsampling(value: Boolean): Self = this.set("createdByUpsampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedByUpsampling: Self = this.set("createdByUpsampling", js.undefined)
    
    @scala.inline
    def setStructure(value: js.Any): Self = this.set("structure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructure: Self = this.set("structure", js.undefined)
    
    @scala.inline
    def setStructureelementMultiplier(value: Double): Self = this.set("structureelementMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructureelementMultiplier: Self = this.set("structureelementMultiplier", js.undefined)
    
    @scala.inline
    def setStructureelementsPerHeight(value: Double): Self = this.set("structureelementsPerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructureelementsPerHeight: Self = this.set("structureelementsPerHeight", js.undefined)
    
    @scala.inline
    def setStructureheightOffset(value: Double): Self = this.set("structureheightOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructureheightOffset: Self = this.set("structureheightOffset", js.undefined)
    
    @scala.inline
    def setStructureheightScale(value: Double): Self = this.set("structureheightScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructureheightScale: Self = this.set("structureheightScale", js.undefined)
    
    @scala.inline
    def setStructureisBigEndian(value: Boolean): Self = this.set("structureisBigEndian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructureisBigEndian: Self = this.set("structureisBigEndian", js.undefined)
    
    @scala.inline
    def setStructurestride(value: Double): Self = this.set("structurestride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructurestride: Self = this.set("structurestride", js.undefined)
  }
}
