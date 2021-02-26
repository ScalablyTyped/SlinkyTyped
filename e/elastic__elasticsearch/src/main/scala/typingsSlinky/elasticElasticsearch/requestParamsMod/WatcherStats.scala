package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatcherStats extends Generic {
  
  var emit_stacktraces: js.UndefOr[Boolean] = js.native
  
  var metric: js.UndefOr[String | js.Array[String]] = js.native
}
object WatcherStats {
  
  @scala.inline
  def apply(): WatcherStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherStats]
  }
  
  @scala.inline
  implicit class WatcherStatsMutableBuilder[Self <: WatcherStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmit_stacktraces(value: Boolean): Self = StObject.set(x, "emit_stacktraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmit_stacktracesUndefined: Self = StObject.set(x, "emit_stacktraces", js.undefined)
    
    @scala.inline
    def setMetric(value: String | js.Array[String]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value :_*))
  }
}
