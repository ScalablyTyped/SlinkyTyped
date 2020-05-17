package typingsSlinky.cordovaPluginsDiagnostic.anon

import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.alert
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.badge
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.sound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ALERT extends js.Object {
  var ALERT: alert = js.native
  var BADGE: badge = js.native
  var SOUND: sound = js.native
}

object ALERT {
  @scala.inline
  def apply(ALERT: alert, BADGE: badge, SOUND: sound): ALERT = {
    val __obj = js.Dynamic.literal(ALERT = ALERT.asInstanceOf[js.Any], BADGE = BADGE.asInstanceOf[js.Any], SOUND = SOUND.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALERT]
  }
  @scala.inline
  implicit class ALERTOps[Self <: ALERT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withALERT(value: alert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALERT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBADGE(value: badge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BADGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSOUND(value: sound): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SOUND")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

