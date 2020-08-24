package typingsSlinky.cathoQuantum.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.BaseFontSizeColors
import typingsSlinky.cathoQuantum.anon.MaxLength
import typingsSlinky.cathoQuantum.anon.MinLength
import typingsSlinky.cathoQuantum.anon.Value
import typingsSlinky.cathoQuantum.anon.ValueString
import typingsSlinky.cathoQuantum.cathoQuantumStrings.email
import typingsSlinky.cathoQuantum.cathoQuantumStrings.number
import typingsSlinky.cathoQuantum.cathoQuantumStrings.password
import typingsSlinky.cathoQuantum.cathoQuantumStrings.search
import typingsSlinky.cathoQuantum.cathoQuantumStrings.tel
import typingsSlinky.cathoQuantum.cathoQuantumStrings.text
import typingsSlinky.cathoQuantum.inputMod.CustomValidate
import typingsSlinky.cathoQuantum.inputMod.InputProps
import typingsSlinky.cathoQuantum.inputMod.Mask
import typingsSlinky.cathoQuantum.inputMod.Validate
import typingsSlinky.cathoQuantum.inputMod.default
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Input {
  @JSImport("@catho/quantum/Input", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def descriptionLabel(value: String): this.type = set("descriptionLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def helperText(value: String): this.type = set("helperText", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def maskVarargs(value: Mask*): this.type = set("mask", js.Array(value :_*))
    @scala.inline
    def maskFunction1(value: /* rawValue */ String => js.Array[String]): this.type = set("mask", js.Any.fromFunction1(value))
    @scala.inline
    def maskRegExp(value: js.RegExp): this.type = set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def mask(value: Mask | js.Array[Mask]): this.type = set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def maxLength(value: Double | String): this.type = set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def minLength(value: Double | String): this.type = set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onClean(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onClean", js.Any.fromFunction1(value))
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: BaseFontSizeColors): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: email | text | tel | number | password | search): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def validateVarargs(value: (Validate | CustomValidate)*): this.type = set("validate", js.Array(value :_*))
    @scala.inline
    def validateFunction2(value: (/* params */ Value, /* cpf */ js.UndefOr[String]) => String): this.type = set("validate", js.Any.fromFunction2(value))
    @scala.inline
    def validateFunction1(
      value: js.UndefOr[
          (/* params */ MaxLength) | (/* params */ MinLength) | (/* params */ Value) | ValueString
        ] => String
    ): this.type = set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def validate(value: Validate | CustomValidate | (js.Array[Validate | CustomValidate])): this.type = set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Input.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

