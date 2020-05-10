package typingsSlinky.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamInput extends js.Object {
  /**
    * The shard ID of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedShardId in the previous operation. 
    */
  var ExclusiveStartShardId: js.UndefOr[ShardId] = js.native
  /**
    * The maximum number of shard objects to return. The upper limit is 100.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.native
  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var StreamArn: typingsSlinky.awsSdk.dynamodbstreamsMod.StreamArn = js.native
}

object DescribeStreamInput {
  @scala.inline
  def apply(StreamArn: StreamArn): DescribeStreamInput = {
    val __obj = js.Dynamic.literal(StreamArn = StreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamInput]
  }
  @scala.inline
  implicit class DescribeStreamInputOps[Self <: DescribeStreamInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamArn(value: StreamArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclusiveStartShardId(value: ShardId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExclusiveStartShardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusiveStartShardId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExclusiveStartShardId")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: PositiveIntegerObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
  }
  
}

