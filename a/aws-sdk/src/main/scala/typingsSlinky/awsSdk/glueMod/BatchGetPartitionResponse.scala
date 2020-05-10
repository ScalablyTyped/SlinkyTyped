package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetPartitionResponse extends js.Object {
  /**
    * A list of the requested partitions.
    */
  var Partitions: js.UndefOr[PartitionList] = js.native
  /**
    * A list of the partition values in the request for which partitions were not returned.
    */
  var UnprocessedKeys: js.UndefOr[BatchGetPartitionValueList] = js.native
}

object BatchGetPartitionResponse {
  @scala.inline
  def apply(): BatchGetPartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetPartitionResponse]
  }
  @scala.inline
  implicit class BatchGetPartitionResponseOps[Self <: BatchGetPartitionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartitions(value: PartitionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Partitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Partitions")(js.undefined)
        ret
    }
    @scala.inline
    def withUnprocessedKeys(value: BatchGetPartitionValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprocessedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedKeys")(js.undefined)
        ret
    }
  }
  
}

