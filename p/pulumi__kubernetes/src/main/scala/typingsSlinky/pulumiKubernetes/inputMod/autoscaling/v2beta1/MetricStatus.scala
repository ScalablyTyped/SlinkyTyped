package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MetricStatus describes the last-read state of a single metric.
  */
@js.native
trait MetricStatus extends js.Object {
  /**
    * external refers to a global metric that is not associated with any Kubernetes object. It
    * allows autoscaling based on information coming from components running outside of cluster
    * (for example length of queue in cloud messaging service, or QPS from loadbalancer running
    * outside of cluster).
    */
  var external: js.UndefOr[Input[ExternalMetricStatus]] = js.native
  /**
    * object refers to a metric describing a single kubernetes object (for example,
    * hits-per-second on an Ingress object).
    */
  var `object`: js.UndefOr[Input[ObjectMetricStatus]] = js.native
  /**
    * pods refers to a metric describing each pod in the current scale target (for example,
    * transactions-processed-per-second).  The values will be averaged together before being
    * compared to the target value.
    */
  var pods: js.UndefOr[Input[PodsMetricStatus]] = js.native
  /**
    * resource refers to a resource metric (such as those specified in requests and limits) known
    * to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such
    * metrics are built in to Kubernetes, and have special scaling options on top of those
    * available to normal per-pod metrics using the "pods" source.
    */
  var resource: js.UndefOr[Input[ResourceMetricStatus]] = js.native
  /**
    * type is the type of metric source.  It will be one of "Object", "Pods" or "Resource", each
    * corresponds to a matching field in the object.
    */
  var `type`: Input[String] = js.native
}

object MetricStatus {
  @scala.inline
  def apply(`type`: Input[String]): MetricStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricStatus]
  }
  @scala.inline
  implicit class MetricStatusOps[Self <: MetricStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal(value: Input[ExternalMetricStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(js.undefined)
        ret
    }
    @scala.inline
    def withObject(value: Input[ObjectMetricStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.undefined)
        ret
    }
    @scala.inline
    def withPods(value: Input[PodsMetricStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pods")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: Input[ResourceMetricStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
  }
  
}

