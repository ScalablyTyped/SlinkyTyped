package typingsSlinky.awsSdkClientXrayNode.typesEdgeMod

import typingsSlinky.awsSdkClientXrayNode.typesAliasMod.UnmarshalledAlias
import typingsSlinky.awsSdkClientXrayNode.typesEdgeStatisticsMod.UnmarshalledEdgeStatistics
import typingsSlinky.awsSdkClientXrayNode.typesHistogramEntryMod.UnmarshalledHistogramEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEdge extends Edge {
  /**
    * <p>Aliases for the edge.</p>
    */
  @JSName("Aliases")
  var Aliases_UnmarshalledEdge: js.UndefOr[js.Array[UnmarshalledAlias]] = js.native
  /**
    * <p>The end time of the last segment on the edge.</p>
    */
  @JSName("EndTime")
  var EndTime_UnmarshalledEdge: js.UndefOr[js.Date] = js.native
  /**
    * <p>A histogram that maps the spread of client response times on an edge.</p>
    */
  @JSName("ResponseTimeHistogram")
  var ResponseTimeHistogram_UnmarshalledEdge: js.UndefOr[js.Array[UnmarshalledHistogramEntry]] = js.native
  /**
    * <p>The start time of the first segment on the edge.</p>
    */
  @JSName("StartTime")
  var StartTime_UnmarshalledEdge: js.UndefOr[js.Date] = js.native
  /**
    * <p>Response statistics for segments on the edge.</p>
    */
  @JSName("SummaryStatistics")
  var SummaryStatistics_UnmarshalledEdge: js.UndefOr[UnmarshalledEdgeStatistics] = js.native
}

object UnmarshalledEdge {
  @scala.inline
  def apply(): UnmarshalledEdge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEdge]
  }
  @scala.inline
  implicit class UnmarshalledEdgeOps[Self <: UnmarshalledEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliases(value: js.Array[UnmarshalledAlias]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTimeHistogram(value: js.Array[UnmarshalledHistogramEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseTimeHistogram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTimeHistogram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseTimeHistogram")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryStatistics(value: UnmarshalledEdgeStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SummaryStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SummaryStatistics")(js.undefined)
        ret
    }
  }
  
}

