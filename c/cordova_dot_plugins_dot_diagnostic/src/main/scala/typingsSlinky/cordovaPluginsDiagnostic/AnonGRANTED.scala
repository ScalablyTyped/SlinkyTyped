package typingsSlinky.cordovaPluginsDiagnostic

import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.authorized
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.denied_always_
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.not_available
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.not_determined
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.not_requested_
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.restricted
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGRANTED extends js.Object {
  var DENIED_ALWAYS: denied_always_ = js.native
  var GRANTED: authorized = js.native
  var NOT_AVAILABLE: not_available = js.native
  var NOT_DETERMINED: not_determined = js.native
  var NOT_REQUESTED: not_requested_ = js.native
  var RESTRICTED: restricted = js.native
  var UNKNOWN: unknown = js.native
}

object AnonGRANTED {
  @scala.inline
  def apply(
    DENIED_ALWAYS: denied_always_,
    GRANTED: authorized,
    NOT_AVAILABLE: not_available,
    NOT_DETERMINED: not_determined,
    NOT_REQUESTED: not_requested_,
    RESTRICTED: restricted,
    UNKNOWN: unknown
  ): AnonGRANTED = {
    val __obj = js.Dynamic.literal(DENIED_ALWAYS = DENIED_ALWAYS.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any], NOT_AVAILABLE = NOT_AVAILABLE.asInstanceOf[js.Any], NOT_DETERMINED = NOT_DETERMINED.asInstanceOf[js.Any], NOT_REQUESTED = NOT_REQUESTED.asInstanceOf[js.Any], RESTRICTED = RESTRICTED.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGRANTED]
  }
  @scala.inline
  implicit class AnonGRANTEDOps[Self <: AnonGRANTED] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDENIED_ALWAYS(value: denied_always_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DENIED_ALWAYS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGRANTED(value: authorized): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GRANTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_AVAILABLE(value: not_available): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_AVAILABLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_DETERMINED(value: not_determined): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_DETERMINED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_REQUESTED(value: not_requested_): Self = {
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
    @scala.inline
    def withUNKNOWN(value: unknown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

