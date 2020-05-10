package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchedPlayerSession extends js.Object {
  /**
    * A unique identifier for a player 
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A unique identifier for a player session
    */
  var PlayerSessionId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.PlayerSessionId] = js.native
}

object MatchedPlayerSession {
  @scala.inline
  def apply(): MatchedPlayerSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchedPlayerSession]
  }
  @scala.inline
  implicit class MatchedPlayerSessionOps[Self <: MatchedPlayerSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlayerId(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayerSessionId(value: PlayerSessionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerSessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerSessionId")(js.undefined)
        ret
    }
  }
  
}

