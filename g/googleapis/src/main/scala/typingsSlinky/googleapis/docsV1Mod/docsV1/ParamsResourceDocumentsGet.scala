package typingsSlinky.googleapis.docsV1Mod.docsV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceDocumentsGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the document to retrieve.
    */
  var documentId: js.UndefOr[String] = js.native
  /**
    * The suggestions view mode to apply to the document. This allows viewing
    * the document with all suggestions inline, accepted or rejected. If one is
    * not specified, DEFAULT_FOR_CURRENT_ACCESS is used.
    */
  var suggestionsViewMode: js.UndefOr[String] = js.native
}

