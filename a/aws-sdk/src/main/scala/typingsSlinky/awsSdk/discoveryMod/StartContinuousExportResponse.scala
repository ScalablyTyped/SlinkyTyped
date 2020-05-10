package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartContinuousExportResponse extends js.Object {
  /**
    * The type of data collector used to gather this data (currently only offered for AGENT).
    */
  var dataSource: js.UndefOr[DataSource] = js.native
  /**
    * The unique ID assigned to this export.
    */
  var exportId: js.UndefOr[ConfigurationsExportId] = js.native
  /**
    * The name of the s3 bucket where the export data parquet files are stored.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.native
  /**
    * A dictionary which describes how the data is stored.    databaseName - the name of the Glue database used to store the schema.  
    */
  var schemaStorageConfig: js.UndefOr[SchemaStorageConfig] = js.native
  /**
    * The timestamp representing when the continuous export was started.
    */
  var startTime: js.UndefOr[js.Date] = js.native
}

object StartContinuousExportResponse {
  @scala.inline
  def apply(): StartContinuousExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartContinuousExportResponse]
  }
  @scala.inline
  implicit class StartContinuousExportResponseOps[Self <: StartContinuousExportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withExportId(value: ConfigurationsExportId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportId")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Bucket(value: S3Bucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Bucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaStorageConfig(value: SchemaStorageConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaStorageConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaStorageConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaStorageConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
  }
  
}

