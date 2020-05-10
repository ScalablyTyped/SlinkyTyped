package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopGameSessionPlacementOutput extends js.Object {
  /**
    * Object that describes the canceled game session placement, with CANCELLED status and an end time stamp. 
    */
  var GameSessionPlacement: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameSessionPlacement] = js.native
}

object StopGameSessionPlacementOutput {
  @scala.inline
  def apply(): StopGameSessionPlacementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopGameSessionPlacementOutput]
  }
  @scala.inline
  implicit class StopGameSessionPlacementOutputOps[Self <: StopGameSessionPlacementOutput] (val x: Self) extends AnyVal {
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

