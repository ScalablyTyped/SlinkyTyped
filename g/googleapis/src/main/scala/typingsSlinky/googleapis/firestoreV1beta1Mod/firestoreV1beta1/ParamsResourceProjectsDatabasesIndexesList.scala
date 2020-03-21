package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsDatabasesIndexesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    *
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The standard List page size.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The standard List page token.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The database name. For example:
    * `projects/{project_id}/databases/{database_id}`
    */
  var parent: js.UndefOr[String] = js.native
}

