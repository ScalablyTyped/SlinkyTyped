package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsInstancesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * DEPRECATED: This field is unused and ignored.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The unique name of the project for which a list of instances is
    * requested. Values are of the form `projects/<project>`.
    */
  var parent: js.UndefOr[String] = js.native
}

