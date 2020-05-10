package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Autoscaler policy.
  */
@js.native
trait SchemaAutoscalingPolicy extends js.Object {
  /**
    * The number of seconds that the autoscaler should wait before it starts
    * collecting information from a new instance. This prevents the autoscaler
    * from collecting information when the instance is initializing, during
    * which the collected usage would not be reliable. The default time
    * autoscaler waits is 60 seconds.  Virtual machine initialization times
    * might vary because of numerous factors. We recommend that you test how
    * long an instance may take to initialize. To do this, create an instance
    * and time the startup process.
    */
  var coolDownPeriodSec: js.UndefOr[Double] = js.native
  /**
    * Defines the CPU utilization policy that allows the autoscaler to scale
    * based on the average CPU utilization of a managed instance group.
    */
  var cpuUtilization: js.UndefOr[SchemaAutoscalingPolicyCpuUtilization] = js.native
  /**
    * Configuration parameters of autoscaling based on a custom metric.
    */
  var customMetricUtilizations: js.UndefOr[js.Array[SchemaAutoscalingPolicyCustomMetricUtilization]] = js.native
  /**
    * Configuration parameters of autoscaling based on load balancer.
    */
  var loadBalancingUtilization: js.UndefOr[SchemaAutoscalingPolicyLoadBalancingUtilization] = js.native
  /**
    * The maximum number of instances that the autoscaler can scale up to. This
    * is required when creating or updating an autoscaler. The maximum number
    * of replicas should not be lower than minimal number of replicas.
    */
  var maxNumReplicas: js.UndefOr[Double] = js.native
  /**
    * The minimum number of replicas that the autoscaler can scale down to.
    * This cannot be less than 0. If not provided, autoscaler will choose a
    * default value depending on maximum number of instances allowed.
    */
  var minNumReplicas: js.UndefOr[Double] = js.native
}

object SchemaAutoscalingPolicy {
  @scala.inline
  def apply(): SchemaAutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingPolicy]
  }
  @scala.inline
  implicit class SchemaAutoscalingPolicyOps[Self <: SchemaAutoscalingPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoolDownPeriodSec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coolDownPeriodSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoolDownPeriodSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coolDownPeriodSec")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuUtilization(value: SchemaAutoscalingPolicyCpuUtilization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuUtilization")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMetricUtilizations(value: js.Array[SchemaAutoscalingPolicyCustomMetricUtilization]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMetricUtilizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMetricUtilizations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMetricUtilizations")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadBalancingUtilization(value: SchemaAutoscalingPolicyLoadBalancingUtilization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancingUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancingUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancingUtilization")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNumReplicas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNumReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumReplicas")(js.undefined)
        ret
    }
    @scala.inline
    def withMinNumReplicas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNumReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinNumReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNumReplicas")(js.undefined)
        ret
    }
  }
  
}

