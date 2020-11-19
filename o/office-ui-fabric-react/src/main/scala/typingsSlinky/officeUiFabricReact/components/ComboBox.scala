package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBoxOption
import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ComboBox {
  
  @JSImport("office-ui-fabric-react", "ComboBox")
  @js.native
  object component extends js.Object
  
  def withProps(p: IComboBoxProps): SharedBuilder_IComboBoxProps467733828[typingsSlinky.officeUiFabricReact.mod.ComboBox] = new SharedBuilder_IComboBoxProps467733828[typingsSlinky.officeUiFabricReact.mod.ComboBox](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(options: js.Array[IComboBoxOption]): SharedBuilder_IComboBoxProps467733828[typingsSlinky.officeUiFabricReact.mod.ComboBox] = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new SharedBuilder_IComboBoxProps467733828[typingsSlinky.officeUiFabricReact.mod.ComboBox](js.Array(this.component, __props.asInstanceOf[IComboBoxProps]))
  }
}
