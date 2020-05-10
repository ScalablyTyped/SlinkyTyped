package typingsSlinky.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceLoadBalancer extends js.Object {
  var containerName: String = js.native
  var containerPort: Double = js.native
  var elbName: js.UndefOr[String] = js.native
  var targetGroupArn: js.UndefOr[String] = js.native
}

object ServiceLoadBalancer {
  @scala.inline
  def apply(containerName: String, containerPort: Double): ServiceLoadBalancer = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], containerPort = containerPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceLoadBalancer]
  }
  @scala.inline
  implicit class ServiceLoadBalancerOps[Self <: ServiceLoadBalancer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElbName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elbName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElbName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elbName")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupArn")(js.undefined)
        ret
    }
  }
  
}

