package typingsSlinky.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor

import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to construct a new `ActivityMonitor`.
  */
@js.native
trait IOptions[Sender, Args] extends js.Object {
  /**
    * The signal to monitor.
    */
  var signal: ISignal[Sender, Args] = js.native
  /**
    * The activity timeout in milliseconds.
    *
    * The default is 1 second.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object IOptions {
  @scala.inline
  def apply[Sender, Args](signal: ISignal[Sender, Args]): IOptions[Sender, Args] = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[Sender, Args]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[sender, args] <: IOptions[sender, args], Sender, Args] (val x: Self[Sender, Args]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Sender, Args] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Sender, Args]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Sender, Args]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Sender, Args]) with Other]
    @scala.inline
    def withSignal(value: ISignal[Sender, Args]): Self[Sender, Args] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self[Sender, Args] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self[Sender, Args] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

