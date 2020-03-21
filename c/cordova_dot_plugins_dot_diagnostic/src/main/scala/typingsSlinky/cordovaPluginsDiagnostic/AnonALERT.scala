package typingsSlinky.cordovaPluginsDiagnostic

import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.alert
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.badge
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.sound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonALERT extends js.Object {
  var ALERT: alert
  var BADGE: badge
  var SOUND: sound
}

object AnonALERT {
  @scala.inline
  def apply(ALERT: alert, BADGE: badge, SOUND: sound): AnonALERT = {
    val __obj = js.Dynamic.literal(ALERT = ALERT.asInstanceOf[js.Any], BADGE = BADGE.asInstanceOf[js.Any], SOUND = SOUND.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonALERT]
  }
}

