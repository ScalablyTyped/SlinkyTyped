package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReusableDelegationSetResponse extends StObject {
  
  /**
    * A complex type that contains information about the reusable delegation set.
    */
  var DelegationSet: typingsSlinky.awsSdk.route53Mod.DelegationSet = js.native
}
object GetReusableDelegationSetResponse {
  
  @scala.inline
  def apply(DelegationSet: DelegationSet): GetReusableDelegationSetResponse = {
    val __obj = js.Dynamic.literal(DelegationSet = DelegationSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReusableDelegationSetResponse]
  }
  
  @scala.inline
  implicit class GetReusableDelegationSetResponseMutableBuilder[Self <: GetReusableDelegationSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegationSet(value: DelegationSet): Self = StObject.set(x, "DelegationSet", value.asInstanceOf[js.Any])
  }
}
