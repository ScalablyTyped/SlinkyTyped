package typingsSlinky.node.childProcessMod

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.nodeStrings.ignore
import typingsSlinky.node.nodeStrings.inherit
import typingsSlinky.node.nodeStrings.ipc
import typingsSlinky.node.nodeStrings.pipe
import typingsSlinky.node.processMod.global.NodeJS.Signals
import typingsSlinky.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecFileSyncOptions extends CommonOptions {
  
  var encoding: js.UndefOr[BufferEncoding] = js.native
  
  var input: js.UndefOr[String | ArrayBufferView] = js.native
  
  var killSignal: js.UndefOr[Signals | Double] = js.native
  
  var maxBuffer: js.UndefOr[Double] = js.native
  
  var shell: js.UndefOr[Boolean | String] = js.native
  
  var stdio: js.UndefOr[StdioOptions] = js.native
}
object ExecFileSyncOptions {
  
  @scala.inline
  def apply(): ExecFileSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecFileSyncOptions]
  }
  
  @scala.inline
  implicit class ExecFileSyncOptionsMutableBuilder[Self <: ExecFileSyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    
    @scala.inline
    def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    @scala.inline
    def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value :_*))
  }
}
