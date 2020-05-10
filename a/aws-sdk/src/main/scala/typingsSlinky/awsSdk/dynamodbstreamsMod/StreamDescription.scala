package typingsSlinky.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamDescription extends js.Object {
  /**
    * The date and time when the request to create this stream was issued.
    */
  var CreationRequestDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The key attribute(s) of the stream's DynamoDB table.
    */
  var KeySchema: js.UndefOr[typingsSlinky.awsSdk.dynamodbstreamsMod.KeySchema] = js.native
  /**
    * The shard ID of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedShardId is empty, then the "last page" of results has been processed and there is currently no more data to be retrieved. If LastEvaluatedShardId is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedShardId is empty.
    */
  var LastEvaluatedShardId: js.UndefOr[ShardId] = js.native
  /**
    * The shards that comprise the stream.
    */
  var Shards: js.UndefOr[ShardDescriptionList] = js.native
  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var StreamArn: js.UndefOr[typingsSlinky.awsSdk.dynamodbstreamsMod.StreamArn] = js.native
  /**
    * A timestamp, in ISO 8601 format, for this stream. Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:   the AWS customer ID.   the table name   the StreamLabel   
    */
  var StreamLabel: js.UndefOr[String] = js.native
  /**
    * Indicates the current status of the stream:    ENABLING - Streams is currently being enabled on the DynamoDB table.    ENABLED - the stream is enabled.    DISABLING - Streams is currently being disabled on the DynamoDB table.    DISABLED - the stream is disabled.  
    */
  var StreamStatus: js.UndefOr[typingsSlinky.awsSdk.dynamodbstreamsMod.StreamStatus] = js.native
  /**
    * Indicates the format of the records within this stream:    KEYS_ONLY - only the key attributes of items that were modified in the DynamoDB table.    NEW_IMAGE - entire items from the table, as they appeared after they were modified.    OLD_IMAGE - entire items from the table, as they appeared before they were modified.    NEW_AND_OLD_IMAGES - both the new and the old images of the items from the table.  
    */
  var StreamViewType: js.UndefOr[typingsSlinky.awsSdk.dynamodbstreamsMod.StreamViewType] = js.native
  /**
    * The DynamoDB table with which the stream is associated.
    */
  var TableName: js.UndefOr[typingsSlinky.awsSdk.dynamodbstreamsMod.TableName] = js.native
}

object StreamDescription {
  @scala.inline
  def apply(): StreamDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamDescription]
  }
  @scala.inline
  implicit class StreamDescriptionOps[Self <: StreamDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationRequestDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationRequestDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationRequestDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationRequestDateTime")(js.undefined)
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
    def withLastEvaluatedShardId(value: ShardId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedShardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastEvaluatedShardId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedShardId")(js.undefined)
        ret
    }
    @scala.inline
    def withShards(value: ShardDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shards")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamArn(value: StreamArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamStatus(value: StreamStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamViewType(value: StreamViewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamViewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamViewType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamViewType")(js.undefined)
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
  }
  
}

