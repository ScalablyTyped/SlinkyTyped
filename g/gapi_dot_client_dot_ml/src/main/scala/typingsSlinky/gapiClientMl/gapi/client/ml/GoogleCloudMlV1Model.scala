package typingsSlinky.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1Model extends js.Object {
  /**
    * Output only. The default version of the model. This version will be used to
    * handle prediction requests that do not specify a version.
    *
    * You can change the default version by calling
    * [projects.methods.versions.setDefault](/ml-engine/reference/rest/v1/projects.models.versions/setDefault).
    */
  var defaultVersion: js.UndefOr[GoogleCloudMlV1Version] = js.native
  /** Optional. The description specified for the model when it was created. */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. The name specified for the model when it was created.
    *
    * The model name must be unique within the project it is created in.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. If true, enables StackDriver Logging for online prediction.
    * Default is false.
    */
  var onlinePredictionLogging: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The list of regions where the model is going to be deployed.
    * Currently only one region per model is supported.
    * Defaults to 'us-central1' if nothing is set.
    * Note:
    * &#42;   No matter where a model is deployed, it can always be accessed by
    * users from anywhere, both for online and batch prediction.
    * &#42;   The region for a batch prediction job is set by the region field when
    * submitting the batch prediction job and does not take its value from
    * this field.
    */
  var regions: js.UndefOr[js.Array[String]] = js.native
}

object GoogleCloudMlV1Model {
  @scala.inline
  def apply(): GoogleCloudMlV1Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Model]
  }
  @scala.inline
  implicit class GoogleCloudMlV1ModelOps[Self <: GoogleCloudMlV1Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultVersion(value: GoogleCloudMlV1Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlinePredictionLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlinePredictionLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlinePredictionLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlinePredictionLogging")(js.undefined)
        ret
    }
    @scala.inline
    def withRegions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
  }
  
}

