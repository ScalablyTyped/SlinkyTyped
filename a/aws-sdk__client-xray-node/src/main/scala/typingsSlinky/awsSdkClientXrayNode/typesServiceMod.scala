package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.typesEdgeMod.Edge
import typingsSlinky.awsSdkClientXrayNode.typesEdgeMod.UnmarshalledEdge
import typingsSlinky.awsSdkClientXrayNode.typesHistogramEntryMod.HistogramEntry
import typingsSlinky.awsSdkClientXrayNode.typesHistogramEntryMod.UnmarshalledHistogramEntry
import typingsSlinky.awsSdkClientXrayNode.typesServiceStatisticsMod.ServiceStatistics
import typingsSlinky.awsSdkClientXrayNode.typesServiceStatisticsMod.UnmarshalledServiceStatistics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesServiceMod {
  
  @js.native
  trait Service extends StObject {
    
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
    implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
      
      @scala.inline
      def setDurationHistogram(value: js.Array[HistogramEntry] | js.Iterable[HistogramEntry]): Self = StObject.set(x, "DurationHistogram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationHistogramIterable(value: js.Iterable[HistogramEntry]): Self = StObject.set(x, "DurationHistogram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationHistogramUndefined: Self = StObject.set(x, "DurationHistogram", js.undefined)
      
      @scala.inline
      def setDurationHistogramVarargs(value: HistogramEntry*): Self = StObject.set(x, "DurationHistogram", js.Array(value :_*))
      
      @scala.inline
      def setEdges(value: js.Array[Edge] | js.Iterable[Edge]): Self = StObject.set(x, "Edges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgesIterable(value: js.Iterable[Edge]): Self = StObject.set(x, "Edges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgesUndefined: Self = StObject.set(x, "Edges", js.undefined)
      
      @scala.inline
      def setEdgesVarargs(value: Edge*): Self = StObject.set(x, "Edges", js.Array(value :_*))
      
      @scala.inline
      def setEndTime(value: js.Date | String | Double): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeDate(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      @scala.inline
      def setNames(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesIterable(value: js.Iterable[String]): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value :_*))
      
      @scala.inline
      def setReferenceId(value: Double): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceIdUndefined: Self = StObject.set(x, "ReferenceId", js.undefined)
      
      @scala.inline
      def setResponseTimeHistogram(value: js.Array[HistogramEntry] | js.Iterable[HistogramEntry]): Self = StObject.set(x, "ResponseTimeHistogram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTimeHistogramIterable(value: js.Iterable[HistogramEntry]): Self = StObject.set(x, "ResponseTimeHistogram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTimeHistogramUndefined: Self = StObject.set(x, "ResponseTimeHistogram", js.undefined)
      
      @scala.inline
      def setResponseTimeHistogramVarargs(value: HistogramEntry*): Self = StObject.set(x, "ResponseTimeHistogram", js.Array(value :_*))
      
      @scala.inline
      def setRoot(value: Boolean): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setStartTime(value: js.Date | String | Double): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeDate(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
      
      @scala.inline
      def setSummaryStatistics(value: ServiceStatistics): Self = StObject.set(x, "SummaryStatistics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryStatisticsUndefined: Self = StObject.set(x, "SummaryStatistics", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
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
    implicit class UnmarshalledServiceMutableBuilder[Self <: UnmarshalledService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDurationHistogram(value: js.Array[UnmarshalledHistogramEntry]): Self = StObject.set(x, "DurationHistogram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationHistogramUndefined: Self = StObject.set(x, "DurationHistogram", js.undefined)
      
      @scala.inline
      def setDurationHistogramVarargs(value: UnmarshalledHistogramEntry*): Self = StObject.set(x, "DurationHistogram", js.Array(value :_*))
      
      @scala.inline
      def setEdges(value: js.Array[UnmarshalledEdge]): Self = StObject.set(x, "Edges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgesUndefined: Self = StObject.set(x, "Edges", js.undefined)
      
      @scala.inline
      def setEdgesVarargs(value: UnmarshalledEdge*): Self = StObject.set(x, "Edges", js.Array(value :_*))
      
      @scala.inline
      def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value :_*))
      
      @scala.inline
      def setResponseTimeHistogram(value: js.Array[UnmarshalledHistogramEntry]): Self = StObject.set(x, "ResponseTimeHistogram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTimeHistogramUndefined: Self = StObject.set(x, "ResponseTimeHistogram", js.undefined)
      
      @scala.inline
      def setResponseTimeHistogramVarargs(value: UnmarshalledHistogramEntry*): Self = StObject.set(x, "ResponseTimeHistogram", js.Array(value :_*))
      
      @scala.inline
      def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
      
      @scala.inline
      def setSummaryStatistics(value: UnmarshalledServiceStatistics): Self = StObject.set(x, "SummaryStatistics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryStatisticsUndefined: Self = StObject.set(x, "SummaryStatistics", js.undefined)
    }
  }
}
