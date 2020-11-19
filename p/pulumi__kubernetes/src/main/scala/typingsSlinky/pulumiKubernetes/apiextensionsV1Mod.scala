package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.v1CustomResourceDefinitionListMod.CustomResourceDefinitionListArgs
import typingsSlinky.pulumiKubernetes.v1CustomResourceDefinitionMod.CustomResourceDefinitionArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/apiextensions/v1", JSImport.Namespace)
@js.native
object apiextensionsV1Mod extends js.Object {
  
  @js.native
  class CustomResourceDefinition protected ()
    extends typingsSlinky.pulumiKubernetes.v1CustomResourceDefinitionMod.CustomResourceDefinition {
    /**
      * Create a CustomResourceDefinition resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CustomResourceDefinitionArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: CustomResourceDefinitionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object CustomResourceDefinition extends js.Object {
    
    /**
      * Get an existing CustomResourceDefinition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1CustomResourceDefinitionMod.CustomResourceDefinition = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1CustomResourceDefinitionMod.CustomResourceDefinition = js.native
    
    /**
      * Returns true if the given object is an instance of CustomResourceDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1/customResourceDefinition.CustomResourceDefinition */ Boolean = js.native
  }
  
  @js.native
  class CustomResourceDefinitionList protected ()
    extends typingsSlinky.pulumiKubernetes.v1CustomResourceDefinitionListMod.CustomResourceDefinitionList {
    /**
      * Create a CustomResourceDefinitionList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CustomResourceDefinitionListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: CustomResourceDefinitionListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object CustomResourceDefinitionList extends js.Object {
    
    /**
      * Get an existing CustomResourceDefinitionList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1CustomResourceDefinitionListMod.CustomResourceDefinitionList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1CustomResourceDefinitionListMod.CustomResourceDefinitionList = js.native
    
    /**
      * Returns true if the given object is an instance of CustomResourceDefinitionList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1/customResourceDefinitionList.CustomResourceDefinitionList */ Boolean = js.native
  }
}
