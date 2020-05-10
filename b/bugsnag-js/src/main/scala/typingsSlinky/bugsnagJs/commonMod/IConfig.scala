package typingsSlinky.bugsnagJs.commonMod

import typingsSlinky.bugsnagJs.AnonNotify
import typingsSlinky.bugsnagJs.clientMod.ILogger
import typingsSlinky.bugsnagJs.reportMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfig extends js.Object {
  var apiKey: String = js.native
  var appVersion: js.UndefOr[String] = js.native
  var autoBreadcrumbs: js.UndefOr[Boolean] = js.native
  var autoCaptureSessions: js.UndefOr[Boolean] = js.native
  var autoNotify: js.UndefOr[Boolean] = js.native
  var beforeSend: js.UndefOr[BeforeSend | js.Array[BeforeSend]] = js.native
  var collectUserIp: js.UndefOr[Boolean] = js.native
  var consoleBreadcrumbsEnabled: js.UndefOr[Boolean] = js.native
  var endpoint: js.UndefOr[String] = js.native
  var endpoints: js.UndefOr[AnonNotify] = js.native
  var interactionBreadcrumbsEnabled: js.UndefOr[Boolean] = js.native
  var logger: js.UndefOr[ILogger | Null] = js.native
  var maxBreadcrumbs: js.UndefOr[Double] = js.native
  var maxEvents: js.UndefOr[Double] = js.native
  var metaData: js.UndefOr[js.Object | Null] = js.native
  var navigationBreadcrumbsEnabled: js.UndefOr[Boolean] = js.native
  var networkBreadcrumbsEnabled: js.UndefOr[Boolean] = js.native
  var notifyReleaseStages: js.UndefOr[js.Array[String]] = js.native
  var releaseStage: js.UndefOr[String] = js.native
  var sessionEndpoint: js.UndefOr[String] = js.native
  var user: js.UndefOr[js.Object | Null] = js.native
}

object IConfig {
  @scala.inline
  def apply(apiKey: String): IConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoBreadcrumbs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBreadcrumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBreadcrumbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBreadcrumbs")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCaptureSessions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCaptureSessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCaptureSessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCaptureSessions")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoNotify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoNotify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoNotify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoNotify")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSendFunction1(value: /* report */ default => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeforeSend(value: BeforeSend | js.Array[BeforeSend]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectUserIp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectUserIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectUserIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectUserIp")(js.undefined)
        ret
    }
    @scala.inline
    def withConsoleBreadcrumbsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleBreadcrumbsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsoleBreadcrumbsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleBreadcrumbsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoints(value: AnonNotify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractionBreadcrumbsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionBreadcrumbsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractionBreadcrumbsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionBreadcrumbsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: ILogger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(null)
        ret
    }
    @scala.inline
    def withMaxBreadcrumbs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBreadcrumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBreadcrumbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBreadcrumbs")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxEvents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(null)
        ret
    }
    @scala.inline
    def withNavigationBreadcrumbsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBreadcrumbsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationBreadcrumbsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBreadcrumbsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkBreadcrumbsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkBreadcrumbsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkBreadcrumbsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkBreadcrumbsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyReleaseStages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyReleaseStages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyReleaseStages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyReleaseStages")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseStage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseStage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseStage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseStage")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
    @scala.inline
    def withUserNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(null)
        ret
    }
  }
  
}

