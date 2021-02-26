package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetDistributionCacheResult extends StObject {
  
  /**
    * The timestamp of the reset cache request (e.g., 1479734909.17) in Unix time format.
    */
  var createTime: js.UndefOr[js.Date] = js.native
  
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request.
    */
  var operation: js.UndefOr[Operation] = js.native
  
  /**
    * The status of the reset cache request.
    */
  var status: js.UndefOr[String] = js.native
}
object ResetDistributionCacheResult {
  
  @scala.inline
  def apply(): ResetDistributionCacheResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetDistributionCacheResult]
  }
  
  @scala.inline
  implicit class ResetDistributionCacheResultMutableBuilder[Self <: ResetDistributionCacheResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setOperation(value: Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
