package typingsSlinky.bugsnagJs.commonMod

import typingsSlinky.bugsnagJs.AnonNotify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFinalConfig extends IConfig {
  @JSName("autoBreadcrumbs")
  var autoBreadcrumbs_IFinalConfig: Boolean = js.native
  @JSName("autoCaptureSessions")
  var autoCaptureSessions_IFinalConfig: Boolean = js.native
  @JSName("autoNotify")
  var autoNotify_IFinalConfig: Boolean = js.native
  @JSName("beforeSend")
  var beforeSend_IFinalConfig: js.Array[BeforeSend] = js.native
  @JSName("collectUserIp")
  var collectUserIp_IFinalConfig: Boolean = js.native
  @JSName("consoleBreadcrumbsEnabled")
  var consoleBreadcrumbsEnabled_IFinalConfig: Boolean = js.native
  @JSName("endpoints")
  var endpoints_IFinalConfig: AnonNotify = js.native
  @JSName("interactionBreadcrumbsEnabled")
  var interactionBreadcrumbsEnabled_IFinalConfig: Boolean = js.native
  @JSName("maxBreadcrumbs")
  var maxBreadcrumbs_IFinalConfig: Double = js.native
  @JSName("maxEvents")
  var maxEvents_IFinalConfig: Double = js.native
  @JSName("metaData")
  var metaData_IFinalConfig: js.Object | Null = js.native
  @JSName("navigationBreadcrumbsEnabled")
  var navigationBreadcrumbsEnabled_IFinalConfig: Boolean = js.native
  @JSName("notifyReleaseStages")
  var notifyReleaseStages_IFinalConfig: js.Array[String] = js.native
  @JSName("releaseStage")
  var releaseStage_IFinalConfig: String = js.native
  @JSName("user")
  var user_IFinalConfig: js.Object | Null = js.native
}

object IFinalConfig {
  @scala.inline
  def apply(
    apiKey: String,
    autoBreadcrumbs: Boolean,
    autoCaptureSessions: Boolean,
    autoNotify: Boolean,
    beforeSend: js.Array[BeforeSend],
    collectUserIp: Boolean,
    consoleBreadcrumbsEnabled: Boolean,
    endpoints: AnonNotify,
    interactionBreadcrumbsEnabled: Boolean,
    maxBreadcrumbs: Double,
    maxEvents: Double,
    navigationBreadcrumbsEnabled: Boolean,
    notifyReleaseStages: js.Array[String],
    releaseStage: String
  ): IFinalConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], autoBreadcrumbs = autoBreadcrumbs.asInstanceOf[js.Any], autoCaptureSessions = autoCaptureSessions.asInstanceOf[js.Any], autoNotify = autoNotify.asInstanceOf[js.Any], beforeSend = beforeSend.asInstanceOf[js.Any], collectUserIp = collectUserIp.asInstanceOf[js.Any], consoleBreadcrumbsEnabled = consoleBreadcrumbsEnabled.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], interactionBreadcrumbsEnabled = interactionBreadcrumbsEnabled.asInstanceOf[js.Any], maxBreadcrumbs = maxBreadcrumbs.asInstanceOf[js.Any], maxEvents = maxEvents.asInstanceOf[js.Any], navigationBreadcrumbsEnabled = navigationBreadcrumbsEnabled.asInstanceOf[js.Any], notifyReleaseStages = notifyReleaseStages.asInstanceOf[js.Any], releaseStage = releaseStage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFinalConfig]
  }
  @scala.inline
  implicit class IFinalConfigOps[Self <: IFinalConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoBreadcrumbs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBreadcrumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoCaptureSessions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCaptureSessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoNotify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoNotify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeSend(value: js.Array[BeforeSend]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollectUserIp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectUserIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsoleBreadcrumbsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleBreadcrumbsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoints(value: AnonNotify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteractionBreadcrumbsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionBreadcrumbsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxBreadcrumbs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBreadcrumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxEvents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationBreadcrumbsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBreadcrumbsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifyReleaseStages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyReleaseStages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseStage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseStage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(null)
        ret
    }
    @scala.inline
    def withUser(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
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

