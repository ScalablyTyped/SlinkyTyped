package typingsSlinky.officeUiFabricReact.indexBundleMod

import typingsSlinky.officeUiFabricReact.anon.ReadonlyICheckboxProps
import typingsSlinky.officeUiFabricReact.anon.ReadonlyICheckboxState
import typingsSlinky.officeUiFabricReact.checkboxBaseMod.ICheckboxState
import typingsSlinky.officeUiFabricReact.checkboxTypesMod.ICheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "CheckboxBase")
@js.native
class CheckboxBase protected ()
  extends typingsSlinky.officeUiFabricReact.mod.CheckboxBase {
  /**
    * Initialize a new instance of the Checkbox
    * @param props - Props for the component
    * @param context - Context or initial state for the base component.
    */
  def this(props: ICheckboxProps) = this()
  def this(props: ICheckboxProps, context: js.Any) = this()
}
/* static members */
@JSImport("office-ui-fabric-react/lib/index.bundle", "CheckboxBase")
@js.native
object CheckboxBase extends js.Object {
  
  var defaultProps: ICheckboxProps = js.native
  
  def getDerivedStateFromProps(nextProps: ReadonlyICheckboxProps, prevState: ReadonlyICheckboxState): ICheckboxState | Null = js.native
}
