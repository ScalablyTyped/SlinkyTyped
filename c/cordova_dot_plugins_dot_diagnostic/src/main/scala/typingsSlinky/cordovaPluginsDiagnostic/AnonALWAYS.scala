package typingsSlinky.cordovaPluginsDiagnostic

import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.always
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.when_in_use
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonALWAYS extends js.Object {
  var ALWAYS: always = js.native
  var WHEN_IN_USE: when_in_use = js.native
}

object AnonALWAYS {
  @scala.inline
  def apply(ALWAYS: always, WHEN_IN_USE: when_in_use): AnonALWAYS = {
    val __obj = js.Dynamic.literal(ALWAYS = ALWAYS.asInstanceOf[js.Any], WHEN_IN_USE = WHEN_IN_USE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonALWAYS]
  }
  @scala.inline
  implicit class AnonALWAYSOps[Self <: AnonALWAYS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withALWAYS(value: always): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALWAYS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWHEN_IN_USE(value: when_in_use): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WHEN_IN_USE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

