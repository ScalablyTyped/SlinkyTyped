package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePipelineNotificationsResponse extends js.Object {
  /**
    * A section of the response body that provides information about the pipeline associated with this notification.
    */
  var Pipeline: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Pipeline] = js.native
}

object UpdatePipelineNotificationsResponse {
  @scala.inline
  def apply(Pipeline: Pipeline = null): UpdatePipelineNotificationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Pipeline != null) __obj.updateDynamic("Pipeline")(Pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePipelineNotificationsResponse]
  }
}

