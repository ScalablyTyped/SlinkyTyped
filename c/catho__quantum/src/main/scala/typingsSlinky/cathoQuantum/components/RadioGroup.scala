package typingsSlinky.cathoQuantum.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.ColorsSpacing
import typingsSlinky.cathoQuantum.anon.Disabled
import typingsSlinky.cathoQuantum.cathoQuantumStrings.button
import typingsSlinky.cathoQuantum.cathoQuantumStrings.radio
import typingsSlinky.cathoQuantum.radioGroupMod.RadioGroupProps
import typingsSlinky.cathoQuantum.radioGroupMod.default
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioGroup {
  @JSImport("@catho/quantum/RadioGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def options(value: js.Array[Disabled]): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ColorsSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: radio | button): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RadioGroupProps]))
  }
}

