package typingsSlinky.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Visibility extends js.Object

@JSImport("cesium", "Visibility")
@js.native
object Visibility extends js.Object {
  @js.native
  sealed trait FULL extends Visibility
  
  @js.native
  sealed trait NONE extends Visibility
  
  @js.native
  sealed trait PARTIAL extends Visibility
  
  /* 2 */ val FULL: typingsSlinky.cesium.cesiumMod.Visibility.FULL with Double = js.native
  /* 0 */ val NONE: typingsSlinky.cesium.cesiumMod.Visibility.NONE with Double = js.native
  /* 1 */ val PARTIAL: typingsSlinky.cesium.cesiumMod.Visibility.PARTIAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility with Double] = js.native
}

