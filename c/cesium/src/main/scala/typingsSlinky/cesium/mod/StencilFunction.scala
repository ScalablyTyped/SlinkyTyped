package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StencilFunction extends StObject
@JSImport("cesium", "StencilFunction")
@js.native
object StencilFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StencilFunction with Double] = js.native
  
  @js.native
  sealed trait ALWAYS extends StencilFunction
  /* 7 */ val ALWAYS: typingsSlinky.cesium.mod.StencilFunction.ALWAYS with Double = js.native
  
  @js.native
  sealed trait EQUAL extends StencilFunction
  /* 2 */ val EQUAL: typingsSlinky.cesium.mod.StencilFunction.EQUAL with Double = js.native
  
  @js.native
  sealed trait GREATER extends StencilFunction
  /* 4 */ val GREATER: typingsSlinky.cesium.mod.StencilFunction.GREATER with Double = js.native
  
  @js.native
  sealed trait GREATER_OR_EQUAL extends StencilFunction
  /* 6 */ val GREATER_OR_EQUAL: typingsSlinky.cesium.mod.StencilFunction.GREATER_OR_EQUAL with Double = js.native
  
  @js.native
  sealed trait LESS extends StencilFunction
  /* 1 */ val LESS: typingsSlinky.cesium.mod.StencilFunction.LESS with Double = js.native
  
  @js.native
  sealed trait LESS_OR_EQUAL extends StencilFunction
  /* 3 */ val LESS_OR_EQUAL: typingsSlinky.cesium.mod.StencilFunction.LESS_OR_EQUAL with Double = js.native
  
  @js.native
  sealed trait NEVER extends StencilFunction
  /* 0 */ val NEVER: typingsSlinky.cesium.mod.StencilFunction.NEVER with Double = js.native
  
  @js.native
  sealed trait NOT_EQUAL extends StencilFunction
  /* 5 */ val NOT_EQUAL: typingsSlinky.cesium.mod.StencilFunction.NOT_EQUAL with Double = js.native
}
