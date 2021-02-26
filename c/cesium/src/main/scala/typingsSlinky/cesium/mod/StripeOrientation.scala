package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StripeOrientation extends StObject
@JSImport("cesium", "StripeOrientation")
@js.native
object StripeOrientation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StripeOrientation with Double] = js.native
  
  @js.native
  sealed trait HORIZONTAL extends StripeOrientation
  /* 0 */ val HORIZONTAL: typingsSlinky.cesium.mod.StripeOrientation.HORIZONTAL with Double = js.native
  
  @js.native
  sealed trait VERTICAL extends StripeOrientation
  /* 1 */ val VERTICAL: typingsSlinky.cesium.mod.StripeOrientation.VERTICAL with Double = js.native
}
