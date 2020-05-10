package typingsSlinky.pulumiKubernetes.outputMod.autoscaling.v2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MetricSpec specifies how to scale based on a single metric (only `type` and one other
  * matching field should be set at once).
  */
@js.native
trait MetricSpec extends js.Object {
  /**
    * external refers to a global metric that is not associated with any Kubernetes object. It
    * allows autoscaling based on information coming from components running outside of cluster
    * (for example length of queue in cloud messaging service, or QPS from loadbalancer running
    * outside of cluster).
    */
  val external: ExternalMetricSource = js.native
  /**
    * object refers to a metric describing a single kubernetes object (for example,
    * hits-per-second on an Ingress object).
    */
  val `object`: ObjectMetricSource = js.native
  /**
    * pods refers to a metric describing each pod in the current scale target (for example,
    * transactions-processed-per-second).  The values will be averaged together before being
    * compared to the target value.
    */
  val pods: PodsMetricSource = js.native
  /**
    * resource refers to a resource metric (such as those specified in requests and limits) known
    * to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such
    * metrics are built in to Kubernetes, and have special scaling options on top of those
    * available to normal per-pod metrics using the "pods" source.
    */
  val resource: ResourceMetricSource = js.native
  /**
    * type is the type of metric source.  It should be one of "Object", "Pods" or "Resource",
    * each mapping to a matching field in the object.
    */
  val `type`: String = js.native
}

object MetricSpec {
  @scala.inline
  def apply(
    external: ExternalMetricSource,
    `object`: ObjectMetricSource,
    pods: PodsMetricSource,
    resource: ResourceMetricSource,
    `type`: String
  ): MetricSpec = {
    val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any], pods = pods.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricSpec]
  }
  @scala.inline
  implicit class MetricSpecOps[Self <: MetricSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternal(value: ExternalMetricSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: ObjectMetricSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPods(value: PodsMetricSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: ResourceMetricSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

