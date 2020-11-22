package typingsSlinky.pulumiPulumi.resourceMod

import typingsSlinky.pulumiPulumi.outputMod.Inputs
import typingsSlinky.pulumiPulumi.outputMod.Output_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/resource", "CustomResource")
@js.native
abstract class CustomResource protected () extends Resource {
  /**
    * Creates and registers a new managed resource.  t is the fully qualified type token and name
    * is the "name" part to use in creating a stable and globally unique URN for the object.
    * dependsOn is an optional list of other resources that this resource depends on, controlling
    * the order in which we perform resource operations. Creating an instance does not necessarily
    * perform a create on the physical entity which it represents, and instead, this is dependent
    * upon the diffing of the new goal state compared to the current known resource state.
    *
    * @param t The type of the resource.
    * @param name The _unique_ name of the resource.
    * @param props The arguments to use to populate the new resource.
    * @param opts A bag of options that control this resource's behavior.
    * @param dependency True if this is a synthetic resource used internally for dependency tracking.
    */
  def this(t: String, name: String) = this()
  def this(t: String, name: String, props: Inputs) = this()
  def this(t: String, name: String, props: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(t: String, name: String, props: Inputs, opts: CustomResourceOptions) = this()
  def this(
    t: String,
    name: String,
    props: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    dependency: Boolean
  ) = this()
  def this(
    t: String,
    name: String,
    props: js.UndefOr[scala.Nothing],
    opts: CustomResourceOptions,
    dependency: Boolean
  ) = this()
  def this(t: String, name: String, props: Inputs, opts: js.UndefOr[scala.Nothing], dependency: Boolean) = this()
  def this(t: String, name: String, props: Inputs, opts: CustomResourceOptions, dependency: Boolean) = this()
  
  /**
    * id is the provider-assigned unique ID for this managed resource.  It is set during
    * deployments and may be missing (undefined) during planning phases.
    */
  val id: Output_[ID] = js.native
}
/* static members */
@JSImport("@pulumi/pulumi/resource", "CustomResource")
@js.native
object CustomResource extends js.Object {
  
  /**
    * Returns true if the given object is an instance of CustomResource.  This is designed to work even when
    * multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.CustomResource */ Boolean = js.native
}
