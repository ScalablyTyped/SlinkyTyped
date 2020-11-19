package typingsSlinky.node.childProcessMod

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.nodeStrings.buffer_
import typingsSlinky.node.processMod.global.NodeJS.Signals
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
  implicit class SpawnSyncOptionsOps[Self <: SpawnSyncOptions] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: BufferEncoding | buffer_): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    
    @scala.inline
    def setInputUint16Array(value: js.typedarray.Uint16Array): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUint32Array(value: js.typedarray.Uint32Array): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUint8Array(value: js.typedarray.Uint8Array): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputInt16Array(value: js.typedarray.Int16Array): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataView(value: js.typedarray.DataView): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: String | ArrayBufferView): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFloat32Array(value: js.typedarray.Float32Array): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFloat64Array(value: js.typedarray.Float64Array): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputInt8Array(value: js.typedarray.Int8Array): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputInt32Array(value: js.typedarray.Int32Array): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setKillSignal(value: Signals | Double): Self = this.set("killSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKillSignal: Self = this.set("killSignal", js.undefined)
    
    @scala.inline
    def setMaxBuffer(value: Double): Self = this.set("maxBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBuffer: Self = this.set("maxBuffer", js.undefined)
  }
}
