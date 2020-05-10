package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlayerSessionsOutput extends js.Object {
  /**
    * A collection of player session objects created for the added players.
    */
  var PlayerSessions: js.UndefOr[PlayerSessionList] = js.native
}

object CreatePlayerSessionsOutput {
  @scala.inline
  def apply(): CreatePlayerSessionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlayerSessionsOutput]
  }
  @scala.inline
  implicit class CreatePlayerSessionsOutputOps[Self <: CreatePlayerSessionsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlayerSessions(value: PlayerSessionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerSessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerSessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerSessions")(js.undefined)
        ret
    }
  }
  
}

