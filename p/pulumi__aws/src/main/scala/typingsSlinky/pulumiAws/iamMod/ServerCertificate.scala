package typingsSlinky.pulumiAws.iamMod

import typingsSlinky.pulumiAws.serverCertificateMod.ServerCertificateArgs
import typingsSlinky.pulumiAws.serverCertificateMod.ServerCertificateState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/iam", "ServerCertificate")
@js.native
class ServerCertificate protected ()
  extends typingsSlinky.pulumiAws.serverCertificateMod.ServerCertificate {
  /**
    * Create a ServerCertificate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ServerCertificateArgs) = this()
  def this(name: String, args: ServerCertificateArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object ServerCertificate {
  
  /**
    * Get an existing ServerCertificate resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/iam", "ServerCertificate.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.serverCertificateMod.ServerCertificate = js.native
  @JSImport("@pulumi/aws/iam", "ServerCertificate.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.serverCertificateMod.ServerCertificate = js.native
  @JSImport("@pulumi/aws/iam", "ServerCertificate.get")
  @js.native
  def get(name: String, id: Input[ID], state: ServerCertificateState): typingsSlinky.pulumiAws.serverCertificateMod.ServerCertificate = js.native
  @JSImport("@pulumi/aws/iam", "ServerCertificate.get")
  @js.native
  def get(name: String, id: Input[ID], state: ServerCertificateState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.serverCertificateMod.ServerCertificate = js.native
  
  /**
    * Returns true if the given object is an instance of ServerCertificate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/iam", "ServerCertificate.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/serverCertificate.ServerCertificate */ Boolean = js.native
}
