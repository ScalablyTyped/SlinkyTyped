package typingsSlinky.cordovaDotPluginsDotDiagnostic

import typingsSlinky.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.DENIED_ALWAYS
import typingsSlinky.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.DENIED_ONCE
import typingsSlinky.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.GRANTED
import typingsSlinky.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.NOT_REQUESTED
import typingsSlinky.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.authorized
import typingsSlinky.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.authorized_when_in_use
import typingsSlinky.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.denied_always_
import typingsSlinky.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.not_determined
import typingsSlinky.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.restricted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authorized extends js.Object {
  var DENIED_ALWAYS: denied_always_ | typingsSlinky.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.DENIED_ALWAYS
  // Android only
  var DENIED_ONCE: typingsSlinky.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.DENIED_ONCE
  // Both iOS and Android
  var GRANTED: authorized | typingsSlinky.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.GRANTED
  var GRANTED_WHEN_IN_USE: authorized_when_in_use
  var NOT_REQUESTED: not_determined | typingsSlinky.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.NOT_REQUESTED
  // iOS only
  var RESTRICTED: restricted
}

object Anon_Authorized {
  @scala.inline
  def apply(
    DENIED_ALWAYS: denied_always_ | DENIED_ALWAYS,
    DENIED_ONCE: DENIED_ONCE,
    GRANTED: authorized | GRANTED,
    GRANTED_WHEN_IN_USE: authorized_when_in_use,
    NOT_REQUESTED: not_determined | NOT_REQUESTED,
    RESTRICTED: restricted
  ): Anon_Authorized = {
    val __obj = js.Dynamic.literal(DENIED_ALWAYS = DENIED_ALWAYS.asInstanceOf[js.Any], DENIED_ONCE = DENIED_ONCE.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any], GRANTED_WHEN_IN_USE = GRANTED_WHEN_IN_USE.asInstanceOf[js.Any], NOT_REQUESTED = NOT_REQUESTED.asInstanceOf[js.Any], RESTRICTED = RESTRICTED.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Authorized]
  }
}

