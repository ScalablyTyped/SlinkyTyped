package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.kinesisanalyticsv2ApplicationMod.ApplicationArgs
import typingsSlinky.pulumiAws.kinesisanalyticsv2ApplicationMod.ApplicationState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kinesisanalyticsv2 {
  
  @JSImport("@pulumi/aws", "kinesisanalyticsv2.Application")
  @js.native
  class Application protected ()
    extends typingsSlinky.pulumiAws.kinesisanalyticsv2Mod.Application {
    /**
      * Create a Application resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApplicationArgs) = this()
    def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Application {
    
    /**
      * Get an existing Application resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "kinesisanalyticsv2.Application.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.kinesisanalyticsv2ApplicationMod.Application = js.native
    @JSImport("@pulumi/aws", "kinesisanalyticsv2.Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.kinesisanalyticsv2ApplicationMod.Application = js.native
    @JSImport("@pulumi/aws", "kinesisanalyticsv2.Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApplicationState): typingsSlinky.pulumiAws.kinesisanalyticsv2ApplicationMod.Application = js.native
    @JSImport("@pulumi/aws", "kinesisanalyticsv2.Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.kinesisanalyticsv2ApplicationMod.Application = js.native
    
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "kinesisanalyticsv2.Application.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesisanalyticsv2/application.Application */ Boolean = js.native
  }
}
