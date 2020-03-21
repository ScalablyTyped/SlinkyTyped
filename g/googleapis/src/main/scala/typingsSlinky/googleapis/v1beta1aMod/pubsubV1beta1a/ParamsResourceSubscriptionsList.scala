package typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSubscriptionsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Maximum number of subscriptions to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The value obtained in the last <code>ListSubscriptionsResponse</code> for
    * continuation.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * A valid label query expression.
    */
  var query: js.UndefOr[String] = js.native
}

