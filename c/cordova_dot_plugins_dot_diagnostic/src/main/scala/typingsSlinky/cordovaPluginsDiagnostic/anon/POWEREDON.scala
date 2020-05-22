package typingsSlinky.cordovaPluginsDiagnostic.anon

import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powered_off
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powered_on
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powering_off
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powering_on
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait POWEREDON extends js.Object {
  var POWERED_OFF: powered_off
  var POWERED_ON: powered_on
  var POWERING_OFF: powering_off
  var POWERING_ON: powering_on
  var UNKNOWN: unknown
}

object POWEREDON {
  @scala.inline
  def apply(
    POWERED_OFF: powered_off,
    POWERED_ON: powered_on,
    POWERING_OFF: powering_off,
    POWERING_ON: powering_on,
    UNKNOWN: unknown
  ): POWEREDON = {
    val __obj = js.Dynamic.literal(POWERED_OFF = POWERED_OFF.asInstanceOf[js.Any], POWERED_ON = POWERED_ON.asInstanceOf[js.Any], POWERING_OFF = POWERING_OFF.asInstanceOf[js.Any], POWERING_ON = POWERING_ON.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[POWEREDON]
  }
}

