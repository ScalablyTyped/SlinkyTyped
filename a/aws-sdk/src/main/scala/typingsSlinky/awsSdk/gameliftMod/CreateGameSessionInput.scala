package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGameSessionInput extends js.Object {
  /**
    * A unique identifier for an alias associated with the fleet to create a game session in. You can use either the alias ID or ARN value. Each request must reference either a fleet ID or alias ID, but not both.
    */
  var AliasId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.AliasId] = js.native
  /**
    * A unique identifier for a player or entity creating the game session. This ID is used to enforce a resource protection policy (if one exists) that limits the number of concurrent active game sessions one player can have.
    */
  var CreatorId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A unique identifier for a fleet to create a game session in. You can use either the fleet ID or ARN value. Each request must reference either a fleet ID or alias ID, but not both.
    */
  var FleetId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.FleetId] = js.native
  /**
    * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.native
  /**
    * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameSessionData: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameSessionData] = js.native
  /**
    *  This parameter is no longer preferred. Please use IdempotencyToken instead. Custom string that uniquely identifies a request for a new game session. Maximum token length is 48 characters. If provided, this string is included in the new game session's ID. (A game session ARN has the following format: arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;.) 
    */
  var GameSessionId: js.UndefOr[IdStringModel] = js.native
  /**
    * Custom string that uniquely identifies a request for a new game session. Maximum token length is 48 characters. If provided, this string is included in the new game session's ID. (A game session ARN has the following format: arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;.) Idempotency tokens remain in use for 30 days after a game session has ended; game session objects are retained for this time period and then deleted.
    */
  var IdempotencyToken: js.UndefOr[IdStringModel] = js.native
  /**
    * The maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: WholeNumber = js.native
  /**
    * A descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
}

object CreateGameSessionInput {
  @scala.inline
  def apply(MaximumPlayerSessionCount: WholeNumber): CreateGameSessionInput = {
    val __obj = js.Dynamic.literal(MaximumPlayerSessionCount = MaximumPlayerSessionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGameSessionInput]
  }
  @scala.inline
  implicit class CreateGameSessionInputOps[Self <: CreateGameSessionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumPlayerSessionCount(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumPlayerSessionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAliasId(value: AliasId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatorId(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorId")(js.undefined)
        ret
    }
    @scala.inline
    def withFleetId(value: FleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(js.undefined)
        ret
    }
    @scala.inline
    def withGameProperties(value: GamePropertyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withGameSessionData(value: GameSessionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSessionData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionData")(js.undefined)
        ret
    }
    @scala.inline
    def withGameSessionId(value: IdStringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withIdempotencyToken(value: IdStringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdempotencyToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdempotencyToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdempotencyToken")(js.undefined)
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
  }
  
}

