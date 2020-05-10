package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of a App Engine backend.
  */
@js.native
trait SchemaBackendServiceAppEngineBackend extends js.Object {
  /**
    * Optional. App Engine app service name.
    */
  var appEngineService: js.UndefOr[String] = js.native
  /**
    * Required. Project ID of the project hosting the app. This is the project
    * ID of this project. Reference to another project is not allowed.
    */
  var targetProject: js.UndefOr[String] = js.native
  /**
    * Optional. Version of App Engine app service. When empty, App Engine will
    * do its normal traffic split.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaBackendServiceAppEngineBackend {
  @scala.inline
  def apply(): SchemaBackendServiceAppEngineBackend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceAppEngineBackend]
  }
  @scala.inline
  implicit class SchemaBackendServiceAppEngineBackendOps[Self <: SchemaBackendServiceAppEngineBackend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppEngineService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppEngineService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineService")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetProject")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

