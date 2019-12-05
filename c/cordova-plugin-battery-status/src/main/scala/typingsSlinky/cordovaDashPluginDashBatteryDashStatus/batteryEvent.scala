package typingsSlinky.cordovaDashPluginDashBatteryDashStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cordovaDashPluginDashBatteryDashStatus.cordovaDashPluginDashBatteryDashStatusStrings.batterystatus
  - typings.cordovaDashPluginDashBatteryDashStatus.cordovaDashPluginDashBatteryDashStatusStrings.batterycritical
  - typings.cordovaDashPluginDashBatteryDashStatus.cordovaDashPluginDashBatteryDashStatusStrings.batterylow
*/
trait batteryEvent extends js.Object

object batteryEvent {
  @scala.inline
  def batterycritical: typingsSlinky.cordovaDashPluginDashBatteryDashStatus.cordovaDashPluginDashBatteryDashStatusStrings.batterycritical = this.cast("batterycritical")
  @scala.inline
  def batterylow: typingsSlinky.cordovaDashPluginDashBatteryDashStatus.cordovaDashPluginDashBatteryDashStatusStrings.batterylow = this.cast("batterylow")
  @scala.inline
  def batterystatus: typingsSlinky.cordovaDashPluginDashBatteryDashStatus.cordovaDashPluginDashBatteryDashStatusStrings.batterystatus = this.cast("batterystatus")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

