package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.outputMod.rbac.v1beta1.PolicyRule
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1beta1
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1RoleMod {
  
  @JSImport("@pulumi/kubernetes/rbac/v1beta1/role", "Role")
  @js.native
  class Role protected () extends CustomResource {
    /**
      * Create a Role resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[rbacDotauthorizationDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Role] = js.native
    
    /**
      * Standard object's metadata.
      */
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * Rules holds all the PolicyRules for this Role
      */
    val rules: Output_[js.Array[PolicyRule]] = js.native
  }
  /* static members */
  object Role {
    
    /**
      * Get an existing Role resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/rbac/v1beta1/role", "Role.get")
    @js.native
    def get(name: String, id: Input[ID]): Role = js.native
    @JSImport("@pulumi/kubernetes/rbac/v1beta1/role", "Role.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): Role = js.native
    
    /**
      * Returns true if the given object is an instance of Role.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/rbac/v1beta1/role", "Role.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/role.Role */ Boolean = js.native
  }
  
  @js.native
  trait RoleArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Role]] = js.native
    
    /**
      * Standard object's metadata.
      */
    val metadata: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.native
    
    /**
      * Rules holds all the PolicyRules for this Role
      */
    val rules: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.rbac.v1beta1.PolicyRule]]]
      ] = js.native
  }
  object RoleArgs {
    
    @scala.inline
    def apply(): RoleArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoleArgs]
    }
    
    @scala.inline
    implicit class RoleArgsMutableBuilder[Self <: RoleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Role]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setRules(value: Input[js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.rbac.v1beta1.PolicyRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: Input[typingsSlinky.pulumiKubernetes.inputMod.rbac.v1beta1.PolicyRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
    }
  }
}
