package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartGameSessionPlacementOutput extends js.Object {
  /**
    * Object that describes the newly created game session placement. This object includes all the information provided in the request, as well as start/end time stamps and placement status. 
    */
  var GameSessionPlacement: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameSessionPlacement] = js.native
}

object StartGameSessionPlacementOutput {
  @scala.inline
  def apply(): StartGameSessionPlacementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartGameSessionPlacementOutput]
  }
  @scala.inline
  implicit class StartGameSessionPlacementOutputOps[Self <: StartGameSessionPlacementOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGameSessionPlacement(value: GameSessionPlacement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSessionPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionPlacement")(js.undefined)
        ret
    }
  }
  
}

