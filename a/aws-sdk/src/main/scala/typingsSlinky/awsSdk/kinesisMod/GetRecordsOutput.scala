package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecordsOutput extends js.Object {
  /**
    * The number of milliseconds the GetRecords response is from the tip of the stream, indicating how far behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are no new records to process at this moment.
    */
  var MillisBehindLatest: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.MillisBehindLatest] = js.native
  /**
    * The next position in the shard from which to start sequentially reading data records. If set to null, the shard has been closed and the requested iterator does not return any more data. 
    */
  var NextShardIterator: js.UndefOr[ShardIterator] = js.native
  /**
    * The data records retrieved from the shard.
    */
  var Records: RecordList = js.native
}

object GetRecordsOutput {
  @scala.inline
  def apply(Records: RecordList): GetRecordsOutput = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecordsOutput]
  }
  @scala.inline
  implicit class GetRecordsOutputOps[Self <: GetRecordsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecords(value: RecordList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMillisBehindLatest(value: MillisBehindLatest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MillisBehindLatest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMillisBehindLatest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MillisBehindLatest")(js.undefined)
        ret
    }
    @scala.inline
    def withNextShardIterator(value: ShardIterator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextShardIterator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextShardIterator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextShardIterator")(js.undefined)
        ret
    }
  }
  
}

