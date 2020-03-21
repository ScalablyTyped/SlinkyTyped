package typingsSlinky.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePagesUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The name of this `ClaimReview` markup page resource, in the form of
    * `pages/{page_id}`. Except for update requests, this field is output-only
    * and should not be set by the user.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
}

