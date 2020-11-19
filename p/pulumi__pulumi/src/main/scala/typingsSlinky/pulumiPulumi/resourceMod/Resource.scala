package typingsSlinky.pulumiPulumi.resourceMod

import typingsSlinky.pulumiPulumi.outputMod.Inputs
import typingsSlinky.pulumiPulumi.outputMod.Output_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/resource", "Resource")
@js.native
abstract class Resource protected () extends js.Object {
  /**
    * Creates and registers a new resource object.  [t] is the fully qualified type token and
    * [name] is the "name" part to use in creating a stable and globally unique URN for the object.
    * dependsOn is an optional list of other resources that this resource depends on, controlling
    * the order in which we perform resource operations.
    *
    * @param t The type of the resource.
    * @param name The _unique_ name of the resource.
    * @param custom True to indicate that this is a custom resource, managed by a plugin.
    * @param props The arguments to use to populate the new resource.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(t: String, name: String, custom: Boolean) = this()
  def this(t: String, name: String, custom: Boolean, props: Inputs) = this()
  def this(t: String, name: String, custom: Boolean, props: js.UndefOr[scala.Nothing], opts: ResourceOptions) = this()
  def this(t: String, name: String, custom: Boolean, props: Inputs, opts: ResourceOptions) = this()
  
  def getProvider(moduleMember: String): js.UndefOr[ProviderResource] = js.native
  
  /**
    * urn is the stable logical URN used to distinctly address a resource, both before and after
    * deployments.
    */
  val urn: Output_[URN] = js.native
}
/* static members */
@JSImport("@pulumi/pulumi/resource", "Resource")
@js.native
object Resource extends js.Object {
  
  def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.Resource */ Boolean = js.native
}
