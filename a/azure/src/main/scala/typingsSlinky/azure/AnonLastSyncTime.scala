package typingsSlinky.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLastSyncTime extends js.Object {
  var LastSyncTime: js.Date
  var Status: String
}

object AnonLastSyncTime {
  @scala.inline
  def apply(LastSyncTime: js.Date, Status: String): AnonLastSyncTime = {
    val __obj = js.Dynamic.literal(LastSyncTime = LastSyncTime.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLastSyncTime]
  }
}

