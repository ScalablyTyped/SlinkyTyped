package typingsSlinky.logg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  def error(var_args: js.Any*): Unit = js.native
  def fine(var_args: js.Any*): Unit = js.native
  def getLogLevel(): Double = js.native
  def getParent(): Logger = js.native
  def getWatchers(): js.Array[js.Function] = js.native
  def info(var_args: js.Any*): Unit = js.native
  def isLoggable(level: Double): Boolean = js.native
  def log(level: Double, var_args: js.Any*): Unit = js.native
  def registerWatcher(watcher: js.Function1[/* logRecord */ String, Unit]): Unit = js.native
  def setLogLevel(level: Double): Unit = js.native
  def setParent(logger: Logger): Unit = js.native
  def warn(var_args: js.Any*): Unit = js.native
}

object Logger {
  @scala.inline
  def apply(
    error: /* repeated */ js.Any => Unit,
    fine: /* repeated */ js.Any => Unit,
    getLogLevel: () => Double,
    getParent: () => Logger,
    getWatchers: () => js.Array[js.Function],
    info: /* repeated */ js.Any => Unit,
    isLoggable: Double => Boolean,
    log: (Double, /* repeated */ js.Any) => Unit,
    registerWatcher: js.Function1[/* logRecord */ String, Unit] => Unit,
    setLogLevel: Double => Unit,
    setParent: Logger => Unit,
    warn: /* repeated */ js.Any => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), fine = js.Any.fromFunction1(fine), getLogLevel = js.Any.fromFunction0(getLogLevel), getParent = js.Any.fromFunction0(getParent), getWatchers = js.Any.fromFunction0(getWatchers), info = js.Any.fromFunction1(info), isLoggable = js.Any.fromFunction1(isLoggable), log = js.Any.fromFunction2(log), registerWatcher = js.Any.fromFunction1(registerWatcher), setLogLevel = js.Any.fromFunction1(setLogLevel), setParent = js.Any.fromFunction1(setParent), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFine(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLogLevel(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLogLevel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParent(value: () => Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWatchers(value: () => js.Array[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWatchers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInfo(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsLoggable(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoggable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLog(value: (Double, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterWatcher(value: js.Function1[/* logRecord */ String, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerWatcher")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLogLevel(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLogLevel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetParent(value: Logger => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWarn(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

