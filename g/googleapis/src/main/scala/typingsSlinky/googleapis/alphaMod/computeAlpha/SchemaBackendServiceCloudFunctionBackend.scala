package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of a Cloud Function backend.
  */
@js.native
trait SchemaBackendServiceCloudFunctionBackend extends js.Object {
  /**
    * Required. A cloud function name. Special value ?*? represents all cloud
    * functions in the project.
    */
  var functionName: js.UndefOr[String] = js.native
  /**
    * Required. Project ID of the project hosting the cloud function.
    */
  var targetProject: js.UndefOr[String] = js.native
}

object SchemaBackendServiceCloudFunctionBackend {
  @scala.inline
  def apply(): SchemaBackendServiceCloudFunctionBackend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceCloudFunctionBackend]
  }
  @scala.inline
  implicit class SchemaBackendServiceCloudFunctionBackendOps[Self <: SchemaBackendServiceCloudFunctionBackend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(js.undefined)
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
  }
  
}

