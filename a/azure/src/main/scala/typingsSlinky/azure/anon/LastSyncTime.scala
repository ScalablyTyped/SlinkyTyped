package typingsSlinky.azure.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastSyncTime extends StObject {
  
  var LastSyncTime: js.Date = js.native
  
  var Status: String = js.native
}
object LastSyncTime {
  
  @scala.inline
  def apply(LastSyncTime: js.Date, Status: String): LastSyncTime = {
    val __obj = js.Dynamic.literal(LastSyncTime = LastSyncTime.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastSyncTime]
  }
  
  @scala.inline
  implicit class LastSyncTimeMutableBuilder[Self <: LastSyncTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastSyncTime(value: js.Date): Self = StObject.set(x, "LastSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
