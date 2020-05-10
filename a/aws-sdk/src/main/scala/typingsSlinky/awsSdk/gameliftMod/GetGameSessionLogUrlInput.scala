package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGameSessionLogUrlInput extends js.Object {
  /**
    * A unique identifier for the game session to get logs for. 
    */
  var GameSessionId: ArnStringModel = js.native
}

object GetGameSessionLogUrlInput {
  @scala.inline
  def apply(GameSessionId: ArnStringModel): GetGameSessionLogUrlInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGameSessionLogUrlInput]
  }
  @scala.inline
  implicit class GetGameSessionLogUrlInputOps[Self <: GetGameSessionLogUrlInput] (val x: Self) extends AnyVal {
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
  }
  
}

