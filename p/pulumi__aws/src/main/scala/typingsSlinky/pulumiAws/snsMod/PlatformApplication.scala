package typingsSlinky.pulumiAws.snsMod

import typingsSlinky.pulumiAws.platformApplicationMod.PlatformApplicationArgs
import typingsSlinky.pulumiAws.platformApplicationMod.PlatformApplicationState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/sns", "PlatformApplication")
@js.native
class PlatformApplication protected ()
  extends typingsSlinky.pulumiAws.platformApplicationMod.PlatformApplication {
  /**
    * Create a PlatformApplication resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PlatformApplicationArgs) = this()
  def this(name: String, args: PlatformApplicationArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/sns", "PlatformApplication")
@js.native
object PlatformApplication extends js.Object {
  
  /**
    * Get an existing PlatformApplication resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.platformApplicationMod.PlatformApplication = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.platformApplicationMod.PlatformApplication = js.native
  def get(name: String, id: Input[ID], state: PlatformApplicationState): typingsSlinky.pulumiAws.platformApplicationMod.PlatformApplication = js.native
  def get(name: String, id: Input[ID], state: PlatformApplicationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.platformApplicationMod.PlatformApplication = js.native
  
  /**
    * Returns true if the given object is an instance of PlatformApplication.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/platformApplication.PlatformApplication */ Boolean = js.native
}
