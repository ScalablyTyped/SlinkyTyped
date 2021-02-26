package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.monitorMod.DipRect
import typingsSlinky.openfin.monitorMod.MonitorDetails
import typingsSlinky.openfin.monitorMod.TaskBar
import typingsSlinky.openfin.openfinStrings.`monitor-info-changed`
import typingsSlinky.openfin.openfinStrings.system
import typingsSlinky.openfin.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitorInfoChangedEvent
  extends typingsSlinky.openfin.monitorMod.MonitorInfo {
  
  var topic: system = js.native
  
  var `type`: `monitor-info-changed` = js.native
}
object MonitorInfoChangedEvent {
  
  @scala.inline
  def apply(
    deviceScaleFactor: Double,
    dpi: Point,
    nonPrimaryMonitors: js.Array[MonitorDetails],
    primaryMonitor: MonitorDetails,
    reason: String,
    taskBar: TaskBar,
    topic: system,
    `type`: `monitor-info-changed`,
    virtualScreen: DipRect
  ): MonitorInfoChangedEvent = {
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], dpi = dpi.asInstanceOf[js.Any], nonPrimaryMonitors = nonPrimaryMonitors.asInstanceOf[js.Any], primaryMonitor = primaryMonitor.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], taskBar = taskBar.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], virtualScreen = virtualScreen.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorInfoChangedEvent]
  }
  
  @scala.inline
  implicit class MonitorInfoChangedEventMutableBuilder[Self <: MonitorInfoChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopic(value: system): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `monitor-info-changed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
