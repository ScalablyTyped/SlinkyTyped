package typingsSlinky.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecordsOutput extends js.Object {
  /**
    * The next position in the shard from which to start sequentially reading stream records. If set to null, the shard has been closed and the requested iterator will not return any more data.
    */
  var NextShardIterator: js.UndefOr[ShardIterator] = js.native
  /**
    * The stream records from the shard, which were retrieved using the shard iterator.
    */
  var Records: js.UndefOr[RecordList] = js.native
}

object GetRecordsOutput {
  @scala.inline
  def apply(): GetRecordsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecordsOutput]
  }
  @scala.inline
  implicit class GetRecordsOutputOps[Self <: GetRecordsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withRecords(value: RecordList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(js.undefined)
        ret
    }
  }
  
}

