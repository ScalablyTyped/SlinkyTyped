package typingsSlinky.exceljs.anon

import typingsSlinky.node.NodeJS.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.stream.xlsx.ZlibOptions> */
@js.native
trait PartialZlibOptions extends StObject {
  
  var chunkSize: js.UndefOr[Double] = js.native
  
  var dictionary: js.UndefOr[js.typedarray.ArrayBuffer | TypedArray | js.typedarray.DataView] = js.native
  
  var finishFlush: js.UndefOr[Double] = js.native
  
  var flush: js.UndefOr[Double] = js.native
  
  var level: js.UndefOr[Double] = js.native
  
  var memLevel: js.UndefOr[Double] = js.native
  
  var strategy: js.UndefOr[Double] = js.native
  
  var windowBits: js.UndefOr[Double] = js.native
}
object PartialZlibOptions {
  
  @scala.inline
  def apply(): PartialZlibOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialZlibOptions]
  }
  
  @scala.inline
  implicit class PartialZlibOptionsMutableBuilder[Self <: PartialZlibOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    @scala.inline
    def setDictionary(value: js.typedarray.ArrayBuffer | TypedArray | js.typedarray.DataView): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryDataView(value: js.typedarray.DataView): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
    
    @scala.inline
    def setFinishFlush(value: Double): Self = StObject.set(x, "finishFlush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishFlushUndefined: Self = StObject.set(x, "finishFlush", js.undefined)
    
    @scala.inline
    def setFlush(value: Double): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMemLevel(value: Double): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemLevelUndefined: Self = StObject.set(x, "memLevel", js.undefined)
    
    @scala.inline
    def setStrategy(value: Double): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    @scala.inline
    def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowBitsUndefined: Self = StObject.set(x, "windowBits", js.undefined)
  }
}
