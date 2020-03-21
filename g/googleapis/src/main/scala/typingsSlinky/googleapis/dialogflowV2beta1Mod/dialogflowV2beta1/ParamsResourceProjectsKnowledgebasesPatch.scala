package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsKnowledgebasesPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The knowledge base resource name. The name must be empty when creating a
    * knowledge base. Format: `projects/<Project ID>/knowledgeBases/<Knowledge
    * Base ID>`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  /**
    * Optional. Not specified means `update all`. Currently, only
    * `display_name` can be updated, an InvalidArgument will be returned for
    * attempting to update other fields.
    */
  var updateMask: js.UndefOr[String] = js.native
}

