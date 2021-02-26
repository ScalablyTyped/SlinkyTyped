package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReusableDelegationSetLimitResponse extends StObject {
  
  /**
    * The current number of hosted zones that you can associate with the specified reusable delegation set.
    */
  var Count: UsageCount = js.native
  
  /**
    * The current setting for the limit on hosted zones that you can associate with the specified reusable delegation set.
    */
  var Limit: ReusableDelegationSetLimit = js.native
}
object GetReusableDelegationSetLimitResponse {
  
  @scala.inline
  def apply(Count: UsageCount, Limit: ReusableDelegationSetLimit): GetReusableDelegationSetLimitResponse = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Limit = Limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReusableDelegationSetLimitResponse]
  }
  
  @scala.inline
  implicit class GetReusableDelegationSetLimitResponseMutableBuilder[Self <: GetReusableDelegationSetLimitResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: UsageCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: ReusableDelegationSetLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
  }
}
