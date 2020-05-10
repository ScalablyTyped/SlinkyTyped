package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ScaleStatus represents the current status of a scale subresource.
  */
@js.native
trait ScaleStatus extends js.Object {
  /**
    * actual number of observed instances of the scaled object.
    */
  var replicas: Input[Double] = js.native
  /**
    * label query over pods that should match the replicas count. This is same as the label
    * selector but in the string format to avoid introspection by clients. The string will be in
    * the same format as the query-param syntax. More info about label selectors:
    * http://kubernetes.io/docs/user-guide/labels#label-selectors
    */
  var selector: js.UndefOr[Input[String]] = js.native
}

object ScaleStatus {
  @scala.inline
  def apply(replicas: Input[Double]): ScaleStatus = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleStatus]
  }
  @scala.inline
  implicit class ScaleStatusOps[Self <: ScaleStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicas(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

