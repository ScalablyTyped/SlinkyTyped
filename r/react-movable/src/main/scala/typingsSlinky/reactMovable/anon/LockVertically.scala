package typingsSlinky.reactMovable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LockVertically extends js.Object {
  var lockVertically: Boolean = js.native
  var removableByMove: Boolean = js.native
  var transitionDuration: Double = js.native
  var voiceover: Canceled = js.native
}

object LockVertically {
  @scala.inline
  def apply(lockVertically: Boolean, removableByMove: Boolean, transitionDuration: Double, voiceover: Canceled): LockVertically = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], removableByMove = removableByMove.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockVertically]
  }
  @scala.inline
  implicit class LockVerticallyOps[Self <: LockVertically] (val x: Self) extends AnyVal {
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
    def withVoiceover(value: Canceled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceover")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

