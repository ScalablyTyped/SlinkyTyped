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

@js.native
trait POWEREDOFF extends js.Object {
  var POWERED_OFF: powered_off = js.native
  var POWERED_ON: powered_on = js.native
  // Android only
  var POWERING_OFF: powering_off = js.native
  var POWERING_ON: powering_on = js.native
  // iOS only
  var RESETTING: resetting = js.native
  var UNAUTHORIZED: unauthorized = js.native
  // Both iOS and Android
  var UNKNOWN: unknown = js.native
  var UNSUPPORTED: unsupported = js.native
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
  @scala.inline
  implicit class POWEREDOFFOps[Self <: POWEREDOFF] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPOWERED_OFF(value: powered_off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POWERED_OFF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPOWERED_ON(value: powered_on): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POWERED_ON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPOWERING_OFF(value: powering_off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POWERING_OFF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPOWERING_ON(value: powering_on): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POWERING_ON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRESETTING(value: resetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESETTING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNAUTHORIZED(value: unauthorized): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNAUTHORIZED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNKNOWN(value: unknown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNSUPPORTED(value: unsupported): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORTED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

