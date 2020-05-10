package typingsSlinky.awsSdkClientDynamodbNode.typesLocalSecondaryIndexMod

import typingsSlinky.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typingsSlinky.awsSdkClientDynamodbNode.typesProjectionMod.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalSecondaryIndex extends js.Object {
  /**
    * <p>The name of the local secondary index. The name must be unique among all other indexes on this table.</p>
    */
  var IndexName: String = js.native
  /**
    * <p>The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
    */
  var KeySchema: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement] = js.native
  /**
    * <p>Represents attributes that are copied (projected) from the table into the local secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
    */
  var Projection: typingsSlinky.awsSdkClientDynamodbNode.typesProjectionMod.Projection = js.native
}

object LocalSecondaryIndex {
  @scala.inline
  def apply(
    IndexName: String,
    KeySchema: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement],
    Projection: Projection
  ): LocalSecondaryIndex = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalSecondaryIndex]
  }
  @scala.inline
  implicit class LocalSecondaryIndexOps[Self <: LocalSecondaryIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexName")(value.asInstanceOf[js.Any])
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
    def withProjection(value: Projection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Projection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

