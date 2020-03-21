package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.spinnerTypesMod.ISpinnerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Spinner", JSImport.Namespace)
@js.native
object libSpinnerMod extends js.Object {
  @js.native
  class SpinnerBase ()
    extends typingsSlinky.officeUiFabricReact.spinnerMod.SpinnerBase
  
  val Spinner: ReactComponentClass[ISpinnerProps] = js.native
  /* static members */
  @js.native
  object SpinnerBase extends js.Object {
    var defaultProps: ISpinnerProps = js.native
  }
  
  @js.native
  object SpinnerSize extends js.Object {
    /* 3 */ val large: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerSize.large with Double = js.native
    /* 2 */ val medium: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerSize.medium with Double = js.native
    /* 1 */ val small: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerSize.small with Double = js.native
    /* 0 */ val xSmall: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerSize.xSmall with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerSize with Double] = js.native
  }
  
  @js.native
  object SpinnerType extends js.Object {
    /* 1 */ val large: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerType.large with Double = js.native
    /* 0 */ val normal: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerType.normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerType with Double] = js.native
  }
  
}

