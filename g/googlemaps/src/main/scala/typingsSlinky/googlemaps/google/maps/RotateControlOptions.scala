package typingsSlinky.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for the rendering of the rotate control. */
@js.native
trait RotateControlOptions extends StObject {
  
  /**
    * Position id. Used to specify the position of the control on the map.
    * The default position is TOP_LEFT.
    */
  var position: js.UndefOr[ControlPosition] = js.native
}
object RotateControlOptions {
  
  @scala.inline
  def apply(): RotateControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateControlOptions]
  }
  
  @scala.inline
  implicit class RotateControlOptionsMutableBuilder[Self <: RotateControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
