package typingsSlinky.cordovaPluginBatteryStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterystatus
  - typingsSlinky.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterycritical
  - typingsSlinky.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterylow
*/
trait batteryEvent extends js.Object

object batteryEvent {
  @scala.inline
  def batterycritical: typingsSlinky.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterycritical = this.cast("batterycritical")
  @scala.inline
  def batterylow: typingsSlinky.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterylow = this.cast("batterylow")
  @scala.inline
  def batterystatus: typingsSlinky.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterystatus = this.cast("batterystatus")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

