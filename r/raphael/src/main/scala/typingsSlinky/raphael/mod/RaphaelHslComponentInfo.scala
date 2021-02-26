package typingsSlinky.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelHslComponentInfo extends StObject {
  
  /**
    * The HSB or HSL hue channel.
    */
  var h: Double = js.native
  
  /**
    * The HSL luminosity channel.
    */
  var l: Double = js.native
  
  /**
    * The HSB or HSL saturation channel.
    */
  var s: Double = js.native
}
object RaphaelHslComponentInfo {
  
  @scala.inline
  def apply(h: Double, l: Double, s: Double): RaphaelHslComponentInfo = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelHslComponentInfo]
  }
  
  @scala.inline
  implicit class RaphaelHslComponentInfoMutableBuilder[Self <: RaphaelHslComponentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
