package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.auditSinkListMod.AuditSinkListArgs
import typingsSlinky.pulumiKubernetes.auditSinkMod.AuditSinkArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auditregistrationMod {
  
  object v1alpha1 {
    
    @JSImport("@pulumi/kubernetes/auditregistration", "v1alpha1.AuditSink")
    @js.native
    class AuditSink protected ()
      extends typingsSlinky.pulumiKubernetes.v1alpha1Mod.AuditSink {
      /**
        * Create a AuditSink resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: AuditSinkArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: AuditSinkArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object AuditSink {
      
      /**
        * Get an existing AuditSink resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/auditregistration", "v1alpha1.AuditSink.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.auditSinkMod.AuditSink = js.native
      @JSImport("@pulumi/kubernetes/auditregistration", "v1alpha1.AuditSink.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.auditSinkMod.AuditSink = js.native
      
      /**
        * Returns true if the given object is an instance of AuditSink.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/auditregistration", "v1alpha1.AuditSink.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/auditSink.AuditSink */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/auditregistration", "v1alpha1.AuditSinkList")
    @js.native
    class AuditSinkList protected ()
      extends typingsSlinky.pulumiKubernetes.v1alpha1Mod.AuditSinkList {
      /**
        * Create a AuditSinkList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: AuditSinkListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: AuditSinkListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object AuditSinkList {
      
      /**
        * Get an existing AuditSinkList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/auditregistration", "v1alpha1.AuditSinkList.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.auditSinkListMod.AuditSinkList = js.native
      @JSImport("@pulumi/kubernetes/auditregistration", "v1alpha1.AuditSinkList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.auditSinkListMod.AuditSinkList = js.native
      
      /**
        * Returns true if the given object is an instance of AuditSinkList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/auditregistration", "v1alpha1.AuditSinkList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/auditSinkList.AuditSinkList */ Boolean = js.native
    }
  }
}
