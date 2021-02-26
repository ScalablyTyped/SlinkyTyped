package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.typesAliasMod.Alias
import typingsSlinky.awsSdkClientXrayNode.typesAliasMod.UnmarshalledAlias
import typingsSlinky.awsSdkClientXrayNode.typesEdgeStatisticsMod.EdgeStatistics
import typingsSlinky.awsSdkClientXrayNode.typesEdgeStatisticsMod.UnmarshalledEdgeStatistics
import typingsSlinky.awsSdkClientXrayNode.typesHistogramEntryMod.HistogramEntry
import typingsSlinky.awsSdkClientXrayNode.typesHistogramEntryMod.UnmarshalledHistogramEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEdgeMod {
  
  @js.native
  trait Edge extends StObject {
    
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
    implicit class EdgeMutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: js.Array[Alias] | js.Iterable[Alias]): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesIterable(value: js.Iterable[Alias]): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: Alias*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
      
      @scala.inline
      def setEndTime(value: js.Date | String | Double): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeDate(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
      
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
      def setStartTime(value: js.Date | String | Double): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeDate(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
      
      @scala.inline
      def setSummaryStatistics(value: EdgeStatistics): Self = StObject.set(x, "SummaryStatistics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryStatisticsUndefined: Self = StObject.set(x, "SummaryStatistics", js.undefined)
    }
  }
  
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
    implicit class UnmarshalledEdgeMutableBuilder[Self <: UnmarshalledEdge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: js.Array[UnmarshalledAlias]): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: UnmarshalledAlias*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
      
      @scala.inline
      def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
      
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
      def setSummaryStatistics(value: UnmarshalledEdgeStatistics): Self = StObject.set(x, "SummaryStatistics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryStatisticsUndefined: Self = StObject.set(x, "SummaryStatistics", js.undefined)
    }
  }
}
