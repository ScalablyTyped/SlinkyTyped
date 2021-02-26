package typingsSlinky.dogapi

import typingsSlinky.dogapi.dogapiStrings.`my apps`
import typingsSlinky.dogapi.dogapiStrings.bitbucket
import typingsSlinky.dogapi.dogapiStrings.capistrano
import typingsSlinky.dogapi.dogapiStrings.chef
import typingsSlinky.dogapi.dogapiStrings.count
import typingsSlinky.dogapi.dogapiStrings.error
import typingsSlinky.dogapi.dogapiStrings.fabric
import typingsSlinky.dogapi.dogapiStrings.feed
import typingsSlinky.dogapi.dogapiStrings.gauge
import typingsSlinky.dogapi.dogapiStrings.git
import typingsSlinky.dogapi.dogapiStrings.hudson
import typingsSlinky.dogapi.dogapiStrings.info
import typingsSlinky.dogapi.dogapiStrings.jenkins
import typingsSlinky.dogapi.dogapiStrings.low
import typingsSlinky.dogapi.dogapiStrings.nagios
import typingsSlinky.dogapi.dogapiStrings.normal
import typingsSlinky.dogapi.dogapiStrings.puppet
import typingsSlinky.dogapi.dogapiStrings.rate
import typingsSlinky.dogapi.dogapiStrings.success
import typingsSlinky.dogapi.dogapiStrings.user
import typingsSlinky.dogapi.dogapiStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Aggregationkey extends StObject {
    
    var aggregation_key: js.UndefOr[String] = js.native
    
    var alert_type: js.UndefOr[error | warning | info | success] = js.native
    
    var date_happened: js.UndefOr[Double] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var priority: js.UndefOr[normal | low] = js.native
    
    var source_type_name: js.UndefOr[
        nagios | hudson | jenkins | user | (`my apps`) | feed | chef | puppet | git | bitbucket | fabric | capistrano
      ] = js.native
    
    var tags: js.UndefOr[js.Array[String]] = js.native
  }
  object Aggregationkey {
    
    @scala.inline
    def apply(): Aggregationkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Aggregationkey]
    }
    
    @scala.inline
    implicit class AggregationkeyMutableBuilder[Self <: Aggregationkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAggregation_key(value: String): Self = StObject.set(x, "aggregation_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregation_keyUndefined: Self = StObject.set(x, "aggregation_key", js.undefined)
      
      @scala.inline
      def setAlert_type(value: error | warning | info | success): Self = StObject.set(x, "alert_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlert_typeUndefined: Self = StObject.set(x, "alert_type", js.undefined)
      
      @scala.inline
      def setDate_happened(value: Double): Self = StObject.set(x, "date_happened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate_happenedUndefined: Self = StObject.set(x, "date_happened", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPriority(value: normal | low): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setSource_type_name(
        value: nagios | hudson | jenkins | user | (`my apps`) | feed | chef | puppet | git | bitbucket | fabric | capistrano
      ): Self = StObject.set(x, "source_type_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_type_nameUndefined: Self = StObject.set(x, "source_type_name", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Apihost extends StObject {
    
    var api_host: js.UndefOr[String] = js.native
    
    var api_key: String = js.native
    
    var app_key: String = js.native
  }
  object Apihost {
    
    @scala.inline
    def apply(api_key: String, app_key: String): Apihost = {
      val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], app_key = app_key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Apihost]
    }
    
    @scala.inline
    implicit class ApihostMutableBuilder[Self <: Apihost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi_host(value: String): Self = StObject.set(x, "api_host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_hostUndefined: Self = StObject.set(x, "api_host", js.undefined)
      
      @scala.inline
      def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp_key(value: String): Self = StObject.set(x, "app_key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Datehappened extends StObject {
    
    var date_happened: Double = js.native
    
    var handle: js.Any = js.native
    
    var id: js.BigInt = js.native
    
    var priority: normal | low = js.native
    
    var related_event_id: Double | Null = js.native
    
    var tags: js.Array[String] = js.native
    
    var text: String = js.native
    
    var title: String = js.native
    
    var url: String = js.native
  }
  object Datehappened {
    
    @scala.inline
    def apply(
      date_happened: Double,
      handle: js.Any,
      id: js.BigInt,
      priority: normal | low,
      tags: js.Array[String],
      text: String,
      title: String,
      url: String
    ): Datehappened = {
      val __obj = js.Dynamic.literal(date_happened = date_happened.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Datehappened]
    }
    
    @scala.inline
    implicit class DatehappenedMutableBuilder[Self <: Datehappened] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate_happened(value: Double): Self = StObject.set(x, "date_happened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandle(value: js.Any): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: js.BigInt): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: normal | low): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelated_event_id(value: Double): Self = StObject.set(x, "related_event_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelated_event_idNull: Self = StObject.set(x, "related_event_id", null)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Host extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var metric_type: js.UndefOr[gauge | count] = js.native
    
    var tags: js.UndefOr[js.Array[String]] = js.native
    
    var `type`: js.UndefOr[gauge | rate | count] = js.native
  }
  object Host {
    
    @scala.inline
    def apply(): Host = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setMetric_type(value: gauge | count): Self = StObject.set(x, "metric_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric_typeUndefined: Self = StObject.set(x, "metric_type", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setType(value: gauge | rate | count): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Metric extends StObject {
    
    var metric: String = js.native
    
    var metric_type: js.UndefOr[String] = js.native
    
    var points: Double | (js.Array[Double | (js.Tuple2[String, Double])]) = js.native
    
    var tags: js.UndefOr[js.Array[String]] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object Metric {
    
    @scala.inline
    def apply(metric: String, points: Double | (js.Array[Double | (js.Tuple2[String, Double])])): Metric = {
      val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metric]
    }
    
    @scala.inline
    implicit class MetricMutableBuilder[Self <: Metric] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric_type(value: String): Self = StObject.set(x, "metric_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric_typeUndefined: Self = StObject.set(x, "metric_type", js.undefined)
      
      @scala.inline
      def setPoints(value: Double | (js.Array[Double | (js.Tuple2[String, Double])])): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsVarargs(value: (Double | (js.Tuple2[String, Double]))*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
