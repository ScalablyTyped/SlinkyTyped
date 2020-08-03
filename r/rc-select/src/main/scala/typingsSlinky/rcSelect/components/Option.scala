package typingsSlinky.rcSelect.components

import typingsSlinky.rcSelect.generatorMod.Key
import typingsSlinky.rcSelect.optionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Option {
  @JSImport("rc-select/lib/Option", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: OptionProps): SharedBuilder_OptionProps961284514 = new SharedBuilder_OptionProps961284514(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: Key): SharedBuilder_OptionProps961284514 = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new SharedBuilder_OptionProps961284514(js.Array(this.component, __props.asInstanceOf[OptionProps]))
  }
}

