package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DesiredPlayerSession extends js.Object {
  /**
    * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game.
    */
  var PlayerData: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.PlayerData] = js.native
  /**
    * A unique identifier for a player to associate with the player session.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DesiredPlayerSession {
  @scala.inline
  def apply(): DesiredPlayerSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DesiredPlayerSession]
  }
  @scala.inline
  implicit class DesiredPlayerSessionOps[Self <: DesiredPlayerSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlayerData(value: PlayerData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerData")(js.undefined)
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
  }
  
}

