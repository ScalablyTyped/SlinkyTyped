package typingsSlinky.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for GenerateConfigReport method.
  */
@js.native
trait SchemaGenerateConfigReportRequest extends js.Object {
  /**
    * Service configuration for which we want to generate the report. For this
    * version of API, the supported types are
    * google.api.servicemanagement.v1.ConfigRef,
    * google.api.servicemanagement.v1.ConfigSource, and google.api.Service
    */
  var newConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Service configuration against which the comparison will be done. For this
    * version of API, the supported types are
    * google.api.servicemanagement.v1.ConfigRef,
    * google.api.servicemanagement.v1.ConfigSource, and google.api.Service
    */
  var oldConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaGenerateConfigReportRequest {
  @scala.inline
  def apply(): SchemaGenerateConfigReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateConfigReportRequest]
  }
  @scala.inline
  implicit class SchemaGenerateConfigReportRequestOps[Self <: SchemaGenerateConfigReportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewConfig(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOldConfig(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldConfig")(js.undefined)
        ret
    }
  }
  
}

