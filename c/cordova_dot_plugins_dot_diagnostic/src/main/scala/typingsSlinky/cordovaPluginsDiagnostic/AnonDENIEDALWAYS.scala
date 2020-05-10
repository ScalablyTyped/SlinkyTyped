package typingsSlinky.cordovaPluginsDiagnostic

import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.DENIED_ALWAYS
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.DENIED_ONCE
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.GRANTED
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.NOT_REQUESTED
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.authorized
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.authorized_when_in_use
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.denied_always_
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.not_determined
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.restricted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDENIEDALWAYS extends js.Object {
  var DENIED_ALWAYS: denied_always_ | typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.DENIED_ALWAYS = js.native
  // Android only
  var DENIED_ONCE: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.DENIED_ONCE = js.native
  // Both iOS and Android
  var GRANTED: authorized | typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.GRANTED = js.native
  var GRANTED_WHEN_IN_USE: authorized_when_in_use = js.native
  var NOT_REQUESTED: not_determined | typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.NOT_REQUESTED = js.native
  // iOS only
  var RESTRICTED: restricted = js.native
}

object AnonDENIEDALWAYS {
  @scala.inline
  def apply(
    DENIED_ALWAYS: denied_always_ | DENIED_ALWAYS,
    DENIED_ONCE: DENIED_ONCE,
    GRANTED: authorized | GRANTED,
    GRANTED_WHEN_IN_USE: authorized_when_in_use,
    NOT_REQUESTED: not_determined | NOT_REQUESTED,
    RESTRICTED: restricted
  ): AnonDENIEDALWAYS = {
    val __obj = js.Dynamic.literal(DENIED_ALWAYS = DENIED_ALWAYS.asInstanceOf[js.Any], DENIED_ONCE = DENIED_ONCE.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any], GRANTED_WHEN_IN_USE = GRANTED_WHEN_IN_USE.asInstanceOf[js.Any], NOT_REQUESTED = NOT_REQUESTED.asInstanceOf[js.Any], RESTRICTED = RESTRICTED.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDENIEDALWAYS]
  }
  @scala.inline
  implicit class AnonDENIEDALWAYSOps[Self <: AnonDENIEDALWAYS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDENIED_ALWAYS(value: denied_always_ | DENIED_ALWAYS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DENIED_ALWAYS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDENIED_ONCE(value: DENIED_ONCE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DENIED_ONCE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGRANTED(value: authorized | GRANTED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GRANTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGRANTED_WHEN_IN_USE(value: authorized_when_in_use): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GRANTED_WHEN_IN_USE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_REQUESTED(value: not_determined | NOT_REQUESTED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_REQUESTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRESTRICTED(value: restricted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESTRICTED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

