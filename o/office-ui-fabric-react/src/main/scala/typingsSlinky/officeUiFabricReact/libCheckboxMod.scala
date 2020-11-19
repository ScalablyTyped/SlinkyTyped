package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.ReadonlyICheckboxProps
import typingsSlinky.officeUiFabricReact.anon.ReadonlyICheckboxState
import typingsSlinky.officeUiFabricReact.checkboxBaseMod.ICheckboxState
import typingsSlinky.officeUiFabricReact.checkboxTypesMod.ICheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Checkbox", JSImport.Namespace)
@js.native
object libCheckboxMod extends js.Object {
  
  val Checkbox: ReactComponentClass[ICheckboxProps] = js.native
  
  @js.native
  class CheckboxBase protected ()
    extends typingsSlinky.officeUiFabricReact.checkboxMod.CheckboxBase {
    /**
      * Initialize a new instance of the Checkbox
      * @param props - Props for the component
      * @param context - Context or initial state for the base component.
      */
    def this(props: ICheckboxProps) = this()
    def this(props: ICheckboxProps, context: js.Any) = this()
  }
  /* static members */
  @js.native
  object CheckboxBase extends js.Object {
    
    var defaultProps: ICheckboxProps = js.native
    
    def getDerivedStateFromProps(nextProps: ReadonlyICheckboxProps, prevState: ReadonlyICheckboxState): ICheckboxState | Null = js.native
  }
}
