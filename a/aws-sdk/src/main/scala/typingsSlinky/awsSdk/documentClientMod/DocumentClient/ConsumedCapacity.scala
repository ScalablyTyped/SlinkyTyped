package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumedCapacity extends js.Object {
  /**
    * The total number of capacity units consumed by the operation.
    */
  var CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
  /**
    * The amount of throughput consumed on each global index affected by the operation.
    */
  var GlobalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.native
  /**
    * The amount of throughput consumed on each local index affected by the operation.
    */
  var LocalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.native
  /**
    * The total number of read capacity units consumed by the operation.
    */
  var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
  /**
    * The amount of throughput consumed on the table affected by the operation.
    */
  var Table: js.UndefOr[Capacity] = js.native
  /**
    * The name of the table that was affected by the operation.
    */
  var TableName: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
  /**
    * The total number of write capacity units consumed by the operation.
    */
  var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
}

object ConsumedCapacity {
  @scala.inline
  def apply(): ConsumedCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumedCapacity]
  }
  @scala.inline
  implicit class ConsumedCapacityOps[Self <: ConsumedCapacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacityUnits(value: ConsumedCapacityUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalSecondaryIndexes(value: SecondaryIndexesCapacityMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalSecondaryIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalSecondaryIndexes(value: SecondaryIndexesCapacityMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalSecondaryIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalSecondaryIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withReadCapacityUnits(value: ConsumedCapacityUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadCapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadCapacityUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: Capacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Table")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteCapacityUnits(value: ConsumedCapacityUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteCapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteCapacityUnits")(js.undefined)
        ret
    }
  }
  
}

