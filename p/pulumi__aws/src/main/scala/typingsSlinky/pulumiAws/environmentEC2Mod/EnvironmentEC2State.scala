package typingsSlinky.pulumiAws.environmentEC2Mod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentEC2State extends js.Object {
  /**
    * The ARN of the environment.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The number of minutes until the running instance is shut down after the environment has last been used.
    */
  val automaticStopTimeMinutes: js.UndefOr[Input[Double]] = js.native
  /**
    * The description of the environment.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The type of instance to connect to the environment, e.g. `t2.micro`.
    */
  val instanceType: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the environment.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the environment owner. This can be ARN of any AWS IAM principal. Defaults to the environment's creator.
    */
  val ownerArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the environment (e.g. `ssh` or `ec2`)
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object EnvironmentEC2State {
  @scala.inline
  def apply(): EnvironmentEC2State = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentEC2State]
  }
  @scala.inline
  implicit class EnvironmentEC2StateOps[Self <: EnvironmentEC2State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomaticStopTimeMinutes(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticStopTimeMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticStopTimeMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticStopTimeMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

