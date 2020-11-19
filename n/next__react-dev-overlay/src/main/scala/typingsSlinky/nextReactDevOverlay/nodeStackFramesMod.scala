package typingsSlinky.nextReactDevOverlay

import typingsSlinky.stacktraceParser.mod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@next/react-dev-overlay/lib/internal/helpers/nodeStackFrames", JSImport.Namespace)
@js.native
object nodeStackFramesMod extends js.Object {
  
  def getFilesystemFrame(frame: StackFrame): StackFrame = js.native
  
  def getNodeError(error: js.Error): js.Error = js.native
  
  def isNodeError(error: js.Error): Boolean = js.native
}
