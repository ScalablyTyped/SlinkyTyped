package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDisksAddResourcePoliciesRequest extends js.Object {
  
  /**
    * Resource policies to be added to this disk.
    */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.native
}
object SchemaDisksAddResourcePoliciesRequest {
  
  @scala.inline
  def apply(): SchemaDisksAddResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisksAddResourcePoliciesRequest]
  }
  
  @scala.inline
  implicit class SchemaDisksAddResourcePoliciesRequestOps[Self <: SchemaDisksAddResourcePoliciesRequest] (val x: Self) extends AnyVal {
    
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
    def setResourcePoliciesVarargs(value: String*): Self = this.set("resourcePolicies", js.Array(value :_*))
    
    @scala.inline
    def setResourcePolicies(value: js.Array[String]): Self = this.set("resourcePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcePolicies: Self = this.set("resourcePolicies", js.undefined)
  }
}
