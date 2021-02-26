package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterReroute[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var dry_run: js.UndefOr[Boolean] = js.native
  
  var explain: js.UndefOr[Boolean] = js.native
  
  var master_timeout: js.UndefOr[String] = js.native
  
  var metric: js.UndefOr[String | js.Array[String]] = js.native
  
  var retry_failed: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[String] = js.native
}
object ClusterReroute {
  
  @scala.inline
  def apply[T](): ClusterReroute[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterReroute[T]]
  }
  
  @scala.inline
  implicit class ClusterRerouteMutableBuilder[Self <: ClusterReroute[_], T] (val x: Self with ClusterReroute[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setDry_run(value: Boolean): Self = StObject.set(x, "dry_run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDry_runUndefined: Self = StObject.set(x, "dry_run", js.undefined)
    
    @scala.inline
    def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    @scala.inline
    def setMetric(value: String | js.Array[String]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value :_*))
    
    @scala.inline
    def setRetry_failed(value: Boolean): Self = StObject.set(x, "retry_failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetry_failedUndefined: Self = StObject.set(x, "retry_failed", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
