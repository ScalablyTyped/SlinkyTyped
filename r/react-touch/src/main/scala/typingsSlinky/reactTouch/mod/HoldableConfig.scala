package typingsSlinky.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoldableConfig extends js.Object {
  def holdComplete(callback: js.Function0[Unit]): js.Function0[js.Function0[Unit]] = js.native
  def holdProgress(callback: js.Function0[Unit]): js.Function1[/* updateState */ js.Function1[/* holdLength */ Double, Unit], js.Function0[Unit]] = js.native
}

object HoldableConfig {
  @scala.inline
  def apply(
    holdComplete: js.Function0[Unit] => js.Function0[js.Function0[Unit]],
    holdProgress: js.Function0[Unit] => js.Function1[/* updateState */ js.Function1[/* holdLength */ Double, Unit], js.Function0[Unit]]
  ): HoldableConfig = {
    val __obj = js.Dynamic.literal(holdComplete = js.Any.fromFunction1(holdComplete), holdProgress = js.Any.fromFunction1(holdProgress))
    __obj.asInstanceOf[HoldableConfig]
  }
  @scala.inline
  implicit class HoldableConfigOps[Self <: HoldableConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHoldComplete(value: js.Function0[Unit] => js.Function0[js.Function0[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHoldProgress(
      value: js.Function0[Unit] => js.Function1[/* updateState */ js.Function1[/* holdLength */ Double, Unit], js.Function0[Unit]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdProgress")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

