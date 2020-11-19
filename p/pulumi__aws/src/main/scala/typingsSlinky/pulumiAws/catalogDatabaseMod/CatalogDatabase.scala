package typingsSlinky.pulumiAws.catalogDatabaseMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/glue/catalogDatabase", "CatalogDatabase")
@js.native
class CatalogDatabase protected () extends CustomResource {
  /**
    * Create a CatalogDatabase resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: CatalogDatabaseArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: CatalogDatabaseArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the Glue Catalog Database.
    */
  val arn: Output_[String] = js.native
  
  /**
    * ID of the Glue Catalog to create the database in. If omitted, this defaults to the AWS Account ID.
    */
  val catalogId: Output_[String] = js.native
  
  /**
    * Description of the database.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The location of the database (for example, an HDFS path).
    */
  val locationUri: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The name of the database.
    */
  val name: Output_[String] = js.native
  
  /**
    * A list of key-value pairs that define parameters and properties of the database.
    */
  val parameters: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/glue/catalogDatabase", "CatalogDatabase")
@js.native
object CatalogDatabase extends js.Object {
  
  /**
    * Get an existing CatalogDatabase resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): CatalogDatabase = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): CatalogDatabase = js.native
  def get(name: String, id: Input[ID], state: CatalogDatabaseState): CatalogDatabase = js.native
  def get(name: String, id: Input[ID], state: CatalogDatabaseState, opts: CustomResourceOptions): CatalogDatabase = js.native
  
  /**
    * Returns true if the given object is an instance of CatalogDatabase.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/catalogDatabase.CatalogDatabase */ Boolean = js.native
}
