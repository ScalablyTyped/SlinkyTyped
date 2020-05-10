package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGameSessionInput extends js.Object {
  /**
    * A unique identifier for the game session to update. 
    */
  var GameSessionId: ArnStringModel = js.native
  /**
    * The maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
  /**
    * A descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Policy determining whether or not the game session accepts new players.
    */
  var PlayerSessionCreationPolicy: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.PlayerSessionCreationPolicy] = js.native
  /**
    * Game session protection policy to apply to this game session only.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var ProtectionPolicy: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.ProtectionPolicy] = js.native
}

object UpdateGameSessionInput {
  @scala.inline
  def apply(GameSessionId: ArnStringModel): UpdateGameSessionInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameSessionInput]
  }
  @scala.inline
  implicit class UpdateGameSessionInputOps[Self <: UpdateGameSessionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGameSessionId(value: ArnStringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumPlayerSessionCount(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumPlayerSessionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumPlayerSessionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumPlayerSessionCount")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayerSessionCreationPolicy(value: PlayerSessionCreationPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerSessionCreationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerSessionCreationPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerSessionCreationPolicy")(js.undefined)
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

