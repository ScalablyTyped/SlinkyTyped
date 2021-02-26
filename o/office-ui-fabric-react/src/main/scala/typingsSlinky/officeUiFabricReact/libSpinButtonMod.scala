package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod.DefaultProps
import typingsSlinky.officeUiFabricReact.spinButtonTypesMod.ISpinButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSpinButtonMod {
  
  @JSImport("office-ui-fabric-react/lib/SpinButton", "KeyboardSpinDirection")
  @js.native
  object KeyboardSpinDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection with Double
      ] = js.native
    
    /* -1 */ val down: typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.down with Double = js.native
    
    /* 0 */ val notSpinning: typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.notSpinning with Double = js.native
    
    /* 1 */ val up: typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.up with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/SpinButton", "SpinButton")
  @js.native
  class SpinButton protected ()
    extends typingsSlinky.officeUiFabricReact.spinButtonMod.SpinButton {
    def this(props: ISpinButtonProps) = this()
  }
  /* static members */
  object SpinButton {
    
    @JSImport("office-ui-fabric-react/lib/SpinButton", "SpinButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/SpinButton", "SpinButton.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    @scala.inline
    def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
