package typingsSlinky.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.maximMazurokGapiClientMl.maximMazurokGapiClientMlStrings.GoogleCloudMlV1__Job
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1Job extends js.Object {
  
  /** Output only. When the job was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. When the job processing was completed. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Output only. The details of a failure or a cancellation. */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a job from overwriting each other. It is strongly suggested that systems make use
    * of the `etag` in the read-modify-write cycle to perform job updates in order to avoid race conditions: An `etag` is returned in the response to `GetJob`, and systems are expected to
    * put that etag in the request to `UpdateJob` to ensure that their change will be applied to the same version of the job.
    */
  var etag: js.UndefOr[String] = js.native
  
  /** Required. The user-specified id of the job. */
  var jobId: js.UndefOr[String] = js.native
  
  /**
    * Optional. One or more labels that you can add, to organize your jobs. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For
    * more information, see the documentation on using labels.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ GoogleCloudMlV1__Job with TopLevel[js.Any]
  ] = js.native
  
  /** Input parameters to create a prediction job. */
  var predictionInput: js.UndefOr[GoogleCloudMlV1PredictionInput] = js.native
  
  /** The current prediction job result. */
  var predictionOutput: js.UndefOr[GoogleCloudMlV1PredictionOutput] = js.native
  
  /** Output only. When the job processing was started. */
  var startTime: js.UndefOr[String] = js.native
  
  /** Output only. The detailed state of a job. */
  var state: js.UndefOr[String] = js.native
  
  /** Input parameters to create a training job. */
  var trainingInput: js.UndefOr[GoogleCloudMlV1TrainingInput] = js.native
  
  /** The current training job result. */
  var trainingOutput: js.UndefOr[GoogleCloudMlV1TrainingOutput] = js.native
}
object GoogleCloudMlV1Job {
  
  @scala.inline
  def apply(): GoogleCloudMlV1Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Job]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1JobOps[Self <: GoogleCloudMlV1Job] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ GoogleCloudMlV1__Job with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setPredictionInput(value: GoogleCloudMlV1PredictionInput): Self = this.set("predictionInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredictionInput: Self = this.set("predictionInput", js.undefined)
    
    @scala.inline
    def setPredictionOutput(value: GoogleCloudMlV1PredictionOutput): Self = this.set("predictionOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredictionOutput: Self = this.set("predictionOutput", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTrainingInput(value: GoogleCloudMlV1TrainingInput): Self = this.set("trainingInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingInput: Self = this.set("trainingInput", js.undefined)
    
    @scala.inline
    def setTrainingOutput(value: GoogleCloudMlV1TrainingOutput): Self = this.set("trainingOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingOutput: Self = this.set("trainingOutput", js.undefined)
  }
}
