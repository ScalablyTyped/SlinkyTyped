package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlayerSessionsInput extends js.Object {
  /**
    * A unique identifier for the game session to add players to.
    */
  var GameSessionId: ArnStringModel = js.native
  /**
    * Map of string pairs, each specifying a player ID and a set of developer-defined information related to the player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game. Player data strings for player IDs not included in the PlayerIds parameter are ignored. 
    */
  var PlayerDataMap: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.PlayerDataMap] = js.native
  /**
    * List of unique identifiers for the players to be added.
    */
  var PlayerIds: PlayerIdList = js.native
}

object CreatePlayerSessionsInput {
  @scala.inline
  def apply(GameSessionId: ArnStringModel, PlayerIds: PlayerIdList): CreatePlayerSessionsInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId.asInstanceOf[js.Any], PlayerIds = PlayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlayerSessionsInput]
  }
  @scala.inline
  implicit class CreatePlayerSessionsInputOps[Self <: CreatePlayerSessionsInput] (val x: Self) extends AnyVal {
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
    def withPlayerIds(value: PlayerIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayerDataMap(value: PlayerDataMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerDataMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerDataMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerDataMap")(js.undefined)
        ret
    }
  }
  
}

