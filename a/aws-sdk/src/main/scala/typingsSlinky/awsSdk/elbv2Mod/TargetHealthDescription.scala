package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetHealthDescription extends js.Object {
  /**
    * The port to use to connect with the target.
    */
  var HealthCheckPort: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckPort] = js.native
  /**
    * The description of the target.
    */
  var Target: js.UndefOr[TargetDescription] = js.native
  /**
    * The health information for the target.
    */
  var TargetHealth: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.TargetHealth] = js.native
}

object TargetHealthDescription {
  @scala.inline
  def apply(): TargetHealthDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHealthDescription]
  }
  @scala.inline
  implicit class TargetHealthDescriptionOps[Self <: TargetHealthDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthCheckPort(value: HealthCheckPort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckPort")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: TargetDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetHealth(value: TargetHealth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetHealth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetHealth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetHealth")(js.undefined)
        ret
    }
  }
  
}

