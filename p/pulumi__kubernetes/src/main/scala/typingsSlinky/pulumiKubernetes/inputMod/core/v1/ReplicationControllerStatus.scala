package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ReplicationControllerStatus represents the current status of a replication controller.
  */
@js.native
trait ReplicationControllerStatus extends StObject {
  
  /**
    * The number of available replicas (ready for at least minReadySeconds) for this replication controller.
    */
  var availableReplicas: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Represents the latest available observations of a replication controller's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[ReplicationControllerCondition]]]] = js.native
  
  /**
    * The number of pods that have labels matching the labels of the pod template of the replication controller.
    */
  var fullyLabeledReplicas: js.UndefOr[Input[Double]] = js.native
  
  /**
    * ObservedGeneration reflects the generation of the most recently observed replication controller.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of ready replicas for this replication controller.
    */
  var readyReplicas: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
    */
  var replicas: Input[Double] = js.native
}
object ReplicationControllerStatus {
  
  @scala.inline
  def apply(replicas: Input[Double]): ReplicationControllerStatus = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationControllerStatus]
  }
  
  @scala.inline
  implicit class ReplicationControllerStatusMutableBuilder[Self <: ReplicationControllerStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableReplicas(value: Input[Double]): Self = StObject.set(x, "availableReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableReplicasUndefined: Self = StObject.set(x, "availableReplicas", js.undefined)
    
    @scala.inline
    def setConditions(value: Input[js.Array[Input[ReplicationControllerCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Input[ReplicationControllerCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setFullyLabeledReplicas(value: Input[Double]): Self = StObject.set(x, "fullyLabeledReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullyLabeledReplicasUndefined: Self = StObject.set(x, "fullyLabeledReplicas", js.undefined)
    
    @scala.inline
    def setObservedGeneration(value: Input[Double]): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    @scala.inline
    def setReadyReplicas(value: Input[Double]): Self = StObject.set(x, "readyReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyReplicasUndefined: Self = StObject.set(x, "readyReplicas", js.undefined)
    
    @scala.inline
    def setReplicas(value: Input[Double]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
  }
}
