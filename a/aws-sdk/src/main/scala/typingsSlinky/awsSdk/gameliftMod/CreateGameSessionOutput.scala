package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGameSessionOutput extends js.Object {
  /**
    * Object that describes the newly created game session record.
    */
  var GameSession: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameSession] = js.native
}

object CreateGameSessionOutput {
  @scala.inline
  def apply(): CreateGameSessionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGameSessionOutput]
  }
  @scala.inline
  implicit class CreateGameSessionOutputOps[Self <: CreateGameSessionOutput] (val x: Self) extends AnyVal {
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
  }
  
}

