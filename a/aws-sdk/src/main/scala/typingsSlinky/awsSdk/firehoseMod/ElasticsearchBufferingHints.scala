package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchBufferingHints extends js.Object {
  /**
    * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300 (5 minutes).
    */
  var IntervalInSeconds: js.UndefOr[ElasticsearchBufferingIntervalInSeconds] = js.native
  /**
    * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5. We recommend setting this parameter to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec, the value should be 10 MB or higher.
    */
  var SizeInMBs: js.UndefOr[ElasticsearchBufferingSizeInMBs] = js.native
}

object ElasticsearchBufferingHints {
  @scala.inline
  def apply(): ElasticsearchBufferingHints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticsearchBufferingHints]
  }
  @scala.inline
  implicit class ElasticsearchBufferingHintsOps[Self <: ElasticsearchBufferingHints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntervalInSeconds(value: ElasticsearchBufferingIntervalInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntervalInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntervalInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeInMBs(value: ElasticsearchBufferingSizeInMBs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInMBs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeInMBs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInMBs")(js.undefined)
        ret
    }
  }
  
}

