package typingsSlinky.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEnvironmentEC2Request extends js.Object {
  /**
    * The number of minutes until the running instance is shut down after the environment has last been used.
    */
  var automaticStopTimeMinutes: js.UndefOr[AutomaticStopTimeMinutes] = js.native
  /**
    * A unique, case-sensitive string that helps AWS Cloud9 to ensure this operation completes no more than one time. For more information, see Client Tokens in the Amazon EC2 API Reference.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The description of the environment to create.
    */
  var description: js.UndefOr[EnvironmentDescription] = js.native
  /**
    * The type of instance to connect to the environment (for example, t2.micro).
    */
  var instanceType: InstanceType = js.native
  /**
    * The name of the environment to create. This name is visible to other AWS IAM users in the same AWS account.
    */
  var name: EnvironmentName = js.native
  /**
    * The Amazon Resource Name (ARN) of the environment owner. This ARN can be the ARN of any AWS IAM principal. If this value is not specified, the ARN defaults to this environment's creator.
    */
  var ownerArn: js.UndefOr[UserArn] = js.native
  /**
    * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
    */
  var subnetId: js.UndefOr[SubnetId] = js.native
  /**
    * An array of key-value pairs that will be associated with the new AWS Cloud9 development environment.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateEnvironmentEC2Request {
  @scala.inline
  def apply(instanceType: InstanceType, name: EnvironmentName): CreateEnvironmentEC2Request = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentEC2Request]
  }
  @scala.inline
  implicit class CreateEnvironmentEC2RequestOps[Self <: CreateEnvironmentEC2Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: EnvironmentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomaticStopTimeMinutes(value: AutomaticStopTimeMinutes): Self = {
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
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: EnvironmentDescription): Self = {
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
    def withOwnerArn(value: UserArn): Self = {
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
    def withSubnetId(value: SubnetId): Self = {
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
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

