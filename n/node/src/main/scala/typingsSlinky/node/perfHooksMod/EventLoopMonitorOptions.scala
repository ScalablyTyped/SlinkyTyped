package typingsSlinky.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventLoopMonitorOptions extends js.Object {
  /**
    * The sampling rate in milliseconds.
    * Must be greater than zero.
    * @default 10
    */
  var resolution: js.UndefOr[Double] = js.native
}

object EventLoopMonitorOptions {
  @scala.inline
  def apply(): EventLoopMonitorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventLoopMonitorOptions]
  }
  @scala.inline
  implicit class EventLoopMonitorOptionsOps[Self <: EventLoopMonitorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
  }
  
}

