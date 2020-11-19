package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDefaultSubnetResult extends js.Object {
  
  /**
    * Information about the subnet.
    */
  var Subnet: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.Subnet] = js.native
}
object CreateDefaultSubnetResult {
  
  @scala.inline
  def apply(): CreateDefaultSubnetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDefaultSubnetResult]
  }
  
  @scala.inline
  implicit class CreateDefaultSubnetResultOps[Self <: CreateDefaultSubnetResult] (val x: Self) extends AnyVal {
    
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
    def setSubnet(value: Subnet): Self = this.set("Subnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnet: Self = this.set("Subnet", js.undefined)
  }
}
