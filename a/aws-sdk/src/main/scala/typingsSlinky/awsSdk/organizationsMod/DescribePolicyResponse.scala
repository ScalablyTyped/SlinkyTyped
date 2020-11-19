package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePolicyResponse extends js.Object {
  
  /**
    * A structure that contains details about the specified policy.
    */
  var Policy: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.Policy] = js.native
}
object DescribePolicyResponse {
  
  @scala.inline
  def apply(): DescribePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePolicyResponse]
  }
  
  @scala.inline
  implicit class DescribePolicyResponseOps[Self <: DescribePolicyResponse] (val x: Self) extends AnyVal {
    
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
    def setPolicy(value: Policy): Self = this.set("Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
  }
}
