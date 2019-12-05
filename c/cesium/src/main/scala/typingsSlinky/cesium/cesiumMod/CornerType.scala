package typingsSlinky.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CornerType extends js.Object

@JSImport("cesium", "CornerType")
@js.native
object CornerType extends js.Object {
  @js.native
  sealed trait BEVELED extends CornerType
  
  @js.native
  sealed trait MITERED extends CornerType
  
  @js.native
  sealed trait ROUNDED extends CornerType
  
  /* 2 */ val BEVELED: typingsSlinky.cesium.cesiumMod.CornerType.BEVELED with Double = js.native
  /* 1 */ val MITERED: typingsSlinky.cesium.cesiumMod.CornerType.MITERED with Double = js.native
  /* 0 */ val ROUNDED: typingsSlinky.cesium.cesiumMod.CornerType.ROUNDED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CornerType with Double] = js.native
}

