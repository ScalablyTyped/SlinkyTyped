package typingsSlinky.reactDashNativeDashPermissions

import typingsSlinky.reactDashNativeDashPermissions.reactDashNativeDashPermissionsStrings.blocked
import typingsSlinky.reactDashNativeDashPermissions.reactDashNativeDashPermissionsStrings.denied
import typingsSlinky.reactDashNativeDashPermissions.reactDashNativeDashPermissionsStrings.granted
import typingsSlinky.reactDashNativeDashPermissions.reactDashNativeDashPermissionsStrings.unavailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BLOCKED extends js.Object {
  var BLOCKED: blocked
  var DENIED: denied
  var GRANTED: granted
  var UNAVAILABLE: unavailable
}

object Anon_BLOCKED {
  @scala.inline
  def apply(BLOCKED: blocked, DENIED: denied, GRANTED: granted, UNAVAILABLE: unavailable): Anon_BLOCKED = {
    val __obj = js.Dynamic.literal(BLOCKED = BLOCKED.asInstanceOf[js.Any], DENIED = DENIED.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any], UNAVAILABLE = UNAVAILABLE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BLOCKED]
  }
}

