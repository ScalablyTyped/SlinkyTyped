package typingsSlinky.pulumiKubernetes.outputMod.authorization.v1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.authorizationDotk8sDotioSlashv1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SelfSubjectRulesReview enumerates the set of actions the current user can perform within a
  * namespace. The returned list of actions may be incomplete depending on the server's
  * authorization mode, and any errors experienced during the evaluation. SelfSubjectRulesReview
  * should be used by UIs to show/hide actions, or to quickly let an end user reason about their
  * permissions. It should NOT Be used by external systems to drive authorization decisions as
  * this raises confused deputy, cache lifetime/revocation, and correctness concerns.
  * SubjectAccessReview, and LocalAccessReview are the correct way to defer authorization
  * decisions to the API server.
  */
@js.native
trait SelfSubjectRulesReview extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: authorizationDotk8sDotioSlashv1 = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.SelfSubjectRulesReview = js.native
  val metadata: ObjectMeta = js.native
  /**
    * Spec holds information about the request being evaluated.
    */
  val spec: SelfSubjectRulesReviewSpec = js.native
  /**
    * Status is filled in by the server and indicates the set of actions a user can perform.
    */
  val status: SubjectRulesReviewStatus = js.native
}

object SelfSubjectRulesReview {
  @scala.inline
  def apply(
    apiVersion: authorizationDotk8sDotioSlashv1,
    kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.SelfSubjectRulesReview,
    metadata: ObjectMeta,
    spec: SelfSubjectRulesReviewSpec,
    status: SubjectRulesReviewStatus
  ): SelfSubjectRulesReview = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfSubjectRulesReview]
  }
  @scala.inline
  implicit class SelfSubjectRulesReviewOps[Self <: SelfSubjectRulesReview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: authorizationDotk8sDotioSlashv1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.SelfSubjectRulesReview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: ObjectMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpec(value: SelfSubjectRulesReviewSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: SubjectRulesReviewStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

