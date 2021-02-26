package typingsSlinky.nextReactDevOverlay

import typingsSlinky.stacktraceParser.mod.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeStackFramesMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/helpers/nodeStackFrames", "getFilesystemFrame")
  @js.native
  def getFilesystemFrame(frame: StackFrame): StackFrame = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/helpers/nodeStackFrames", "getNodeError")
  @js.native
  def getNodeError(error: js.Error): js.Error = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/helpers/nodeStackFrames", "isNodeError")
  @js.native
  def isNodeError(error: js.Error): Boolean = js.native
}
