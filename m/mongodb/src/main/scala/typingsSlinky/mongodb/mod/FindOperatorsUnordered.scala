package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindOperatorsUnordered extends js.Object {
  var length: scala.Double = js.native
  def remove(): UnorderedBulkOperation = js.native
  def removeOne(): UnorderedBulkOperation = js.native
  def replaceOne(doc: js.Object): UnorderedBulkOperation = js.native
  def update(doc: js.Object): UnorderedBulkOperation = js.native
  def updateOne(doc: js.Object): UnorderedBulkOperation = js.native
  def upsert(): FindOperatorsUnordered = js.native
}

object FindOperatorsUnordered {
  @scala.inline
  def apply(
    length: scala.Double,
    remove: () => UnorderedBulkOperation,
    removeOne: () => UnorderedBulkOperation,
    replaceOne: js.Object => UnorderedBulkOperation,
    update: js.Object => UnorderedBulkOperation,
    updateOne: js.Object => UnorderedBulkOperation,
    upsert: () => FindOperatorsUnordered
  ): FindOperatorsUnordered = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), removeOne = js.Any.fromFunction0(removeOne), replaceOne = js.Any.fromFunction1(replaceOne), update = js.Any.fromFunction1(update), updateOne = js.Any.fromFunction1(updateOne), upsert = js.Any.fromFunction0(upsert))
    __obj.asInstanceOf[FindOperatorsUnordered]
  }
  @scala.inline
  implicit class FindOperatorsUnorderedOps[Self <: FindOperatorsUnordered] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: () => UnorderedBulkOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveOne(value: () => UnorderedBulkOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOne")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReplaceOne(value: js.Object => UnorderedBulkOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceOne")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: js.Object => UnorderedBulkOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateOne(value: js.Object => UnorderedBulkOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOne")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpsert(value: () => FindOperatorsUnordered): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

