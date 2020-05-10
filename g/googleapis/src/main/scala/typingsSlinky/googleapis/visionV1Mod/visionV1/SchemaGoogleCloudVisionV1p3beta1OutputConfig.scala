package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The desired output location and metadata.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1OutputConfig extends js.Object {
  /**
    * The max number of response protos to put into each output JSON file on
    * Google Cloud Storage. The valid range is [1, 100]. If not specified, the
    * default value is 20.  For example, for one pdf file with 100 pages, 100
    * response protos will be generated. If `batch_size` = 20, then 5 json
    * files each containing 20 response protos will be written under the prefix
    * `gcs_destination`.`uri`.  Currently, batch_size only applies to
    * GcsDestination, with potential future support for other output
    * configurations.
    */
  var batchSize: js.UndefOr[Double] = js.native
  /**
    * The Google Cloud Storage location to write the output(s) to.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1GcsDestination] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1OutputConfig {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1OutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1OutputConfig]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1OutputConfigOps[Self <: SchemaGoogleCloudVisionV1p3beta1OutputConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGcsDestination(value: SchemaGoogleCloudVisionV1p3beta1GcsDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcsDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsDestination")(js.undefined)
        ret
    }
  }
  
}

