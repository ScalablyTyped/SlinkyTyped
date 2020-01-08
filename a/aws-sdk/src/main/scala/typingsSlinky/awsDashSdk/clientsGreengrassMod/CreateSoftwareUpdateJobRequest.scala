package typingsSlinky.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSoftwareUpdateJobRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.native
  var S3UrlSignerRole: typingsSlinky.awsDashSdk.clientsGreengrassMod.S3UrlSignerRole = js.native
  var SoftwareToUpdate: typingsSlinky.awsDashSdk.clientsGreengrassMod.SoftwareToUpdate = js.native
  var UpdateAgentLogLevel: js.UndefOr[typingsSlinky.awsDashSdk.clientsGreengrassMod.UpdateAgentLogLevel] = js.native
  var UpdateTargets: typingsSlinky.awsDashSdk.clientsGreengrassMod.UpdateTargets = js.native
  var UpdateTargetsArchitecture: typingsSlinky.awsDashSdk.clientsGreengrassMod.UpdateTargetsArchitecture = js.native
  var UpdateTargetsOperatingSystem: typingsSlinky.awsDashSdk.clientsGreengrassMod.UpdateTargetsOperatingSystem = js.native
}

object CreateSoftwareUpdateJobRequest {
  @scala.inline
  def apply(
    S3UrlSignerRole: S3UrlSignerRole,
    SoftwareToUpdate: SoftwareToUpdate,
    UpdateTargets: UpdateTargets,
    UpdateTargetsArchitecture: UpdateTargetsArchitecture,
    UpdateTargetsOperatingSystem: UpdateTargetsOperatingSystem,
    AmznClientToken: __string = null,
    UpdateAgentLogLevel: UpdateAgentLogLevel = null
  ): CreateSoftwareUpdateJobRequest = {
    val __obj = js.Dynamic.literal(S3UrlSignerRole = S3UrlSignerRole.asInstanceOf[js.Any], SoftwareToUpdate = SoftwareToUpdate.asInstanceOf[js.Any], UpdateTargets = UpdateTargets.asInstanceOf[js.Any], UpdateTargetsArchitecture = UpdateTargetsArchitecture.asInstanceOf[js.Any], UpdateTargetsOperatingSystem = UpdateTargetsOperatingSystem.asInstanceOf[js.Any])
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    if (UpdateAgentLogLevel != null) __obj.updateDynamic("UpdateAgentLogLevel")(UpdateAgentLogLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSoftwareUpdateJobRequest]
  }
}

