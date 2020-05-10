package typingsSlinky.mochaPhantomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MochaPhantomJsWindowOptions extends Window {
  var ended: Boolean = js.native
  var env: js.Any = js.native
  var failures: Double = js.native
  var started: Boolean = js.native
  def run(): Unit = js.native
}

object MochaPhantomJsWindowOptions {
  @scala.inline
  def apply(
    ended: Boolean,
    env: js.Any,
    failures: Double,
    mochaPhantomJS: () => MochaPhantomJsWindowOptions,
    run: () => Unit,
    started: Boolean
  ): MochaPhantomJsWindowOptions = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], mochaPhantomJS = js.Any.fromFunction0(mochaPhantomJS), run = js.Any.fromFunction0(run), started = started.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaPhantomJsWindowOptions]
  }
  @scala.inline
  implicit class MochaPhantomJsWindowOptionsOps[Self <: MochaPhantomJsWindowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStarted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

