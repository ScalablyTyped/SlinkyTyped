package typingsSlinky.pulumiAws.outputMod.route53

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoneVpc extends js.Object {
  
  /**
    * ID of the VPC to associate.
    */
  var vpcId: String = js.native
  
  /**
    * Region of the VPC to associate. Defaults to AWS provider region.
    */
  var vpcRegion: String = js.native
}
object ZoneVpc {
  
  @scala.inline
  def apply(vpcId: String, vpcRegion: String): ZoneVpc = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any], vpcRegion = vpcRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneVpc]
  }
  
  @scala.inline
  implicit class ZoneVpcOps[Self <: ZoneVpc] (val x: Self) extends AnyVal {
    
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
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcRegion(value: String): Self = this.set("vpcRegion", value.asInstanceOf[js.Any])
  }
}
