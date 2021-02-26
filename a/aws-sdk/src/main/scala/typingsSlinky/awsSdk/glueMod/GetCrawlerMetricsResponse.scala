package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCrawlerMetricsResponse extends StObject {
  
  /**
    * A list of metrics for the specified crawler.
    */
  var CrawlerMetricsList: js.UndefOr[typingsSlinky.awsSdk.glueMod.CrawlerMetricsList] = js.native
  
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object GetCrawlerMetricsResponse {
  
  @scala.inline
  def apply(): GetCrawlerMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCrawlerMetricsResponse]
  }
  
  @scala.inline
  implicit class GetCrawlerMetricsResponseMutableBuilder[Self <: GetCrawlerMetricsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrawlerMetricsList(value: CrawlerMetricsList): Self = StObject.set(x, "CrawlerMetricsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlerMetricsListUndefined: Self = StObject.set(x, "CrawlerMetricsList", js.undefined)
    
    @scala.inline
    def setCrawlerMetricsListVarargs(value: CrawlerMetrics*): Self = StObject.set(x, "CrawlerMetricsList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
