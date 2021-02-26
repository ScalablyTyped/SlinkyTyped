package typingsSlinky.gatsbyCli.anon

import typingsSlinky.gatsbyCli.constantsMod.ActivityStatuses
import typingsSlinky.gatsbyCli.constantsMod.ActivityTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTime extends StObject {
  
  var id: String = js.native
  
  var startTime: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var status: ActivityStatuses = js.native
  
  var `type`: ActivityTypes = js.native
}
object StartTime {
  
  @scala.inline
  def apply(id: String, status: ActivityStatuses, `type`: ActivityTypes): StartTime = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTime]
  }
  
  @scala.inline
  implicit class StartTimeMutableBuilder[Self <: StartTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: ActivityStatuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ActivityTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
