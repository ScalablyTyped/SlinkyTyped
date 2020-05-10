package typingsSlinky.awsSdkClientDynamodbNode.typesCreateGlobalSecondaryIndexActionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typingsSlinky.awsSdkClientDynamodbNode.typesProjectionMod.Projection
import typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGlobalSecondaryIndexAction extends js.Object {
  /**
    * <p>The name of the global secondary index to be created.</p>
    */
  var IndexName: String = js.native
  /**
    * <p>The key schema for the global secondary index.</p>
    */
  var KeySchema: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement] = js.native
  /**
    * <p>Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.</p>
    */
  var Projection: typingsSlinky.awsSdkClientDynamodbNode.typesProjectionMod.Projection = js.native
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ProvisionedThroughput: typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput = js.native
}

object CreateGlobalSecondaryIndexAction {
  @scala.inline
  def apply(
    IndexName: String,
    KeySchema: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement],
    Projection: Projection,
    ProvisionedThroughput: ProvisionedThroughput
  ): CreateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalSecondaryIndexAction]
  }
  @scala.inline
  implicit class CreateGlobalSecondaryIndexActionOps[Self <: CreateGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withProvisionedThroughput(value: ProvisionedThroughput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughput")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

