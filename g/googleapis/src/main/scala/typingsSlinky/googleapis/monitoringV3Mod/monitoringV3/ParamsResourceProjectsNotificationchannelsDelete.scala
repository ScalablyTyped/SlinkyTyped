package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsNotificationchannelsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * If true, the notification channel will be deleted regardless of its use
    * in alert policies (the policies will be updated to remove the channel).
    * If false, channels that are still referenced by an existing alerting
    * policy will fail to be deleted in a delete operation.
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * The channel for which to execute the request. The format is
    * projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID].
    */
  var name: js.UndefOr[String] = js.native
}

