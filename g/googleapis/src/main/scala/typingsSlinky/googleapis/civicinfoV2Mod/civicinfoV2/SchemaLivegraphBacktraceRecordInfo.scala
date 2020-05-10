package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLivegraphBacktraceRecordInfo extends js.Object {
  var dataSourcePublishMsec: js.UndefOr[String] = js.native
  var expId: js.UndefOr[String] = js.native
  var expInfo: js.UndefOr[SchemaLivegraphBacktraceRecordInfoExpInfo] = js.native
  var isRecon: js.UndefOr[Boolean] = js.native
  var isWlmThrottled: js.UndefOr[Boolean] = js.native
  var numberOfTriples: js.UndefOr[String] = js.native
  var priority: js.UndefOr[String] = js.native
  var process: js.UndefOr[String] = js.native
  var proxyReceiveMsec: js.UndefOr[String] = js.native
  var proxySentMsec: js.UndefOr[String] = js.native
  var recordId: js.UndefOr[String] = js.native
  var shouldMonitorLatency: js.UndefOr[Boolean] = js.native
  var subscriberReceiveMsec: js.UndefOr[String] = js.native
  var topicBuildFinishMsec: js.UndefOr[String] = js.native
  var topicBuildStartMsec: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object SchemaLivegraphBacktraceRecordInfo {
  @scala.inline
  def apply(): SchemaLivegraphBacktraceRecordInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLivegraphBacktraceRecordInfo]
  }
  @scala.inline
  implicit class SchemaLivegraphBacktraceRecordInfoOps[Self <: SchemaLivegraphBacktraceRecordInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourcePublishMsec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourcePublishMsec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourcePublishMsec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourcePublishMsec")(js.undefined)
        ret
    }
    @scala.inline
    def withExpId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expId")(js.undefined)
        ret
    }
    @scala.inline
    def withExpInfo(value: SchemaLivegraphBacktraceRecordInfoExpInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRecon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRecon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRecon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRecon")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWlmThrottled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWlmThrottled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWlmThrottled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWlmThrottled")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfTriples(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfTriples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfTriples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfTriples")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withProcess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyReceiveMsec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyReceiveMsec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyReceiveMsec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyReceiveMsec")(js.undefined)
        ret
    }
    @scala.inline
    def withProxySentMsec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxySentMsec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxySentMsec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxySentMsec")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordId")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldMonitorLatency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldMonitorLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldMonitorLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldMonitorLatency")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriberReceiveMsec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriberReceiveMsec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriberReceiveMsec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriberReceiveMsec")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicBuildFinishMsec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicBuildFinishMsec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicBuildFinishMsec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicBuildFinishMsec")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicBuildStartMsec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicBuildStartMsec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicBuildStartMsec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicBuildStartMsec")(js.undefined)
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

