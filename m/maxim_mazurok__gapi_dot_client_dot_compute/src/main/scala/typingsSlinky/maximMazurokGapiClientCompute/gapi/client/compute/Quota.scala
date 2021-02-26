package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Quota extends StObject {
  
  /** [Output Only] Quota limit for this metric. */
  var limit: js.UndefOr[Double] = js.native
  
  /** [Output Only] Name of the quota metric. */
  var metric: js.UndefOr[String] = js.native
  
  /** [Output Only] Owning resource. This is the resource on which this quota is applied. */
  var owner: js.UndefOr[String] = js.native
  
  /** [Output Only] Current usage of this metric. */
  var usage: js.UndefOr[Double] = js.native
}
object Quota {
  
  @scala.inline
  def apply(): Quota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quota]
  }
  
  @scala.inline
  implicit class QuotaMutableBuilder[Self <: Quota] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
