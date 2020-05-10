package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalSecondaryIndexDescription extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the index.
    */
  var IndexArn: js.UndefOr[String] = js.native
  /**
    * Represents the name of the local secondary index.
    */
  var IndexName: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
  /**
    * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var IndexSizeBytes: js.UndefOr[Long] = js.native
  /**
    * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var ItemCount: js.UndefOr[Long] = js.native
  /**
    * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
    */
  var KeySchema: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.KeySchema] = js.native
  /**
    * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
    */
  var Projection: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.Projection] = js.native
}

object LocalSecondaryIndexDescription {
  @scala.inline
  def apply(): LocalSecondaryIndexDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalSecondaryIndexDescription]
  }
  @scala.inline
  implicit class LocalSecondaryIndexDescriptionOps[Self <: LocalSecondaryIndexDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

