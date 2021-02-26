package typingsSlinky.plotlyJs.mod

import org.scalajs.dom.raw.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SunburstClickEvent extends StObject {
  
  var event: MouseEvent = js.native
  
  var nextLevel: String = js.native
  
  var points: js.Array[SunburstPlotDatum] = js.native
}
object SunburstClickEvent {
  
  @scala.inline
  def apply(event: MouseEvent, nextLevel: String, points: js.Array[SunburstPlotDatum]): SunburstClickEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nextLevel = nextLevel.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[SunburstClickEvent]
  }
  
  @scala.inline
  implicit class SunburstClickEventMutableBuilder[Self <: SunburstClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextLevel(value: String): Self = StObject.set(x, "nextLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: js.Array[SunburstPlotDatum]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: SunburstPlotDatum*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
