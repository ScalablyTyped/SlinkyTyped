package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCachePoliciesResult extends js.Object {
  
  /**
    * A list of cache policies.
    */
  var CachePolicyList: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.CachePolicyList] = js.native
}
object ListCachePoliciesResult {
  
  @scala.inline
  def apply(): ListCachePoliciesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCachePoliciesResult]
  }
  
  @scala.inline
  implicit class ListCachePoliciesResultOps[Self <: ListCachePoliciesResult] (val x: Self) extends AnyVal {
    
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
    def setCachePolicyList(value: CachePolicyList): Self = this.set("CachePolicyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachePolicyList: Self = this.set("CachePolicyList", js.undefined)
  }
}
