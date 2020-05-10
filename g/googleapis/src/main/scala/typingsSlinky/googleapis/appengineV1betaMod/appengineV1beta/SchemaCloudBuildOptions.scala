package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the build operations performed as a part of the version
  * deployment. Only applicable for App Engine flexible environment when
  * creating a version using source code directly.
  */
@js.native
trait SchemaCloudBuildOptions extends js.Object {
  /**
    * Path to the yaml file used in deployment, used to determine runtime
    * configuration details.Required for flexible environment builds.See
    * https://cloud.google.com/appengine/docs/standard/python/config/appref for
    * more details.
    */
  var appYamlPath: js.UndefOr[String] = js.native
  /**
    * The Cloud Build timeout used as part of any dependent builds performed by
    * version creation. Defaults to 10 minutes.
    */
  var cloudBuildTimeout: js.UndefOr[String] = js.native
}

object SchemaCloudBuildOptions {
  @scala.inline
  def apply(): SchemaCloudBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudBuildOptions]
  }
  @scala.inline
  implicit class SchemaCloudBuildOptionsOps[Self <: SchemaCloudBuildOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppYamlPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appYamlPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppYamlPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appYamlPath")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudBuildTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudBuildTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudBuildTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudBuildTimeout")(js.undefined)
        ret
    }
  }
  
}

