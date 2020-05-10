package typingsSlinky.pathfinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JumpPointFinderBaseOptions extends Heuristic {
  var trackJumpRecursion: js.UndefOr[Boolean] = js.native
}

object JumpPointFinderBaseOptions {
  @scala.inline
  def apply(): JumpPointFinderBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JumpPointFinderBaseOptions]
  }
  @scala.inline
  implicit class JumpPointFinderBaseOptionsOps[Self <: JumpPointFinderBaseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrackJumpRecursion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackJumpRecursion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackJumpRecursion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackJumpRecursion")(js.undefined)
        ret
    }
  }
  
}

