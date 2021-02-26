package typingsSlinky.node.childProcessMod

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.nodeStrings.buffer_
import typingsSlinky.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpawnSyncOptions extends CommonSpawnOptions {
  
  var encoding: js.UndefOr[BufferEncoding | buffer_ | Null] = js.native
  
  var input: js.UndefOr[String | ArrayBufferView] = js.native
  
  var killSignal: js.UndefOr[Signals | Double] = js.native
  
  var maxBuffer: js.UndefOr[Double] = js.native
}
object SpawnSyncOptions {
  
  @scala.inline
  def apply(): SpawnSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnSyncOptions]
  }
  
  @scala.inline
  implicit class SpawnSyncOptionsMutableBuilder[Self <: SpawnSyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding | buffer_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setInput(value: String | ArrayBufferView): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataView(value: js.typedarray.DataView): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
    
    @scala.inline
    def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
  }
}
