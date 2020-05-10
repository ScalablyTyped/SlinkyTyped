package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProtectedResourceOutput extends js.Object {
  /**
    * The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The value of LastBackupTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LastBackupTime: js.UndefOr[js.Date] = js.native
  /**
    * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: js.UndefOr[ARN] = js.native
  /**
    * The type of AWS resource saved as a recovery point; for example, an EBS volume or an Amazon RDS database.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.backupMod.ResourceType] = js.native
}

object DescribeProtectedResourceOutput {
  @scala.inline
  def apply(): DescribeProtectedResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProtectedResourceOutput]
  }
  @scala.inline
  implicit class DescribeProtectedResourceOutputOps[Self <: DescribeProtectedResourceOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastBackupTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastBackupTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastBackupTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastBackupTime")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceArn(value: ARN): Self = {
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
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
  }
  
}

