package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Protection extends js.Object {
  /**
    * The unique identifier (ID) for the Route 53 health check that's associated with the protection. 
    */
  var HealthCheckIds: js.UndefOr[typingsSlinky.awsSdk.shieldMod.HealthCheckIds] = js.native
  /**
    * The unique identifier (ID) of the protection.
    */
  var Id: js.UndefOr[ProtectionId] = js.native
  /**
    * The friendly name of the protection. For example, My CloudFront distributions.
    */
  var Name: js.UndefOr[ProtectionName] = js.native
  /**
    * The ARN (Amazon Resource Name) of the AWS resource that is protected.
    */
  var ResourceArn: js.UndefOr[typingsSlinky.awsSdk.shieldMod.ResourceArn] = js.native
}

object Protection {
  @scala.inline
  def apply(): Protection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Protection]
  }
  @scala.inline
  implicit class ProtectionOps[Self <: Protection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthCheckIds(value: HealthCheckIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckIds")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ProtectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ProtectionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(js.undefined)
        ret
    }
  }
  
}

