package typingsSlinky.pulumiPulumi.dynamicMod

import typingsSlinky.pulumiPulumi.outputMod.Inputs
import typingsSlinky.pulumiPulumi.resourceMod.CustomResource
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/dynamic", "Resource")
@js.native
abstract class Resource protected () extends CustomResource {
  /**
    * Creates a new dynamic resource.
    *
    * @param provider The implementation of the resource's CRUD operations.
    * @param name The name of the resource.
    * @param props The arguments to use to populate the new resource. Must not define the reserved
    *              property "__provider".
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(provider: ResourceProvider, name: String, props: Inputs) = this()
  def this(provider: ResourceProvider, name: String, props: Inputs, opts: CustomResourceOptions) = this()
}
