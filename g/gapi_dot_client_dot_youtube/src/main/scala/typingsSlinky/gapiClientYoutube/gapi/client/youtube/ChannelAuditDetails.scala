package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelAuditDetails extends js.Object {
  /** Whether or not the channel respects the community guidelines. */
  var communityGuidelinesGoodStanding: js.UndefOr[Boolean] = js.native
  /** Whether or not the channel has any unresolved claims. */
  var contentIdClaimsGoodStanding: js.UndefOr[Boolean] = js.native
  /** Whether or not the channel has any copyright strikes. */
  var copyrightStrikesGoodStanding: js.UndefOr[Boolean] = js.native
  /**
    * Describes the general state of the channel. This field will always show if there are any issues whatsoever with the channel. Currently this field
    * represents the result of the logical and operation over the community guidelines good standing, the copyright strikes good standing and the content ID
    * claims good standing, but this may change in the future.
    */
  var overallGoodStanding: js.UndefOr[Boolean] = js.native
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
    @scala.inline
    def withOverallGoodStanding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overallGoodStanding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverallGoodStanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overallGoodStanding")(js.undefined)
        ret
    }
  }
  
}

