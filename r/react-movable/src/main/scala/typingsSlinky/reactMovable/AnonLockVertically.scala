package typingsSlinky.reactMovable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLockVertically extends js.Object {
  var lockVertically: Boolean = js.native
  var removableByMove: Boolean = js.native
  var transitionDuration: Double = js.native
  var voiceover: AnonCanceled = js.native
}

object AnonLockVertically {
  @scala.inline
  def apply(
    lockVertically: Boolean,
    removableByMove: Boolean,
    transitionDuration: Double,
    voiceover: AnonCanceled
  ): AnonLockVertically = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], removableByMove = removableByMove.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLockVertically]
  }
  @scala.inline
  implicit class AnonLockVerticallyOps[Self <: AnonLockVertically] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLockVertically(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockVertically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovableByMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removableByMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoiceover(value: AnonCanceled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceover")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

