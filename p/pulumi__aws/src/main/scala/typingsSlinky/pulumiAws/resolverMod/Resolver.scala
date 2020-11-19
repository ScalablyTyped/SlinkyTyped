package typingsSlinky.pulumiAws.resolverMod

import typingsSlinky.pulumiAws.outputMod.appsync.ResolverCachingConfig
import typingsSlinky.pulumiAws.outputMod.appsync.ResolverPipelineConfig
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/appsync/resolver", "Resolver")
@js.native
class Resolver protected () extends CustomResource {
  /**
    * Create a Resolver resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResolverArgs) = this()
  def this(name: String, args: ResolverArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The API ID for the GraphQL API.
    */
  val apiId: Output_[String] = js.native
  
  /**
    * The ARN
    */
  val arn: Output_[String] = js.native
  
  /**
    * The CachingConfig.
    */
  val cachingConfig: Output_[js.UndefOr[ResolverCachingConfig]] = js.native
  
  /**
    * The DataSource name.
    */
  val dataSource: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The field name from the schema defined in the GraphQL API.
    */
  val field: Output_[String] = js.native
  
  /**
    * The resolver type. Valid values are `UNIT` and `PIPELINE`.
    */
  val kind: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The PipelineConfig.
    */
  val pipelineConfig: Output_[js.UndefOr[ResolverPipelineConfig]] = js.native
  
  /**
    * The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver.
    */
  val requestTemplate: Output_[String] = js.native
  
  /**
    * The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver.
    */
  val responseTemplate: Output_[String] = js.native
  
  /**
    * The type name from the schema defined in the GraphQL API.
    */
  val `type`: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/appsync/resolver", "Resolver")
@js.native
object Resolver extends js.Object {
  
  /**
    * Get an existing Resolver resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Resolver = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Resolver = js.native
  def get(name: String, id: Input[ID], state: ResolverState): Resolver = js.native
  def get(name: String, id: Input[ID], state: ResolverState, opts: CustomResourceOptions): Resolver = js.native
  
  /**
    * Returns true if the given object is an instance of Resolver.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/resolver.Resolver */ Boolean = js.native
}
