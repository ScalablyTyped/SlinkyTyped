package typingsSlinky.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBatchSize(value: String): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setDataFormat(value: String): Self = this.set("dataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFormat: Self = this.set("dataFormat", js.undefined)
    
    @scala.inline
    def setInputPathsVarargs(value: String*): Self = this.set("inputPaths", js.Array(value :_*))
    
    @scala.inline
    def setInputPaths(value: js.Array[String]): Self = this.set("inputPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputPaths: Self = this.set("inputPaths", js.undefined)
    
    @scala.inline
    def setMaxWorkerCount(value: String): Self = this.set("maxWorkerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWorkerCount: Self = this.set("maxWorkerCount", js.undefined)
    
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelName: Self = this.set("modelName", js.undefined)
    
    @scala.inline
    def setOutputDataFormat(value: String): Self = this.set("outputDataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputDataFormat: Self = this.set("outputDataFormat", js.undefined)
    
    @scala.inline
    def setOutputPath(value: String): Self = this.set("outputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputPath: Self = this.set("outputPath", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRuntimeVersion(value: String): Self = this.set("runtimeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeVersion: Self = this.set("runtimeVersion", js.undefined)
    
    @scala.inline
    def setSignatureName(value: String): Self = this.set("signatureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureName: Self = this.set("signatureName", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setVersionName(value: String): Self = this.set("versionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionName: Self = this.set("versionName", js.undefined)
  }
}
