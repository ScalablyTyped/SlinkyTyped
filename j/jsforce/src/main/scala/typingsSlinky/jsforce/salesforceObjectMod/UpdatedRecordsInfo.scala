package typingsSlinky.jsforce.salesforceObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatedRecordsInfo extends js.Object {
  var ids: js.Array[String] = js.native
  var latestDateCovered: String = js.native
}

object UpdatedRecordsInfo {
  @scala.inline
  def apply(ids: js.Array[String], latestDateCovered: String): UpdatedRecordsInfo = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], latestDateCovered = latestDateCovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedRecordsInfo]
  }
  @scala.inline
  implicit class UpdatedRecordsInfoOps[Self <: UpdatedRecordsInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestDateCovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestDateCovered")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

