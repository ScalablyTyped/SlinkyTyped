package typingsSlinky.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalSetPolicyRequest extends js.Object {
  
  /** Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify bindings. */
  var bindings: js.UndefOr[js.Array[Binding]] = js.native
  
  /** Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify the etag. */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * REQUIRED: The complete policy to be applied to the 'resource'. The size of the policy is limited to a few 10s of KB. An empty policy is in general a valid policy but certain
    * services (like Projects) might reject them.
    */
  var policy: js.UndefOr[Policy] = js.native
}
object GlobalSetPolicyRequest {
  
  @scala.inline
  def apply(): GlobalSetPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalSetPolicyRequest]
  }
  
  @scala.inline
  implicit class GlobalSetPolicyRequestOps[Self <: GlobalSetPolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setBindingsVarargs(value: Binding*): Self = this.set("bindings", js.Array(value :_*))
    
    @scala.inline
    def setBindings(value: js.Array[Binding]): Self = this.set("bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setPolicy(value: Policy): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
}
