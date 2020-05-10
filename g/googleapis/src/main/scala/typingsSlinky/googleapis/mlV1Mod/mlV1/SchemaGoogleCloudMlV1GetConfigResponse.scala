package typingsSlinky.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns service account information associated with a project.
  */
@js.native
trait SchemaGoogleCloudMlV1GetConfigResponse extends js.Object {
  var config: js.UndefOr[SchemaGoogleCloudMlV1Config] = js.native
  /**
    * The service account Cloud ML uses to access resources in the project.
    */
  var serviceAccount: js.UndefOr[String] = js.native
  /**
    * The project number for `service_account`.
    */
  var serviceAccountProject: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1GetConfigResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1GetConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1GetConfigResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1GetConfigResponseOps[Self <: SchemaGoogleCloudMlV1GetConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: SchemaGoogleCloudMlV1Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountProject")(js.undefined)
        ret
    }
  }
  
}

