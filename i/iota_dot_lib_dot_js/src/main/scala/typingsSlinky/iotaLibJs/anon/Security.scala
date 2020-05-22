package typingsSlinky.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Security extends js.Object {
  var end: Double
  var security: js.UndefOr[typingsSlinky.iotaLibJs.mod.Security] = js.undefined
  var start: Double
}

object Security {
  @scala.inline
  def apply(end: Double, start: Double, security: typingsSlinky.iotaLibJs.mod.Security = null): Security = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    __obj.asInstanceOf[Security]
  }
}

