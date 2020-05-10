package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFormationStackRecordSourceInfo extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the export snapshot record.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the record.
    */
  var name: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Lightsail resource type (e.g., ExportSnapshotRecord).
    */
  var resourceType: js.UndefOr[CloudFormationStackRecordSourceType] = js.native
}

object CloudFormationStackRecordSourceInfo {
  @scala.inline
  def apply(): CloudFormationStackRecordSourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFormationStackRecordSourceInfo]
  }
  @scala.inline
  implicit class CloudFormationStackRecordSourceInfoOps[Self <: CloudFormationStackRecordSourceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: NonEmptyString): Self = {
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
    def withName(value: NonEmptyString): Self = {
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
    def withResourceType(value: CloudFormationStackRecordSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
  }
  
}

