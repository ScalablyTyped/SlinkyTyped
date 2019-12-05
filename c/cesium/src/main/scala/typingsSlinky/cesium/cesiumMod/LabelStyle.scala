package typingsSlinky.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelStyle extends js.Object

@JSImport("cesium", "LabelStyle")
@js.native
object LabelStyle extends js.Object {
  @js.native
  sealed trait FILL extends LabelStyle
  
  @js.native
  sealed trait FILL_AND_OUTLINE extends LabelStyle
  
  @js.native
  sealed trait OUTLINE extends LabelStyle
  
  /* 0 */ val FILL: typingsSlinky.cesium.cesiumMod.LabelStyle.FILL with Double = js.native
  /* 2 */ val FILL_AND_OUTLINE: typingsSlinky.cesium.cesiumMod.LabelStyle.FILL_AND_OUTLINE with Double = js.native
  /* 1 */ val OUTLINE: typingsSlinky.cesium.cesiumMod.LabelStyle.OUTLINE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelStyle with Double] = js.native
}

