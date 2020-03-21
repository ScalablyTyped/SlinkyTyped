package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsKnowledgebasesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. The maximum number of items to return in a single page. By
    * default 10 and at most 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional. The next_page_token value returned from a previous list
    * request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The project to list of knowledge bases for. Format:
    * `projects/<Project ID>`.
    */
  var parent: js.UndefOr[String] = js.native
}

