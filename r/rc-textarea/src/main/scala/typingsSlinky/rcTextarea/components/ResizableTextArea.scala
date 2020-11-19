package typingsSlinky.rcTextarea.components

import typingsSlinky.rcTextarea.mod.TextAreaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResizableTextArea {
  
  @JSImport("rc-textarea", "ResizableTextArea")
  @js.native
  object component extends js.Object
  
  def withProps(p: TextAreaProps): SharedBuilder_TextAreaProps_1237784874[typingsSlinky.rcTextarea.mod.ResizableTextArea] = new SharedBuilder_TextAreaProps_1237784874[typingsSlinky.rcTextarea.mod.ResizableTextArea](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ResizableTextArea.type): SharedBuilder_TextAreaProps_1237784874[typingsSlinky.rcTextarea.mod.ResizableTextArea] = new SharedBuilder_TextAreaProps_1237784874[typingsSlinky.rcTextarea.mod.ResizableTextArea](js.Array(this.component, js.Dictionary.empty))()
}
