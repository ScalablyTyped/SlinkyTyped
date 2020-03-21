package typingsSlinky.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceBeaconsAttachmentsDelete extends StandardParameters {
  /**
    * The attachment name (`attachmentName`) of the attachment to remove. For
    * example:
    * `beacons/3!893737abc9/attachments/c5e937-af0-494-959-ec49d12738`. For
    * Eddystone-EID beacons, the beacon ID portion (`3!893737abc9`) may be the
    * beacon's current EID, or its "stable" Eddystone-UID. Required.
    */
  var attachmentName: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The project id of the attachment to delete. If not provided, the project
    * that is making the request is used. Optional.
    */
  var projectId: js.UndefOr[String] = js.native
}

