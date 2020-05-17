package typingsSlinky.cathoQuantum.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.ColorsSpacing
import typingsSlinky.cathoQuantum.radioGroupMod.RadioProps
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Radio {
  @JSImport("@catho/quantum/RadioGroup", "default.Radio")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def theme(value: ColorsSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: String): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RadioProps]))
  }
}

