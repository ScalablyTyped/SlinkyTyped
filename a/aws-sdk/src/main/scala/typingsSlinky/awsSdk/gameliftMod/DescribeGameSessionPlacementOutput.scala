package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGameSessionPlacementOutput extends js.Object {
  /**
    * Object that describes the requested game session placement.
    */
  var GameSessionPlacement: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameSessionPlacement] = js.native
}

object DescribeGameSessionPlacementOutput {
  @scala.inline
  def apply(): DescribeGameSessionPlacementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameSessionPlacementOutput]
  }
  @scala.inline
  implicit class DescribeGameSessionPlacementOutputOps[Self <: DescribeGameSessionPlacementOutput] (val x: Self) extends AnyVal {
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

