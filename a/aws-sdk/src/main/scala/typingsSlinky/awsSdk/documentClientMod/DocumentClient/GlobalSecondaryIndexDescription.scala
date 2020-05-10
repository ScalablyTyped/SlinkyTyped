package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalSecondaryIndexDescription extends js.Object {
  /**
    * Indicates whether the index is currently backfilling. Backfilling is the process of reading items from the table and determining whether they can be added to the index. (Not all items will qualify: For example, a partition key cannot have any duplicate values.) If an item can be added to the index, DynamoDB will do so. After all items have been processed, the backfilling operation is complete and Backfilling is false. You can delete an index that is being created during the Backfilling phase when IndexStatus is set to CREATING and Backfilling is true. You can't delete the index that is being created when IndexStatus is set to CREATING and Backfilling is false.   For indexes that were created during a CreateTable operation, the Backfilling attribute does not appear in the DescribeTable output. 
    */
  var Backfilling: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.Backfilling] = js.native
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the index.
    */
  var IndexArn: js.UndefOr[String] = js.native
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
  /**
    * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var IndexSizeBytes: js.UndefOr[Long] = js.native
  /**
    * The current state of the global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.  
    */
  var IndexStatus: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.IndexStatus] = js.native
  /**
    * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var ItemCount: js.UndefOr[Long] = js.native
  /**
    * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
    */
  var KeySchema: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.KeySchema] = js.native
  /**
    * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
    */
  var Projection: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.Projection] = js.native
  /**
    * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
    */
  var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.native
}

object GlobalSecondaryIndexDescription {
  @scala.inline
  def apply(): GlobalSecondaryIndexDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalSecondaryIndexDescription]
  }
  @scala.inline
  implicit class GlobalSecondaryIndexDescriptionOps[Self <: GlobalSecondaryIndexDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackfilling(value: Backfilling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Backfilling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackfilling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Backfilling")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexArn")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexName(value: IndexName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexName")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexSizeBytes(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexSizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexStatus(value: IndexStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCount(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withKeySchema(value: KeySchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeySchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeySchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeySchema")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: Projection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Projection")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedThroughput(value: ProvisionedThroughputDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedThroughput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughput")(js.undefined)
        ret
    }
  }
  
}

