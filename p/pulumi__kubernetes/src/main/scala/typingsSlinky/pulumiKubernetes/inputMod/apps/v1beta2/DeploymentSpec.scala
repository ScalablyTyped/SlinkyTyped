package typingsSlinky.pulumiKubernetes.inputMod.apps.v1beta2

import typingsSlinky.pulumiKubernetes.inputMod.core.v1.PodTemplateSpec
import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DeploymentSpec is the specification of the desired behavior of the Deployment.
  */
@js.native
trait DeploymentSpec extends StObject {
  
  /**
    * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
    */
  var minReadySeconds: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Indicates that the deployment is paused.
    */
  var paused: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
    */
  var progressDeadlineSeconds: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
    */
  var replicas: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
    */
  var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template's labels.
    */
  var selector: Input[LabelSelector] = js.native
  
  /**
    * The deployment strategy to use to replace existing pods with new ones.
    */
  var strategy: js.UndefOr[Input[DeploymentStrategy]] = js.native
  
  /**
    * Template describes the pods that will be created.
    */
  var template: Input[PodTemplateSpec] = js.native
}
object DeploymentSpec {
  
  @scala.inline
  def apply(selector: Input[LabelSelector], template: Input[PodTemplateSpec]): DeploymentSpec = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentSpec]
  }
  
  @scala.inline
  implicit class DeploymentSpecMutableBuilder[Self <: DeploymentSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinReadySeconds(value: Input[Double]): Self = StObject.set(x, "minReadySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinReadySecondsUndefined: Self = StObject.set(x, "minReadySeconds", js.undefined)
    
    @scala.inline
    def setPaused(value: Input[Boolean]): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    @scala.inline
    def setProgressDeadlineSeconds(value: Input[Double]): Self = StObject.set(x, "progressDeadlineSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressDeadlineSecondsUndefined: Self = StObject.set(x, "progressDeadlineSeconds", js.undefined)
    
    @scala.inline
    def setReplicas(value: Input[Double]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    @scala.inline
    def setRevisionHistoryLimit(value: Input[Double]): Self = StObject.set(x, "revisionHistoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionHistoryLimitUndefined: Self = StObject.set(x, "revisionHistoryLimit", js.undefined)
    
    @scala.inline
    def setSelector(value: Input[LabelSelector]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: Input[DeploymentStrategy]): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    @scala.inline
    def setTemplate(value: Input[PodTemplateSpec]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
