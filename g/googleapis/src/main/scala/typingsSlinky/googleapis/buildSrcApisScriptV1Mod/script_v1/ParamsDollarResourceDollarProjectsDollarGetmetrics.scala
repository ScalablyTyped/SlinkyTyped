package typingsSlinky.googleapis.buildSrcApisScriptV1Mod.script_v1

import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarGetmetrics extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional field indicating a specific deployment to retrieve metrics from.
    */
  @JSName("metricsFilter.deploymentId")
  var metricsFilterDotdeploymentId: js.UndefOr[String] = js.native
  /**
    * Required field indicating what granularity of metrics are returned.
    */
  var metricsGranularity: js.UndefOr[String] = js.native
  /**
    * Required field indicating the script to get metrics for.
    */
  var scriptId: js.UndefOr[String] = js.native
}

