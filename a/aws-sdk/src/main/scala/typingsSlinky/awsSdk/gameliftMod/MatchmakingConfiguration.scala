package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchmakingConfiguration extends js.Object {
  /**
    * A flag that indicates whether a match that was created with this configuration must be accepted by the matched players. To require acceptance, set to TRUE.
    */
  var AcceptanceRequired: js.UndefOr[BooleanModel] = js.native
  /**
    * The length of time (in seconds) to wait for players to accept a proposed match. If any player rejects the match or fails to accept before the timeout, the ticket continues to look for an acceptable match.
    */
  var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.native
  /**
    * The number of player slots in a match to keep open for future players. For example, assume that the configuration's rule set specifies a match for a single 12-person team. If the additional player count is set to 2, only 10 players are initially selected for the match.
    */
  var AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.native
  /**
    * The method used to backfill game sessions created with this matchmaking configuration. MANUAL indicates that the game makes backfill requests or does not use the match backfill feature. AUTOMATIC indicates that GameLift creates StartMatchBackfill requests whenever a game session has one or more open slots. Learn more about manual and automatic backfill in Backfill Existing Games with FlexMatch.
    */
  var BackfillMode: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.BackfillMode] = js.native
  /**
    * Amazon Resource Name (ARN) that is assigned to a GameLift matchmaking configuration resource and uniquely identifies it. ARNs are unique across all Regions. In a GameLift configuration ARN, the resource ID matches the Name value.
    */
  var ConfigurationArn: js.UndefOr[MatchmakingConfigurationArn] = js.native
  /**
    * The time stamp indicating when this data object was created. The format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * Information to attach to all events related to the matchmaking configuration. 
    */
  var CustomEventData: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.CustomEventData] = js.native
  /**
    * A descriptive label that is associated with matchmaking configuration.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A set of custom properties for a game session, formatted as key-value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session). This information is added to the new GameSession object that is created for a successful match. 
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.native
  /**
    * A set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session). This information is added to the new GameSession object that is created for a successful match. 
    */
  var GameSessionData: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameSessionData] = js.native
  /**
    * Amazon Resource Name (ARN) that is assigned to a GameLift game session queue resource and uniquely identifies it. ARNs are unique across all Regions. GameLift uses the listed queues when placing game sessions for matches that are created with this matchmaking configuration. Queues can be located in any Region.
    */
  var GameSessionQueueArns: js.UndefOr[QueueArnsList] = js.native
  /**
    * A unique identifier for a matchmaking configuration. This name is used to identify the configuration associated with a matchmaking request or ticket.
    */
  var Name: js.UndefOr[MatchmakingIdStringModel] = js.native
  /**
    * An SNS topic ARN that is set up to receive matchmaking notifications.
    */
  var NotificationTarget: js.UndefOr[SnsArnStringModel] = js.native
  /**
    * The maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests that fail due to timing out can be resubmitted as needed.
    */
  var RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger] = js.native
  /**
    * The Amazon Resource Name (ARN) associated with the GameLift matchmaking rule set resource that this configuration uses.
    */
  var RuleSetArn: js.UndefOr[MatchmakingRuleSetArn] = js.native
  /**
    * A unique identifier for a matchmaking rule set to use with this configuration. A matchmaking configuration can only use rule sets that are defined in the same Region.
    */
  var RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.native
}

object MatchmakingConfiguration {
  @scala.inline
  def apply(): MatchmakingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchmakingConfiguration]
  }
  @scala.inline
  implicit class MatchmakingConfigurationOps[Self <: MatchmakingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptanceRequired(value: BooleanModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptanceRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptanceRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptanceRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withAcceptanceTimeoutSeconds(value: MatchmakingAcceptanceTimeoutInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptanceTimeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptanceTimeoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptanceTimeoutSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalPlayerCount(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalPlayerCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalPlayerCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalPlayerCount")(js.undefined)
        ret
    }
    @scala.inline
    def withBackfillMode(value: BackfillMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackfillMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackfillMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackfillMode")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationArn(value: MatchmakingConfigurationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomEventData(value: CustomEventData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomEventData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomEventData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomEventData")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
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
    def withGameSessionQueueArns(value: QueueArnsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionQueueArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSessionQueueArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionQueueArns")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: MatchmakingIdStringModel): Self = {
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
    def withNotificationTarget(value: SnsArnStringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTimeoutSeconds(value: MatchmakingRequestTimeoutInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestTimeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTimeoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestTimeoutSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleSetArn(value: MatchmakingRuleSetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleSetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleSetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleSetArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleSetName(value: MatchmakingIdStringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleSetName")(js.undefined)
        ret
    }
  }
  
}

