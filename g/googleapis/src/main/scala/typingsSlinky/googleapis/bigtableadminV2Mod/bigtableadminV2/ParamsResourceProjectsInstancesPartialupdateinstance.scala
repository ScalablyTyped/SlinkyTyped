package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsInstancesPartialupdateinstance extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * (`OutputOnly`) The unique name of the instance. Values are of the form
    * `projects/<project>/instances/a-z+[a-z0-9]`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInstance] = js.native
  /**
    * The subset of Instance fields which should be replaced. Must be
    * explicitly set.
    */
  var updateMask: js.UndefOr[String] = js.native
}

