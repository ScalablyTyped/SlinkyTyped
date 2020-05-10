package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterOnPremisesInstanceInput extends js.Object {
  /**
    * The ARN of the IAM session to associate with the on-premises instance.
    */
  var iamSessionArn: js.UndefOr[IamSessionArn] = js.native
  /**
    * The ARN of the IAM user to associate with the on-premises instance.
    */
  var iamUserArn: js.UndefOr[IamUserArn] = js.native
  /**
    * The name of the on-premises instance to register.
    */
  var instanceName: InstanceName = js.native
}

object RegisterOnPremisesInstanceInput {
  @scala.inline
  def apply(instanceName: InstanceName): RegisterOnPremisesInstanceInput = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterOnPremisesInstanceInput]
  }
  @scala.inline
  implicit class RegisterOnPremisesInstanceInputOps[Self <: RegisterOnPremisesInstanceInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceName(value: InstanceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIamSessionArn(value: IamSessionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamSessionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamSessionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamSessionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withIamUserArn(value: IamUserArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamUserArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamUserArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamUserArn")(js.undefined)
        ret
    }
  }
  
}

