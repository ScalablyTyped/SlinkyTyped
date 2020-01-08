package typingsSlinky.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarMetricdescriptorsDollarDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The metric descriptor on which to execute the request. The format is
    * "projects/{project_id_or_number}/metricDescriptors/{metric_id}". An
    * example of {metric_id} is: "custom.googleapis.com/my_test_metric".
    */
  var name: js.UndefOr[String] = js.native
}

