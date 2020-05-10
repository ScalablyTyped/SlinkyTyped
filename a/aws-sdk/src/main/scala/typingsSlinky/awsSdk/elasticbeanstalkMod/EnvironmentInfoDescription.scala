package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentInfoDescription extends js.Object {
  /**
    * The Amazon EC2 Instance ID for this information.
    */
  var Ec2InstanceId: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Ec2InstanceId] = js.native
  /**
    * The type of information retrieved.
    */
  var InfoType: js.UndefOr[EnvironmentInfoType] = js.native
  /**
    * The retrieved information. Currently contains a presigned Amazon S3 URL. The files are deleted after 15 minutes. Anyone in possession of this URL can access the files before they are deleted. Make the URL available only to trusted parties.
    */
  var Message: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Message] = js.native
  /**
    * The time stamp when this information was retrieved.
    */
  var SampleTimestamp: js.UndefOr[js.Date] = js.native
}

object EnvironmentInfoDescription {
  @scala.inline
  def apply(): EnvironmentInfoDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentInfoDescription]
  }
  @scala.inline
  implicit class EnvironmentInfoDescriptionOps[Self <: EnvironmentInfoDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEc2InstanceId(value: Ec2InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2InstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoType(value: EnvironmentInfoType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoType")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleTimestamp")(js.undefined)
        ret
    }
  }
  
}

