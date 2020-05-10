package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceDataSourceUpdate extends js.Object {
  /**
    * ID of the reference data source being updated. You can use the DescribeApplication operation to get this value.
    */
  var ReferenceId: Id = js.native
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream. 
    */
  var ReferenceSchemaUpdate: js.UndefOr[SourceSchema] = js.native
  /**
    * Describes the S3 bucket name, object key name, and IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf and populate the in-application reference table.
    */
  var S3ReferenceDataSourceUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.S3ReferenceDataSourceUpdate] = js.native
  /**
    * In-application table name that is created by this update.
    */
  var TableNameUpdate: js.UndefOr[InAppTableName] = js.native
}

object ReferenceDataSourceUpdate {
  @scala.inline
  def apply(ReferenceId: Id): ReferenceDataSourceUpdate = {
    val __obj = js.Dynamic.literal(ReferenceId = ReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceDataSourceUpdate]
  }
  @scala.inline
  implicit class ReferenceDataSourceUpdateOps[Self <: ReferenceDataSourceUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReferenceId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceSchemaUpdate(value: SourceSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceSchemaUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceSchemaUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceSchemaUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withS3ReferenceDataSourceUpdate(value: S3ReferenceDataSourceUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3ReferenceDataSourceUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3ReferenceDataSourceUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3ReferenceDataSourceUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withTableNameUpdate(value: InAppTableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableNameUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableNameUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableNameUpdate")(js.undefined)
        ret
    }
  }
  
}

