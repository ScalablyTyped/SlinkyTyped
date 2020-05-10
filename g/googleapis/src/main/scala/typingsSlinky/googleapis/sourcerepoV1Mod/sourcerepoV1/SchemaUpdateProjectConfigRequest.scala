package typingsSlinky.googleapis.sourcerepoV1Mod.sourcerepoV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for UpdateProjectConfig.
  */
@js.native
trait SchemaUpdateProjectConfigRequest extends js.Object {
  /**
    * The new configuration for the project.
    */
  var projectConfig: js.UndefOr[SchemaProjectConfig] = js.native
  /**
    * A FieldMask specifying which fields of the project_config to modify. Only
    * the fields in the mask will be modified. If no mask is provided, this
    * request is no-op.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaUpdateProjectConfigRequest {
  @scala.inline
  def apply(): SchemaUpdateProjectConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateProjectConfigRequest]
  }
  @scala.inline
  implicit class SchemaUpdateProjectConfigRequestOps[Self <: SchemaUpdateProjectConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectConfig(value: SchemaProjectConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
  }
  
}

