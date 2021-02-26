package typingsSlinky.pulumiKubernetes.coreV1Mod

import typingsSlinky.pulumiKubernetes.namespaceMod.NamespaceArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/core/v1", "Namespace")
@js.native
class Namespace protected ()
  extends typingsSlinky.pulumiKubernetes.namespaceMod.Namespace {
  /**
    * Create a Namespace resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: NamespaceArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: NamespaceArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object Namespace {
  
  /**
    * Get an existing Namespace resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/kubernetes/core/v1", "Namespace.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.namespaceMod.Namespace = js.native
  @JSImport("@pulumi/kubernetes/core/v1", "Namespace.get")
  @js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.namespaceMod.Namespace = js.native
  
  /**
    * Returns true if the given object is an instance of Namespace.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/kubernetes/core/v1", "Namespace.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/namespace.Namespace */ Boolean = js.native
}
