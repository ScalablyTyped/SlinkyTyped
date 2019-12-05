package typingsSlinky.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalOrigin extends js.Object

@JSImport("cesium", "HorizontalOrigin")
@js.native
object HorizontalOrigin extends js.Object {
  @js.native
  sealed trait CENTER extends HorizontalOrigin
  
  @js.native
  sealed trait LEFT extends HorizontalOrigin
  
  @js.native
  sealed trait RIGHT extends HorizontalOrigin
  
  /* 0 */ val CENTER: typingsSlinky.cesium.cesiumMod.HorizontalOrigin.CENTER with Double = js.native
  /* 1 */ val LEFT: typingsSlinky.cesium.cesiumMod.HorizontalOrigin.LEFT with Double = js.native
  /* 2 */ val RIGHT: typingsSlinky.cesium.cesiumMod.HorizontalOrigin.RIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalOrigin with Double] = js.native
}

