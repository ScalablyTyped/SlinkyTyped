package typingsSlinky.rcTextarea.components

import typingsSlinky.rcTextarea.mod.TextAreaProps
import typingsSlinky.rcTextarea.resizableTextAreaMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResizableTextArea {
  @JSImport("rc-textarea/es/ResizableTextArea", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TextAreaProps): SharedBuilder_TextAreaProps_1237784874[default] = new SharedBuilder_TextAreaProps_1237784874[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ResizableTextArea.type): SharedBuilder_TextAreaProps_1237784874[default] = new SharedBuilder_TextAreaProps_1237784874[default](js.Array(this.component, js.Dictionary.empty))()
}

