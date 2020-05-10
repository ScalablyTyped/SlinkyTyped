package typingsSlinky.awsSdkClientXrayNode.typesEdgeStatisticsMod

import typingsSlinky.awsSdkClientXrayNode.typesErrorStatisticsMod.UnmarshalledErrorStatistics
import typingsSlinky.awsSdkClientXrayNode.typesFaultStatisticsMod.UnmarshalledFaultStatistics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEdgeStatistics extends EdgeStatistics {
  /**
    * <p>Information about requests that failed with a 4xx Client Error status code.</p>
    */
  @JSName("ErrorStatistics")
  var ErrorStatistics_UnmarshalledEdgeStatistics: js.UndefOr[UnmarshalledErrorStatistics] = js.native
  /**
    * <p>Information about requests that failed with a 5xx Server Error status code.</p>
    */
  @JSName("FaultStatistics")
  var FaultStatistics_UnmarshalledEdgeStatistics: js.UndefOr[UnmarshalledFaultStatistics] = js.native
}

object UnmarshalledEdgeStatistics {
  @scala.inline
  def apply(): UnmarshalledEdgeStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEdgeStatistics]
  }
  @scala.inline
  implicit class UnmarshalledEdgeStatisticsOps[Self <: UnmarshalledEdgeStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorStatistics(value: UnmarshalledErrorStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorStatistics")(js.undefined)
        ret
    }
    @scala.inline
    def withFaultStatistics(value: UnmarshalledFaultStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaultStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaultStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaultStatistics")(js.undefined)
        ret
    }
  }
  
}

