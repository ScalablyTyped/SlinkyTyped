package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TurnBasedMatchCreateRequest extends js.Object {
  /** Criteria for auto-matching players into this match. */
  var autoMatchingCriteria: js.UndefOr[TurnBasedAutoMatchingCriteria] = js.native
  /** The player ids to invite to the match. */
  var invitedPlayerIds: js.UndefOr[js.Array[String]] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchCreateRequest. */
  var kind: js.UndefOr[String] = js.native
  /** A randomly generated numeric ID. This number is used at the server to ensure that the request is handled correctly across retries. */
  var requestId: js.UndefOr[String] = js.native
  /**
    * The variant / mode of the application to be played. This can be any integer value, or left blank. You should use a small number of variants to keep the
    * auto-matching pool as large as possible.
    */
  var variant: js.UndefOr[Double] = js.native
}

object TurnBasedMatchCreateRequest {
  @scala.inline
  def apply(): TurnBasedMatchCreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TurnBasedMatchCreateRequest]
  }
  @scala.inline
  implicit class TurnBasedMatchCreateRequestOps[Self <: TurnBasedMatchCreateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMatchingCriteria(value: TurnBasedAutoMatchingCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatchingCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMatchingCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatchingCriteria")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitedPlayerIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedPlayerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitedPlayerIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedPlayerIds")(js.undefined)
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
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(js.undefined)
        ret
    }
    @scala.inline
    def withVariant(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(js.undefined)
        ret
    }
  }
  
}

