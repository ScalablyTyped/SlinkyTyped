package typingsSlinky.nextReactDevOverlay

import typingsSlinky.nextReactDevOverlay.nextReactDevOverlayBooleans.`false`
import typingsSlinky.nextReactDevOverlay.nextReactDevOverlayBooleans.`true`
import typingsSlinky.stacktraceParser.mod.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackFrameMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/helpers/stack-frame", "getFrameSource")
  @js.native
  def getFrameSource(frame: StackFrame): String = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/helpers/stack-frame", "getOriginalStackFrame")
  @js.native
  def getOriginalStackFrame(isServerSide: Boolean, source: StackFrame): js.Promise[OriginalStackFrame] = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/helpers/stack-frame", "getOriginalStackFrames")
  @js.native
  def getOriginalStackFrames(isServerSide: Boolean, frames: js.Array[StackFrame]): js.Promise[js.Array[OriginalStackFrame]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nextReactDevOverlay.anon.Expanded
    - typingsSlinky.nextReactDevOverlay.anon.External
    - typingsSlinky.nextReactDevOverlay.anon.OriginalCodeFrame
  */
  trait OriginalStackFrame extends StObject
  object OriginalStackFrame {
    
    @scala.inline
    def Expanded(
      error: `true`,
      expanded: `false`,
      external: `false`,
      originalCodeFrame: Null,
      originalStackFrame: Null,
      reason: String,
      sourceStackFrame: StackFrame
    ): typingsSlinky.nextReactDevOverlay.anon.Expanded = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], originalCodeFrame = originalCodeFrame.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nextReactDevOverlay.anon.Expanded]
    }
    
    @scala.inline
    def External(
      error: `false`,
      expanded: Boolean,
      external: `false`,
      originalStackFrame: StackFrame,
      reason: Null,
      sourceStackFrame: StackFrame
    ): typingsSlinky.nextReactDevOverlay.anon.External = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nextReactDevOverlay.anon.External]
    }
    
    @scala.inline
    def OriginalCodeFrame(
      error: `false`,
      expanded: `false`,
      external: `true`,
      originalCodeFrame: Null,
      originalStackFrame: Null,
      reason: Null,
      sourceStackFrame: StackFrame
    ): typingsSlinky.nextReactDevOverlay.anon.OriginalCodeFrame = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], originalCodeFrame = originalCodeFrame.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nextReactDevOverlay.anon.OriginalCodeFrame]
    }
  }
}
