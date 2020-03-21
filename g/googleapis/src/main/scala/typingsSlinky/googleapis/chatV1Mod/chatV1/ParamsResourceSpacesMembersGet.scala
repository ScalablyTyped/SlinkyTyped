package typingsSlinky.googleapis.chatV1Mod.chatV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSpacesMembersGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. Resource name of the membership to be retrieved, in the form
    * "spaces/x/members/x".  Example:
    * spaces/AAAAMpdlehY/members/105115627578887013105
    */
  var name: js.UndefOr[String] = js.native
}

