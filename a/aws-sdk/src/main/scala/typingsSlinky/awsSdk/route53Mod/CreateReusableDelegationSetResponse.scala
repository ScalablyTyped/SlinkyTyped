package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReusableDelegationSetResponse extends StObject {
  
  /**
    * A complex type that contains name server information.
    */
  var DelegationSet: typingsSlinky.awsSdk.route53Mod.DelegationSet = js.native
  
  /**
    * The unique URL representing the new reusable delegation set.
    */
  var Location: ResourceURI = js.native
}
object CreateReusableDelegationSetResponse {
  
  @scala.inline
  def apply(DelegationSet: DelegationSet, Location: ResourceURI): CreateReusableDelegationSetResponse = {
    val __obj = js.Dynamic.literal(DelegationSet = DelegationSet.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReusableDelegationSetResponse]
  }
  
  @scala.inline
  implicit class CreateReusableDelegationSetResponseMutableBuilder[Self <: CreateReusableDelegationSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegationSet(value: DelegationSet): Self = StObject.set(x, "DelegationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: ResourceURI): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
  }
}
