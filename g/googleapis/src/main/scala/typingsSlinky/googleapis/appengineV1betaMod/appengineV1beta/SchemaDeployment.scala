package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Code and application artifacts used to deploy a version to App Engine.
  */
@js.native
trait SchemaDeployment extends js.Object {
  /**
    * Google Cloud Build build information. Only applicable for instances
    * running in the App Engine flexible environment.
    */
  var build: js.UndefOr[SchemaBuildInfo] = js.native
  /**
    * Options for any Google Cloud Build builds created as a part of this
    * deployment.These options will only be used if a new build is created,
    * such as when deploying to the App Engine flexible environment using files
    * or zip.
    */
  var cloudBuildOptions: js.UndefOr[SchemaCloudBuildOptions] = js.native
  /**
    * The Docker image for the container that runs the version. Only applicable
    * for instances running in the App Engine flexible environment.
    */
  var container: js.UndefOr[SchemaContainerInfo] = js.native
  /**
    * Manifest of the files stored in Google Cloud Storage that are included as
    * part of this version. All files must be readable using the credentials
    * supplied with this call.
    */
  var files: js.UndefOr[StringDictionary[SchemaFileInfo]] = js.native
  /**
    * The zip file for this deployment, if this is a zip deployment.
    */
  var zip: js.UndefOr[SchemaZipInfo] = js.native
}

object SchemaDeployment {
  @scala.inline
  def apply(): SchemaDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeployment]
  }
  @scala.inline
  implicit class SchemaDeploymentOps[Self <: SchemaDeployment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: SchemaBuildInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudBuildOptions(value: SchemaCloudBuildOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudBuildOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudBuildOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudBuildOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: SchemaContainerInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: StringDictionary[SchemaFileInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withZip(value: SchemaZipInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip")(js.undefined)
        ret
    }
  }
  
}

