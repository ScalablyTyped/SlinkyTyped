package typingsSlinky.pulumiAws.productSubscriptionMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/securityhub/productSubscription", "ProductSubscription")
@js.native
class ProductSubscription protected () extends CustomResource {
  /**
    * Create a ProductSubscription resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ProductSubscriptionArgs) = this()
  def this(name: String, args: ProductSubscriptionArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of a resource that represents your subscription to the product that generates the findings that you want to import into Security Hub.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The ARN of the product that generates findings that you want to import into Security Hub - see below.
    */
  val productArn: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/securityhub/productSubscription", "ProductSubscription")
@js.native
object ProductSubscription extends js.Object {
  
  /**
    * Get an existing ProductSubscription resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ProductSubscription = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ProductSubscription = js.native
  def get(name: String, id: Input[ID], state: ProductSubscriptionState): ProductSubscription = js.native
  def get(name: String, id: Input[ID], state: ProductSubscriptionState, opts: CustomResourceOptions): ProductSubscription = js.native
  
  /**
    * Returns true if the given object is an instance of ProductSubscription.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/productSubscription.ProductSubscription */ Boolean = js.native
}
