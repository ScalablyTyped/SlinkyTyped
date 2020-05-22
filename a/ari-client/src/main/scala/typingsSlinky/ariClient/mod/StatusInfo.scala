package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusInfo extends js.Object {
  var last_reload_time: js.Date
  /* Properties */
  var startup_time: js.Date
}

object StatusInfo {
  @scala.inline
  def apply(last_reload_time: js.Date, startup_time: js.Date): StatusInfo = {
    val __obj = js.Dynamic.literal(last_reload_time = last_reload_time.asInstanceOf[js.Any], startup_time = startup_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusInfo]
  }
}

