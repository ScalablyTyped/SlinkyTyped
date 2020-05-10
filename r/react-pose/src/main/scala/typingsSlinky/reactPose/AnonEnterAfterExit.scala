package typingsSlinky.reactPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnterAfterExit extends js.Object {
  var enterAfterExit: Boolean = js.native
  var enterPose: String = js.native
  var exitPose: String = js.native
  var flipMove: Boolean = js.native
  var preEnterPose: String = js.native
}

object AnonEnterAfterExit {
  @scala.inline
  def apply(
    enterAfterExit: Boolean,
    enterPose: String,
    exitPose: String,
    flipMove: Boolean,
    preEnterPose: String
  ): AnonEnterAfterExit = {
    val __obj = js.Dynamic.literal(enterAfterExit = enterAfterExit.asInstanceOf[js.Any], enterPose = enterPose.asInstanceOf[js.Any], exitPose = exitPose.asInstanceOf[js.Any], flipMove = flipMove.asInstanceOf[js.Any], preEnterPose = preEnterPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnterAfterExit]
  }
  @scala.inline
  implicit class AnonEnterAfterExitOps[Self <: AnonEnterAfterExit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnterAfterExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterAfterExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnterPose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterPose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExitPose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitPose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlipMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreEnterPose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preEnterPose")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

