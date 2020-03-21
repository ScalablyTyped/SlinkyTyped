package typingsSlinky.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSitesDomainsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The page size to return. Defaults to 50.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token from a previous request, if provided.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The parent for which to list domains, in the format:
    * <code>sites/<var>site-name</var></code>
    */
  var parent: js.UndefOr[String] = js.native
}

