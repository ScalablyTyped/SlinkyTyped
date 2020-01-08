package typingsSlinky.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarList extends StandardParameters {
  /**
    * Part of `parent`. Name of the parent Version resource. Example:
    * apps/myapp/services/default/versions/v1.
    */
  var appsId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Maximum results to return per page.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Part of `parent`. See documentation of `appsId`.
    */
  var servicesId: js.UndefOr[String] = js.native
  /**
    * Part of `parent`. See documentation of `appsId`.
    */
  var versionsId: js.UndefOr[String] = js.native
}

