package typingsSlinky.rcSelect.components

import typingsSlinky.rcSelect.generatorMod.Key
import typingsSlinky.rcSelect.optionMod.OptionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Option {
  
  @scala.inline
  def apply(value: Key): SharedBuilder_OptionProps961284514 = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new SharedBuilder_OptionProps961284514(js.Array(this.component, __props.asInstanceOf[OptionProps]))
  }
  
  @JSImport("rc-select", "Option")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OptionProps): SharedBuilder_OptionProps961284514 = new SharedBuilder_OptionProps961284514(js.Array(this.component, p.asInstanceOf[js.Any]))
}
