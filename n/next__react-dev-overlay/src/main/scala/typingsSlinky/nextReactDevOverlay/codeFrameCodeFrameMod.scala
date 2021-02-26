package typingsSlinky.nextReactDevOverlay

import slinky.core.ReactComponentClass
import typingsSlinky.stacktraceParser.mod.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeFrameCodeFrameMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/CodeFrame/CodeFrame", "CodeFrame")
  @js.native
  val CodeFrame: ReactComponentClass[CodeFrameProps] = js.native
  
  @js.native
  trait CodeFrameProps extends StObject {
    
    var codeFrame: String = js.native
    
    var stackFrame: StackFrame = js.native
  }
  object CodeFrameProps {
    
    @scala.inline
    def apply(codeFrame: String, stackFrame: StackFrame): CodeFrameProps = {
      val __obj = js.Dynamic.literal(codeFrame = codeFrame.asInstanceOf[js.Any], stackFrame = stackFrame.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeFrameProps]
    }
    
    @scala.inline
    implicit class CodeFramePropsMutableBuilder[Self <: CodeFrameProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodeFrame(value: String): Self = StObject.set(x, "codeFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackFrame(value: StackFrame): Self = StObject.set(x, "stackFrame", value.asInstanceOf[js.Any])
    }
  }
}
