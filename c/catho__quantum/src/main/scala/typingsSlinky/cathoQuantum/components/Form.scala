package typingsSlinky.cathoQuantum.components

import org.scalablytyped.runtime.StringDictionary
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.AnonValid
import typingsSlinky.cathoQuantum.formMod.FormProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Form {
  @JSImport("@catho/quantum/Form", "Form")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.cathoQuantum.formMod.Form] {
    @scala.inline
    def noValidate(value: Boolean): this.type = set("noValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def onSubmit(value: /* hasValid */ js.UndefOr[AnonValid] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def onValidSubmit(value: /* values */ js.UndefOr[StringDictionary[js.UndefOr[String]]] => Unit): this.type = set("onValidSubmit", js.Any.fromFunction1(value))
  }
  
  def withProps(p: FormProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Form.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

