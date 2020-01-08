package typingsSlinky.rotDashJs.rotDashJsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.rotDashJs.libFovDiscreteDashShadowcastingMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "FOV")
@js.native
object FOV extends js.Object {
  @js.native
  class DiscreteShadowcasting () extends default
  
  @js.native
  class PreciseShadowcasting ()
    extends typingsSlinky.rotDashJs.libFovPreciseDashShadowcastingMod.default
  
  @js.native
  class RecursiveShadowcasting ()
    extends typingsSlinky.rotDashJs.libFovRecursiveDashShadowcastingMod.default
  
  @js.native
  object DiscreteShadowcasting extends TopLevel[Instantiable0[default]]
  
  @js.native
  object PreciseShadowcasting
    extends TopLevel[Instantiable0[typingsSlinky.rotDashJs.libFovPreciseDashShadowcastingMod.default]]
  
  @js.native
  object RecursiveShadowcasting
    extends TopLevel[
          Instantiable0[typingsSlinky.rotDashJs.libFovRecursiveDashShadowcastingMod.default]
        ]
  
}

