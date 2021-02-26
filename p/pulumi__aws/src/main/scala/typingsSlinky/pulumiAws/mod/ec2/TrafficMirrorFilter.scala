package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.trafficMirrorFilterMod.TrafficMirrorFilterArgs
import typingsSlinky.pulumiAws.trafficMirrorFilterMod.TrafficMirrorFilterState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.TrafficMirrorFilter")
@js.native
class TrafficMirrorFilter protected ()
  extends typingsSlinky.pulumiAws.ec2Mod.TrafficMirrorFilter {
  /**
    * Create a TrafficMirrorFilter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: TrafficMirrorFilterArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: TrafficMirrorFilterArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object TrafficMirrorFilter {
  
  /**
    * Get an existing TrafficMirrorFilter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws", "ec2.TrafficMirrorFilter.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.trafficMirrorFilterMod.TrafficMirrorFilter = js.native
  @JSImport("@pulumi/aws", "ec2.TrafficMirrorFilter.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.trafficMirrorFilterMod.TrafficMirrorFilter = js.native
  @JSImport("@pulumi/aws", "ec2.TrafficMirrorFilter.get")
  @js.native
  def get(name: String, id: Input[ID], state: TrafficMirrorFilterState): typingsSlinky.pulumiAws.trafficMirrorFilterMod.TrafficMirrorFilter = js.native
  @JSImport("@pulumi/aws", "ec2.TrafficMirrorFilter.get")
  @js.native
  def get(name: String, id: Input[ID], state: TrafficMirrorFilterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.trafficMirrorFilterMod.TrafficMirrorFilter = js.native
  
  /**
    * Returns true if the given object is an instance of TrafficMirrorFilter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws", "ec2.TrafficMirrorFilter.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/trafficMirrorFilter.TrafficMirrorFilter */ Boolean = js.native
}
