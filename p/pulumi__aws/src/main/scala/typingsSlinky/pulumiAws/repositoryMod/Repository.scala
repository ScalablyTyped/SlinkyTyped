package typingsSlinky.pulumiAws.repositoryMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/codecommit/repository", "Repository")
@js.native
class Repository protected () extends CustomResource {
  /**
    * Create a Repository resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RepositoryArgs) = this()
  def this(name: String, args: RepositoryArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the repository
    */
  val arn: Output_[String] = js.native
  
  /**
    * The URL to use for cloning the repository over HTTPS.
    */
  val cloneUrlHttp: Output_[String] = js.native
  
  /**
    * The URL to use for cloning the repository over SSH.
    */
  val cloneUrlSsh: Output_[String] = js.native
  
  /**
    * The default branch of the repository. The branch specified here needs to exist.
    */
  val defaultBranch: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The description of the repository. This needs to be less than 1000 characters
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ID of the repository
    */
  val repositoryId: Output_[String] = js.native
  
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: Output_[String] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/codecommit/repository", "Repository")
@js.native
object Repository extends js.Object {
  
  /**
    * Get an existing Repository resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Repository = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Repository = js.native
  def get(name: String, id: Input[ID], state: RepositoryState): Repository = js.native
  def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): Repository = js.native
  
  /**
    * Returns true if the given object is an instance of Repository.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codecommit/repository.Repository */ Boolean = js.native
}
