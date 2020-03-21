package typingsSlinky.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsDatabasesCollectiongroupsFieldsGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A name of the form
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/fields/{field_id}`
    */
  var name: js.UndefOr[String] = js.native
}

