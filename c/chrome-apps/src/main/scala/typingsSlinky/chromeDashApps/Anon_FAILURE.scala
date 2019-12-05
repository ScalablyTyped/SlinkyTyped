package typingsSlinky.chromeDashApps

import typingsSlinky.chromeDashApps.chromeDashAppsStrings.failure
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.in_use_
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.no_such_device
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FAILURE extends js.Object {
  var FAILURE: failure
  var IN_USE: in_use_
  var NO_SUCH_DEVICE: no_such_device
  var SUCCESS: success
}

object Anon_FAILURE {
  @scala.inline
  def apply(FAILURE: failure, IN_USE: in_use_, NO_SUCH_DEVICE: no_such_device, SUCCESS: success): Anon_FAILURE = {
    val __obj = js.Dynamic.literal(FAILURE = FAILURE.asInstanceOf[js.Any], IN_USE = IN_USE.asInstanceOf[js.Any], NO_SUCH_DEVICE = NO_SUCH_DEVICE.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FAILURE]
  }
}

