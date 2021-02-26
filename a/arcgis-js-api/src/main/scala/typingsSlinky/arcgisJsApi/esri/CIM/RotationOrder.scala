package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RotationOrder extends StObject
@JSGlobal("__esri.CIM.RotationOrder")
@js.native
object RotationOrder extends StObject {
  
  /**
    * Rotate in XYZ order.
    */
  @js.native
  sealed trait XYZ extends RotationOrder
  
  /**
    * Rotate in YXZ order.
    */
  @js.native
  sealed trait YXZ extends RotationOrder
  
  /**
    * Rotate in ZYX order.
    */
  @js.native
  sealed trait ZXY extends RotationOrder
}
