package typingsSlinky.pulumiKubernetes.outputMod.apps.v1beta1

import typingsSlinky.pulumiKubernetes.outputMod.core.v1.PodTemplateSpec
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DeploymentSpec is the specification of the desired behavior of the Deployment.
  */
@js.native
trait DeploymentSpec extends js.Object {
  /**
    * Minimum number of seconds for which a newly created pod should be ready without any of its
    * container crashing, for it to be considered available. Defaults to 0 (pod will be
    * considered available as soon as it is ready)
    */
  val minReadySeconds: Double = js.native
  /**
    * Indicates that the deployment is paused.
    */
  val paused: Boolean = js.native
  /**
    * The maximum time in seconds for a deployment to make progress before it is considered to be
    * failed. The deployment controller will continue to process failed deployments and a
    * condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status.
    * Note that progress will not be estimated during the time a deployment is paused. Defaults
    * to 600s.
    */
  val progressDeadlineSeconds: Double = js.native
  /**
    * Number of desired pods. This is a pointer to distinguish between explicit zero and not
    * specified. Defaults to 1.
    */
  val replicas: Double = js.native
  /**
    * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish
    * between explicit zero and not specified. Defaults to 2.
    */
  val revisionHistoryLimit: Double = js.native
  /**
    * DEPRECATED. The config this deployment is rolling back to. Will be cleared after rollback
    * is done.
    */
  val rollbackTo: RollbackConfig = js.native
  /**
    * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the
    * ones affected by this deployment.
    */
  val selector: LabelSelector = js.native
  /**
    * The deployment strategy to use to replace existing pods with new ones.
    */
  val strategy: DeploymentStrategy = js.native
  /**
    * Template describes the pods that will be created.
    */
  val template: PodTemplateSpec = js.native
}

object DeploymentSpec {
  @scala.inline
  def apply(
    minReadySeconds: Double,
    paused: Boolean,
    progressDeadlineSeconds: Double,
    replicas: Double,
    revisionHistoryLimit: Double,
    rollbackTo: RollbackConfig,
    selector: LabelSelector,
    strategy: DeploymentStrategy,
    template: PodTemplateSpec
  ): DeploymentSpec = {
    val __obj = js.Dynamic.literal(minReadySeconds = minReadySeconds.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], progressDeadlineSeconds = progressDeadlineSeconds.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], revisionHistoryLimit = revisionHistoryLimit.asInstanceOf[js.Any], rollbackTo = rollbackTo.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentSpec]
  }
  @scala.inline
  implicit class DeploymentSpecOps[Self <: DeploymentSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinReadySeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minReadySeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressDeadlineSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressDeadlineSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevisionHistoryLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionHistoryLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRollbackTo(value: RollbackConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollbackTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: LabelSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrategy(value: DeploymentStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: PodTemplateSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

