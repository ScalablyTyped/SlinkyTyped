package typingsSlinky.pulumiAws.catalogTableMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.glue.CatalogTablePartitionKey
import typingsSlinky.pulumiAws.outputMod.glue.CatalogTableStorageDescriptor
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/glue/catalogTable", "CatalogTable")
@js.native
class CatalogTable protected () extends CustomResource {
  /**
    * Create a CatalogTable resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CatalogTableArgs) = this()
  def this(name: String, args: CatalogTableArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the Glue Table.
    */
  val arn: Output_[String] = js.native
  
  /**
    * ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
    */
  val catalogId: Output_[String] = js.native
  
  /**
    * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
    */
  val databaseName: Output_[String] = js.native
  
  /**
    * Description of the table.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Name of the SerDe.
    */
  val name: Output_[String] = js.native
  
  /**
    * Owner of the table.
    */
  val owner: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  val parameters: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys. see Partition Keys below.
    */
  val partitionKeys: Output_[js.UndefOr[js.Array[CatalogTablePartitionKey]]] = js.native
  
  /**
    * Retention time for this table.
    */
  val retention: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
    */
  val storageDescriptor: Output_[js.UndefOr[CatalogTableStorageDescriptor]] = js.native
  
  /**
    * The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.). While optional, some Athena DDL queries such as `ALTER TABLE` and `SHOW CREATE TABLE` will fail if this argument is empty.
    */
  val tableType: Output_[js.UndefOr[String]] = js.native
  
  /**
    * If the table is a view, the expanded text of the view; otherwise null.
    */
  val viewExpandedText: Output_[js.UndefOr[String]] = js.native
  
  /**
    * If the table is a view, the original text of the view; otherwise null.
    */
  val viewOriginalText: Output_[js.UndefOr[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/glue/catalogTable", "CatalogTable")
@js.native
object CatalogTable extends js.Object {
  
  /**
    * Get an existing CatalogTable resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): CatalogTable = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): CatalogTable = js.native
  def get(name: String, id: Input[ID], state: CatalogTableState): CatalogTable = js.native
  def get(name: String, id: Input[ID], state: CatalogTableState, opts: CustomResourceOptions): CatalogTable = js.native
  
  /**
    * Returns true if the given object is an instance of CatalogTable.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/catalogTable.CatalogTable */ Boolean = js.native
}
