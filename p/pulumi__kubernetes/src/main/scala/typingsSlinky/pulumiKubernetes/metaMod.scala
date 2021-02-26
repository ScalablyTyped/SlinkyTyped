package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.statusMod.StatusArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metaMod {
  
  object v1 {
    
    @JSImport("@pulumi/kubernetes/meta", "v1.Status")
    @js.native
    class Status protected ()
      extends typingsSlinky.pulumiKubernetes.metaV1Mod.Status {
      /**
        * Create a Status resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: StatusArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: StatusArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object Status {
      
      /**
        * Get an existing Status resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/meta", "v1.Status.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.statusMod.Status = js.native
      @JSImport("@pulumi/kubernetes/meta", "v1.Status.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.statusMod.Status = js.native
      
      /**
        * Returns true if the given object is an instance of Status.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/meta", "v1.Status.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/meta/v1/status.Status */ Boolean = js.native
    }
  }
}
