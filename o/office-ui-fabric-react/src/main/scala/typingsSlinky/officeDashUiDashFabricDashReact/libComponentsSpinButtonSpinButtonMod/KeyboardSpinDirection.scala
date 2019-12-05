package typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyboardSpinDirection extends js.Object

@JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton", "KeyboardSpinDirection")
@js.native
object KeyboardSpinDirection extends js.Object {
  @js.native
  sealed trait down extends KeyboardSpinDirection
  
  @js.native
  sealed trait notSpinning extends KeyboardSpinDirection
  
  @js.native
  sealed trait up extends KeyboardSpinDirection
  
  /* -1 */ val down: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection.down with Double = js.native
  /* 0 */ val notSpinning: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection.notSpinning with Double = js.native
  /* 1 */ val up: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection.up with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyboardSpinDirection with Double] = js.native
}

