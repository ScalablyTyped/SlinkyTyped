package typingsSlinky.pulumiKubernetes.coreMod.v1

import typingsSlinky.pulumiKubernetes.endpointsMod.EndpointsArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/core", "v1.Endpoints")
@js.native
class Endpoints protected ()
  extends typingsSlinky.pulumiKubernetes.coreV1Mod.Endpoints {
  /**
    * Create a Endpoints resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: EndpointsArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: EndpointsArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/kubernetes/core", "v1.Endpoints")
@js.native
object Endpoints extends js.Object {
  
  /**
    * Get an existing Endpoints resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.endpointsMod.Endpoints = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.endpointsMod.Endpoints = js.native
  
  /**
    * Returns true if the given object is an instance of Endpoints.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/endpoints.Endpoints */ Boolean = js.native
}
