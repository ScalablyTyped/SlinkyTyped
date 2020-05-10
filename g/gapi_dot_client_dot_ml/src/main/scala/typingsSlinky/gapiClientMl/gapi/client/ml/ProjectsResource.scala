package typingsSlinky.gapiClientMl.gapi.client.ml

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientMl.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  var jobs: JobsResource = js.native
  var models: ModelsResource = js.native
  var operations: OperationsResource = js.native
  /**
    * Get the service account information associated with your project. You need
    * this information in order to grant the service account persmissions for
    * the Google Cloud Storage location where you put your model training code
    * for training the model with Google Cloud Machine Learning.
    */
  def getConfig(request: AnonAccesstoken): Request_[GoogleCloudMlV1GetConfigResponse] = js.native
  /**
    * Performs prediction on the data in the request.
    *
    * &#42;&#42;&#42;&#42; REMOVE FROM GENERATED DOCUMENTATION
    */
  def predict(request: AnonAccesstoken): Request_[GoogleApiHttpBody] = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(
    getConfig: AnonAccesstoken => Request_[GoogleCloudMlV1GetConfigResponse],
    jobs: JobsResource,
    models: ModelsResource,
    operations: OperationsResource,
    predict: AnonAccesstoken => Request_[GoogleApiHttpBody]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction1(getConfig), jobs = jobs.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], predict = js.Any.fromFunction1(predict))
    __obj.asInstanceOf[ProjectsResource]
  }
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetConfig(value: AnonAccesstoken => Request_[GoogleCloudMlV1GetConfigResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJobs(value: JobsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModels(value: ModelsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperations(value: OperationsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredict(value: AnonAccesstoken => Request_[GoogleApiHttpBody]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predict")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

