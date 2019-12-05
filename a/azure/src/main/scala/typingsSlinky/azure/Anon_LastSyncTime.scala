package typingsSlinky.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LastSyncTime extends js.Object {
  var LastSyncTime: js.Date
  var Status: String
}

object Anon_LastSyncTime {
  @scala.inline
  def apply(LastSyncTime: js.Date, Status: String): Anon_LastSyncTime = {
    val __obj = js.Dynamic.literal(LastSyncTime = LastSyncTime.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LastSyncTime]
  }
}

