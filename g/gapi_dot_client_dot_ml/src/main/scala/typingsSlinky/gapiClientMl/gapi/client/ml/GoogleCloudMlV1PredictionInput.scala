package typingsSlinky.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1PredictionInput extends js.Object {
  /**
    * Optional. Number of records per batch, defaults to 64.
    * The service will buffer batch_size number of records in memory before
    * invoking one Tensorflow prediction call internally. So take the record
    * size and memory available into consideration when setting this parameter.
    */
  var batchSize: js.UndefOr[String] = js.native
  /** Required. The format of the input data files. */
  var dataFormat: js.UndefOr[String] = js.native
  /**
    * Required. The Google Cloud Storage location of the input data files.
    * May contain wildcards.
    */
  var inputPaths: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The maximum number of workers to be used for parallel processing.
    * Defaults to 10 if not specified.
    */
  var maxWorkerCount: js.UndefOr[String] = js.native
  /**
    * Use this field if you want to use the default version for the specified
    * model. The string must use the following format:
    *
    * `"projects/<var>[YOUR_PROJECT]</var>/models/<var>[YOUR_MODEL]</var>"`
    */
  var modelName: js.UndefOr[String] = js.native
  /** Required. The output Google Cloud Storage location. */
  var outputPath: js.UndefOr[String] = js.native
  /** Required. The Google Compute Engine region to run the prediction job in. */
  var region: js.UndefOr[String] = js.native
  /**
    * Optional. The Google Cloud ML runtime version to use for this batch
    * prediction. If not set, Google Cloud ML will pick the runtime version used
    * during the CreateVersion request for this model version, or choose the
    * latest stable version when model version information is not available
    * such as when the model is specified by uri.
    */
  var runtimeVersion: js.UndefOr[String] = js.native
  /**
    * Use this field if you want to specify a Google Cloud Storage path for
    * the model to use.
    */
  var uri: js.UndefOr[String] = js.native
  /**
    * Use this field if you want to specify a version of the model to use. The
    * string is formatted the same way as `model_version`, with the addition
    * of the version information:
    *
    * `"projects/<var>[YOUR_PROJECT]</var>/models/<var>YOUR_MODEL/versions/<var>[YOUR_VERSION]</var>"`
    */
  var versionName: js.UndefOr[String] = js.native
}

object GoogleCloudMlV1PredictionInput {
  @scala.inline
  def apply(): GoogleCloudMlV1PredictionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1PredictionInput]
  }
  @scala.inline
  implicit class GoogleCloudMlV1PredictionInputOps[Self <: GoogleCloudMlV1PredictionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchSize(value: String): Self = {
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
    def withDataFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withInputPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWorkerCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorkerCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWorkerCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorkerCount")(js.undefined)
        ret
    }
    @scala.inline
    def withModelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionName")(js.undefined)
        ret
    }
  }
  
}

