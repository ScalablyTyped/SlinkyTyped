package typingsSlinky.baidumapWebSdk.anon

import typingsSlinky.baidumapWebSdk.BMap.HotspotOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spots extends StObject {
  
  var spots: HotspotOptions = js.native
  
  var target: js.Any = js.native
  
  var `type`: String = js.native
}
object Spots {
  
  @scala.inline
  def apply(spots: HotspotOptions, target: js.Any, `type`: String): Spots = {
    val __obj = js.Dynamic.literal(spots = spots.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spots]
  }
  
  @scala.inline
  implicit class SpotsMutableBuilder[Self <: Spots] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpots(value: HotspotOptions): Self = StObject.set(x, "spots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
