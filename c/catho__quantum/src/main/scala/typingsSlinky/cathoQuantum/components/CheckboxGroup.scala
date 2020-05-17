package typingsSlinky.cathoQuantum.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.ColorsSpacing
import typingsSlinky.cathoQuantum.cathoQuantumStrings.button
import typingsSlinky.cathoQuantum.cathoQuantumStrings.checkbox
import typingsSlinky.cathoQuantum.checkboxMod.CheckboxGroupProps
import typingsSlinky.cathoQuantum.checkboxMod.Options
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CheckboxGroup {
  @JSImport("@catho/quantum/Checkbox", "CheckboxGroup")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.cathoQuantum.checkboxMod.CheckboxGroup] {
    @scala.inline
    def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(
      value: (/* items */ js.UndefOr[Options], /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def options(value: Options): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ColorsSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CheckboxGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(`type`: checkbox | button): Builder = {
    val __props = js.Dynamic.literal()
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CheckboxGroupProps]))
  }
}

