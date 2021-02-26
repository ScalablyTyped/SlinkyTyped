package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.ReadonlyICheckboxProps
import typingsSlinky.officeUiFabricReact.anon.ReadonlyICheckboxState
import typingsSlinky.officeUiFabricReact.checkboxBaseMod.ICheckboxState
import typingsSlinky.officeUiFabricReact.checkboxTypesMod.ICheckboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCheckboxMod {
  
  @JSImport("office-ui-fabric-react/lib/Checkbox", "Checkbox")
  @js.native
  val Checkbox: ReactComponentClass[ICheckboxProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Checkbox", "CheckboxBase")
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
  object CheckboxBase {
    
    @JSImport("office-ui-fabric-react/lib/Checkbox", "CheckboxBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Checkbox", "CheckboxBase.defaultProps")
    @js.native
    def defaultProps: ICheckboxProps = js.native
    @scala.inline
    def defaultProps_=(x: ICheckboxProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/Checkbox", "CheckboxBase.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: ReadonlyICheckboxProps, prevState: ReadonlyICheckboxState): ICheckboxState | Null = js.native
  }
}
