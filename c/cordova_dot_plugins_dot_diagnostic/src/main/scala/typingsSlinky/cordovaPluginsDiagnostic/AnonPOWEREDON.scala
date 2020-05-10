package typingsSlinky.cordovaPluginsDiagnostic

import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powered_off
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powered_on
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powering_off
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powering_on
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPOWEREDON extends js.Object {
  var POWERED_OFF: powered_off = js.native
  var POWERED_ON: powered_on = js.native
  var POWERING_OFF: powering_off = js.native
  var POWERING_ON: powering_on = js.native
  var UNKNOWN: unknown = js.native
}

object AnonPOWEREDON {
  @scala.inline
  def apply(
    POWERED_OFF: powered_off,
    POWERED_ON: powered_on,
    POWERING_OFF: powering_off,
    POWERING_ON: powering_on,
    UNKNOWN: unknown
  ): AnonPOWEREDON = {
    val __obj = js.Dynamic.literal(POWERED_OFF = POWERED_OFF.asInstanceOf[js.Any], POWERED_ON = POWERED_ON.asInstanceOf[js.Any], POWERING_OFF = POWERING_OFF.asInstanceOf[js.Any], POWERING_ON = POWERING_ON.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPOWEREDON]
  }
  @scala.inline
  implicit class AnonPOWEREDONOps[Self <: AnonPOWEREDON] (val x: Self) extends AnyVal {
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
    def withUNKNOWN(value: unknown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

