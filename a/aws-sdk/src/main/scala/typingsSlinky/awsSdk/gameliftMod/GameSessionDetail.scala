package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameSessionDetail extends js.Object {
  /**
    * Object that describes a game session.
    */
  var GameSession: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameSession] = js.native
  /**
    * Current status of protection for the game session.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var ProtectionPolicy: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.ProtectionPolicy] = js.native
}

object GameSessionDetail {
  @scala.inline
  def apply(): GameSessionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSessionDetail]
  }
  @scala.inline
  implicit class GameSessionDetailOps[Self <: GameSessionDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGameSession(value: GameSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSession")(js.undefined)
        ret
    }
    @scala.inline
    def withProtectionPolicy(value: ProtectionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProtectionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProtectionPolicy")(js.undefined)
        ret
    }
  }
  
}

