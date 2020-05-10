package typingsSlinky.recluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BalancerOptions extends js.Object {
  /** arguments to pass to the worker (default: []) */
  var args: js.UndefOr[js.Array[String]] = js.native
  /** max time between respawns when workers die */
  var backoff: js.UndefOr[Double] = js.native
  /** what to log to stdout (default: {respawns: true}) */
  var log: js.UndefOr[LogOptions] = js.native
  /** logger to use, needs `log` method (default: console) */
  var logger: js.UndefOr[Logger] = js.native
  /** when does the worker become ready? 'listening' or 'started' */
  var readyWhen: js.UndefOr[String] = js.native
  /** min time between respawns when workers die */
  var respawn: js.UndefOr[Double] = js.native
  /** kill timeout for old workers after reload (sec) */
  var timeout: js.UndefOr[Double] = js.native
  /** number of active workers */
  var workers: js.UndefOr[Double] = js.native
}

object BalancerOptions {
  @scala.inline
  def apply(): BalancerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BalancerOptions]
  }
  @scala.inline
  implicit class BalancerOptionsOps[Self <: BalancerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withBackoff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoff")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: LogOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withReadyWhen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyWhen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadyWhen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyWhen")(js.undefined)
        ret
    }
    @scala.inline
    def withRespawn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respawn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRespawn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respawn")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workers")(js.undefined)
        ret
    }
  }
  
}

