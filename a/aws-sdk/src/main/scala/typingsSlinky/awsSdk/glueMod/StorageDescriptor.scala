package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageDescriptor extends js.Object {
  /**
    * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
    */
  var BucketColumns: js.UndefOr[NameStringList] = js.native
  /**
    * A list of the Columns in the table.
    */
  var Columns: js.UndefOr[ColumnList] = js.native
  /**
    *  True if the data in the table is compressed, or False if not.
    */
  var Compressed: js.UndefOr[Boolean] = js.native
  /**
    * The input format: SequenceFileInputFormat (binary), or TextInputFormat, or a custom format.
    */
  var InputFormat: js.UndefOr[FormatString] = js.native
  /**
    * The physical location of the table. By default, this takes the form of the warehouse location, followed by the database location in the warehouse, followed by the table name.
    */
  var Location: js.UndefOr[LocationString] = js.native
  /**
    * Must be specified if the table contains any dimension columns.
    */
  var NumberOfBuckets: js.UndefOr[Integer] = js.native
  /**
    * The output format: SequenceFileOutputFormat (binary), or IgnoreKeyTextOutputFormat, or a custom format.
    */
  var OutputFormat: js.UndefOr[FormatString] = js.native
  /**
    * The user-supplied properties in key-value form.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * The serialization/deserialization (SerDe) information.
    */
  var SerdeInfo: js.UndefOr[SerDeInfo] = js.native
  /**
    * The information about values that appear frequently in a column (skewed values).
    */
  var SkewedInfo: js.UndefOr[typingsSlinky.awsSdk.glueMod.SkewedInfo] = js.native
  /**
    * A list specifying the sort order of each bucket in the table.
    */
  var SortColumns: js.UndefOr[OrderList] = js.native
  /**
    *  True if the table data is stored in subdirectories, or False if not.
    */
  var StoredAsSubDirectories: js.UndefOr[Boolean] = js.native
}

object StorageDescriptor {
  @scala.inline
  def apply(): StorageDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageDescriptor]
  }
  @scala.inline
  implicit class StorageDescriptorOps[Self <: StorageDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketColumns(value: NameStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: ColumnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compressed")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFormat(value: FormatString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: LocationString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfBuckets(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFormat(value: FormatString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: ParametersMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withSerdeInfo(value: SerDeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerdeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerdeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerdeInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSkewedInfo(value: SkewedInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkewedInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkewedInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkewedInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSortColumns(value: OrderList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withStoredAsSubDirectories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoredAsSubDirectories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoredAsSubDirectories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoredAsSubDirectories")(js.undefined)
        ret
    }
  }
  
}

