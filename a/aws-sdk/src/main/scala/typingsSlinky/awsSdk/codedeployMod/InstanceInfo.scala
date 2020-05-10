package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceInfo extends js.Object {
  /**
    * If the on-premises instance was deregistered, the time at which the on-premises instance was deregistered.
    */
  var deregisterTime: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of the IAM session associated with the on-premises instance.
    */
  var iamSessionArn: js.UndefOr[IamSessionArn] = js.native
  /**
    * The IAM user ARN associated with the on-premises instance.
    */
  var iamUserArn: js.UndefOr[IamUserArn] = js.native
  /**
    * The ARN of the on-premises instance.
    */
  var instanceArn: js.UndefOr[InstanceArn] = js.native
  /**
    * The name of the on-premises instance.
    */
  var instanceName: js.UndefOr[InstanceName] = js.native
  /**
    * The time at which the on-premises instance was registered.
    */
  var registerTime: js.UndefOr[js.Date] = js.native
  /**
    * The tags currently associated with the on-premises instance.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object InstanceInfo {
  @scala.inline
  def apply(): InstanceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceInfo]
  }
  @scala.inline
  implicit class InstanceInfoOps[Self <: InstanceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeregisterTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeregisterTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterTime")(js.undefined)
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
    @scala.inline
    def withInstanceArn(value: InstanceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceName(value: InstanceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisterTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerTime")(js.undefined)
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

