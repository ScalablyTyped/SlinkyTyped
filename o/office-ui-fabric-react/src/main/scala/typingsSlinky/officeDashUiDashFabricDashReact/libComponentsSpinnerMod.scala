package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.ISpinnerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Spinner", JSImport.Namespace)
@js.native
object libComponentsSpinnerMod extends js.Object {
  @js.native
  class SpinnerBase ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotBaseMod.SpinnerBase
  
  val Spinner: ReactComponentClass[ISpinnerProps] = js.native
  /* static members */
  @js.native
  object SpinnerBase extends js.Object {
    var defaultProps: ISpinnerProps = js.native
  }
  
  @js.native
  object SpinnerSize extends js.Object {
    /* 3 */ val large: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize.large with Double = js.native
    /* 2 */ val medium: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize.medium with Double = js.native
    /* 1 */ val small: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize.small with Double = js.native
    /* 0 */ val xSmall: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize.xSmall with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize with Double
      ] = js.native
  }
  
  @js.native
  object SpinnerType extends js.Object {
    /* 1 */ val large: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerType.large with Double = js.native
    /* 0 */ val normal: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerType.normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerType with Double
      ] = js.native
  }
  
}

