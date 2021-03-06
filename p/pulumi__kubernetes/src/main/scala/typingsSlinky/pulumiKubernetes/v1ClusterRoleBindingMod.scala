package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.outputMod.rbac.v1.RoleRef
import typingsSlinky.pulumiKubernetes.outputMod.rbac.v1.Subject
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1ClusterRoleBindingMod {
  
  @JSImport("@pulumi/kubernetes/rbac/v1/clusterRoleBinding", "ClusterRoleBinding")
  @js.native
  class ClusterRoleBinding protected () extends CustomResource {
    /**
      * Create a ClusterRoleBinding resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleBindingArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleBindingArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[rbacDotauthorizationDotk8sDotioSlashv1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBinding] = js.native
    
    /**
      * Standard object's metadata.
      */
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
      */
    val roleRef: Output_[RoleRef] = js.native
    
    /**
      * Subjects holds references to the objects the role applies to.
      */
    val subjects: Output_[js.Array[Subject]] = js.native
  }
  /* static members */
  object ClusterRoleBinding {
    
    /**
      * Get an existing ClusterRoleBinding resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/rbac/v1/clusterRoleBinding", "ClusterRoleBinding.get")
    @js.native
    def get(name: String, id: Input[ID]): ClusterRoleBinding = js.native
    @JSImport("@pulumi/kubernetes/rbac/v1/clusterRoleBinding", "ClusterRoleBinding.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): ClusterRoleBinding = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterRoleBinding.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/rbac/v1/clusterRoleBinding", "ClusterRoleBinding.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1/clusterRoleBinding.ClusterRoleBinding */ Boolean = js.native
  }
  
  @js.native
  trait ClusterRoleBindingArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBinding]] = js.native
    
    /**
      * Standard object's metadata.
      */
    val metadata: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.native
    
    /**
      * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
      */
    val roleRef: Input[typingsSlinky.pulumiKubernetes.inputMod.rbac.v1.RoleRef] = js.native
    
    /**
      * Subjects holds references to the objects the role applies to.
      */
    val subjects: js.UndefOr[Input[js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.rbac.v1.Subject]]]] = js.native
  }
  object ClusterRoleBindingArgs {
    
    @scala.inline
    def apply(roleRef: Input[typingsSlinky.pulumiKubernetes.inputMod.rbac.v1.RoleRef]): ClusterRoleBindingArgs = {
      val __obj = js.Dynamic.literal(roleRef = roleRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterRoleBindingArgs]
    }
    
    @scala.inline
    implicit class ClusterRoleBindingArgsMutableBuilder[Self <: ClusterRoleBindingArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[rbacDotauthorizationDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBinding]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setRoleRef(value: Input[typingsSlinky.pulumiKubernetes.inputMod.rbac.v1.RoleRef]): Self = StObject.set(x, "roleRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjects(value: Input[js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.rbac.v1.Subject]]]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectsUndefined: Self = StObject.set(x, "subjects", js.undefined)
      
      @scala.inline
      def setSubjectsVarargs(value: Input[typingsSlinky.pulumiKubernetes.inputMod.rbac.v1.Subject]*): Self = StObject.set(x, "subjects", js.Array(value :_*))
    }
  }
}
