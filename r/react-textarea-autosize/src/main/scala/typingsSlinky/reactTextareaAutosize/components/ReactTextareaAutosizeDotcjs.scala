package typingsSlinky.reactTextareaAutosize.components

import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsSlinky.reactTextareaAutosize.anon.PickTextareaPropscolortra
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTextareaAutosizeDotcjs {
  
  @JSImport("react-textarea-autosize/dist/react-textarea-autosize.cjs", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PickTextareaPropscolortra): SharedBuilder_PickTextareaPropscolortra_1829433617[HTMLTextAreaElement] = new SharedBuilder_PickTextareaPropscolortra_1829433617[HTMLTextAreaElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactTextareaAutosizeDotcjs.type): SharedBuilder_PickTextareaPropscolortra_1829433617[HTMLTextAreaElement] = new SharedBuilder_PickTextareaPropscolortra_1829433617[HTMLTextAreaElement](js.Array(this.component, js.Dictionary.empty))()
}
