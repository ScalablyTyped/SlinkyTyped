package typingsSlinky.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metric extends StObject {
  
  /** A mathematical expression for derived metrics. For example, the metric Event count per user is `eventCount/totalUsers`. */
  var expression: js.UndefOr[String] = js.native
  
  /**
    * Indicates if a metric is invisible in the report response. If a metric is invisible, the metric will not produce a column in the response, but can be used in `metricFilter`,
    * `orderBys`, or a metric `expression`.
    */
  var invisible: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the metric. See the [API Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#metrics) for the list of metric names. If `expression`
    * is specified, `name` can be any string that you would like. For example if `expression` is `screenPageViews/sessions`, you could call that metric's name = `viewsPerSession`. Metrics
    * are referenced by `name` in `metricFilter`, `orderBys`, and metric `expression`.
    */
  var name: js.UndefOr[String] = js.native
}
object Metric {
  
  @scala.inline
  def apply(): Metric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metric]
  }
  
  @scala.inline
  implicit class MetricMutableBuilder[Self <: Metric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
