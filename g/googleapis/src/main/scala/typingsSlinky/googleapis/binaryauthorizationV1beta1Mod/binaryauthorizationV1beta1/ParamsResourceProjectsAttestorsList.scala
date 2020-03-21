package typingsSlinky.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsAttestorsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Requested page size. The server may return fewer results than requested.
    * If unspecified, the server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of ListAttestorsResponse.next_page_token
    * returned from the previous call to the `ListAttestors` method.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The resource name of the project associated with the attestors,
    * in the format `projects/x`.
    */
  var parent: js.UndefOr[String] = js.native
}

