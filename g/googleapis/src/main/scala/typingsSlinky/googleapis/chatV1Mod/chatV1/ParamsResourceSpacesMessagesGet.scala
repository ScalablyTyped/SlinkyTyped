package typingsSlinky.googleapis.chatV1Mod.chatV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSpacesMessagesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. Resource name of the message to be retrieved, in the form
    * "spaces/x/messages/x".  Example:
    * spaces/AAAAMpdlehY/messages/UMxbHmzDlr4.UMxbHmzDlr4
    */
  var name: js.UndefOr[String] = js.native
}

