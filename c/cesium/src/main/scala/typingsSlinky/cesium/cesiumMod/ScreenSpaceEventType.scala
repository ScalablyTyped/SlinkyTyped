package typingsSlinky.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScreenSpaceEventType extends js.Object

@JSImport("cesium", "ScreenSpaceEventType")
@js.native
object ScreenSpaceEventType extends js.Object {
  @js.native
  sealed trait LEFT_CLICK extends ScreenSpaceEventType
  
  @js.native
  sealed trait LEFT_DOUBLE_CLICK extends ScreenSpaceEventType
  
  @js.native
  sealed trait LEFT_DOWN extends ScreenSpaceEventType
  
  @js.native
  sealed trait LEFT_UP extends ScreenSpaceEventType
  
  @js.native
  sealed trait MIDDLE_CLICK extends ScreenSpaceEventType
  
  @js.native
  sealed trait MIDDLE_DOWN extends ScreenSpaceEventType
  
  @js.native
  sealed trait MIDDLE_UP extends ScreenSpaceEventType
  
  @js.native
  sealed trait MOUSE_MOVE extends ScreenSpaceEventType
  
  @js.native
  sealed trait PINCH_END extends ScreenSpaceEventType
  
  @js.native
  sealed trait PINCH_MOVE extends ScreenSpaceEventType
  
  @js.native
  sealed trait PINCH_START extends ScreenSpaceEventType
  
  @js.native
  sealed trait RIGHT_CLICK extends ScreenSpaceEventType
  
  @js.native
  sealed trait RIGHT_DOWN extends ScreenSpaceEventType
  
  @js.native
  sealed trait RIGHT_UP extends ScreenSpaceEventType
  
  @js.native
  sealed trait WHEEL extends ScreenSpaceEventType
  
  /* 2 */ val LEFT_CLICK: typingsSlinky.cesium.cesiumMod.ScreenSpaceEventType.LEFT_CLICK with Double = js.native
  /* 3 */ val LEFT_DOUBLE_CLICK: typingsSlinky.cesium.cesiumMod.ScreenSpaceEventType.LEFT_DOUBLE_CLICK with Double = js.native
  /* 0 */ val LEFT_DOWN: typingsSlinky.cesium.cesiumMod.ScreenSpaceEventType.LEFT_DOWN with Double = js.native
  /* 1 */ val LEFT_UP: typingsSlinky.cesium.cesiumMod.ScreenSpaceEventType.LEFT_UP with Double = js.native
  /* 12 */ val MIDDLE_CLICK: typingsSlinky.cesium.cesiumMod.ScreenSpaceEventType.MIDDLE_CLICK with Double = js.native
  /* 10 */ val MIDDLE_DOWN: typingsSlinky.cesium.cesiumMod.ScreenSpaceEventType.MIDDLE_DOWN with Double = js.native
  /* 11 */ val MIDDLE_UP: typingsSlinky.cesium.cesiumMod.ScreenSpaceEventType.MIDDLE_UP with Double = js.native
  /* 15 */ val MOUSE_MOVE: typingsSlinky.cesium.cesiumMod.ScreenSpaceEventType.MOUSE_MOVE with Double = js.native
  /* 18 */ val PINCH_END: typingsSlinky.cesium.cesiumMod.ScreenSpaceEventType.PINCH_END with Double = js.native
  /* 19 */ val PINCH_MOVE: typingsSlinky.cesium.cesiumMod.ScreenSpaceEventType.PINCH_MOVE with Double = js.native
  /* 17 */ val PINCH_START: typingsSlinky.cesium.cesiumMod.ScreenSpaceEventType.PINCH_START with Double = js.native
  /* 7 */ val RIGHT_CLICK: typingsSlinky.cesium.cesiumMod.ScreenSpaceEventType.RIGHT_CLICK with Double = js.native
  /* 5 */ val RIGHT_DOWN: typingsSlinky.cesium.cesiumMod.ScreenSpaceEventType.RIGHT_DOWN with Double = js.native
  /* 6 */ val RIGHT_UP: typingsSlinky.cesium.cesiumMod.ScreenSpaceEventType.RIGHT_UP with Double = js.native
  /* 16 */ val WHEEL: typingsSlinky.cesium.cesiumMod.ScreenSpaceEventType.WHEEL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScreenSpaceEventType with Double] = js.native
}

