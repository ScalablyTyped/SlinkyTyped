package typingsSlinky.agDashGrid.distLibComponentsFrameworkComponentProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RegisteredComponentSource extends js.Object

@JSImport("ag-grid/dist/lib/components/framework/componentProvider", "RegisteredComponentSource")
@js.native
object RegisteredComponentSource extends js.Object {
  @js.native
  sealed trait DEFAULT extends RegisteredComponentSource
  
  @js.native
  sealed trait REGISTERED extends RegisteredComponentSource
  
  /* 0 */ val DEFAULT: typingsSlinky.agDashGrid.distLibComponentsFrameworkComponentProviderMod.RegisteredComponentSource.DEFAULT with Double = js.native
  /* 1 */ val REGISTERED: typingsSlinky.agDashGrid.distLibComponentsFrameworkComponentProviderMod.RegisteredComponentSource.REGISTERED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RegisteredComponentSource with Double] = js.native
}

