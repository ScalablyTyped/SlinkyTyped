package typingsSlinky.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeometricEffectLocalizerFeatherStyle extends js.Object
@JSGlobal("__esri.CIM.GeometricEffectLocalizerFeatherStyle")
@js.native
object GeometricEffectLocalizerFeatherStyle extends js.Object {
  
  /**
    * Displays a complete localizer feather.
    */
  @js.native
  sealed trait Complete extends GeometricEffectLocalizerFeatherStyle
  
  /**
    * Displays the left side of a localizer feather.
    */
  @js.native
  sealed trait Left extends GeometricEffectLocalizerFeatherStyle
  
  /**
    * Displays the right side of a localizer feather.
    */
  @js.native
  sealed trait Right extends GeometricEffectLocalizerFeatherStyle
}
