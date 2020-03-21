package typingsSlinky.googleapis.composerV1beta1Mod.composerV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsImageversionsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of image_versions to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token value returned from a previous List request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * List ImageVersions in the given project and location, in the form:
    * "projects/{projectId}/locations/{locationId}"
    */
  var parent: js.UndefOr[String] = js.native
}

