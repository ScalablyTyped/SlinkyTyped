package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkWriteOpResultObject extends js.Object {
  var deletedCount: js.UndefOr[scala.Double] = js.native
  var insertedCount: js.UndefOr[scala.Double] = js.native
  var insertedIds: js.UndefOr[js.Any] = js.native
  var matchedCount: js.UndefOr[scala.Double] = js.native
  var modifiedCount: js.UndefOr[scala.Double] = js.native
  var result: js.UndefOr[js.Any] = js.native
  var upsertedCount: js.UndefOr[scala.Double] = js.native
  var upsertedIds: js.UndefOr[js.Any] = js.native
}

object BulkWriteOpResultObject {
  @scala.inline
  def apply(): BulkWriteOpResultObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkWriteOpResultObject]
  }
  @scala.inline
  implicit class BulkWriteOpResultObjectOps[Self <: BulkWriteOpResultObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedCount(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertedCount(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertedIds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertedIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertedIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertedIds")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchedCount(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedCount(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withUpsertedCount(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsertedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpsertedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsertedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withUpsertedIds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsertedIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpsertedIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsertedIds")(js.undefined)
        ret
    }
  }
  
}

