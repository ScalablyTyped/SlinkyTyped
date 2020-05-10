package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyCommand extends js.Object {
  /**
    * Optional parameters to use with the Amazon Redshift COPY command. For more information, see the "Optional Parameters" section of Amazon Redshift COPY command. Some possible examples that would apply to Kinesis Data Firehose are as follows:  delimiter '\t' lzop; - fields are delimited with "\t" (TAB character) and compressed using lzop.  delimiter '|' - fields are delimited with "|" (this is the default delimiter).  delimiter '|' escape - the delimiter should be escaped.  fixedwidth 'venueid:3,venuename:25,venuecity:12,venuestate:2,venueseats:6' - fields are fixed width in the source, with each width specified after every column in the table.  JSON 's3://mybucket/jsonpaths.txt' - data is in JSON format, and the path specified is the format of the data. For more examples, see Amazon Redshift COPY command examples.
    */
  var CopyOptions: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.CopyOptions] = js.native
  /**
    * A comma-separated list of column names.
    */
  var DataTableColumns: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.DataTableColumns] = js.native
  /**
    * The name of the target table. The table must already exist in the database.
    */
  var DataTableName: typingsSlinky.awsSdk.firehoseMod.DataTableName = js.native
}

object CopyCommand {
  @scala.inline
  def apply(DataTableName: DataTableName): CopyCommand = {
    val __obj = js.Dynamic.literal(DataTableName = DataTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyCommand]
  }
  @scala.inline
  implicit class CopyCommandOps[Self <: CopyCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataTableName(value: DataTableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyOptions(value: CopyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTableColumns(value: DataTableColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTableColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTableColumns")(js.undefined)
        ret
    }
  }
  
}

