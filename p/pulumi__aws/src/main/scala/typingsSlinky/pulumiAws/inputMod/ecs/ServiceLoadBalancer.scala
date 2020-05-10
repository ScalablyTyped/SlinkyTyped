package typingsSlinky.pulumiAws.inputMod.ecs

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceLoadBalancer extends js.Object {
  var containerName: Input[String] = js.native
  var containerPort: Input[Double] = js.native
  var elbName: js.UndefOr[Input[String]] = js.native
  var targetGroupArn: js.UndefOr[Input[String]] = js.native
}

object ServiceLoadBalancer {
  @scala.inline
  def apply(containerName: Input[String], containerPort: Input[Double]): ServiceLoadBalancer = {
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
    def withContainerName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElbName(value: Input[String]): Self = {
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
    def withTargetGroupArn(value: Input[String]): Self = {
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

