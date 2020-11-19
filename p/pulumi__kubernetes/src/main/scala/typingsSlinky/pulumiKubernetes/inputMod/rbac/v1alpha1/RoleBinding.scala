package typingsSlinky.pulumiKubernetes.inputMod.rbac.v1alpha1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1alpha1
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RoleBinding references a role, but does not contain it.  It can reference a Role in the same namespace or a ClusterRole in the global namespace. It adds who information via Subjects and namespace information by which namespace it exists in.  RoleBindings in a given namespace only have effect in that namespace. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 RoleBinding, and will no longer be served in v1.20.
  */
@js.native
trait RoleBinding extends js.Object {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1alpha1]] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.RoleBinding]] = js.native
  
  /**
    * Standard object's metadata.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  
  /**
    * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
    */
  var roleRef: Input[RoleRef] = js.native
  
  /**
    * Subjects holds references to the objects the role applies to.
    */
  var subjects: js.UndefOr[Input[js.Array[Input[Subject]]]] = js.native
}
object RoleBinding {
  
  @scala.inline
  def apply(roleRef: Input[RoleRef]): RoleBinding = {
    val __obj = js.Dynamic.literal(roleRef = roleRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleBinding]
  }
  
  @scala.inline
  implicit class RoleBindingOps[Self <: RoleBinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRoleRef(value: Input[RoleRef]): Self = this.set("roleRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersion(value: Input[rbacDotauthorizationDotk8sDotioSlashv1alpha1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.RoleBinding]): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setSubjectsVarargs(value: Input[Subject]*): Self = this.set("subjects", js.Array(value :_*))
    
    @scala.inline
    def setSubjects(value: Input[js.Array[Input[Subject]]]): Self = this.set("subjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjects: Self = this.set("subjects", js.undefined)
  }
}
