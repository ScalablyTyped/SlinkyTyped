package typingsSlinky.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReelsMediaFeedResponseLinksItem extends js.Object {
  @JSName("package")
  var _package: String = js.native
  var androidClass: String = js.native
  var appInstallObjectiveInvalidationBehavior: Null = js.native
  var callToActionTitle: String = js.native
  var deeplinkUri: String = js.native
  var igUserId: String = js.native
  var leadGenFormId: String = js.native
  var linkType: Double = js.native
  var redirectUri: Null = js.native
  var webUri: String = js.native
}

object ReelsMediaFeedResponseLinksItem {
  @scala.inline
  def apply(
    _package: String,
    androidClass: String,
    appInstallObjectiveInvalidationBehavior: Null,
    callToActionTitle: String,
    deeplinkUri: String,
    igUserId: String,
    leadGenFormId: String,
    linkType: Double,
    redirectUri: Null,
    webUri: String
  ): ReelsMediaFeedResponseLinksItem = {
    val __obj = js.Dynamic.literal(androidClass = androidClass.asInstanceOf[js.Any], appInstallObjectiveInvalidationBehavior = appInstallObjectiveInvalidationBehavior.asInstanceOf[js.Any], callToActionTitle = callToActionTitle.asInstanceOf[js.Any], deeplinkUri = deeplinkUri.asInstanceOf[js.Any], igUserId = igUserId.asInstanceOf[js.Any], leadGenFormId = leadGenFormId.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], webUri = webUri.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseLinksItem]
  }
  @scala.inline
  implicit class ReelsMediaFeedResponseLinksItemOps[Self <: ReelsMediaFeedResponseLinksItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_package(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppInstallObjectiveInvalidationBehavior(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appInstallObjectiveInvalidationBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallToActionTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callToActionTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeeplinkUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deeplinkUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("igUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeadGenFormId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadGenFormId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectUri(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

