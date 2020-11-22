package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.maximMazurokGapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePoliciesScopedList extends js.Object {
  
  /** A list of resourcePolicies contained in this scope. */
  var resourcePolicies: js.UndefOr[js.Array[ResourcePolicy]] = js.native
  
  /** Informational warning which replaces the list of resourcePolicies when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object ResourcePoliciesScopedList {
  
  @scala.inline
  def apply(): ResourcePoliciesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePoliciesScopedList]
  }
  
  @scala.inline
  implicit class ResourcePoliciesScopedListOps[Self <: ResourcePoliciesScopedList] (val x: Self) extends AnyVal {
    
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
    def setResourcePoliciesVarargs(value: ResourcePolicy*): Self = this.set("resourcePolicies", js.Array(value :_*))
    
    @scala.inline
    def setResourcePolicies(value: js.Array[ResourcePolicy]): Self = this.set("resourcePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcePolicies: Self = this.set("resourcePolicies", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
