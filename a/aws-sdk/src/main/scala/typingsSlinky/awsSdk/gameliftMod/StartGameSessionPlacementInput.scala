package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartGameSessionPlacementInput extends js.Object {
  /**
    * Set of information on each player to create a player session for.
    */
  var DesiredPlayerSessions: js.UndefOr[DesiredPlayerSessionList] = js.native
  /**
    * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.native
  /**
    * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameSessionData: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameSessionData] = js.native
  /**
    * A descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var GameSessionName: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Name of the queue to use to place the new game session. You can use either the qieue name or ARN value. 
    */
  var GameSessionQueueName: typingsSlinky.awsSdk.gameliftMod.GameSessionQueueName = js.native
  /**
    * The maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: WholeNumber = js.native
  /**
    * A unique identifier to assign to the new game session placement. This value is developer-defined. The value must be unique across all Regions and cannot be reused unless you are resubmitting a canceled or timed-out placement request.
    */
  var PlacementId: IdStringModel = js.native
  /**
    * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when connected to AWS Regions. This information is used to try to place the new game session where it can offer the best possible gameplay experience for the players. 
    */
  var PlayerLatencies: js.UndefOr[PlayerLatencyList] = js.native
}

object StartGameSessionPlacementInput {
  @scala.inline
  def apply(
    GameSessionQueueName: GameSessionQueueName,
    MaximumPlayerSessionCount: WholeNumber,
    PlacementId: IdStringModel
  ): StartGameSessionPlacementInput = {
    val __obj = js.Dynamic.literal(GameSessionQueueName = GameSessionQueueName.asInstanceOf[js.Any], MaximumPlayerSessionCount = MaximumPlayerSessionCount.asInstanceOf[js.Any], PlacementId = PlacementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartGameSessionPlacementInput]
  }
  @scala.inline
  implicit class StartGameSessionPlacementInputOps[Self <: StartGameSessionPlacementInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGameSessionQueueName(value: GameSessionQueueName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionQueueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumPlayerSessionCount(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumPlayerSessionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacementId(value: IdStringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlacementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredPlayerSessions(value: DesiredPlayerSessionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredPlayerSessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredPlayerSessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredPlayerSessions")(js.undefined)
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
    def withGameSessionName(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSessionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionName")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayerLatencies(value: PlayerLatencyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerLatencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerLatencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerLatencies")(js.undefined)
        ret
    }
  }
  
}

