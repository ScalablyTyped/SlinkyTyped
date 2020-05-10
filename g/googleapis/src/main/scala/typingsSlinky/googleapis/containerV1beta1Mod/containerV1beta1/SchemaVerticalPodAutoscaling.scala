package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VerticalPodAutoscaling contains global, per-cluster information required by
  * Vertical Pod Autoscaler to automatically adjust the resources of pods
  * controlled by it.
  */
@js.native
trait SchemaVerticalPodAutoscaling extends js.Object {
  /**
    * Enables vertical pod autoscaling.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaVerticalPodAutoscaling {
  @scala.inline
  def apply(): SchemaVerticalPodAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerticalPodAutoscaling]
  }
  @scala.inline
  implicit class SchemaVerticalPodAutoscalingOps[Self <: SchemaVerticalPodAutoscaling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
  }
  
}

