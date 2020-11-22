package typingsSlinky.reactAutosizeTextarea.components

import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsSlinky.reactAutosizeTextarea.anon.PickHTMLPropsHTMLTextArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextareaAutosize {
  
  @JSImport("react-autosize-textarea/lib/TextareaAutosize", "TextareaAutosize")
  @js.native
  object component extends js.Object
  
  def withProps(p: PickHTMLPropsHTMLTextArea): SharedBuilder_PickHTMLPropsHTMLTextArea_1161398555[HTMLTextAreaElement] = new SharedBuilder_PickHTMLPropsHTMLTextArea_1161398555[HTMLTextAreaElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TextareaAutosize.type): SharedBuilder_PickHTMLPropsHTMLTextArea_1161398555[HTMLTextAreaElement] = new SharedBuilder_PickHTMLPropsHTMLTextArea_1161398555[HTMLTextAreaElement](js.Array(this.component, js.Dictionary.empty))()
}
