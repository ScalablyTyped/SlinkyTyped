package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSoftwareUpdateJobRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  var S3UrlSignerRole: typingsSlinky.awsSdk.greengrassMod.S3UrlSignerRole = js.native
  var SoftwareToUpdate: typingsSlinky.awsSdk.greengrassMod.SoftwareToUpdate = js.native
  var UpdateAgentLogLevel: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.UpdateAgentLogLevel] = js.native
  var UpdateTargets: typingsSlinky.awsSdk.greengrassMod.UpdateTargets = js.native
  var UpdateTargetsArchitecture: typingsSlinky.awsSdk.greengrassMod.UpdateTargetsArchitecture = js.native
  var UpdateTargetsOperatingSystem: typingsSlinky.awsSdk.greengrassMod.UpdateTargetsOperatingSystem = js.native
}

object CreateSoftwareUpdateJobRequest {
  @scala.inline
  def apply(
    S3UrlSignerRole: S3UrlSignerRole,
    SoftwareToUpdate: SoftwareToUpdate,
    UpdateTargets: UpdateTargets,
    UpdateTargetsArchitecture: UpdateTargetsArchitecture,
    UpdateTargetsOperatingSystem: UpdateTargetsOperatingSystem
  ): CreateSoftwareUpdateJobRequest = {
    val __obj = js.Dynamic.literal(S3UrlSignerRole = S3UrlSignerRole.asInstanceOf[js.Any], SoftwareToUpdate = SoftwareToUpdate.asInstanceOf[js.Any], UpdateTargets = UpdateTargets.asInstanceOf[js.Any], UpdateTargetsArchitecture = UpdateTargetsArchitecture.asInstanceOf[js.Any], UpdateTargetsOperatingSystem = UpdateTargetsOperatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSoftwareUpdateJobRequest]
  }
  @scala.inline
  implicit class CreateSoftwareUpdateJobRequestOps[Self <: CreateSoftwareUpdateJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3UrlSignerRole(value: S3UrlSignerRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3UrlSignerRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftwareToUpdate(value: SoftwareToUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftwareToUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateTargets(value: UpdateTargets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateTargetsArchitecture(value: UpdateTargetsArchitecture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateTargetsArchitecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateTargetsOperatingSystem(value: UpdateTargetsOperatingSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateTargetsOperatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmznClientToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmznClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmznClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmznClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateAgentLogLevel(value: UpdateAgentLogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateAgentLogLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateAgentLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateAgentLogLevel")(js.undefined)
        ret
    }
  }
  
}

