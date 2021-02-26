package typingsSlinky.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitorInfo extends StObject {
  
  var monitorInfo: typingsSlinky.openfin.monitorMod.MonitorInfo = js.native
  
  var runtimeInfo: String = js.native
  
  var timeStamp: String = js.native
}
object MonitorInfo {
  
  @scala.inline
  def apply(monitorInfo: typingsSlinky.openfin.monitorMod.MonitorInfo, runtimeInfo: String, timeStamp: String): MonitorInfo = {
    val __obj = js.Dynamic.literal(monitorInfo = monitorInfo.asInstanceOf[js.Any], runtimeInfo = runtimeInfo.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorInfo]
  }
  
  @scala.inline
  implicit class MonitorInfoMutableBuilder[Self <: MonitorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitorInfo(value: typingsSlinky.openfin.monitorMod.MonitorInfo): Self = StObject.set(x, "monitorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeInfo(value: String): Self = StObject.set(x, "runtimeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: String): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
