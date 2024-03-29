package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Autoscaler policy.
  */
@js.native
trait SchemaAutoscalingPolicy extends StObject {
  
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
  
  /**
    * Defines operating mode for this policy.
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * Configuration parameters of autoscaling based on queuing system.
    */
  var queueBasedScaling: js.UndefOr[SchemaAutoscalingPolicyQueueBasedScaling] = js.native
}
object SchemaAutoscalingPolicy {
  
  @scala.inline
  def apply(): SchemaAutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingPolicy]
  }
  
  @scala.inline
  implicit class SchemaAutoscalingPolicyMutableBuilder[Self <: SchemaAutoscalingPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoolDownPeriodSec(value: Double): Self = StObject.set(x, "coolDownPeriodSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoolDownPeriodSecUndefined: Self = StObject.set(x, "coolDownPeriodSec", js.undefined)
    
    @scala.inline
    def setCpuUtilization(value: SchemaAutoscalingPolicyCpuUtilization): Self = StObject.set(x, "cpuUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuUtilizationUndefined: Self = StObject.set(x, "cpuUtilization", js.undefined)
    
    @scala.inline
    def setCustomMetricUtilizations(value: js.Array[SchemaAutoscalingPolicyCustomMetricUtilization]): Self = StObject.set(x, "customMetricUtilizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMetricUtilizationsUndefined: Self = StObject.set(x, "customMetricUtilizations", js.undefined)
    
    @scala.inline
    def setCustomMetricUtilizationsVarargs(value: SchemaAutoscalingPolicyCustomMetricUtilization*): Self = StObject.set(x, "customMetricUtilizations", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancingUtilization(value: SchemaAutoscalingPolicyLoadBalancingUtilization): Self = StObject.set(x, "loadBalancingUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancingUtilizationUndefined: Self = StObject.set(x, "loadBalancingUtilization", js.undefined)
    
    @scala.inline
    def setMaxNumReplicas(value: Double): Self = StObject.set(x, "maxNumReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNumReplicasUndefined: Self = StObject.set(x, "maxNumReplicas", js.undefined)
    
    @scala.inline
    def setMinNumReplicas(value: Double): Self = StObject.set(x, "minNumReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNumReplicasUndefined: Self = StObject.set(x, "minNumReplicas", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setQueueBasedScaling(value: SchemaAutoscalingPolicyQueueBasedScaling): Self = StObject.set(x, "queueBasedScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueBasedScalingUndefined: Self = StObject.set(x, "queueBasedScaling", js.undefined)
  }
}
