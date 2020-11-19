package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subnet extends js.Object {
  
  /**
    * The Availability Zone (AZ) for the subnet.
    */
  var SubnetAvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The system-assigned identifier for the subnet.
    */
  var SubnetIdentifier: js.UndefOr[String] = js.native
}
object Subnet {
  
  @scala.inline
  def apply(): Subnet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subnet]
  }
  
  @scala.inline
  implicit class SubnetOps[Self <: Subnet] (val x: Self) extends AnyVal {
    
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
    def setSubnetAvailabilityZone(value: String): Self = this.set("SubnetAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetAvailabilityZone: Self = this.set("SubnetAvailabilityZone", js.undefined)
    
    @scala.inline
    def setSubnetIdentifier(value: String): Self = this.set("SubnetIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIdentifier: Self = this.set("SubnetIdentifier", js.undefined)
  }
}
