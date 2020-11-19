package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EgressFilter extends js.Object {
  
  /**
    * The egress filter type. By default, the type is DROP_ALL, which allows
    egress only from virtual nodes to other defined resources in the service mesh (and any
    traffic to *.amazonaws.com for AWS API calls). You can set the egress filter
    type to ALLOW_ALL to allow egress to any endpoint inside or outside of the
    service mesh.
    */
  var `type`: EgressFilterType = js.native
}
object EgressFilter {
  
  @scala.inline
  def apply(`type`: EgressFilterType): EgressFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EgressFilter]
  }
  
  @scala.inline
  implicit class EgressFilterOps[Self <: EgressFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: EgressFilterType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
