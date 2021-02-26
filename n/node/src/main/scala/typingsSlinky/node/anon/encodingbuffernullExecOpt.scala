package typingsSlinky.node.anon

import typingsSlinky.node.nodeStrings.buffer_
import typingsSlinky.node.processMod.global.NodeJS.ProcessEnv
import typingsSlinky.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  encoding :'buffer' | null} & node.child_process.ExecOptions */
@js.native
trait encodingbuffernullExecOpt extends StObject {
  
  var cwd: js.UndefOr[String] = js.native
  
  var encoding: buffer_ | Null = js.native
  
  var env: js.UndefOr[ProcessEnv] = js.native
  
  var gid: js.UndefOr[Double] = js.native
  
  var killSignal: js.UndefOr[Signals | Double] = js.native
  
  var maxBuffer: js.UndefOr[Double] = js.native
  
  var shell: js.UndefOr[String] = js.native
  
  /**
    * @default 0
    */
  var timeout: js.UndefOr[Double] = js.native
  
  var uid: js.UndefOr[Double] = js.native
  
  /**
    * @default true
    */
  var windowsHide: js.UndefOr[Boolean] = js.native
}
object encodingbuffernullExecOpt {
  
  @scala.inline
  def apply(): encodingbuffernullExecOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[encodingbuffernullExecOpt]
  }
  
  @scala.inline
  implicit class encodingbuffernullExecOptMutableBuilder[Self <: encodingbuffernullExecOpt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    @scala.inline
    def setEncoding(value: buffer_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
    
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
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    @scala.inline
    def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
  }
}
