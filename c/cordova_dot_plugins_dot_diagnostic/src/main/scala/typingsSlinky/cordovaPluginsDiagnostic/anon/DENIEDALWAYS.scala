package typingsSlinky.cordovaPluginsDiagnostic.anon

import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.DENIED_ALWAYS
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.DENIED_ONCE
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.NOT_REQUESTED
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.authorized
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.authorized_when_in_use
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.denied_always_
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.not_determined
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.restricted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DENIEDALWAYS extends js.Object {
  var DENIED_ALWAYS: denied_always_ | typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.DENIED_ALWAYS
  // Android only
  var DENIED_ONCE: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.DENIED_ONCE
  // Both iOS and Android
  var GRANTED: authorized | typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.GRANTED
  var GRANTED_WHEN_IN_USE: authorized_when_in_use
  var NOT_REQUESTED: not_determined | typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.NOT_REQUESTED
  // iOS only
  var RESTRICTED: restricted
}

object DENIEDALWAYS {
  @scala.inline
  def apply(
    DENIED_ALWAYS: denied_always_ | DENIED_ALWAYS,
    DENIED_ONCE: DENIED_ONCE,
    GRANTED: authorized | typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.GRANTED,
    GRANTED_WHEN_IN_USE: authorized_when_in_use,
    NOT_REQUESTED: not_determined | NOT_REQUESTED,
    RESTRICTED: restricted
  ): DENIEDALWAYS = {
    val __obj = js.Dynamic.literal(DENIED_ALWAYS = DENIED_ALWAYS.asInstanceOf[js.Any], DENIED_ONCE = DENIED_ONCE.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any], GRANTED_WHEN_IN_USE = GRANTED_WHEN_IN_USE.asInstanceOf[js.Any], NOT_REQUESTED = NOT_REQUESTED.asInstanceOf[js.Any], RESTRICTED = RESTRICTED.asInstanceOf[js.Any])
    __obj.asInstanceOf[DENIEDALWAYS]
  }
}

