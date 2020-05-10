package typingsSlinky.awsLambda.kinesisFirehoseTransformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseRecordMetadata extends js.Object {
  var approximateArrivalTimestamp: String = js.native
  var partitionKey: String = js.native
  var sequenceNumber: String = js.native
  var shardId: String = js.native
  var subsequenceNumber: String = js.native
}

object FirehoseRecordMetadata {
  @scala.inline
  def apply(
    approximateArrivalTimestamp: String,
    partitionKey: String,
    sequenceNumber: String,
    shardId: String,
    subsequenceNumber: String
  ): FirehoseRecordMetadata = {
    val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], shardId = shardId.asInstanceOf[js.Any], subsequenceNumber = subsequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseRecordMetadata]
  }
  @scala.inline
  implicit class FirehoseRecordMetadataOps[Self <: FirehoseRecordMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproximateArrivalTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approximateArrivalTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartitionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubsequenceNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subsequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

