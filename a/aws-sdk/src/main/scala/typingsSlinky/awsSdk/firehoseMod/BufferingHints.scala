package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferingHints extends js.Object {
  /**
    * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300. This parameter is optional but if you specify a value for it, you must also specify a value for SizeInMBs, and vice versa.
    */
  var IntervalInSeconds: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.IntervalInSeconds] = js.native
  /**
    * Buffer incoming data to the specified size, in MiBs, before delivering it to the destination. The default value is 5. This parameter is optional but if you specify a value for it, you must also specify a value for IntervalInSeconds, and vice versa. We recommend setting this parameter to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MiB/sec, the value should be 10 MiB or higher.
    */
  var SizeInMBs: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.SizeInMBs] = js.native
}

object BufferingHints {
  @scala.inline
  def apply(): BufferingHints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferingHints]
  }
  @scala.inline
  implicit class BufferingHintsOps[Self <: BufferingHints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntervalInSeconds(value: IntervalInSeconds): Self = {
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
    def withSizeInMBs(value: SizeInMBs): Self = {
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

