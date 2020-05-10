package typingsSlinky.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastSeenObjectIdEventDataType extends js.Object {
  var lastSeenObjectId: Double = js.native
  var timestamp: Double = js.native
}

object LastSeenObjectIdEventDataType {
  @scala.inline
  def apply(lastSeenObjectId: Double, timestamp: Double): LastSeenObjectIdEventDataType = {
    val __obj = js.Dynamic.literal(lastSeenObjectId = lastSeenObjectId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastSeenObjectIdEventDataType]
  }
  @scala.inline
  implicit class LastSeenObjectIdEventDataTypeOps[Self <: LastSeenObjectIdEventDataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastSeenObjectId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSeenObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

