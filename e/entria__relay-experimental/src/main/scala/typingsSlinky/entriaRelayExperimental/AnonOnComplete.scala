package typingsSlinky.entriaRelayExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnComplete extends js.Object {
  var onComplete: js.UndefOr[js.Function1[/* arg */ js.Error | Null, Unit]] = js.native
}

object AnonOnComplete {
  @scala.inline
  def apply(): AnonOnComplete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOnComplete]
  }
  @scala.inline
  implicit class AnonOnCompleteOps[Self <: AnonOnComplete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnComplete(value: /* arg */ js.Error | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
  }
  
}

