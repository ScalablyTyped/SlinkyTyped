package typingsSlinky.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyboardEventModifier extends js.Object

@JSImport("cesium", "KeyboardEventModifier")
@js.native
object KeyboardEventModifier extends js.Object {
  @js.native
  sealed trait ALT extends KeyboardEventModifier
  
  @js.native
  sealed trait CTRL extends KeyboardEventModifier
  
  @js.native
  sealed trait SHIFT extends KeyboardEventModifier
  
  /* 2 */ val ALT: typingsSlinky.cesium.cesiumMod.KeyboardEventModifier.ALT with Double = js.native
  /* 1 */ val CTRL: typingsSlinky.cesium.cesiumMod.KeyboardEventModifier.CTRL with Double = js.native
  /* 0 */ val SHIFT: typingsSlinky.cesium.cesiumMod.KeyboardEventModifier.SHIFT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyboardEventModifier with Double] = js.native
}

