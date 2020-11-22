package typingsSlinky.pulumiAws.meshMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.appmesh.MeshSpec
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/appmesh/mesh", "Mesh")
@js.native
class Mesh protected () extends CustomResource {
  /**
    * Create a Mesh resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: MeshArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: MeshArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the service mesh.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The creation date of the service mesh.
    */
  val createdDate: Output_[String] = js.native
  
  /**
    * The last update date of the service mesh.
    */
  val lastUpdatedDate: Output_[String] = js.native
  
  /**
    * The AWS account ID of the service mesh's owner.
    */
  val meshOwner: Output_[String] = js.native
  
  /**
    * The name to use for the service mesh. Must be between 1 and 255 characters in length.
    */
  val name: Output_[String] = js.native
  
  /**
    * The resource owner's AWS account ID.
    */
  val resourceOwner: Output_[String] = js.native
  
  /**
    * The service mesh specification to apply.
    */
  val spec: Output_[js.UndefOr[MeshSpec]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/appmesh/mesh", "Mesh")
@js.native
object Mesh extends js.Object {
  
  /**
    * Get an existing Mesh resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Mesh = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Mesh = js.native
  def get(name: String, id: Input[ID], state: MeshState): Mesh = js.native
  def get(name: String, id: Input[ID], state: MeshState, opts: CustomResourceOptions): Mesh = js.native
  
  /**
    * Returns true if the given object is an instance of Mesh.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/mesh.Mesh */ Boolean = js.native
}
