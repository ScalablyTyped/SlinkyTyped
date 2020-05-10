package typingsSlinky.reactForm.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactText
import typingsSlinky.reactForm.FieldPropschildrenpropsFi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioGroup {
  @JSImport("react-form", "RadioGroup")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactForm.mod.RadioGroup] {
    @scala.inline
    def errorBefore(value: Boolean): this.type = set("errorBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def field(value: String | (js.Array[js.Array[ReactText] | ReactText | String])): this.type = set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def isForm(value: Boolean): this.type = set("isForm", value.asInstanceOf[js.Any])
    @scala.inline
    def showErrors(value: Boolean): this.type = set("showErrors", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FieldPropschildrenpropsFi): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RadioGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

