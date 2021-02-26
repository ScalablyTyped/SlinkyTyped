package typingsSlinky.node.childProcessMod

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.nodeStrings.buffer_
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
trait ExecSyncOptions extends CommonOptions {
  
  var encoding: js.UndefOr[BufferEncoding | buffer_ | Null] = js.native
  
  var input: js.UndefOr[String | js.typedarray.Uint8Array] = js.native
  
  var killSignal: js.UndefOr[Signals | Double] = js.native
  
  var maxBuffer: js.UndefOr[Double] = js.native
  
  var shell: js.UndefOr[String] = js.native
  
  var stdio: js.UndefOr[StdioOptions] = js.native
}
object ExecSyncOptions {
  
  @scala.inline
  def apply(): ExecSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecSyncOptions]
  }
  
  @scala.inline
  implicit class ExecSyncOptionsMutableBuilder[Self <: ExecSyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding | buffer_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setInput(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
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
    def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
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
