package typingsSlinky.pulumiKubernetes.outputMod.rbac.v1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RoleBinding references a role, but does not contain it.  It can reference a Role in the same
  * namespace or a ClusterRole in the global namespace. It adds who information via Subjects and
  * namespace information by which namespace it exists in.  RoleBindings in a given namespace
  * only have effect in that namespace.
  */
@js.native
trait RoleBinding extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: rbacDotauthorizationDotk8sDotioSlashv1 = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.RoleBinding = js.native
  /**
    * Standard object's metadata.
    */
  val metadata: ObjectMeta = js.native
  /**
    * RoleRef can reference a Role in the current namespace or a ClusterRole in the global
    * namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
    */
  val roleRef: RoleRef = js.native
  /**
    * Subjects holds references to the objects the role applies to.
    */
  val subjects: js.Array[Subject] = js.native
}

object RoleBinding {
  @scala.inline
  def apply(
    apiVersion: rbacDotauthorizationDotk8sDotioSlashv1,
    kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.RoleBinding,
    metadata: ObjectMeta,
    roleRef: RoleRef,
    subjects: js.Array[Subject]
  ): RoleBinding = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], roleRef = roleRef.asInstanceOf[js.Any], subjects = subjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleBinding]
  }
  @scala.inline
  implicit class RoleBindingOps[Self <: RoleBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: rbacDotauthorizationDotk8sDotioSlashv1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.RoleBinding): Self = {
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
    def withRoleRef(value: RoleRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubjects(value: js.Array[Subject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjects")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

