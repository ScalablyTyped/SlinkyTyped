package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HorizontalPodAutoscaling extends js.Object {
  /**
    * Whether the Horizontal Pod Autoscaling feature is enabled in the cluster.
    * When enabled, it ensures that a Heapster pod is running in the cluster,
    * which is also used by the Cloud Monitoring service.
    */
  var disabled: js.UndefOr[Boolean] = js.native
}

object HorizontalPodAutoscaling {
  @scala.inline
  def apply(): HorizontalPodAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalPodAutoscaling]
  }
  @scala.inline
  implicit class HorizontalPodAutoscalingOps[Self <: HorizontalPodAutoscaling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
  }
  
}

