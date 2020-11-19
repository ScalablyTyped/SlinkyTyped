package typingsSlinky.pulumiAws.applicationloadbalancingListenerCertificateMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/applicationloadbalancing/listenerCertificate", "ListenerCertificate")
@js.native
class ListenerCertificate protected () extends CustomResource {
  /**
    * Create a ListenerCertificate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  /** @deprecated aws.applicationloadbalancing.ListenerCertificate has been deprecated in favor of aws.alb.ListenerCertificate */
  def this(name: String, args: ListenerCertificateArgs) = this()
  def this(name: String, args: ListenerCertificateArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the certificate to attach to the listener.
    */
  val certificateArn: Output_[String] = js.native
  
  /**
    * The ARN of the listener to which to attach the certificate.
    */
  val listenerArn: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/applicationloadbalancing/listenerCertificate", "ListenerCertificate")
@js.native
object ListenerCertificate extends js.Object {
  
  /**
    * Get an existing ListenerCertificate resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ListenerCertificate = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ListenerCertificate = js.native
  def get(name: String, id: Input[ID], state: ListenerCertificateState): ListenerCertificate = js.native
  def get(name: String, id: Input[ID], state: ListenerCertificateState, opts: CustomResourceOptions): ListenerCertificate = js.native
  
  /**
    * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/listenerCertificate.ListenerCertificate */ Boolean = js.native
}
