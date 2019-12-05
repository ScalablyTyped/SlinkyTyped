package typingsSlinky.officeDashUiDashFabricDashReact

import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonDotTypesMod.ISpinButtonProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.DefaultProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/SpinButton", JSImport.Namespace)
@js.native
object libSpinButtonMod extends js.Object {
  @js.native
  class SpinButton protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinButtonMod.SpinButton {
    def this(props: ISpinButtonProps) = this()
  }
  
  @js.native
  object KeyboardSpinDirection extends js.Object {
    /* -1 */ val down: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection.down with Double = js.native
    /* 0 */ val notSpinning: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection.notSpinning with Double = js.native
    /* 1 */ val up: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection.up with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object SpinButton extends js.Object {
    var defaultProps: DefaultProps = js.native
  }
  
}

