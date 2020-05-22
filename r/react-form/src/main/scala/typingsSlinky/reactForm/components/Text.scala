package typingsSlinky.reactForm.components

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.reactForm.mod.FieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Text {
  @JSImport("react-form", "Text")
  @js.native
  object component extends js.Object
  
  def withProps(p: FieldProps with InputHTMLAttributes[HTMLInputElement]): SharedBuilder_FieldPropsInputHTMLAttributes_1924190813 = new SharedBuilder_FieldPropsInputHTMLAttributes_1924190813(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Text.type): SharedBuilder_FieldPropsInputHTMLAttributes_1924190813 = new SharedBuilder_FieldPropsInputHTMLAttributes_1924190813(js.Array(this.component, js.Dictionary.empty))()
}

