package typingsSlinky.cordovaPluginsDiagnostic.anon

import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.battery_saving
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.device_only
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.high_accuracy
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.location_off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BATTERYSAVING extends js.Object {
  var BATTERY_SAVING: battery_saving
  var DEVICE_ONLY: device_only
  var HIGH_ACCURACY: high_accuracy
  var LOCATION_OFF: location_off
}

object BATTERYSAVING {
  @scala.inline
  def apply(
    BATTERY_SAVING: battery_saving,
    DEVICE_ONLY: device_only,
    HIGH_ACCURACY: high_accuracy,
    LOCATION_OFF: location_off
  ): BATTERYSAVING = {
    val __obj = js.Dynamic.literal(BATTERY_SAVING = BATTERY_SAVING.asInstanceOf[js.Any], DEVICE_ONLY = DEVICE_ONLY.asInstanceOf[js.Any], HIGH_ACCURACY = HIGH_ACCURACY.asInstanceOf[js.Any], LOCATION_OFF = LOCATION_OFF.asInstanceOf[js.Any])
    __obj.asInstanceOf[BATTERYSAVING]
  }
}

