package typingsSlinky.pulumiKubernetes.roleBindingMod

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.inputMod.rbac.v1alpha1.RoleRef
import typingsSlinky.pulumiKubernetes.inputMod.rbac.v1alpha1.Subject
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1alpha1
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleBindingArgs extends js.Object {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1alpha1]] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.RoleBinding]] = js.native
  
  /**
    * Standard object's metadata.
    */
  val metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  
  /**
    * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
    */
  val roleRef: Input[RoleRef] = js.native
  
  /**
    * Subjects holds references to the objects the role applies to.
    */
  val subjects: js.UndefOr[Input[js.Array[Input[Subject]]]] = js.native
}
object RoleBindingArgs {
  
  @scala.inline
  def apply(roleRef: Input[RoleRef]): RoleBindingArgs = {
    val __obj = js.Dynamic.literal(roleRef = roleRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleBindingArgs]
  }
  
  @scala.inline
  implicit class RoleBindingArgsOps[Self <: RoleBindingArgs] (val x: Self) extends AnyVal {
    
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
