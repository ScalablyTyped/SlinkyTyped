package typingsSlinky.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetShardIteratorInput extends js.Object {
  /**
    * The sequence number of a stream record in the shard from which to start reading.
    */
  var SequenceNumber: js.UndefOr[typingsSlinky.awsSdk.dynamodbstreamsMod.SequenceNumber] = js.native
  /**
    * The identifier of the shard. The iterator will be returned for this shard ID.
    */
  var ShardId: typingsSlinky.awsSdk.dynamodbstreamsMod.ShardId = js.native
  /**
    * Determines how the shard iterator is used to start reading stream records from the shard:    AT_SEQUENCE_NUMBER - Start reading exactly from the position denoted by a specific sequence number.    AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by a specific sequence number.    TRIM_HORIZON - Start reading at the last (untrimmed) stream record, which is the oldest record in the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this limit are subject to removal (trimming) from the stream.    LATEST - Start reading just after the most recent stream record in the shard, so that you always read the most recent data in the shard.  
    */
  var ShardIteratorType: typingsSlinky.awsSdk.dynamodbstreamsMod.ShardIteratorType = js.native
  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var StreamArn: typingsSlinky.awsSdk.dynamodbstreamsMod.StreamArn = js.native
}

object GetShardIteratorInput {
  @scala.inline
  def apply(ShardId: ShardId, ShardIteratorType: ShardIteratorType, StreamArn: StreamArn): GetShardIteratorInput = {
    val __obj = js.Dynamic.literal(ShardId = ShardId.asInstanceOf[js.Any], ShardIteratorType = ShardIteratorType.asInstanceOf[js.Any], StreamArn = StreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetShardIteratorInput]
  }
  @scala.inline
  implicit class GetShardIteratorInputOps[Self <: GetShardIteratorInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShardId(value: ShardId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShardIteratorType(value: ShardIteratorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShardIteratorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamArn(value: StreamArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceNumber(value: SequenceNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequenceNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceNumber")(js.undefined)
        ret
    }
  }
  
}

