package typingsSlinky.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOrganizationsGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The resource name of the Organization to fetch. This is the
    * organization's relative path in the API, formatted as
    * "organizations/[organizationId]". For example, "organizations/1234".
    */
  var name: js.UndefOr[String] = js.native
}

