package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod.DefaultProps
import typingsSlinky.officeUiFabricReact.spinButtonTypesMod.ISpinButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/SpinButton", JSImport.Namespace)
@js.native
object libSpinButtonMod extends js.Object {
  
  @js.native
  object KeyboardSpinDirection extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection with Double
      ] = js.native
    
    /* -1 */ val down: typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.down with Double = js.native
    
    /* 0 */ val notSpinning: typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.notSpinning with Double = js.native
    
    /* 1 */ val up: typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.up with Double = js.native
  }
  
  @js.native
  class SpinButton protected ()
    extends typingsSlinky.officeUiFabricReact.spinButtonMod.SpinButton {
    def this(props: ISpinButtonProps) = this()
  }
  /* static members */
  @js.native
  object SpinButton extends js.Object {
    
    var defaultProps: DefaultProps = js.native
  }
}
