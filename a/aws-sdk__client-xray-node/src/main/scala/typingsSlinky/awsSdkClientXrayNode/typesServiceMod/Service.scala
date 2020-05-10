package typingsSlinky.awsSdkClientXrayNode.typesServiceMod

import typingsSlinky.awsSdkClientXrayNode.typesEdgeMod.Edge
import typingsSlinky.awsSdkClientXrayNode.typesHistogramEntryMod.HistogramEntry
import typingsSlinky.awsSdkClientXrayNode.typesServiceStatisticsMod.ServiceStatistics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  /**
    * <p>Identifier of the AWS account in which the service runs.</p>
    */
  var AccountId: js.UndefOr[String] = js.native
  /**
    * <p>A histogram that maps the spread of service durations.</p>
    */
  var DurationHistogram: js.UndefOr[js.Array[HistogramEntry] | js.Iterable[HistogramEntry]] = js.native
  /**
    * <p>Connections to downstream services.</p>
    */
  var Edges: js.UndefOr[js.Array[Edge] | js.Iterable[Edge]] = js.native
  /**
    * <p>The end time of the last segment that the service generated.</p>
    */
  var EndTime: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>The canonical name of the service.</p>
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * <p>A list of names for the service, including the canonical name.</p>
    */
  var Names: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  /**
    * <p>Identifier for the service. Unique within the service map.</p>
    */
  var ReferenceId: js.UndefOr[Double] = js.native
  /**
    * <p>A histogram that maps the spread of service response times.</p>
    */
  var ResponseTimeHistogram: js.UndefOr[js.Array[HistogramEntry] | js.Iterable[HistogramEntry]] = js.native
  /**
    * <p>Indicates that the service was the first service to process a request.</p>
    */
  var Root: js.UndefOr[Boolean] = js.native
  /**
    * <p>The start time of the first segment that the service generated.</p>
    */
  var StartTime: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>The service's state.</p>
    */
  var State: js.UndefOr[String] = js.native
  /**
    * <p>Aggregated statistics for the service.</p>
    */
  var SummaryStatistics: js.UndefOr[ServiceStatistics] = js.native
  /**
    * <p>The type of service.</p> <ul> <li> <p>AWS Resource - The type of an AWS resource. For example, <code>AWS::EC2::Instance</code> for a application running on Amazon EC2 or <code>AWS::DynamoDB::Table</code> for an Amazon DynamoDB table that the application used.</p> </li> <li> <p>AWS Service - The type of an AWS service. For example, <code>AWS::DynamoDB</code> for downstream calls to Amazon DynamoDB that didn't target a specific table.</p> </li> <li> <p> <code>client</code> - Represents the clients that sent requests to a root service.</p> </li> <li> <p> <code>remote</code> - A downstream service of indeterminate type.</p> </li> </ul>
    */
  var Type: js.UndefOr[String] = js.native
}

object Service {
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationHistogramIterable(value: js.Iterable[HistogramEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationHistogram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurationHistogram(value: js.Array[HistogramEntry] | js.Iterable[HistogramEntry]): Self = {
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
    def withEdgesIterable(value: js.Iterable[Edge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdges(value: js.Array[Edge] | js.Iterable[Edge]): Self = {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamesIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNames(value: js.Array[String] | js.Iterable[String]): Self = {
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
    def withRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Root")(js.undefined)
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
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryStatistics(value: ServiceStatistics): Self = {
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
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

