package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StencilOperation extends StObject
@JSImport("cesium", "StencilOperation")
@js.native
object StencilOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StencilOperation with Double] = js.native
  
  @js.native
  sealed trait DECREMENT extends StencilOperation
  /* 4 */ val DECREMENT: typingsSlinky.cesium.mod.StencilOperation.DECREMENT with Double = js.native
  
  @js.native
  sealed trait DECREMENT_WRAP extends StencilOperation
  /* 7 */ val DECREMENT_WRAP: typingsSlinky.cesium.mod.StencilOperation.DECREMENT_WRAP with Double = js.native
  
  @js.native
  sealed trait INCREMENT extends StencilOperation
  /* 3 */ val INCREMENT: typingsSlinky.cesium.mod.StencilOperation.INCREMENT with Double = js.native
  
  @js.native
  sealed trait INCREMENT_WRAP extends StencilOperation
  /* 6 */ val INCREMENT_WRAP: typingsSlinky.cesium.mod.StencilOperation.INCREMENT_WRAP with Double = js.native
  
  @js.native
  sealed trait INVERT extends StencilOperation
  /* 5 */ val INVERT: typingsSlinky.cesium.mod.StencilOperation.INVERT with Double = js.native
  
  @js.native
  sealed trait KEEP extends StencilOperation
  /* 1 */ val KEEP: typingsSlinky.cesium.mod.StencilOperation.KEEP with Double = js.native
  
  @js.native
  sealed trait REPLACE extends StencilOperation
  /* 2 */ val REPLACE: typingsSlinky.cesium.mod.StencilOperation.REPLACE with Double = js.native
  
  @js.native
  sealed trait ZERO extends StencilOperation
  /* 0 */ val ZERO: typingsSlinky.cesium.mod.StencilOperation.ZERO with Double = js.native
}
