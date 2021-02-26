package typingsSlinky.mapboxMapboxSdk.directionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Maneuver extends StObject {
  
  /**
    * Number between 0 and 360 indicating the clockwise angle from true north to the direction of travel right after the maneuver
    */
  var bearing_after: Double = js.native
  
  /**
    * Number between 0 and 360 indicating the clockwise angle from true north to the direction of travel right before the maneuver
    */
  var bearing_before: Double = js.native
  
  /**
    * A human-readable instruction of how to execute the returned maneuver
    */
  var instruction: String = js.native
  
  /**
    * Array of [ longitude, latitude ] coordinates for the point of the maneuver
    */
  var location: js.Array[Double] = js.native
  
  /**
    * Optional String indicating the direction change of the maneuver
    */
  var modifier: js.UndefOr[ManeuverModifier] = js.native
  
  /**
    * String indicating the type of maneuver
    */
  var `type`: ManeuverType = js.native
}
object Maneuver {
  
  @scala.inline
  def apply(
    bearing_after: Double,
    bearing_before: Double,
    instruction: String,
    location: js.Array[Double],
    `type`: ManeuverType
  ): Maneuver = {
    val __obj = js.Dynamic.literal(bearing_after = bearing_after.asInstanceOf[js.Any], bearing_before = bearing_before.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maneuver]
  }
  
  @scala.inline
  implicit class ManeuverMutableBuilder[Self <: Maneuver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBearing_after(value: Double): Self = StObject.set(x, "bearing_after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearing_before(value: Double): Self = StObject.set(x, "bearing_before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    @scala.inline
    def setModifier(value: ManeuverModifier): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setType(value: ManeuverType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
