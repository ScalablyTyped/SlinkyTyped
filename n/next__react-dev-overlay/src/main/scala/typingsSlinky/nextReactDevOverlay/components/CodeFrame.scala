package typingsSlinky.nextReactDevOverlay.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nextReactDevOverlay.codeFrameCodeFrameMod.CodeFrameProps
import typingsSlinky.stacktraceParser.mod.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeFrame {
  
  @scala.inline
  def apply(codeFrame: String, stackFrame: StackFrame): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(codeFrame = codeFrame.asInstanceOf[js.Any], stackFrame = stackFrame.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[CodeFrameProps]))
  }
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/CodeFrame", "CodeFrame")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CodeFrameProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
