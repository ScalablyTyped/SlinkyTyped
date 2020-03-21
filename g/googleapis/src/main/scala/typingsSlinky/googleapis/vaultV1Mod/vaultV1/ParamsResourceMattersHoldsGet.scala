package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceMattersHoldsGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The hold ID.
    */
  var holdId: js.UndefOr[String] = js.native
  /**
    * The matter ID.
    */
  var matterId: js.UndefOr[String] = js.native
  /**
    * Specifies which parts of the Hold to return.
    */
  var view: js.UndefOr[String] = js.native
}

