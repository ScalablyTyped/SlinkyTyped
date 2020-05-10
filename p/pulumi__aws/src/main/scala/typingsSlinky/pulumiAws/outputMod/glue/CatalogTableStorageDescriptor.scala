package typingsSlinky.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTableStorageDescriptor extends js.Object {
  /**
    * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
    */
  var bucketColumns: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of the Columns in the table.
    */
  var columns: js.UndefOr[js.Array[CatalogTableStorageDescriptorColumn]] = js.native
  /**
    * True if the data in the table is compressed, or False if not.
    */
  var compressed: js.UndefOr[Boolean] = js.native
  /**
    * The input format: SequenceFileInputFormat (binary), or TextInputFormat, or a custom format.
    */
  var inputFormat: js.UndefOr[String] = js.native
  /**
    * The physical location of the table. By default this takes the form of the warehouse location, followed by the database location in the warehouse, followed by the table name.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Must be specified if the table contains any dimension columns.
    */
  var numberOfBuckets: js.UndefOr[Double] = js.native
  /**
    * The output format: SequenceFileOutputFormat (binary), or IgnoreKeyTextOutputFormat, or a custom format.
    */
  var outputFormat: js.UndefOr[String] = js.native
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Serialization/deserialization (SerDe) information.
    */
  var serDeInfo: js.UndefOr[CatalogTableStorageDescriptorSerDeInfo] = js.native
  /**
    * Information about values that appear very frequently in a column (skewed values).
    */
  var skewedInfo: js.UndefOr[CatalogTableStorageDescriptorSkewedInfo] = js.native
  /**
    * A list of Order objects specifying the sort order of each bucket in the table.
    */
  var sortColumns: js.UndefOr[js.Array[CatalogTableStorageDescriptorSortColumn]] = js.native
  /**
    * True if the table data is stored in subdirectories, or False if not.
    */
  var storedAsSubDirectories: js.UndefOr[Boolean] = js.native
}

object CatalogTableStorageDescriptor {
  @scala.inline
  def apply(): CatalogTableStorageDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogTableStorageDescriptor]
  }
  @scala.inline
  implicit class CatalogTableStorageDescriptorOps[Self <: CatalogTableStorageDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketColumns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[CatalogTableStorageDescriptorColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressed")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfBuckets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: StringDictionary[String]): Self = {
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
    def withSerDeInfo(value: CatalogTableStorageDescriptorSerDeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serDeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerDeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serDeInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSkewedInfo(value: CatalogTableStorageDescriptorSkewedInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewedInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkewedInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewedInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSortColumns(value: js.Array[CatalogTableStorageDescriptorSortColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withStoredAsSubDirectories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedAsSubDirectories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoredAsSubDirectories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedAsSubDirectories")(js.undefined)
        ret
    }
  }
  
}

