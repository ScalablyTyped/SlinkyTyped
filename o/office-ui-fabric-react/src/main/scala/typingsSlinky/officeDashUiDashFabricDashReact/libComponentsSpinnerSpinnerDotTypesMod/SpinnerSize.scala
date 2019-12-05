package typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpinnerSize extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.types", "SpinnerSize")
@js.native
object SpinnerSize extends js.Object {
  /**
    * 28px Spinner diameter
    */
  @js.native
  sealed trait large extends SpinnerSize
  
  /**
    * 20px Spinner diameter
    */
  @js.native
  sealed trait medium extends SpinnerSize
  
  /**
    * 16px Spinner diameter
    */
  @js.native
  sealed trait small extends SpinnerSize
  
  /**
    * 12px Spinner diameter
    */
  @js.native
  sealed trait xSmall extends SpinnerSize
  
  /* 3 */ val large: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize.large with Double = js.native
  /* 2 */ val medium: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize.medium with Double = js.native
  /* 1 */ val small: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize.small with Double = js.native
  /* 0 */ val xSmall: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize.xSmall with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpinnerSize with Double] = js.native
}

