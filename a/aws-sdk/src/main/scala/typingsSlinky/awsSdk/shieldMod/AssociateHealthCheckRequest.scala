package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateHealthCheckRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the health check to associate with the protection.
    */
  var HealthCheckArn: typingsSlinky.awsSdk.shieldMod.HealthCheckArn = js.native
  /**
    * The unique identifier (ID) for the Protection object to add the health check association to. 
    */
  var ProtectionId: typingsSlinky.awsSdk.shieldMod.ProtectionId = js.native
}

object AssociateHealthCheckRequest {
  @scala.inline
  def apply(HealthCheckArn: HealthCheckArn, ProtectionId: ProtectionId): AssociateHealthCheckRequest = {
    val __obj = js.Dynamic.literal(HealthCheckArn = HealthCheckArn.asInstanceOf[js.Any], ProtectionId = ProtectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateHealthCheckRequest]
  }
  @scala.inline
  implicit class AssociateHealthCheckRequestOps[Self <: AssociateHealthCheckRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthCheckArn(value: HealthCheckArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtectionId(value: ProtectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProtectionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

