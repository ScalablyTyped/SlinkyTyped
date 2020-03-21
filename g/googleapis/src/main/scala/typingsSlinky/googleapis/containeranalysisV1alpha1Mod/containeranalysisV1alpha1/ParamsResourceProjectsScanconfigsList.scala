package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsScanconfigsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The filter expression.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The number of items to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The page token to use for the next request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * This containers the project Id i.e.: projects/{project_id}
    */
  var parent: js.UndefOr[String] = js.native
}

