package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Claim extends js.Object {
  var appliedPolicy: js.UndefOr[Policy] = js.native
  var assetId: js.UndefOr[String] = js.native
  var blockOutsideOwnership: js.UndefOr[Boolean] = js.native
  var contentType: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var isPartnerUploaded: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var matchInfo: js.UndefOr[ClaimMatchInfo] = js.native
  var origin: js.UndefOr[ClaimOrigin] = js.native
  var policy: js.UndefOr[Policy] = js.native
  var status: js.UndefOr[String] = js.native
  var timeCreated: js.UndefOr[String] = js.native
  var videoId: js.UndefOr[String] = js.native
}

object Claim {
  @scala.inline
  def apply(): Claim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Claim]
  }
  @scala.inline
  implicit class ClaimOps[Self <: Claim] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppliedPolicy(value: Policy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliedPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetId")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockOutsideOwnership(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockOutsideOwnership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockOutsideOwnership: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockOutsideOwnership")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPartnerUploaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPartnerUploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPartnerUploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPartnerUploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchInfo(value: ClaimMatchInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: ClaimOrigin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: Policy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(js.undefined)
        ret
    }
  }
  
}

