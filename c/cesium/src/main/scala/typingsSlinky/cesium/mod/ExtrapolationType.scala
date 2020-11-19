package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtrapolationType extends js.Object
@JSImport("cesium", "ExtrapolationType")
@js.native
object ExtrapolationType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtrapolationType with Double] = js.native
  
  @js.native
  sealed trait EXTRAPOLATE extends ExtrapolationType
  /* 2 */ @js.native
  object EXTRAPOLATE extends TopLevel[EXTRAPOLATE with Double]
  
  @js.native
  sealed trait HOLD extends ExtrapolationType
  /* 1 */ @js.native
  object HOLD extends TopLevel[HOLD with Double]
  
  @js.native
  sealed trait NONE extends ExtrapolationType
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
}
