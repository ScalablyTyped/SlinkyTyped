package typingsSlinky.antd.components

import typingsSlinky.antd.textAreaMod.TextAreaProps
import typingsSlinky.antd.textAreaMod.TextAreaRef
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextArea {
  
  @JSImport("antd/lib/input/TextArea", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TextArea.type): SharedBuilder_TextAreaPropsRefAttributes1467975471[TextAreaRef] = new SharedBuilder_TextAreaPropsRefAttributes1467975471[TextAreaRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextAreaProps with RefAttributes[TextAreaRef]): SharedBuilder_TextAreaPropsRefAttributes1467975471[TextAreaRef] = new SharedBuilder_TextAreaPropsRefAttributes1467975471[TextAreaRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
