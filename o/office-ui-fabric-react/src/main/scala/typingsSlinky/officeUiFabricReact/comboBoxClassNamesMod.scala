package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.anon.PartialIComboBoxOptionSty
import typingsSlinky.officeUiFabricReact.anon.PartialIComboBoxStyles
import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBoxClassNames
import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBoxOptionClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/ComboBox/ComboBox.classNames", JSImport.Namespace)
@js.native
object comboBoxClassNamesMod extends js.Object {
  
  def getClassNames(
    styles: PartialIComboBoxStyles,
    className: String,
    isOpen: Boolean,
    disabled: Boolean,
    required: Boolean,
    focused: Boolean,
    allowFreeForm: Boolean,
    hasErrorMessage: Boolean
  ): IComboBoxClassNames = js.native
  
  def getComboBoxOptionClassNames(styles: PartialIComboBoxOptionSty): IComboBoxOptionClassNames = js.native
}
