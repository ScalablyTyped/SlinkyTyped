package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceExportDetails extends js.Object {
  /**
    * The ID of the resource being exported.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The target virtualization environment.
    */
  var TargetEnvironment: js.UndefOr[ExportEnvironment] = js.native
}

object InstanceExportDetails {
  @scala.inline
  def apply(): InstanceExportDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceExportDetails]
  }
  @scala.inline
  implicit class InstanceExportDetailsOps[Self <: InstanceExportDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetEnvironment(value: ExportEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetEnvironment")(js.undefined)
        ret
    }
  }
  
}

