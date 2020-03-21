package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceContactgroupsUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateContactGroupRequest] = js.native
  /**
    * The resource name for the contact group, assigned by the server. An ASCII
    * string, in the form of `contactGroups/`<var>contact_group_id</var>.
    */
  var resourceName: js.UndefOr[String] = js.native
}

