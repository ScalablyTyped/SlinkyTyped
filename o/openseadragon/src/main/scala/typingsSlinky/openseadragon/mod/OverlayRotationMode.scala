package typingsSlinky.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverlayRotationMode extends StObject
@JSImport("openseadragon", "OverlayRotationMode")
@js.native
object OverlayRotationMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverlayRotationMode with Double] = js.native
  
  @js.native
  sealed trait BOUNDING_BOX extends OverlayRotationMode
  /* 2 */ val BOUNDING_BOX: typingsSlinky.openseadragon.mod.OverlayRotationMode.BOUNDING_BOX with Double = js.native
  
  @js.native
  sealed trait EXACT extends OverlayRotationMode
  /* 1 */ val EXACT: typingsSlinky.openseadragon.mod.OverlayRotationMode.EXACT with Double = js.native
  
  @js.native
  sealed trait NO_ROTATION extends OverlayRotationMode
  /* 0 */ val NO_ROTATION: typingsSlinky.openseadragon.mod.OverlayRotationMode.NO_ROTATION with Double = js.native
}
