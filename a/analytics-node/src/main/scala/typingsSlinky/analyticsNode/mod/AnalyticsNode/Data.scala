package typingsSlinky.analyticsNode.mod.AnalyticsNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var batch: js.Array[Message]
  var sentAt: js.Date
  var timestamp: js.Date
}

object Data {
  @scala.inline
  def apply(batch: js.Array[Message], sentAt: js.Date, timestamp: js.Date): Data = {
    val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any], sentAt = sentAt.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Data]
  }
}

