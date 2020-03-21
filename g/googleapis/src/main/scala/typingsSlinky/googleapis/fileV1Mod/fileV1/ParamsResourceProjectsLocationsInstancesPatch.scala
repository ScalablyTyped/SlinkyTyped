package typingsSlinky.googleapis.fileV1Mod.fileV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsInstancesPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Output only. The resource name of the instance, in the format
    * projects/{project_id}/locations/{location_id}/instances/{instance_id}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInstance] = js.native
  /**
    * Mask of fields to update.  At least one path must be supplied in this
    * field.  The elements of the repeated paths field may only include these
    * fields: "description"
    */
  var updateMask: js.UndefOr[String] = js.native
}

