package typingsSlinky.pulumiKubernetes.coreV1Mod

import typingsSlinky.pulumiKubernetes.secretMod.SecretArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/core/v1", "Secret")
@js.native
class Secret protected ()
  extends typingsSlinky.pulumiKubernetes.secretMod.Secret {
  /**
    * Create a Secret resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: SecretArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: SecretArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object Secret {
  
  /**
    * Get an existing Secret resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/kubernetes/core/v1", "Secret.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.secretMod.Secret = js.native
  @JSImport("@pulumi/kubernetes/core/v1", "Secret.get")
  @js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.secretMod.Secret = js.native
  
  /**
    * Returns true if the given object is an instance of Secret.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/kubernetes/core/v1", "Secret.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/secret.Secret */ Boolean = js.native
}
