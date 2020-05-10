package typingsSlinky.discordRpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Presence extends js.Object {
  var details: js.UndefOr[String] = js.native
  var endTimestamp: js.UndefOr[Double | js.Date] = js.native
  var instance: js.UndefOr[Boolean] = js.native
  var joinSecret: js.UndefOr[String] = js.native
  var largeImageKey: js.UndefOr[String] = js.native
  var largeImageText: js.UndefOr[String] = js.native
  var matchSecret: js.UndefOr[String] = js.native
  var partyMax: js.UndefOr[Double] = js.native
  var partySize: js.UndefOr[Double] = js.native
  var smallImageKey: js.UndefOr[String] = js.native
  var smallImageText: js.UndefOr[String] = js.native
  var spectateSecret: js.UndefOr[String] = js.native
  var startTimestamp: js.UndefOr[Double | js.Date] = js.native
  var state: js.UndefOr[String] = js.native
}

object Presence {
  @scala.inline
  def apply(): Presence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Presence]
  }
  @scala.inline
  implicit class PresenceOps[Self <: Presence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTimestampDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTimestamp(value: Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withInstance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withJoinSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoinSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withLargeImageKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeImageKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargeImageKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeImageKey")(js.undefined)
        ret
    }
    @scala.inline
    def withLargeImageText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeImageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargeImageText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeImageText")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withPartyMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partyMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartyMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partyMax")(js.undefined)
        ret
    }
    @scala.inline
    def withPartySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partySize")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallImageKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallImageKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallImageKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallImageKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallImageText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallImageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallImageText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallImageText")(js.undefined)
        ret
    }
    @scala.inline
    def withSpectateSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectateSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpectateSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectateSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimestampDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTimestamp(value: Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

