package typingsSlinky.reactForm.components

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.reactForm.mod.FieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Checkbox {
  @JSImport("react-form", "Checkbox")
  @js.native
  object component extends js.Object
  
  def withProps(p: FieldProps with InputHTMLAttributes[HTMLInputElement]): `SharedBuilder_<intersection>_1924190813` = new `SharedBuilder_<intersection>_1924190813`(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Checkbox.type): `SharedBuilder_<intersection>_1924190813` = new `SharedBuilder_<intersection>_1924190813`(js.Array(this.component, js.Dictionary.empty))()
}

