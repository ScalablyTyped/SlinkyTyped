package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.trafficMirrorTargetMod.TrafficMirrorTargetArgs
import typingsSlinky.pulumiAws.trafficMirrorTargetMod.TrafficMirrorTargetState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "TrafficMirrorTarget")
@js.native
class TrafficMirrorTarget protected ()
  extends typingsSlinky.pulumiAws.trafficMirrorTargetMod.TrafficMirrorTarget {
  /**
    * Create a TrafficMirrorTarget resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: TrafficMirrorTargetArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: TrafficMirrorTargetArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object TrafficMirrorTarget {
  
  /**
    * Get an existing TrafficMirrorTarget resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/ec2", "TrafficMirrorTarget.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.trafficMirrorTargetMod.TrafficMirrorTarget = js.native
  @JSImport("@pulumi/aws/ec2", "TrafficMirrorTarget.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.trafficMirrorTargetMod.TrafficMirrorTarget = js.native
  @JSImport("@pulumi/aws/ec2", "TrafficMirrorTarget.get")
  @js.native
  def get(name: String, id: Input[ID], state: TrafficMirrorTargetState): typingsSlinky.pulumiAws.trafficMirrorTargetMod.TrafficMirrorTarget = js.native
  @JSImport("@pulumi/aws/ec2", "TrafficMirrorTarget.get")
  @js.native
  def get(name: String, id: Input[ID], state: TrafficMirrorTargetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.trafficMirrorTargetMod.TrafficMirrorTarget = js.native
  
  /**
    * Returns true if the given object is an instance of TrafficMirrorTarget.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/ec2", "TrafficMirrorTarget.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/trafficMirrorTarget.TrafficMirrorTarget */ Boolean = js.native
}
