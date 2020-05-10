package typingsSlinky.antd.components

import typingsSlinky.antd.resizableTextAreaMod.default
import typingsSlinky.antd.textAreaMod.TextAreaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResizableTextArea {
  @JSImport("antd/lib/input/ResizableTextArea", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TextAreaProps): SharedBuilder_TextAreaProps261102882[default] = new SharedBuilder_TextAreaProps261102882[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ResizableTextArea.type): SharedBuilder_TextAreaProps261102882[default] = new SharedBuilder_TextAreaProps261102882[default](js.Array(this.component, js.Dictionary.empty))()
}

