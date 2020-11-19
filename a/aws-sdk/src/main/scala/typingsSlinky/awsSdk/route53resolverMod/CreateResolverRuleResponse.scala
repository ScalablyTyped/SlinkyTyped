package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateResolverRuleResponse extends js.Object {
  
  /**
    * Information about the CreateResolverRule request, including the status of the request.
    */
  var ResolverRule: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.ResolverRule] = js.native
}
object CreateResolverRuleResponse {
  
  @scala.inline
  def apply(): CreateResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResolverRuleResponse]
  }
  
  @scala.inline
  implicit class CreateResolverRuleResponseOps[Self <: CreateResolverRuleResponse] (val x: Self) extends AnyVal {
    
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
    def setResolverRule(value: ResolverRule): Self = this.set("ResolverRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverRule: Self = this.set("ResolverRule", js.undefined)
  }
}
