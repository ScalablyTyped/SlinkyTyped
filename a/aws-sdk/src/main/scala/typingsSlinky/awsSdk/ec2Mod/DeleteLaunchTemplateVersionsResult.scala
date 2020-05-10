package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLaunchTemplateVersionsResult extends js.Object {
  /**
    * Information about the launch template versions that were successfully deleted.
    */
  var SuccessfullyDeletedLaunchTemplateVersions: js.UndefOr[DeleteLaunchTemplateVersionsResponseSuccessSet] = js.native
  /**
    * Information about the launch template versions that could not be deleted.
    */
  var UnsuccessfullyDeletedLaunchTemplateVersions: js.UndefOr[DeleteLaunchTemplateVersionsResponseErrorSet] = js.native
}

object DeleteLaunchTemplateVersionsResult {
  @scala.inline
  def apply(): DeleteLaunchTemplateVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLaunchTemplateVersionsResult]
  }
  @scala.inline
  implicit class DeleteLaunchTemplateVersionsResultOps[Self <: DeleteLaunchTemplateVersionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccessfullyDeletedLaunchTemplateVersions(value: DeleteLaunchTemplateVersionsResponseSuccessSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfullyDeletedLaunchTemplateVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessfullyDeletedLaunchTemplateVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfullyDeletedLaunchTemplateVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsuccessfullyDeletedLaunchTemplateVersions(value: DeleteLaunchTemplateVersionsResponseErrorSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnsuccessfullyDeletedLaunchTemplateVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsuccessfullyDeletedLaunchTemplateVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnsuccessfullyDeletedLaunchTemplateVersions")(js.undefined)
        ret
    }
  }
  
}

