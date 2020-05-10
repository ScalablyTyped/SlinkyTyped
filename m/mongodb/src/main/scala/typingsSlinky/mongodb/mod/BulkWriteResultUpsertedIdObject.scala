package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkWriteResultUpsertedIdObject extends js.Object {
  var _id: typingsSlinky.bson.mod.ObjectId = js.native
  var index: scala.Double = js.native
}

object BulkWriteResultUpsertedIdObject {
  @scala.inline
  def apply(_id: typingsSlinky.bson.mod.ObjectId, index: scala.Double): BulkWriteResultUpsertedIdObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteResultUpsertedIdObject]
  }
  @scala.inline
  implicit class BulkWriteResultUpsertedIdObjectOps[Self <: BulkWriteResultUpsertedIdObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_id(value: typingsSlinky.bson.mod.ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

