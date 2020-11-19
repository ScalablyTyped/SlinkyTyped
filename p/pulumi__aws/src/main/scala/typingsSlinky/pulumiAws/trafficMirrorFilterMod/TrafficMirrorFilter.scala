package typingsSlinky.pulumiAws.trafficMirrorFilterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/trafficMirrorFilter", "TrafficMirrorFilter")
@js.native
class TrafficMirrorFilter protected () extends CustomResource {
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
  
  /**
    * A description of the filter.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * List of amazon network services that should be mirrored. Valid values: `amazon-dns`.
    */
  val networkServices: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * Key-value map of resource tags.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/trafficMirrorFilter", "TrafficMirrorFilter")
@js.native
object TrafficMirrorFilter extends js.Object {
  
  /**
    * Get an existing TrafficMirrorFilter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): TrafficMirrorFilter = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TrafficMirrorFilter = js.native
  def get(name: String, id: Input[ID], state: TrafficMirrorFilterState): TrafficMirrorFilter = js.native
  def get(name: String, id: Input[ID], state: TrafficMirrorFilterState, opts: CustomResourceOptions): TrafficMirrorFilter = js.native
  
  /**
    * Returns true if the given object is an instance of TrafficMirrorFilter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/trafficMirrorFilter.TrafficMirrorFilter */ Boolean = js.native
}
