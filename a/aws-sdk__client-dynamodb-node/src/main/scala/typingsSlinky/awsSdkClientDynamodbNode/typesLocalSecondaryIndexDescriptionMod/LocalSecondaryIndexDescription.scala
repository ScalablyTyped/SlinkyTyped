package typingsSlinky.awsSdkClientDynamodbNode.typesLocalSecondaryIndexDescriptionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typingsSlinky.awsSdkClientDynamodbNode.typesProjectionMod.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalSecondaryIndexDescription extends js.Object {
  /**
    * <p>The Amazon Resource Name (ARN) that uniquely identifies the index.</p>
    */
  var IndexArn: js.UndefOr[String] = js.native
  /**
    * <p>Represents the name of the local secondary index.</p>
    */
  var IndexName: js.UndefOr[String] = js.native
  /**
    * <p>The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p>
    */
  var IndexSizeBytes: js.UndefOr[Double] = js.native
  /**
    * <p>The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p>
    */
  var ItemCount: js.UndefOr[Double] = js.native
  /**
    * <p>The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
    */
  var KeySchema: js.UndefOr[js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement]] = js.native
  /**
    * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
    */
  var Projection: js.UndefOr[typingsSlinky.awsSdkClientDynamodbNode.typesProjectionMod.Projection] = js.native
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
    def withIndexName(value: String): Self = {
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
    def withIndexSizeBytes(value: Double): Self = {
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
    def withItemCount(value: Double): Self = {
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
    def withKeySchemaIterable(value: js.Iterable[KeySchemaElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeySchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeySchema(value: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement]): Self = {
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

