package typingsSlinky.pulumiAws.catalogTableMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.glue.CatalogTablePartitionKey
import typingsSlinky.pulumiAws.inputMod.glue.CatalogTableStorageDescriptor
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTableArgs extends js.Object {
  /**
    * ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
    */
  val catalogId: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
    */
  val databaseName: Input[String] = js.native
  /**
    * Description of the table.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the SerDe.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Owner of the table.
    */
  val owner: js.UndefOr[Input[String]] = js.native
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
    */
  val partitionKeys: js.UndefOr[Input[js.Array[Input[CatalogTablePartitionKey]]]] = js.native
  /**
    * Retention time for this table.
    */
  val retention: js.UndefOr[Input[Double]] = js.native
  /**
    * A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
    */
  val storageDescriptor: js.UndefOr[Input[CatalogTableStorageDescriptor]] = js.native
  /**
    * The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.).
    */
  val tableType: js.UndefOr[Input[String]] = js.native
  /**
    * If the table is a view, the expanded text of the view; otherwise null.
    */
  val viewExpandedText: js.UndefOr[Input[String]] = js.native
  /**
    * If the table is a view, the original text of the view; otherwise null.
    */
  val viewOriginalText: js.UndefOr[Input[String]] = js.native
}

object CatalogTableArgs {
  @scala.inline
  def apply(databaseName: Input[String]): CatalogTableArgs = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTableArgs]
  }
  @scala.inline
  implicit class CatalogTableArgsOps[Self <: CatalogTableArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCatalogId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalogId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitionKeys(value: Input[js.Array[Input[CatalogTablePartitionKey]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withRetention(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retention")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageDescriptor(value: Input[CatalogTableStorageDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageDescriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageDescriptor")(js.undefined)
        ret
    }
    @scala.inline
    def withTableType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableType")(js.undefined)
        ret
    }
    @scala.inline
    def withViewExpandedText(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewExpandedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewExpandedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewExpandedText")(js.undefined)
        ret
    }
    @scala.inline
    def withViewOriginalText(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewOriginalText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewOriginalText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewOriginalText")(js.undefined)
        ret
    }
  }
  
}

