package typingsSlinky.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends js.Object {
  // configuration for ingestion from  a dynamodb table
  var dynamodb: js.UndefOr[SourceDynamoDb] = js.native
  // file upload details
  var file_upload: js.UndefOr[SourceFileUpload] = js.native
  // format parameters for data from this source
  var format_params: js.UndefOr[FormatParams] = js.native
  // configuration for ingestion from GCS
  var gcs: js.UndefOr[SourceGcs] = js.native
  // name of integration to use
  var integration_name: String = js.native
  // configuration for ingestion from kinesis stream
  var kinesis: js.UndefOr[SourceKinesis] = js.native
  // configuration for ingestion from Redshift
  var redshift: js.UndefOr[SourceRedshift] = js.native
  // configuration for ingestion from S3
  var s3: js.UndefOr[SourceS3] = js.native
  // the ingest status of this source
  var status: js.UndefOr[Status] = js.native
}

object Source {
  @scala.inline
  def apply(integration_name: String): Source = {
    val __obj = js.Dynamic.literal(integration_name = integration_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntegration_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integration_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDynamodb(value: SourceDynamoDb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamodb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodb")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_upload(value: SourceFileUpload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_upload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_upload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_upload")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat_params(value: FormatParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat_params: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_params")(js.undefined)
        ret
    }
    @scala.inline
    def withGcs(value: SourceGcs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcs")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesis(value: SourceKinesis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesis")(js.undefined)
        ret
    }
    @scala.inline
    def withRedshift(value: SourceRedshift): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redshift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedshift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redshift")(js.undefined)
        ret
    }
    @scala.inline
    def withS3(value: SourceS3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

