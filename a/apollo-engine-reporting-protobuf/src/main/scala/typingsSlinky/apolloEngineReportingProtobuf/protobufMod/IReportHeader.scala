package typingsSlinky.apolloEngineReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReportHeader extends js.Object {
  /** ReportHeader agentVersion */
  var agentVersion: js.UndefOr[String | Null] = js.native
  /** ReportHeader hostname */
  var hostname: js.UndefOr[String | Null] = js.native
  /** ReportHeader runtimeVersion */
  var runtimeVersion: js.UndefOr[String | Null] = js.native
  /** ReportHeader schemaHash */
  var schemaHash: js.UndefOr[String | Null] = js.native
  /** ReportHeader schemaTag */
  var schemaTag: js.UndefOr[String | Null] = js.native
  /** ReportHeader service */
  var service: js.UndefOr[String | Null] = js.native
  /** ReportHeader serviceVersion */
  var serviceVersion: js.UndefOr[String | Null] = js.native
  /** ReportHeader uname */
  var uname: js.UndefOr[String | Null] = js.native
}

object IReportHeader {
  @scala.inline
  def apply(): IReportHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReportHeader]
  }
  @scala.inline
  implicit class IReportHeaderOps[Self <: IReportHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withAgentVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentVersion")(null)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withHostnameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(null)
        ret
    }
    @scala.inline
    def withRuntimeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeVersion")(null)
        ret
    }
    @scala.inline
    def withSchemaHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaHash")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaHashNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaHash")(null)
        ret
    }
    @scala.inline
    def withSchemaTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaTag")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaTagNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaTag")(null)
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(null)
        ret
    }
    @scala.inline
    def withServiceVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceVersion")(null)
        ret
    }
    @scala.inline
    def withUname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uname")(js.undefined)
        ret
    }
    @scala.inline
    def withUnameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uname")(null)
        ret
    }
  }
  
}

