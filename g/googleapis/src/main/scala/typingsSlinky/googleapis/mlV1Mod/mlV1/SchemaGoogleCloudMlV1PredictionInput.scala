package typingsSlinky.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents input parameters for a prediction job.
  */
@js.native
trait SchemaGoogleCloudMlV1PredictionInput extends js.Object {
  /**
    * Optional. Number of records per batch, defaults to 64. The service will
    * buffer batch_size number of records in memory before invoking one
    * Tensorflow prediction call internally. So take the record size and memory
    * available into consideration when setting this parameter.
    */
  var batchSize: js.UndefOr[String] = js.native
  /**
    * Required. The format of the input data files.
    */
  var dataFormat: js.UndefOr[String] = js.native
  /**
    * Required. The Google Cloud Storage location of the input data files. May
    * contain wildcards. See &lt;a
    * href=&quot;https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames&lt;/a&gt;
    */
  var inputPaths: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The maximum number of workers to be used for parallel
    * processing. Defaults to 10 if not specified.
    */
  var maxWorkerCount: js.UndefOr[String] = js.native
  /**
    * Use this field if you want to use the default version for the specified
    * model. The string must use the following format:
    * `&quot;projects/YOUR_PROJECT/models/YOUR_MODEL&quot;`
    */
  var modelName: js.UndefOr[String] = js.native
  /**
    * Optional. Format of the output data files, defaults to JSON.
    */
  var outputDataFormat: js.UndefOr[String] = js.native
  /**
    * Required. The output Google Cloud Storage location.
    */
  var outputPath: js.UndefOr[String] = js.native
  /**
    * Required. The Google Compute Engine region to run the prediction job in.
    * See the &lt;a
    * href=&quot;/ml-engine/docs/tensorflow/regions&quot;&gt;available
    * regions&lt;/a&gt; for ML Engine services.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Optional. The Cloud ML Engine runtime version to use for this batch
    * prediction. If not set, Cloud ML Engine will pick the runtime version
    * used during the CreateVersion request for this model version, or choose
    * the latest stable version when model version information is not available
    * such as when the model is specified by uri.
    */
  var runtimeVersion: js.UndefOr[String] = js.native
  /**
    * Optional. The name of the signature defined in the SavedModel to use for
    * this job. Please refer to
    * [SavedModel](https://tensorflow.github.io/serving/serving_basic.html) for
    * information about how to use signatures.  Defaults to
    * [DEFAULT_SERVING_SIGNATURE_DEF_KEY](https://www.tensorflow.org/api_docs/python/tf/saved_model/signature_constants)
    * , which is &quot;serving_default&quot;.
    */
  var signatureName: js.UndefOr[String] = js.native
  /**
    * Use this field if you want to specify a Google Cloud Storage path for the
    * model to use.
    */
  var uri: js.UndefOr[String] = js.native
  /**
    * Use this field if you want to specify a version of the model to use. The
    * string is formatted the same way as `model_version`, with the addition of
    * the version information:
    * `&quot;projects/YOUR_PROJECT/models/YOUR_MODEL/versions/YOUR_VERSION&quot;`
    */
  var versionName: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1PredictionInput {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1PredictionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1PredictionInput]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1PredictionInputOps[Self <: SchemaGoogleCloudMlV1PredictionInput] (val x: Self) extends AnyVal {
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
    def withOutputDataFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDataFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputDataFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDataFormat")(js.undefined)
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
    def withSignatureName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureName")(js.undefined)
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

