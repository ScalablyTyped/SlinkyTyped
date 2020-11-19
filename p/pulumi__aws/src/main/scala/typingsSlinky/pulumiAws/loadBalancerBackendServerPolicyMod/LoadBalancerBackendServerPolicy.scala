package typingsSlinky.pulumiAws.loadBalancerBackendServerPolicyMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerBackendServerPolicy", "LoadBalancerBackendServerPolicy")
@js.native
class LoadBalancerBackendServerPolicy protected () extends CustomResource {
  /**
    * Create a LoadBalancerBackendServerPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  /** @deprecated aws.elasticloadbalancing.LoadBalancerBackendServerPolicy has been deprecated in favor of aws.elb.LoadBalancerBackendServerPolicy */
  def this(name: String, args: LoadBalancerBackendServerPolicyArgs) = this()
  def this(name: String, args: LoadBalancerBackendServerPolicyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The instance port to apply the policy to.
    */
  val instancePort: Output_[Double] = js.native
  
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: Output_[String] = js.native
  
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: Output_[js.UndefOr[js.Array[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerBackendServerPolicy", "LoadBalancerBackendServerPolicy")
@js.native
object LoadBalancerBackendServerPolicy extends js.Object {
  
  /**
    * Get an existing LoadBalancerBackendServerPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LoadBalancerBackendServerPolicy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LoadBalancerBackendServerPolicy = js.native
  def get(name: String, id: Input[ID], state: LoadBalancerBackendServerPolicyState): LoadBalancerBackendServerPolicy = js.native
  def get(
    name: String,
    id: Input[ID],
    state: LoadBalancerBackendServerPolicyState,
    opts: CustomResourceOptions
  ): LoadBalancerBackendServerPolicy = js.native
  
  /**
    * Returns true if the given object is an instance of LoadBalancerBackendServerPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancerBackendServerPolicy.LoadBalancerBackendServerPolicy */ Boolean = js.native
}
