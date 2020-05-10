package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePlayerSessionsInput extends js.Object {
  /**
    * A unique identifier for the game session to retrieve player sessions for.
    */
  var GameSessionId: js.UndefOr[ArnStringModel] = js.native
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. If a player session ID is specified, this parameter is ignored.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value. If a player session ID is specified, this parameter is ignored.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A unique identifier for a player to retrieve player sessions for.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A unique identifier for a player session to retrieve.
    */
  var PlayerSessionId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.PlayerSessionId] = js.native
  /**
    * Player session status to filter results on. Possible player session statuses include the following:    RESERVED -- The player session request has been received, but the player has not yet connected to the server process and/or been validated.     ACTIVE -- The player has been validated by the server process and is currently connected.    COMPLETED -- The player connection has been dropped.    TIMEDOUT -- A player session request was received, but the player did not connect and/or was not validated within the timeout limit (60 seconds).  
    */
  var PlayerSessionStatusFilter: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DescribePlayerSessionsInput {
  @scala.inline
  def apply(): DescribePlayerSessionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlayerSessionsInput]
  }
  @scala.inline
  implicit class DescribePlayerSessionsInputOps[Self <: DescribePlayerSessionsInput] (val x: Self) extends AnyVal {
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
    def withoutGameSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: PositiveInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
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
    @scala.inline
    def withPlayerSessionStatusFilter(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerSessionStatusFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerSessionStatusFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerSessionStatusFilter")(js.undefined)
        ret
    }
  }
  
}

