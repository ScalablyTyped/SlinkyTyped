package typingsSlinky.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.google.protobuf.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStatsReport extends js.Object {
  /** StatsReport endTime */
  var endTime: js.UndefOr[ITimestamp | Null] = js.native
  /** StatsReport header */
  var header: js.UndefOr[IReportHeader | Null] = js.native
  /** StatsReport legacyPerQueryImplicitOperationName */
  var legacyPerQueryImplicitOperationName: js.UndefOr[StringDictionary[IQueryStats] | Null] = js.native
  /** StatsReport memStats */
  var memStats: js.UndefOr[IMemStats | Null] = js.native
  /** StatsReport perQuery */
  var perQuery: js.UndefOr[StringDictionary[IQueryStats] | Null] = js.native
  /** StatsReport realtimeDuration */
  var realtimeDuration: js.UndefOr[Double | Null] = js.native
  /** StatsReport startTime */
  var startTime: js.UndefOr[ITimestamp | Null] = js.native
  /** StatsReport timeStats */
  var timeStats: js.UndefOr[ITimeStats | Null] = js.native
  /** StatsReport type */
  var `type`: js.UndefOr[js.Array[IType] | Null] = js.native
}

object IStatsReport {
  @scala.inline
  def apply(): IStatsReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStatsReport]
  }
  @scala.inline
  implicit class IStatsReportOps[Self <: IStatsReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(null)
        ret
    }
    @scala.inline
    def withHeader(value: IReportHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(null)
        ret
    }
    @scala.inline
    def withLegacyPerQueryImplicitOperationName(value: StringDictionary[IQueryStats]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyPerQueryImplicitOperationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacyPerQueryImplicitOperationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyPerQueryImplicitOperationName")(js.undefined)
        ret
    }
    @scala.inline
    def withLegacyPerQueryImplicitOperationNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyPerQueryImplicitOperationName")(null)
        ret
    }
    @scala.inline
    def withMemStats(value: IMemStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memStats")(js.undefined)
        ret
    }
    @scala.inline
    def withMemStatsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memStats")(null)
        ret
    }
    @scala.inline
    def withPerQuery(value: StringDictionary[IQueryStats]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withPerQueryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perQuery")(null)
        ret
    }
    @scala.inline
    def withRealtimeDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtimeDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealtimeDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtimeDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withRealtimeDurationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtimeDuration")(null)
        ret
    }
    @scala.inline
    def withStartTime(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(null)
        ret
    }
    @scala.inline
    def withTimeStats(value: ITimeStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStats")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeStatsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStats")(null)
        ret
    }
    @scala.inline
    def withType(value: js.Array[IType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
  }
  
}

