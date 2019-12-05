package typingsSlinky.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClockStep extends js.Object

@JSImport("cesium", "ClockStep")
@js.native
object ClockStep extends js.Object {
  @js.native
  sealed trait SYSTEM_CLOCK extends ClockStep
  
  @js.native
  sealed trait SYSTEM_CLOCK_MULTIPLIER extends ClockStep
  
  @js.native
  sealed trait TICK_DEPENDENT extends ClockStep
  
  /* 2 */ val SYSTEM_CLOCK: typingsSlinky.cesium.cesiumMod.ClockStep.SYSTEM_CLOCK with Double = js.native
  /* 1 */ val SYSTEM_CLOCK_MULTIPLIER: typingsSlinky.cesium.cesiumMod.ClockStep.SYSTEM_CLOCK_MULTIPLIER with Double = js.native
  /* 0 */ val TICK_DEPENDENT: typingsSlinky.cesium.cesiumMod.ClockStep.TICK_DEPENDENT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClockStep with Double] = js.native
}

