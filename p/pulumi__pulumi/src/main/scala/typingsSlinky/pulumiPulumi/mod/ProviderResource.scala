package typingsSlinky.pulumiPulumi.mod

import typingsSlinky.pulumiPulumi.outputMod.Inputs
import typingsSlinky.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi", "ProviderResource")
@js.native
abstract class ProviderResource protected ()
  extends typingsSlinky.pulumiPulumi.resourceMod.ProviderResource {
  /**
    * Creates and registers a new provider resource for a particular package.
    *
    * @param pkg The package associated with this provider.
    * @param name The _unique_ name of the provider.
    * @param props The configuration to use for this provider.
    * @param opts A bag of options that control this provider's behavior.
    */
  def this(pkg: String, name: String) = this()
  def this(pkg: String, name: String, props: Inputs) = this()
  def this(pkg: String, name: String, props: js.UndefOr[scala.Nothing], opts: ResourceOptions) = this()
  def this(pkg: String, name: String, props: Inputs, opts: ResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/pulumi", "ProviderResource")
@js.native
object ProviderResource extends js.Object {
  
  def register(): js.Promise[js.UndefOr[String]] = js.native
  def register(provider: typingsSlinky.pulumiPulumi.resourceMod.ProviderResource): js.Promise[js.UndefOr[String]] = js.native
}
