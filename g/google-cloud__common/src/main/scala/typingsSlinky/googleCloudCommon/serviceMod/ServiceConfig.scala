package typingsSlinky.googleCloudCommon.serviceMod

import typingsSlinky.googleAuthLibrary.mod.GoogleAuth
import typingsSlinky.googleCloudCommon.utilMod.PackageJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceConfig extends js.Object {
  /**
    * The API Endpoint to use when connecting to the service.
    * Example:  storage.googleapis.com
    */
  var apiEndpoint: String = js.native
  /**
    * Reuse an existing GoogleAuth client instead of creating a new one.
    */
  var authClient: js.UndefOr[GoogleAuth] = js.native
  /**
    * The base URL to make API requests to.
    */
  var baseUrl: String = js.native
  var packageJson: PackageJson = js.native
  var projectIdRequired: js.UndefOr[Boolean] = js.native
  /**
    * The scopes required for the request.
    */
  var scopes: js.Array[String] = js.native
}

object ServiceConfig {
  @scala.inline
  def apply(apiEndpoint: String, baseUrl: String, packageJson: PackageJson, scopes: js.Array[String]): ServiceConfig = {
    val __obj = js.Dynamic.literal(apiEndpoint = apiEndpoint.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], packageJson = packageJson.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfig]
  }
  @scala.inline
  implicit class ServiceConfigOps[Self <: ServiceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageJson(value: PackageJson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthClient(value: GoogleAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authClient")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectIdRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectIdRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectIdRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectIdRequired")(js.undefined)
        ret
    }
  }
  
}

