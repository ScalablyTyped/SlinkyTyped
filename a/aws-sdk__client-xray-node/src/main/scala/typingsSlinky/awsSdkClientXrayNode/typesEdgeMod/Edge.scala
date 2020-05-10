package typingsSlinky.awsSdkClientXrayNode.typesEdgeMod

import typingsSlinky.awsSdkClientXrayNode.typesAliasMod.Alias
import typingsSlinky.awsSdkClientXrayNode.typesEdgeStatisticsMod.EdgeStatistics
import typingsSlinky.awsSdkClientXrayNode.typesHistogramEntryMod.HistogramEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edge extends js.Object {
  /**
    * <p>Aliases for the edge.</p>
    */
  var Aliases: js.UndefOr[js.Array[Alias] | js.Iterable[Alias]] = js.native
  /**
    * <p>The end time of the last segment on the edge.</p>
    */
  var EndTime: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>Identifier of the edge. Unique within a service map.</p>
    */
  var ReferenceId: js.UndefOr[Double] = js.native
  /**
    * <p>A histogram that maps the spread of client response times on an edge.</p>
    */
  var ResponseTimeHistogram: js.UndefOr[js.Array[HistogramEntry] | js.Iterable[HistogramEntry]] = js.native
  /**
    * <p>The start time of the first segment on the edge.</p>
    */
  var StartTime: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>Response statistics for segments on the edge.</p>
    */
  var SummaryStatistics: js.UndefOr[EdgeStatistics] = js.native
}

object Edge {
  @scala.inline
  def apply(): Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edge]
  }
  @scala.inline
  implicit class EdgeOps[Self <: Edge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasesIterable(value: js.Iterable[Alias]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAliases(value: js.Array[Alias] | js.Iterable[Alias]): Self = {
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
    def withEndTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date | String | Double): Self = {
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
    def withReferenceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceId")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTimeHistogramIterable(value: js.Iterable[HistogramEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseTimeHistogram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseTimeHistogram(value: js.Array[HistogramEntry] | js.Iterable[HistogramEntry]): Self = {
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
    def withStartTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date | String | Double): Self = {
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
    def withSummaryStatistics(value: EdgeStatistics): Self = {
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

