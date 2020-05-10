package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGameSessionQueueOutput extends js.Object {
  /**
    * An object that describes the newly updated game session queue.
    */
  var GameSessionQueue: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameSessionQueue] = js.native
}

object UpdateGameSessionQueueOutput {
  @scala.inline
  def apply(): UpdateGameSessionQueueOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGameSessionQueueOutput]
  }
  @scala.inline
  implicit class UpdateGameSessionQueueOutputOps[Self <: UpdateGameSessionQueueOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGameSessionQueue(value: GameSessionQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSessionQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionQueue")(js.undefined)
        ret
    }
  }
  
}

