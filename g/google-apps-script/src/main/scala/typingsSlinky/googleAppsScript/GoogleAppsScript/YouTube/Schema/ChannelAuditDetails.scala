package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelAuditDetails extends js.Object {
  var communityGuidelinesGoodStanding: js.UndefOr[Boolean] = js.native
  var contentIdClaimsGoodStanding: js.UndefOr[Boolean] = js.native
  var copyrightStrikesGoodStanding: js.UndefOr[Boolean] = js.native
}

object ChannelAuditDetails {
  @scala.inline
  def apply(): ChannelAuditDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelAuditDetails]
  }
  @scala.inline
  implicit class ChannelAuditDetailsOps[Self <: ChannelAuditDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommunityGuidelinesGoodStanding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("communityGuidelinesGoodStanding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommunityGuidelinesGoodStanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("communityGuidelinesGoodStanding")(js.undefined)
        ret
    }
    @scala.inline
    def withContentIdClaimsGoodStanding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentIdClaimsGoodStanding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentIdClaimsGoodStanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentIdClaimsGoodStanding")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyrightStrikesGoodStanding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyrightStrikesGoodStanding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyrightStrikesGoodStanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyrightStrikesGoodStanding")(js.undefined)
        ret
    }
  }
  
}

