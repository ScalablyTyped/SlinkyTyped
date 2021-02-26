package typingsSlinky.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ButtonState extends StObject
@JSImport("openseadragon", "ButtonState")
@js.native
object ButtonState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonState with Double] = js.native
  
  @js.native
  sealed trait DOWN extends ButtonState
  /* 3 */ val DOWN: typingsSlinky.openseadragon.mod.ButtonState.DOWN with Double = js.native
  
  @js.native
  sealed trait GROUP extends ButtonState
  /* 1 */ val GROUP: typingsSlinky.openseadragon.mod.ButtonState.GROUP with Double = js.native
  
  @js.native
  sealed trait HOVER extends ButtonState
  /* 2 */ val HOVER: typingsSlinky.openseadragon.mod.ButtonState.HOVER with Double = js.native
  
  @js.native
  sealed trait REST extends ButtonState
  /* 0 */ val REST: typingsSlinky.openseadragon.mod.ButtonState.REST with Double = js.native
}
