package typingsSlinky.reactForm.components

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.reactForm.mod.FieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Checkbox {
  
  @JSImport("react-form", "Checkbox")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Checkbox.type): SharedBuilder_FieldPropsInputHTMLAttributes_1924190813 = new SharedBuilder_FieldPropsInputHTMLAttributes_1924190813(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FieldProps with InputHTMLAttributes[HTMLInputElement]): SharedBuilder_FieldPropsInputHTMLAttributes_1924190813 = new SharedBuilder_FieldPropsInputHTMLAttributes_1924190813(js.Array(this.component, p.asInstanceOf[js.Any]))
}
