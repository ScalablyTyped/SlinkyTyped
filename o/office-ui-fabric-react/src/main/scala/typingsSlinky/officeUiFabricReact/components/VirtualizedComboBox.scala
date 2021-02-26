package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBoxOption
import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VirtualizedComboBox {
  
  @scala.inline
  def apply(options: js.Array[IComboBoxOption]): SharedBuilder_IComboBoxProps467733828[typingsSlinky.officeUiFabricReact.mod.VirtualizedComboBox] = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new SharedBuilder_IComboBoxProps467733828[typingsSlinky.officeUiFabricReact.mod.VirtualizedComboBox](js.Array(this.component, __props.asInstanceOf[IComboBoxProps]))
  }
  
  @JSImport("office-ui-fabric-react", "VirtualizedComboBox")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IComboBoxProps): SharedBuilder_IComboBoxProps467733828[typingsSlinky.officeUiFabricReact.mod.VirtualizedComboBox] = new SharedBuilder_IComboBoxProps467733828[typingsSlinky.officeUiFabricReact.mod.VirtualizedComboBox](js.Array(this.component, p.asInstanceOf[js.Any]))
}
