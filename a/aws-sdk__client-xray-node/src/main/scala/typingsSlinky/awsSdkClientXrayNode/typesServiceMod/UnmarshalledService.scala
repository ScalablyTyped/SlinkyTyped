package typingsSlinky.awsSdkClientXrayNode.typesServiceMod

import typingsSlinky.awsSdkClientXrayNode.typesEdgeMod.UnmarshalledEdge
import typingsSlinky.awsSdkClientXrayNode.typesHistogramEntryMod.UnmarshalledHistogramEntry
import typingsSlinky.awsSdkClientXrayNode.typesServiceStatisticsMod.UnmarshalledServiceStatistics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledService extends Service {
  /**
    * <p>A histogram that maps the spread of service durations.</p>
    */
  @JSName("DurationHistogram")
  var DurationHistogram_UnmarshalledService: js.UndefOr[js.Array[UnmarshalledHistogramEntry]] = js.native
  /**
    * <p>Connections to downstream services.</p>
    */
  @JSName("Edges")
  var Edges_UnmarshalledService: js.UndefOr[js.Array[UnmarshalledEdge]] = js.native
  /**
    * <p>The end time of the last segment that the service generated.</p>
    */
  @JSName("EndTime")
  var EndTime_UnmarshalledService: js.UndefOr[js.Date] = js.native
  /**
    * <p>A list of names for the service, including the canonical name.</p>
    */
  @JSName("Names")
  var Names_UnmarshalledService: js.UndefOr[js.Array[String]] = js.native
  /**
    * <p>A histogram that maps the spread of service response times.</p>
    */
  @JSName("ResponseTimeHistogram")
  var ResponseTimeHistogram_UnmarshalledService: js.UndefOr[js.Array[UnmarshalledHistogramEntry]] = js.native
  /**
    * <p>The start time of the first segment that the service generated.</p>
    */
  @JSName("StartTime")
  var StartTime_UnmarshalledService: js.UndefOr[js.Date] = js.native
  /**
    * <p>Aggregated statistics for the service.</p>
    */
  @JSName("SummaryStatistics")
  var SummaryStatistics_UnmarshalledService: js.UndefOr[UnmarshalledServiceStatistics] = js.native
}

object UnmarshalledService {
  @scala.inline
  def apply(): UnmarshalledService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledService]
  }
  @scala.inline
  implicit class UnmarshalledServiceOps[Self <: UnmarshalledService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationHistogram(value: js.Array[UnmarshalledHistogramEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationHistogram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationHistogram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationHistogram")(js.undefined)
        ret
    }
    @scala.inline
    def withEdges(value: js.Array[UnmarshalledEdge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Edges")(js.undefined)
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
    def withNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(js.undefined)
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
    def withSummaryStatistics(value: UnmarshalledServiceStatistics): Self = {
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

