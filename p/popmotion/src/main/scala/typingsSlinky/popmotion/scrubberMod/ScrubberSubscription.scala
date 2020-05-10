package typingsSlinky.popmotion.scrubberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrubberSubscription extends js.Object {
  def seek(progress: Double): js.Any = js.native
}

object ScrubberSubscription {
  @scala.inline
  def apply(seek: Double => js.Any): ScrubberSubscription = {
    val __obj = js.Dynamic.literal(seek = js.Any.fromFunction1(seek))
    __obj.asInstanceOf[ScrubberSubscription]
  }
  @scala.inline
  implicit class ScrubberSubscriptionOps[Self <: ScrubberSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeek(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

