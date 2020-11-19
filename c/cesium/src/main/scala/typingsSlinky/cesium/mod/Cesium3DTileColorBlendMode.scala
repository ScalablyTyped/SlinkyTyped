package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Cesium3DTileColorBlendMode extends js.Object
@JSImport("cesium", "Cesium3DTileColorBlendMode")
@js.native
object Cesium3DTileColorBlendMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Cesium3DTileColorBlendMode with Double] = js.native
  
  @js.native
  sealed trait HIGHLIGHT extends Cesium3DTileColorBlendMode
  /* 0 */ @js.native
  object HIGHLIGHT extends TopLevel[HIGHLIGHT with Double]
  
  @js.native
  sealed trait MIX extends Cesium3DTileColorBlendMode
  /* 2 */ @js.native
  object MIX extends TopLevel[MIX with Double]
  
  @js.native
  sealed trait REPLACE extends Cesium3DTileColorBlendMode
  /* 1 */ @js.native
  object REPLACE extends TopLevel[REPLACE with Double]
}
