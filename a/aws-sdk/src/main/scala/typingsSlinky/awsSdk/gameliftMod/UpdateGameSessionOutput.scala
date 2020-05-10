package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGameSessionOutput extends js.Object {
  /**
    * The updated game session metadata.
    */
  var GameSession: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameSession] = js.native
}

object UpdateGameSessionOutput {
  @scala.inline
  def apply(): UpdateGameSessionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGameSessionOutput]
  }
  @scala.inline
  implicit class UpdateGameSessionOutputOps[Self <: UpdateGameSessionOutput] (val x: Self) extends AnyVal {
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

