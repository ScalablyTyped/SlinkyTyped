package typingsSlinky.pulumiAws.wafGeoMatchSetMod

import typingsSlinky.pulumiAws.outputMod.waf.GeoMatchSetGeoMatchConstraint
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/waf/geoMatchSet", "GeoMatchSet")
@js.native
class GeoMatchSet protected () extends CustomResource {
  /**
    * Create a GeoMatchSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: GeoMatchSetArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: GeoMatchSetArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: Output_[String] = js.native
  
  /**
    * The GeoMatchConstraint objects which contain the country that you want AWS WAF to search for.
    */
  val geoMatchConstraints: Output_[js.UndefOr[js.Array[GeoMatchSetGeoMatchConstraint]]] = js.native
  
  /**
    * The name or description of the GeoMatchSet.
    */
  val name: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/waf/geoMatchSet", "GeoMatchSet")
@js.native
object GeoMatchSet extends js.Object {
  
  /**
    * Get an existing GeoMatchSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): GeoMatchSet = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): GeoMatchSet = js.native
  def get(name: String, id: Input[ID], state: GeoMatchSetState): GeoMatchSet = js.native
  def get(name: String, id: Input[ID], state: GeoMatchSetState, opts: CustomResourceOptions): GeoMatchSet = js.native
  
  /**
    * Returns true if the given object is an instance of GeoMatchSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/geoMatchSet.GeoMatchSet */ Boolean = js.native
}
