package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for PartitionQuery or PartitionRead
  */
@js.native
trait SchemaPartitionResponse extends js.Object {
  /**
    * Partitions created by this request.
    */
  var partitions: js.UndefOr[js.Array[SchemaPartition]] = js.native
  /**
    * Transaction created by this request.
    */
  var transaction: js.UndefOr[SchemaTransaction] = js.native
}

object SchemaPartitionResponse {
  @scala.inline
  def apply(): SchemaPartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartitionResponse]
  }
  @scala.inline
  implicit class SchemaPartitionResponseOps[Self <: SchemaPartitionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartitions(value: js.Array[SchemaPartition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitions")(js.undefined)
        ret
    }
    @scala.inline
    def withTransaction(value: SchemaTransaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(js.undefined)
        ret
    }
  }
  
}

