package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsTemplatesLaunch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Path to dynamic template spec file on GCS. The file must be a Json
    * serialized DynamicTemplateFieSpec object.
    */
  @JSName("dynamicTemplate.gcsPath")
  var dynamicTemplateDotgcsPath: js.UndefOr[String] = js.native
  /**
    * Cloud Storage path for staging dependencies. Must be a valid Cloud
    * Storage URL, beginning with `gs://`.
    */
  @JSName("dynamicTemplate.stagingLocation")
  var dynamicTemplateDotstagingLocation: js.UndefOr[String] = js.native
  /**
    * A Cloud Storage path to the template from which to create the job. Must
    * be valid Cloud Storage URL, beginning with 'gs://'.
    */
  var gcsPath: js.UndefOr[String] = js.native
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to
    * which to direct the request.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Required. The ID of the Cloud Platform project that the job belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLaunchTemplateParameters] = js.native
  /**
    * If true, the request is validated but not actually executed. Defaults to
    * false.
    */
  var validateOnly: js.UndefOr[Boolean] = js.native
}

object ParamsResourceProjectsLocationsTemplatesLaunch {
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsTemplatesLaunch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTemplatesLaunch]
  }
  @scala.inline
  implicit class ParamsResourceProjectsLocationsTemplatesLaunchOps[Self <: ParamsResourceProjectsLocationsTemplatesLaunch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicTemplateDotgcsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTemplate.gcsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicTemplateDotgcsPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTemplate.gcsPath")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicTemplateDotstagingLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTemplate.stagingLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicTemplateDotstagingLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTemplate.stagingLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withGcsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcsPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsPath")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBody(value: SchemaLaunchTemplateParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnly")(js.undefined)
        ret
    }
  }
  
}

