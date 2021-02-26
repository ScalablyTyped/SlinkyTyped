package typingsSlinky.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buffer extends StObject {
  
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
  implicit class BufferMutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(
      value: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Float32Array | js.typedarray.Float64Array
    ): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildTileMask(value: Double): Self = StObject.set(x, "childTileMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildTileMaskUndefined: Self = StObject.set(x, "childTileMask", js.undefined)
    
    @scala.inline
    def setCreatedByUpsampling(value: Boolean): Self = StObject.set(x, "createdByUpsampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUpsamplingUndefined: Self = StObject.set(x, "createdByUpsampling", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructure(value: js.Any): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureUndefined: Self = StObject.set(x, "structure", js.undefined)
    
    @scala.inline
    def setStructureelementMultiplier(value: Double): Self = StObject.set(x, "structureelementMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureelementMultiplierUndefined: Self = StObject.set(x, "structureelementMultiplier", js.undefined)
    
    @scala.inline
    def setStructureelementsPerHeight(value: Double): Self = StObject.set(x, "structureelementsPerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureelementsPerHeightUndefined: Self = StObject.set(x, "structureelementsPerHeight", js.undefined)
    
    @scala.inline
    def setStructureheightOffset(value: Double): Self = StObject.set(x, "structureheightOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureheightOffsetUndefined: Self = StObject.set(x, "structureheightOffset", js.undefined)
    
    @scala.inline
    def setStructureheightScale(value: Double): Self = StObject.set(x, "structureheightScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureheightScaleUndefined: Self = StObject.set(x, "structureheightScale", js.undefined)
    
    @scala.inline
    def setStructureisBigEndian(value: Boolean): Self = StObject.set(x, "structureisBigEndian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureisBigEndianUndefined: Self = StObject.set(x, "structureisBigEndian", js.undefined)
    
    @scala.inline
    def setStructurestride(value: Double): Self = StObject.set(x, "structurestride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructurestrideUndefined: Self = StObject.set(x, "structurestride", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
