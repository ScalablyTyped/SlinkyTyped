package typingsSlinky.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a

import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarTopicsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Maximum number of topics to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The value obtained in the last <code>ListTopicsResponse</code> for
    * continuation.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * A valid label query expression.
    */
  var query: js.UndefOr[String] = js.native
}

