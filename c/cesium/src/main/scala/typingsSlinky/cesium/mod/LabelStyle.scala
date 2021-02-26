package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LabelStyle extends StObject
@JSImport("cesium", "LabelStyle")
@js.native
object LabelStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelStyle with Double] = js.native
  
  @js.native
  sealed trait FILL extends LabelStyle
  /* 0 */ val FILL: typingsSlinky.cesium.mod.LabelStyle.FILL with Double = js.native
  
  @js.native
  sealed trait FILL_AND_OUTLINE extends LabelStyle
  /* 2 */ val FILL_AND_OUTLINE: typingsSlinky.cesium.mod.LabelStyle.FILL_AND_OUTLINE with Double = js.native
  
  @js.native
  sealed trait OUTLINE extends LabelStyle
  /* 1 */ val OUTLINE: typingsSlinky.cesium.mod.LabelStyle.OUTLINE with Double = js.native
}
