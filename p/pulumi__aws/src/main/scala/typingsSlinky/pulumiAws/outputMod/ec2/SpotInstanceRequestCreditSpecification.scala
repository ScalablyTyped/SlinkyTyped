package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotInstanceRequestCreditSpecification extends js.Object {
  
  /**
    * The credit option for CPU usage. Can be `"standard"` or `"unlimited"`. T3 instances are launched as unlimited by default. T2 instances are launched as standard by default.
    */
  var cpuCredits: js.UndefOr[String] = js.native
}
object SpotInstanceRequestCreditSpecification {
  
  @scala.inline
  def apply(): SpotInstanceRequestCreditSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotInstanceRequestCreditSpecification]
  }
  
  @scala.inline
  implicit class SpotInstanceRequestCreditSpecificationOps[Self <: SpotInstanceRequestCreditSpecification] (val x: Self) extends AnyVal {
    
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
    def setCpuCredits(value: String): Self = this.set("cpuCredits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuCredits: Self = this.set("cpuCredits", js.undefined)
  }
}
