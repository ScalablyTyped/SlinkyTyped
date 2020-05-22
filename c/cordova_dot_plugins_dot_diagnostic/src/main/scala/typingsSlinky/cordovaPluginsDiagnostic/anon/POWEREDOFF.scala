package typingsSlinky.cordovaPluginsDiagnostic.anon

import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powered_off
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powered_on
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powering_off
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powering_on
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.resetting
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.unauthorized
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.unknown
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.unsupported
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait POWEREDOFF extends js.Object {
  var POWERED_OFF: powered_off
  var POWERED_ON: powered_on
  // Android only
  var POWERING_OFF: powering_off
  var POWERING_ON: powering_on
  // iOS only
  var RESETTING: resetting
  var UNAUTHORIZED: unauthorized
  // Both iOS and Android
  var UNKNOWN: unknown
  var UNSUPPORTED: unsupported
}

object POWEREDOFF {
  @scala.inline
  def apply(
    POWERED_OFF: powered_off,
    POWERED_ON: powered_on,
    POWERING_OFF: powering_off,
    POWERING_ON: powering_on,
    RESETTING: resetting,
    UNAUTHORIZED: unauthorized,
    UNKNOWN: unknown,
    UNSUPPORTED: unsupported
  ): POWEREDOFF = {
    val __obj = js.Dynamic.literal(POWERED_OFF = POWERED_OFF.asInstanceOf[js.Any], POWERED_ON = POWERED_ON.asInstanceOf[js.Any], POWERING_OFF = POWERING_OFF.asInstanceOf[js.Any], POWERING_ON = POWERING_ON.asInstanceOf[js.Any], RESETTING = RESETTING.asInstanceOf[js.Any], UNAUTHORIZED = UNAUTHORIZED.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any], UNSUPPORTED = UNSUPPORTED.asInstanceOf[js.Any])
    __obj.asInstanceOf[POWEREDOFF]
  }
}

