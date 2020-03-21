package typingsSlinky.googleapis.v1alpha2Mod.genomicsV1alpha2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePipelinesGetcontrollerconfig extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The operation to retrieve controller configuration for.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    *
    */
  var validationToken: js.UndefOr[String] = js.native
}

