package typingsSlinky.awsSdkClientXrayNode.typesSamplingStatisticSummaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSamplingStatisticSummary extends SamplingStatisticSummary {
  /**
    * <p>The start time of the reporting window.</p>
    */
  @JSName("Timestamp")
  var Timestamp_UnmarshalledSamplingStatisticSummary: js.UndefOr[js.Date] = js.native
}

object UnmarshalledSamplingStatisticSummary {
  @scala.inline
  def apply(): UnmarshalledSamplingStatisticSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSamplingStatisticSummary]
  }
  @scala.inline
  implicit class UnmarshalledSamplingStatisticSummaryOps[Self <: UnmarshalledSamplingStatisticSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(js.undefined)
        ret
    }
  }
  
}

