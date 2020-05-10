package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindOperatorsOrdered extends js.Object {
  def delete(): OrderedBulkOperation = js.native
  def deleteOne(): OrderedBulkOperation = js.native
  def replaceOne(doc: js.Object): OrderedBulkOperation = js.native
  def update(doc: js.Object): OrderedBulkOperation = js.native
  def updateOne(doc: js.Object): OrderedBulkOperation = js.native
  def upsert(): FindOperatorsOrdered = js.native
}

object FindOperatorsOrdered {
  @scala.inline
  def apply(
    delete: () => OrderedBulkOperation,
    deleteOne: () => OrderedBulkOperation,
    replaceOne: js.Object => OrderedBulkOperation,
    update: js.Object => OrderedBulkOperation,
    updateOne: js.Object => OrderedBulkOperation,
    upsert: () => FindOperatorsOrdered
  ): FindOperatorsOrdered = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteOne = js.Any.fromFunction0(deleteOne), replaceOne = js.Any.fromFunction1(replaceOne), update = js.Any.fromFunction1(update), updateOne = js.Any.fromFunction1(updateOne), upsert = js.Any.fromFunction0(upsert))
    __obj.asInstanceOf[FindOperatorsOrdered]
  }
  @scala.inline
  implicit class FindOperatorsOrderedOps[Self <: FindOperatorsOrdered] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: () => OrderedBulkOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeleteOne(value: () => OrderedBulkOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOne")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReplaceOne(value: js.Object => OrderedBulkOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceOne")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: js.Object => OrderedBulkOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateOne(value: js.Object => OrderedBulkOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOne")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpsert(value: () => FindOperatorsOrdered): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

