package typingsSlinky.pulumiKubernetes.outputMod.authorization.v1beta1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.authorizationDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not
  * filling in a spec.namespace means "in all namespaces".  Self is a special case, because users
  * should always be able to check whether they can perform an action
  */
@js.native
trait SelfSubjectAccessReview extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: authorizationDotk8sDotioSlashv1beta1 = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.SelfSubjectAccessReview = js.native
  val metadata: ObjectMeta = js.native
  /**
    * Spec holds information about the request being evaluated.  user and groups must be empty
    */
  val spec: SelfSubjectAccessReviewSpec = js.native
  /**
    * Status is filled in by the server and indicates whether the request is allowed or not
    */
  val status: SubjectAccessReviewStatus = js.native
}

object SelfSubjectAccessReview {
  @scala.inline
  def apply(
    apiVersion: authorizationDotk8sDotioSlashv1beta1,
    kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.SelfSubjectAccessReview,
    metadata: ObjectMeta,
    spec: SelfSubjectAccessReviewSpec,
    status: SubjectAccessReviewStatus
  ): SelfSubjectAccessReview = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfSubjectAccessReview]
  }
  @scala.inline
  implicit class SelfSubjectAccessReviewOps[Self <: SelfSubjectAccessReview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: authorizationDotk8sDotioSlashv1beta1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.SelfSubjectAccessReview): Self = {
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
    def withSpec(value: SelfSubjectAccessReviewSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: SubjectAccessReviewStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

