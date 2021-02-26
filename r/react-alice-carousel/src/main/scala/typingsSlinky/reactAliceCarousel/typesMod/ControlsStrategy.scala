package typingsSlinky.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ControlsStrategy extends StObject
@JSImport("react-alice-carousel/lib/types", "ControlsStrategy")
@js.native
object ControlsStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ControlsStrategy with String] = js.native
  
  @js.native
  sealed trait DEFAULT extends ControlsStrategy
  /* "default" */ val DEFAULT: typingsSlinky.reactAliceCarousel.typesMod.ControlsStrategy.DEFAULT with String = js.native
  
  @js.native
  sealed trait RESPONSIVE extends ControlsStrategy
  /* "responsive" */ val RESPONSIVE: typingsSlinky.reactAliceCarousel.typesMod.ControlsStrategy.RESPONSIVE with String = js.native
}
