package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIdentityMailFromDomainAttributesRequest extends js.Object {
  
  /**
    * A list of one or more identities.
    */
  var Identities: IdentityList = js.native
}
object GetIdentityMailFromDomainAttributesRequest {
  
  @scala.inline
  def apply(Identities: IdentityList): GetIdentityMailFromDomainAttributesRequest = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityMailFromDomainAttributesRequest]
  }
  
  @scala.inline
  implicit class GetIdentityMailFromDomainAttributesRequestOps[Self <: GetIdentityMailFromDomainAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdentitiesVarargs(value: Identity*): Self = this.set("Identities", js.Array(value :_*))
    
    @scala.inline
    def setIdentities(value: IdentityList): Self = this.set("Identities", value.asInstanceOf[js.Any])
  }
}
