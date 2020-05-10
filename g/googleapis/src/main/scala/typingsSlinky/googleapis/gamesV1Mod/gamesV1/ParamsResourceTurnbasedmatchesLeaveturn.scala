package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceTurnbasedmatchesLeaveturn extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The preferred language to use for strings returned by this method.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The ID of the match.
    */
  var matchId: js.UndefOr[String] = js.native
  /**
    * The version of the match being updated.
    */
  var matchVersion: js.UndefOr[Double] = js.native
  /**
    * The ID of another participant who should take their turn next. If not
    * set, the match will wait for other player(s) to join via automatching;
    * this is only valid if automatch criteria is set on the match with
    * remaining slots for automatched players.
    */
  var pendingParticipantId: js.UndefOr[String] = js.native
}

object ParamsResourceTurnbasedmatchesLeaveturn {
  @scala.inline
  def apply(): ParamsResourceTurnbasedmatchesLeaveturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTurnbasedmatchesLeaveturn]
  }
  @scala.inline
  implicit class ParamsResourceTurnbasedmatchesLeaveturnOps[Self <: ParamsResourceTurnbasedmatchesLeaveturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchId")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingParticipantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingParticipantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingParticipantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingParticipantId")(js.undefined)
        ret
    }
  }
  
}

